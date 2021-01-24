package com.course.client;

import com.courses.entity.Course;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 课程列表客户端:用于远程访问courselist系统
 */
@FeignClient(value="course-list")
public interface CourseListClient {
    @RequestMapping("/courseList")
    public List<Course> getCourseList();
}
