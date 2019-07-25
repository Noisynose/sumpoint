package com.sumpoint.application.category.core.mappers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.data.entities.CategoryEntity;

@RunWith(MockitoJUnitRunner.class)
public class CategoryMapperImplTests {
    private final static int AN_ID = 2;
    private final static String A_NAME = "yo";

    private Category category;

    @InjectMocks
    private CategoryMapperImpl categoryMapper;

    @Before
    public void setUp() {
        category = new Category();
        category.setName(A_NAME);
        category.setId(AN_ID);
    }

    @Test
    public void whenFromCategoryToCategoryEntity_givenCategory_thenIdConverted() {
        CategoryEntity result = categoryMapper.fromCategoryToCategoryEntity(category);

        assertEquals(AN_ID, result.getId());
    }

    @Test
    public void whenFromCategoryToCategoryEntity_givenCategory_thenNameConverted() {
        CategoryEntity result = categoryMapper.fromCategoryToCategoryEntity(category);

        assertEquals(A_NAME, result.getName());
    }
}
