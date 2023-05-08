package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, String> {

}
