package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Data

public class User {
        private int id;
        @Id
        private String name;
        private String address;
    }
