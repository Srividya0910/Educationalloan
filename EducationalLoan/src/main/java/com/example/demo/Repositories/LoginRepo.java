package com.example.demo.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, String> {

}