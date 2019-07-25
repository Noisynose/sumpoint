package com.sumpoint.application.region.core.mappers;

import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;

/**
 * Defines methods to convert {@link Region} to {@link RegionEntity}
 * or vice-versa.
 */
public interface RegionMapper {
    /**
     * Converts an instance of {@link Region} to an instance of {@link RegionEntity}.
     * @param region An instance of {@link Region}.
     * @return An instance of {@link RegionEntity}.
     */
    RegionEntity fromRegionToRegionEntity(Region region);
}
