package com.hp.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hp.utils.CategoryType;

@Controller
public class HomeController {

	@RequestMapping(value="/categories",produces={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ArrayList<CategoryType> findAll(){
		ArrayList<CategoryType> categories = new ArrayList<CategoryType>();
		categories.add(CategoryType.Gown);
		categories.add(CategoryType.Lehenga);
		categories.add(CategoryType.Saree);
		categories.add(CategoryType.Suit);
		categories.add(CategoryType.Kids);
		return categories;
	}

	@RequestMapping(value="/category/{id}")
	public @ResponseBody String findCategory(@PathVariable("id") String categoryType){

		return CategoryType.valueOf(categoryType).findCategoryName();
	}

}
