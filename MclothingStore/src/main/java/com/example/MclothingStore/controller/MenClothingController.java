package com.example.MclothingStore.controller;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.MclothingStore.entity.MenCategory;
import com.example.MclothingStore.entity.WomenCategory;
import com.example.MclothingStore.service.MenClothingService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/men")
public class MenClothingController {
	
	
	
	
	
	@Autowired
	private  MenClothingService menClothingService;
	
	
	
	@PostMapping("/sectionname/{sectionname}")
    public ResponseEntity<MenCategory> addMenCategory(@PathVariable("sectionname") String sectionname,
           @RequestParam("data") String data,
           @RequestParam("image") MultipartFile image
    ) {
		MenCategory savedCategory=null;
		try {
		 ObjectMapper objectMapper= new ObjectMapper();
		 MenCategory menCategory = objectMapper.readValue(data, MenCategory.class);
		 
		 if(!image.isEmpty()) {
			 menCategory.setImage(image.getBytes());
		 }
 
         savedCategory = menClothingService.addMenCategory(menCategory);
        return ResponseEntity.ok(savedCategory);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		 return ResponseEntity.ok(savedCategory);
    }

	
	@GetMapping("/sectionname/{sectionname}")
	public ResponseEntity<List<MenCategory>> getMenCategoriesBySectionName(@PathVariable("sectionname") String sectionname){
		List<MenCategory> items= menClothingService.getMenCategoriesBySectionName(sectionname);
		
		for(MenCategory item:items) {
			if(item.getImage() !=null) {
				String base64Image = encodeToBase64(item.getImage());
				item.setBase64Image(base64Image);
			}
		}
		return ResponseEntity.ok(items);
	}
	
	private String encodeToBase64(byte[] imageBytes) {
		return Base64.getEncoder().encodeToString(imageBytes);
	}
	
	@GetMapping("/{id}")
	public Optional<MenCategory> getMenCategoryById(@PathVariable Long id){
		return menClothingService.getMenCategoryById(id);
	}
	
	@GetMapping("/name/{name}")
	public MenCategory getMenCategoryByName(@PathVariable String name) {
		return menClothingService.getMenCategoryByName(name);
	}
	
	

}
