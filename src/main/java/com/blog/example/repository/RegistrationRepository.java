package com.blog.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.example.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
