package com.sumpoint.application.category.data.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sumpoint.application.category.data.entities.CategoryEntity;

/**
 * Defines methods to interact with {@link CategoryEntity} persistence.
 */
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

}
