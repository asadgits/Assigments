package com.orm.practice.ormpractice.controllers;

import com.orm.practice.ormpractice.DAO.SetDataDTO;
import com.orm.practice.ormpractice.entities.Teacher;
import com.orm.practice.ormpractice.repositories.CoursesRepository;
import com.orm.practice.ormpractice.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherCoursesController {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping
    public void insertRecord(@RequestBody SetDataDTO  setDataDTO){
        System.out.println(setDataDTO);
        teacherRepository.save(setDataDTO.getTeacher());
    }
}
