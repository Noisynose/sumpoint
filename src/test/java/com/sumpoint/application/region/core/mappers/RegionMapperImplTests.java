package com.sumpoint.application.region.core.mappers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.sumpoint.application.region.core.models.Region;
import com.sumpoint.application.region.data.entities.RegionEntity;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RegionMapperImplTests {
    private final static int AN_ID = 2;
    private final static String A_NAME = "yo";

    private Region region;

    @InjectMocks
    private RegionMapperImpl regionMapper;

    @Before
    public void setUp() {
        region = new Region();
        region.setName(A_NAME);
        region.setId(AN_ID);
    }

    @Test
    public void whenFromRegionToRegionEntity_givenRegion_thenIdConverted() {
        RegionEntity result = regionMapper.fromRegionToRegionEntity(region);

        assertEquals(AN_ID, result.getId());
    }

    @Test
    public void whenFromRegionToRegionEntity_givenRegion_thenNameConverted() {
        RegionEntity result = regionMapper.fromRegionToRegionEntity(region);

        assertEquals(A_NAME, result.getName());
    }
}
