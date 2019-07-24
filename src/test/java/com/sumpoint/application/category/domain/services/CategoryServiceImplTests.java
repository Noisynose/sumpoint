package com.sumpoint.application.category.domain.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.server.ResponseStatusException;

@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceImplTests {
    @Before
    public void setUp() {

    }

    @Test
    public void whenAdd_givenCategory_thenCategoryRepositoryCalled() {
        Assert.fail();
    }

    @Test
    public void whenAdd_givenCategory_thenCategoryMapperCalled() {
        Assert.fail();
    }

    @Test
    public void whenGet_givenId_thenCategoryRepositoryCalled() {
        Assert.fail();
    }

    @Test(expected = ResponseStatusException.class)
    public void whenGet_givenCategoryNotFound_thenResponseStatusException() {
        Assert.fail();
    }

    @Test
    public void whenGet_givenId_thenCategoryMapperCalled() {
        Assert.fail();
    }
}
