package com.sumpoint.application.category.core.mappers;

import org.springframework.stereotype.Component;

import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.data.entities.CategoryEntity;

/**
 * Implements methods to convert {@link Category} to {@link CategoryEntity}
 * or vice-versa.
 */
@Component
public class CategoryMapperImpl implements CategoryMapper {

    /**
     * {@inheritDoc}
     */
    @Override
    public CategoryEntity fromCategoryToCategoryEntity(Category category) {
        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId(category.getId());
        categoryEntity.setName(category.getName());

        return categoryEntity;
    }

}
