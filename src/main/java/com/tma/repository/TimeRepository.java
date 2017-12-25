package com.tma.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.Time;

public interface TimeRepository extends JpaRepository<Time, UUID> {

}
