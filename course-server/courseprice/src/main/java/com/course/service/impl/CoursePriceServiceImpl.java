package com.course.service.impl;

import com.course.dao.CoursePriceMapper;
import com.course.entity.CoursePrice;
import com.course.service.ICoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursePriceServiceImpl implements ICoursePriceService {
    @Autowired
    private CoursePriceMapper coursePriceMapper;
    @Override
    public CoursePrice getCoursePrice(int courseId) {
        return coursePriceMapper.getCoursePrice(courseId);
    }
}
