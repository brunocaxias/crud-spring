package com.bruno.crudspring.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.bruno.crudspring.dto.mapper.CourseMapper;
import com.bruno.crudspring.repository.CourseRepository;

@Validated
@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    
}
