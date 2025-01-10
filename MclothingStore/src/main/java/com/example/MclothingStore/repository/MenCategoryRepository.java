package com.example.MclothingStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MclothingStore.entity.MenCategory;
import com.example.MclothingStore.entity.WomenCategory;

@Repository
public interface MenCategoryRepository extends JpaRepository<MenCategory, Long> {
	
	List<MenCategory> findBySectionname(String sectionname);
	 
	

    MenCategory findByName(String name);
    
}