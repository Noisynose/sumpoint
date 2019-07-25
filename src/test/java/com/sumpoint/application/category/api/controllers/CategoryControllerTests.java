package com.sumpoint.application.category.api.controllers;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sumpoint.application.category.api.mappers.CategoryUploadMapper;
import com.sumpoint.application.category.api.requests.CategoryUpload;
import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.core.services.CategoryService;

@RunWith(MockitoJUnitRunner.class)
public class CategoryControllerTests {
    private final static int AN_ID = 123;
    private final static String A_NAME = "bonjour";
    private final static int ANOTHER_ID = 312;
    private final static String ANOTHER_NAME = "SALUT";
    
    private CategoryUpload categoryUpload;
    private Category category;
    
    @Mock
    private CategoryService categoryService;
    
    @Mock
    private CategoryUploadMapper categoryMapper;
    
    @InjectMocks
    private CategoryController controller;
    
    @Before
    public void setUp() {
        categoryUpload = new CategoryUpload();
        categoryUpload.setId(AN_ID);
        categoryUpload.setName(A_NAME);
        
        category = new Category();
        category.setId(ANOTHER_ID);
        category.setName(ANOTHER_NAME);
        
        when(categoryMapper.fromCategoryUploadToCategory(categoryUpload)).thenReturn(category);
    }
    
    @Test
    public void whenCreate_givenCategoryUpload_thenCategoryMapperCalled() {
        controller.create(categoryUpload);
        
        verify(categoryMapper).fromCategoryUploadToCategory(categoryUpload);
    }

    @Test
    public void whenCreate_givenCategoryUpload_thenCategoryServiceCalled() {
        controller.create(categoryUpload);
        
        verify(categoryService).add(category);
    }
}
