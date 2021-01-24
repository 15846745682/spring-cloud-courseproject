package com.courses.service.impl;

import com.courses.dao.CourseMapper;
import com.courses.entity.Course;
import com.courses.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList() {

        return courseMapper.getCourseList();
    }
}
