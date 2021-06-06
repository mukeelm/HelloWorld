package com.helloworld.repository;

import com.helloworld.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Modifying
    @Query(
            value =
                    "insert into Student (firstName, lastName, emailId,) values (:firstName, :lastName, :emailId)",
            nativeQuery = true)
    Long registerStudent(@Param("firstName") String firstName, @Param("lastName") String lastName,
                    @Param("emailId") String emailId);

}