package com.example.MclothingStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MclothingStore.entity.WomenCategory;
import com.example.MclothingStore.repository.MenCategoryRepository;
import com.example.MclothingStore.repository.WomenCategoryRepository;
@Service
public class WomenClothingServiceImpl implements WomenClothingService{
	@Autowired
	private WomenCategoryRepository womenCategoryRepository;
	
	public WomenClothingServiceImpl(WomenCategoryRepository womenCategoryRepository) {
		this.womenCategoryRepository = womenCategoryRepository;
	}

	@Override
	public WomenCategory addWomenCategory(WomenCategory womenCategory) {
	
		return womenCategoryRepository.save(womenCategory);
	}

	@Override
	public List<WomenCategory> getWomenCategoriesBySectionName(String sectionname) {
		// TODO Auto-generated method stub
		return womenCategoryRepository.findBySectionname(sectionname);
	}

	@Override
	public Optional<WomenCategory> getWomenCategoryById(Long id) {
		// TODO Auto-generated method stub
		return womenCategoryRepository.findById(id);
	}

	@Override
	public WomenCategory getWomenCategoryByName(String name) {
		// TODO Auto-generated method stub
		return womenCategoryRepository.findByName(name);
	}

}
