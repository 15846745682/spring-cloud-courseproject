package com.course.dao;

import com.course.entity.CoursePrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CoursePriceMapper {
    @Select("select * from course_price where course_id=#{courseId}")
    public CoursePrice getCoursePrice(int courseId);
}
