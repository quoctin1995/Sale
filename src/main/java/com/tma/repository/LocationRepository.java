package com.tma.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.entity.Location;

public interface LocationRepository extends JpaRepository<Location, UUID> {

}