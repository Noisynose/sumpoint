package com.sumpoint.application.region.core.services;

import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;
import com.sumpoint.application.region.data.repositories.RegionRepository;

/**
 * Implements methods to interact with {@link Region}.
 */
public class RegionServiceImpl implements RegionService {

    private RegionRepository regionRepository;

    /**
     * Creates an instance of {@link RegionServiceImpl}.
     * @param regionRepository An instance of {@link RegionRepository}.
     */
    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Region region) {
        regionRepository.save(new RegionEntity());
    }
}
