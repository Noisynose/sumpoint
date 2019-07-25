package com.sumpoint.application.category.api.mappers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.sumpoint.application.category.api.requests.CategoryUpload;
import com.sumpoint.application.category.core.models.Category;

@RunWith(MockitoJUnitRunner.class)
public class CategoryMapperImplTests {
    private final static int AN_ID = 2;
    private final static String A_NAME = "yo";
    
    private CategoryUpload upload;
    
    @InjectMocks
    private CategoryUploadMapperImpl categoryMapper;

    @Before
    public void setUp() {
        upload = new CategoryUpload();
        upload.setName(A_NAME);
        upload.setId(AN_ID);
    }
    
    @Test
    public void whenFromCategoryUploadToCategory_givenCategoryUpload_thenNameConverted() {
        Category result = categoryMapper.fromCategoryUploadToCategory(upload);
        
        assertEquals(A_NAME, result.getName());
    }

    @Test
    public void whenFromCategoryUploadToCategory_givenCategoryUpload_thenIdConverted() {
        Category result = categoryMapper.fromCategoryUploadToCategory(upload);
        
        assertEquals(AN_ID, result.getId());
    }
}
