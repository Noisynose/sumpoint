package com.sumpoint.application.category.core.services;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sumpoint.application.category.core.mappers.CategoryMapper;
import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.data.entities.CategoryEntity;
import com.sumpoint.application.category.data.repositories.CategoryRepository;

@RunWith(MockitoJUnitRunner.class)
public class CategoryServiceImplTests {

    private Category category;
    private CategoryEntity entity;

    @Mock
    private CategoryMapper categoryMapper;

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryServiceImpl service;

    @Before
    public void setUp() {
        category = new Category();
        entity = new CategoryEntity();
    }

    @Test
    public void whenAdd_givenCategory_thenCategoryMapperCalled() {
        service.add(category);

        verify(categoryMapper).fromCategoryToCategoryEntity(category);
    }

    @Test
    public void whenAdd_givenCategory_thenCategoryRepositoryCalled() {
        when(categoryMapper.fromCategoryToCategoryEntity(category)).thenReturn(entity);

        service.add(category);

        verify(categoryRepository).save(entity);
    }
}
