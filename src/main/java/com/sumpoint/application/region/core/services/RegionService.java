package com.sumpoint.application.region.core.services;

import com.sumpoint.application.region.core.models.Region;

/**
 * Defines methods to interact with {@link Region}.
 */
public interface RegionService {
    /**
     * Adds a new instance of {@link Region}.
     * @param region An instance of {@link Region}.
     */
    void add(Region region);
}
