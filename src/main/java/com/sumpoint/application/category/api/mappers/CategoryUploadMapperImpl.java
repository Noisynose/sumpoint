package com.sumpoint.application.category.api.mappers;

import org.springframework.stereotype.Component;

import com.sumpoint.application.category.api.requests.CategoryUpload;
import com.sumpoint.application.category.core.models.Category;

/**
 * Implements methods to converts with {@link CategoryUpload}
 * to {@link Category} or vice-versa.
 */
@Component
public class CategoryUploadMapperImpl implements CategoryUploadMapper {

    /**
     * {@inheritDoc}
     */
    @Override
    public Category fromCategoryUploadToCategory(CategoryUpload categoryUpload) {
        Category category = new Category();

        category.setName(categoryUpload.getName());
        category.setId(categoryUpload.getId());

        return category;
    }

}
