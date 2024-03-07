package com.sb.project6.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.project6.model.Model;

public interface Repository extends JpaRepository<Model, Serializable> {

}
