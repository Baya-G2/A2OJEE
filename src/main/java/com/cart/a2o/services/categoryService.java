package com.cart.a2o.services;

import com.cart.a2o.entities.category;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface categoryService {
    @Transactional
    category createCategory(category category);

    @Transactional
    category updateCategory(Long categoryId, category category);

    @Transactional
    void deleteCategory(Long categoryId);

    category getCategoryById(Long categoryId);

    List<category> getAllCategories();

    void save(category category);

}
