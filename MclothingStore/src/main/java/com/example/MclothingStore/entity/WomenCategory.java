package com.example.MclothingStore.entity;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="women_categories")
public class WomenCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="sectionname",nullable = false,length = 255)
	 private String sectionname;
	@Lob
	@Column(name="image",nullable = false)
	 private byte[] image;
	@Column(name="description",columnDefinition = "TEXT")
	 private String description;
	@Column(name="initialPrice",precision = 10)
	 private Double initialPrice;
	@Column(name="offerPrice",precision = 10)
	 private Double offerPrice;
	@Column(name="name",length = 255)
	 private String name;
	@Column(name="dealname",length = 255)
	 private String dealname;
	@Column(name="sizes",length = 255)
	 private String sizes;
	@Column(name="sizeChart",length = 255)
	 private String sizeChart;
	@Column(name="freeDelivery")
	 private Boolean freeDelivery;
	@Column(name="cashDelivery")
	 private Boolean cashDelivery;
	@Column
	 private Date DeliveryDate;
	@Column
	 private String returnPolicy;
	@Column
	 private Boolean codAvailable;
	@Column
	 private String highlights;
	@Column
	 private String fabricDetails;
	@Column
	 private String color;
	@Lob
	@Column
	 private String ratingsReviews;
	@Lob
	@Column
	 private String questionAnswers;
	
	
	public WomenCategory() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(Double initialPrice) {
		this.initialPrice = initialPrice;
	}
	public Double getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(Double offerPrice) {
		this.offerPrice = offerPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDealname() {
		return dealname;
	}
	public void setDealname(String dealname) {
		this.dealname = dealname;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getSizeChart() {
		return sizeChart;
	}
	public void setSizeChart(String sizeChart) {
		this.sizeChart = sizeChart;
	}
	public Boolean getFreeDelivery() {
		return freeDelivery;
	}
	public void setFreeDelivery(Boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	public Boolean getCashDelivery() {
		return cashDelivery;
	}
	public void setCashDelivery(Boolean cashDelivery) {
		this.cashDelivery = cashDelivery;
	}
	public Date getDeliveryDate() {
		return DeliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public String getReturnPolicy() {
		return returnPolicy;
	}
	public void setReturnPolicy(String returnPolicy) {
		this.returnPolicy = returnPolicy;
	}
	public Boolean getCodAvailable() {
		return codAvailable;
	}
	public void setCodAvailable(Boolean codAvailable) {
		this.codAvailable = codAvailable;
	}
	public String getHighlights() {
		return highlights;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public String getFabricDetails() {
		return fabricDetails;
	}
	public void setFabricDetails(String fabricDetails) {
		this.fabricDetails = fabricDetails;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRatingsReviews() {
		return ratingsReviews;
	}
	public void setRatingsReviews(String ratingsReviews) {
		this.ratingsReviews = ratingsReviews;
	}
	public String getQuestionAnswers() {
		return questionAnswers;
	}
	public void setQuestionAnswers(String questionAnswers) {
		this.questionAnswers = questionAnswers;
	}
	@Override
	public String toString() {
		return "WomenCategory [id=" + id + ", sectionname=" + sectionname + ", image=" + Arrays.toString(image)
				+ ", description=" + description + ", initialPrice=" + initialPrice + ", offerPrice=" + offerPrice
				+ ", name=" + name + ", dealname=" + dealname + ", sizes=" + sizes + ", sizeChart=" + sizeChart
				+ ", freeDelivery=" + freeDelivery + ", cashDelivery=" + cashDelivery + ", DeliveryDate=" + DeliveryDate
				+ ", returnPolicy=" + returnPolicy + ", codAvailable=" + codAvailable + ", highlights=" + highlights
				+ ", fabricDetails=" + fabricDetails + ", color=" + color + ", ratingsReviews=" + ratingsReviews
				+ ", questionAnswers=" + questionAnswers + "]";
	}
	public WomenCategory(Long id, String sectionname, byte[] image, String description, Double initialPrice,
			Double offerPrice, String name, String dealname, String sizes, String sizeChart, Boolean freeDelivery,
			Boolean cashDelivery, Date deliveryDate, String returnPolicy, Boolean codAvailable, String highlights,
			String fabricDetails, String color, String ratingsReviews, String questionAnswers) {
		super();
		this.id = id;
		this.sectionname = sectionname;
		this.image = image;
		this.description = description;
		this.initialPrice = initialPrice;
		this.offerPrice = offerPrice;
		this.name = name;
		this.dealname = dealname;
		this.sizes = sizes;
		this.sizeChart = sizeChart;
		this.freeDelivery = freeDelivery;
		this.cashDelivery = cashDelivery;
		DeliveryDate = deliveryDate;
		this.returnPolicy = returnPolicy;
		this.codAvailable = codAvailable;
		this.highlights = highlights;
		this.fabricDetails = fabricDetails;
		this.color = color;
		this.ratingsReviews = ratingsReviews;
		this.questionAnswers = questionAnswers;
	}
	
	
	

}
