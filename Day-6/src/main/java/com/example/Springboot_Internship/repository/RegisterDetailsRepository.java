package com.example.Springboot_Internship.repository;

import com.example.Springboot_Internship.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDetailsRepository extends JpaRepository<RegisterDetails, Long> {
    RegisterDetails findByEmail(String email);
}