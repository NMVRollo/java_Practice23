package com.example.Practice23.repository;

import com.example.Practice23.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {
    Dog findOneById(Long id);
    List<Dog> findAllByName(String name);
    List<Dog> findAllByBreed(String breed);
}
