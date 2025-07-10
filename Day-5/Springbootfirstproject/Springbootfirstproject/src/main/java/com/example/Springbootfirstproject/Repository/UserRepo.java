package com.example.Springbootfirstproject.Repository;

import com.example.Springbootfirstproject.Models.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDetails,Integer> {
}
