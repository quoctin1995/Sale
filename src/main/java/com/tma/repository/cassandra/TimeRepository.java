package com.tma.repository.cassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.entity.cassandra.Time;

public interface TimeRepository extends CrudRepository<Time, UUID> {

}
