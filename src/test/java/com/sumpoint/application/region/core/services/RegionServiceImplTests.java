package com.sumpoint.application.region.core.services;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.sumpoint.application.region.core.mappers.RegionMapper;
import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;
import com.sumpoint.application.region.data.repositories.RegionRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RegionServiceImplTests {

    private Region region;
    private RegionEntity entity;

    @Mock
    private RegionMapper regionMapper;  

    @Mock
    private RegionRepository regionRepository;

    @InjectMocks
    private RegionServiceImpl service;

    @Before
    public void setUp() {
        region = new Region();
        entity = new RegionEntity();
    }

    @Test
    public void whenAdd_givenRegion_thenRegionMapperCalled() {
        service.add(region);

        verify(regionMapper).fromRegionToRegionEntity(region);
    }

    @Test
    public void whenAdd_givenRegion_thenRegionRepositoryCalled() {
        when(regionMapper.fromRegionToRegionEntity(region)).thenReturn(entity);

        service.add(region);

        verify(regionRepository).save(entity);
    }
}
