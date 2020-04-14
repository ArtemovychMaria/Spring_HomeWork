package com.example.SpringHomeWork.hw2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {
    private UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository){
        this.universityRepository=universityRepository;
    }

    public University create(University university){
        return universityRepository.saveAndFlush(university);
    }

    public Optional<University> readById(int id){
        return universityRepository.findById(id);
    }

    public List<University> readAll(){
        return universityRepository.findAll();
    }

    public void update(String name,int id){
        universityRepository.updateNameById(name,id);
    }

    public void deleteById(int id){
        universityRepository.deleteById(id);
    }

}
