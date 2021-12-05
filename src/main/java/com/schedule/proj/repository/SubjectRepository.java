package com.schedule.proj.repository;

import com.schedule.proj.model.Subject;
import com.schedule.proj.model.Teacher;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
   List<Subject> findAllBySubjectTeacher(Teacher teacher);
   Subject findAllBySubjectGroupAndAndSubjectName(Integer subjectGroup,String subjectName);
   Subject findBySubjectGroupAndSubjectName(Integer subjectGroup,String subjectName);


}
