package com.example.MclothingStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MclothingStore.entity.MenCategory;
import com.example.MclothingStore.repository.MenCategoryRepository;
import com.example.MclothingStore.repository.WomenCategoryRepository;
@Service
public class MenClothingServiceImpl implements MenClothingService {
	
	@Autowired
	private MenCategoryRepository menCategoryRepository;

	@Override
	public MenCategory addMenCategory(MenCategory menCategory) {
		return menCategoryRepository.save(menCategory);
	}

	@Override
	public List<MenCategory> getMenCategoriesBySectionName(String sectionname) {
		return menCategoryRepository.findBySectionname(sectionname);
	}

	@Override
	public Optional<MenCategory> getMenCategoryById(Long id) {
		return menCategoryRepository.findById(id);
	}

	@Override
	public MenCategory getMenCategoryByName(String name) {
		return menCategoryRepository.findByName(name);
	}

}
