package com.hp.utils;


public enum CategoryType {

	Lehenga(0,"Lehenga"),
	Saree(1,"Saree"),
	Suit(2,"Suit"),
	Gown(3,"Designer Gown"),
	Kids(4,"Kids Wear");

	private int categoryId;
	private String categoryName;

	CategoryType(int categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public String findCategoryName(){
		return categoryName;
	}

	public int findCategoryId(){
		return categoryId;
	}

}
