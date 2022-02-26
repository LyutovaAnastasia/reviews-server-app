package com.company.rest;

import com.company.domain.model.dto.CategoryDto;
import com.company.domain.model.response.CategoryResponse;
import com.company.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    //@GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findCategoriesById(@PathVariable("id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(categoryService.findCategoryById(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategory(@PathVariable("id") Long id) {
        return ResponseEntity.ok(categoryService.getCategory(id));
    }


}
