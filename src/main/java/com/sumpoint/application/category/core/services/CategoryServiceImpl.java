package com.sumpoint.application.category.core.services;

import org.springframework.stereotype.Component;

import com.sumpoint.application.category.core.mappers.CategoryMapper;
import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.data.entities.CategoryEntity;
import com.sumpoint.application.category.data.repositories.CategoryRepository;

/**
 * Implements methods to interact with {@link Category}.
 */
@Component
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;
    private CategoryRepository categoryRepository;

    /**
     * Creates a new instance of {@link CategoryServiceImpl}.
     * @param categoryMapper An instance of {@link CategoryMapper}.
     * @param categoryRepository An instance of {@link CategoryRepository}
     */
    public CategoryServiceImpl(CategoryMapper categoryMapper,
            CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Category category) {
        CategoryEntity categoryEntity = categoryMapper.fromCategoryToCategoryEntity(category);
        categoryRepository.save(categoryEntity);
    }

    //    /**
    //     * {@inheritDoc}
    //     */
    //    @Override
    //    public Category get(int id) {
    //        // TODO Auto-generated method stub
    //        return null;
    //    }

}
