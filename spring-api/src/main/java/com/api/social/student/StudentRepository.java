package com.api.social.student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
    public Optional<Student> findById(@Param("id")String id);

    @Query("SELECT student.name FROM Student student where student.id = :id")
    public Optional<String> findNameById(@Param("id")String id);

    @Query("SELECT '*' FROM Student student where student.id = ?1 AND student.department = ?2")
    public Optional<Student> findByNameAndDepartment(String name, String department);

    //The example below gets a list of students whose names start with the letter ‘k’.
    @Query("SELECT '*' FROM Student t where t.name = '%?1%'")
    public Optional<Student> findByCriteria(String criteria);
}
