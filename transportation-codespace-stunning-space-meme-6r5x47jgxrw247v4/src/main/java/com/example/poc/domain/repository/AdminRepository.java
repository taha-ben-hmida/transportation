package com.example.poc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.poc.domain.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin , Long>{

}
