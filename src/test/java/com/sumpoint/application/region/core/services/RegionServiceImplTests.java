package com.sumpoint.application.region.core.services;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;
import com.sumpoint.application.region.data.repositories.RegionRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RegionServiceImplTests {

    private Region region;
    private RegionEntity entity;

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
    public void whenAdd_givenRegion_thenRegionRepositoryCalled() {
        service.add(region);

        verify(regionRepository).save(entity);
    }
}
