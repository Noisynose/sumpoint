package com.sumpoint.application.category.core.mappers;

import com.sumpoint.application.category.core.models.Category;
import com.sumpoint.application.category.data.entities.CategoryEntity;

/**
 * Defines methods to convert {@link Category} to {@link CategoryEntity}
 * or vice-versa.
 */
public interface CategoryMapper {
    /**
     * Converts an instance of {@link Category} to an instance of {@link CategoryEntity}.
     * @param category An instance of {@link Category}.
     * @return An instance of {@link CategoryEntity}.
     */
    CategoryEntity fromCategoryToCategoryEntity(Category category);
}
