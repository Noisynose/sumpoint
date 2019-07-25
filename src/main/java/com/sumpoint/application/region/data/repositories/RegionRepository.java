package com.sumpoint.application.region.data.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sumpoint.application.region.data.entities.RegionEntity;

/**
 * Defines methods to interact with {@link RegionEntity} persistence.
 */
public interface RegionRepository extends CrudRepository<RegionEntity, Long> {

}
