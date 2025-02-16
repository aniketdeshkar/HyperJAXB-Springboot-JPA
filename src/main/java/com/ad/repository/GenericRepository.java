package com.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Document;

@Repository
public interface GenericRepository extends JpaRepository<Document, Long >{

}
