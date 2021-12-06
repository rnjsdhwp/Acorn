package com.jin.View.Ex09;

public class Animal {
	private String animalName;
	private String pictureName;
	
	public Animal() {	}
	
	public Animal(String animalName, String pictureName) {
		this.animalName = animalName;
		this.pictureName = pictureName;
	}
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
}
