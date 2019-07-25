package com.sumpoint.application.category.api.mappers;

import com.sumpoint.application.category.api.requests.CategoryUpload;
import com.sumpoint.application.category.core.models.Category;

/**
 * Defines methods to converts with {@link CategoryUpload}
 * to {@link Category} or vice-versa.
 */
public interface CategoryUploadMapper {
    /**
     * Converts an instance of {@link CategoryUpload} to {@link Category}.
     * @param categoryUpload An instance of {@link CategoryUpload}.
     * @return An instance of {@link Category}.
     */
    Category fromCategoryUploadToCategory(CategoryUpload categoryUpload);
}
