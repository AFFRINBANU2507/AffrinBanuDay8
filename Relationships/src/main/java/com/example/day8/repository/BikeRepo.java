package com.example.day8.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.day8.model.BikeModal;

public interface BikeRepo extends JpaRepository<BikeModal, Long>
{

}