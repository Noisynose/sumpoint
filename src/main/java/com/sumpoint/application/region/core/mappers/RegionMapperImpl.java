package com.sumpoint.application.region.core.mappers;

import org.springframework.stereotype.Component;

import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;

/**
 * Implements methods to convert {@link Region} to {@link RegionEntity}
 * or vice-versa.
 */
@Component
public class RegionMapperImpl implements RegionMapper {

    /**
     * {@inheritDoc}
     */
    @Override
    public RegionEntity fromRegionToRegionEntity(Region region) {
        RegionEntity regionEntity = new RegionEntity();

        regionEntity.setId(region.getId());
        regionEntity.setName(region.getName());

        return regionEntity;
    }
}
