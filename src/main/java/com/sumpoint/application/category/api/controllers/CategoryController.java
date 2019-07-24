package com.sumpoint.application.category.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sumpoint.application.category.api.mappers.CategoryMapper;
import com.sumpoint.application.category.api.requests.CategoryUpload;
import com.sumpoint.application.category.domain.models.Category;
import com.sumpoint.application.category.domain.services.CategoryService;

/**
 * Defines REST methods to interact with {@link Category}.
 */
@RestController
@RequestMapping("categories")
public class CategoryController {

    private CategoryService categoryService;
    private CategoryMapper categoryMapper;

    /**
     * Creates a new instance of {@link CategoryController}.
     * @param categoryService An instance of {@link CategoryService}.
     * @param categoryMapper An instance of {@link CategoryMapper}.
     */
    public CategoryController(CategoryService categoryService,
            CategoryMapper categoryMapper) {
        this.categoryService = categoryService;
        this.categoryMapper = categoryMapper;
    }

    /**
     * Creates a new instance of {@link Category}.
     * @param name The name of the {@link Category}.
     */
    @ResponseStatus(HttpStatus.OK)
    @PostMapping()
    public void create(@RequestBody CategoryUpload categoryUpload) {
        categoryService.add(categoryMapper.fromCategoryUploadToCategory(categoryUpload));
    }
}
