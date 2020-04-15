package com.example.SpringHomeWork.hw2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UniversityRepository extends JpaRepository<University,Integer> {

    @Transactional
    @Modifying
    @Query("update University u set u.name=?1 where u.id=?2")
    public void updateNameById(String name, int id);

    @Transactional
    @Modifying
    @Query("update University u set u.numberOfStudents=:numberOfStudents where u.id=:id")
    public void updateNumberOfStudentsById(@Param("numberOfStudents") int numberOfStudents, @Param("id") int id);

    @Transactional
    @Modifying
    @Query(value = "update universities set number_of_institutes=?1 where id=?2 ",nativeQuery = true)
    public void updateNumberOfInstitutesById(int numberOfInsitutes, int id);
}
