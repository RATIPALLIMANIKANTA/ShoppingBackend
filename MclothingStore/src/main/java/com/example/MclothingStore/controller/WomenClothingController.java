package com.example.MclothingStore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MclothingStore.entity.MenCategory;
import com.example.MclothingStore.entity.WomenCategory;
import com.example.MclothingStore.service.MenClothingService;
import com.example.MclothingStore.service.WomenClothingService;

@RestController
@RequestMapping("/api/women")
public class WomenClothingController {
@Autowired	
private WomenClothingService womenClothingService;
	
    
	
	@PostMapping("/{sectionname}")
	public WomenCategory addWomenCategory(@PathVariable String sectionname,@RequestBody WomenCategory womenCategory) {
		womenCategory.setSectionname(sectionname);
		return womenClothingService.addWomenCategory(womenCategory);
	}
	
	@GetMapping("/section/{sectionName}")
	public List<WomenCategory> getWomenCategoriesBySectionName(@PathVariable String sectionname){
		return womenClothingService.getWomenCategoriesBySectionName(sectionname);
	}
	
	@GetMapping("/{id}")
	public Optional<WomenCategory> getWomenCategoryById(@PathVariable Long id){
		return womenClothingService.getWomenCategoryById(id);
	}
	
	@GetMapping("/name/{name}")
	public WomenCategory getWomenCategoryByName(@PathVariable String name) {
		return womenClothingService.getWomenCategoryByName(name);
	}

}
