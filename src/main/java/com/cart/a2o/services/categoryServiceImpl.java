package com.cart.a2o.services;

import com.cart.a2o.entities.category;
import com.cart.a2o.repositories.catgoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class categoryServiceImpl implements categoryService {

    @Autowired
    private catgoryRepository categoryRepository;

    @Transactional
    @Override
    public category createCategory(category category) {
        return categoryRepository.save(category);
    }

    @Transactional
    @Override
    public category updateCategory(Long categoryId, category category) {
        Optional<category> existingCategoryOptional = categoryRepository.findById(categoryId);
        if (!existingCategoryOptional.isPresent()) {
            throw new IllegalArgumentException("Category not found");
        }

        category existingCategory = existingCategoryOptional.get();
        existingCategory.setCategory(category.getCategory());
        existingCategory.setDescription(category.getDescription());
        return categoryRepository.save(existingCategory);
    }

    @Transactional
    @Override
    public void deleteCategory(Long categoryId) {
        if (!categoryRepository.existsById(categoryId)) {
            throw new IllegalArgumentException("Category not found");
        }
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalArgumentException("Category not found"));
    }

    @Override
    public List<category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(category category) {

    }
}
