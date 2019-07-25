package com.sumpoint.application.category.core.services;

import com.sumpoint.application.category.core.models.Category;

/**
 * Defines methods to interact with {@link Category}.
 */
public interface CategoryService {
    /**
     * Adds a new instance of {@link Category}.
     * @param category An instance of {@link Category}.
     */
    void add(Category category);

//    /**
//     * Gets an instance of {@link Category} by ID.
//     * @return An instance of {@link Category}.
//     */
//    Category get(int id);
}
