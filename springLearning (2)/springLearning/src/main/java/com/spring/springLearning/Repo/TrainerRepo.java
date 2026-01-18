package com.spring.springLearning.Repo;

import com.spring.springLearning.Entity.TrainerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepo extends JpaRepository<TrainerDetails, Integer> {
    

}
