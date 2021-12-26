package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Weeks;

public interface WeekRepository extends JpaRepository<Weeks, Integer>{

}
