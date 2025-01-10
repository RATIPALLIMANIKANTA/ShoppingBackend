package com.example.MclothingStore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.MclothingStore.entity.MenCategory;

@Service
public interface MenClothingService {

  public MenCategory addMenCategory(MenCategory menCategory);

public List<MenCategory> getMenCategoriesBySectionName(String sectionName);

public Optional<MenCategory> getMenCategoryById(Long id);

public MenCategory getMenCategoryByName(String name);

}
