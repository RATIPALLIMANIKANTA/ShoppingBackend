package com.example.MclothingStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.MclothingStore.entity.WomenCategory;

@Service
public interface WomenClothingService {

	WomenCategory addWomenCategory(WomenCategory womenCategory);

	List<WomenCategory> getWomenCategoriesBySectionName(String sectionName);

	Optional<WomenCategory> getWomenCategoryById(Long id);

	WomenCategory getWomenCategoryByName(String name);

}
