package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Role;

public interface RolesRepository extends JpaRepository<Role, Integer>{

}
