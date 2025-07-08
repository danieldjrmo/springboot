package com.bce.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bce.demo.entity.User;

public interface UserRepository extends  JpaRepository<User,Integer>{

}
