package com.orm.practice.ormpractice.repositories;

import com.orm.practice.ormpractice.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
