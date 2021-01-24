package com.courses.controller;

import com.courses.entity.Course;
import com.courses.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private ICourseService courseService;
    @RequestMapping("/courseList")
    public List<Course> getCourseList(){
    return courseService.getCourseList();
    }
}
