package com.tma.repository.cassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.entity.cassandra.Location;

public interface LocationRepository extends CrudRepository<Location, UUID> {

}
