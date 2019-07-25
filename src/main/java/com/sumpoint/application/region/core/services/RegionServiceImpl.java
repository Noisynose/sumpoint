package com.sumpoint.application.region.core.services;

import com.sumpoint.application.region.core.mappers.RegionMapper;
import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.repositories.RegionRepository;

/**
 * Implements methods to interact with {@link Region}.
 */
public class RegionServiceImpl implements RegionService {
    private RegionRepository regionRepository;
    private RegionMapper regionMapper;

    /**
     * Creates an instance of {@link RegionServiceImpl}.
     * @param regionRepository An instance of {@link RegionRepository}.
     * @param regionMapper An instance of {@link RegionMapper}.
     */
    public RegionServiceImpl(RegionRepository regionRepository,
            RegionMapper regionMapper) {
        this.regionRepository = regionRepository;
        this.regionMapper = regionMapper;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Region region) {
        regionRepository.save(regionMapper.fromRegionToRegionEntity(region));
    }
}
