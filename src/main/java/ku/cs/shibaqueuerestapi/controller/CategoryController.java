package ku.cs.shibaqueuerestapi.controller;

import ku.cs.shibaqueuerestapi.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("/category")
    public List<Category> getAllCategories(){
        return service.getAll();
    }

    @GetMapping("/category/{idCategory}")
    public Category getCategoryById(@PathVariable UUID idCategory){
        return service.getCategoryById(idCategory);
    }

    @GetMapping("/category/name/{categoryName}")
    public Category getCategoryByName(@PathVariable String categoryName){
        return service.getCategoryByName(categoryName);
    }

    @PostMapping("/category")
    public Category create(@RequestBody Category category){
        return service.create(category);
    }

    @DeleteMapping("/category/{idCategory}")
    public Category delete(@PathVariable UUID idCategory){
        return service.delete(idCategory);
    }
}
