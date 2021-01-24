package com.courses.dao;

import com.courses.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
@Mapper
@Repository
public interface CourseMapper {
    @Select("select * from course where valid=1")
    public List<Course> getCourseList();
}
