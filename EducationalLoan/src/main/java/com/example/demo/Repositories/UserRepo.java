
package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}