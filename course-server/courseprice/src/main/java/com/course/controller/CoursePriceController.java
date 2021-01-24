package com.course.controller;

import com.course.client.CourseListClient;
import com.course.entity.CourseAndPrice;
import com.course.entity.CoursePrice;
import com.course.service.ICoursePriceService;
import com.courses.entity.Course;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursePriceController {
    @Autowired
    private ICoursePriceService coursePriceService;
    @Autowired(required = false)
    private CourseListClient courseListClient;
    @RequestMapping("/price")
    public int getCoursePrice(int courseId){

        return coursePriceService.getCoursePrice(courseId).getPrice();
    }
    @HystrixCommand(fallbackMethod = "getDefaultValue")
    @RequestMapping("/courses")
    public List<Course> getCourseList(){
        return courseListClient.getCourseList();
    }
    //熔断器方法
    public List<Course> getDefaultValue(){
        List<Course> course=new ArrayList<>();
        Course c=new Course();
        c.setId(-1);
        c.setCourseId(-1);
        c.setName("默认书籍");
        c.setValid(1);
        course.add(c);
        return course;
    }
    @RequestMapping("/courseAndPrice")
   public List<CourseAndPrice> getCourseAndPrice(){
        List<Course> list=getCourseList();
        List<CourseAndPrice> array=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Course course=list.get(i);
            int price=getCoursePrice(course.getCourseId());
            CourseAndPrice cp=new CourseAndPrice();
            cp.setId(i);
            cp.setCourseId(course.getCourseId());
            cp.setName(course.getName());
            cp.setPrice(price);
            array.add(cp);
        }
       return array;
   }
}
