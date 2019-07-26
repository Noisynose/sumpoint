package com.sumpoint.application.entrant.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.sumpoint.application.entrant.api.requests.EntrantUpload;
import com.sumpoint.application.entrant.api.requests.EntrantView;
import com.sumpoint.application.entrant.api.services.EntrantService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EntrantControllerTests {  
    private EntrantUpload entrantUpload;

    @Mock
    private EntrantService mockEntrantService;

    @InjectMocks
    private EntrantController controller;

    @Before
    public void setUp() {
        entrantUpload = new EntrantUpload();
    }

    @Test
    public void whenCreate_givenEntrantUpload_thenEntrantServiceAddCalled() {
        controller.create(entrantUpload);

        verify(mockEntrantService).add(entrantUpload);
    }

    @Test
    public void whenGet_thenEntrantServiceGetEntrantsCalled() {
        controller.get();

        verify(mockEntrantService).getEntrants();
    }

    @Test
    public void whenGet_givenEntrants_thenResultSizeIsOne() {
        List<EntrantView> entrants = Arrays.asList(new EntrantView());
        when(mockEntrantService.getEntrants()).thenReturn(entrants);

        controller.get();

        assertEquals(1, entrants.size());
    }
}
