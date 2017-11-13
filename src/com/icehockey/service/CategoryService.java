package com.icehockey.service;

import com.icehockey.dao.CategoryDao;
import com.icehockey.entity.Category;

public class CategoryService {

	CategoryDao dao=new CategoryDao();
	Category category=null;
	public Category queryCategory(String categoryValue) {//通过角色名称查找角色对象并返回
		category=dao.getCategoryByCategoryId(categoryValue);
		if(category!=null){
			System.out.println(category.toString());
		}
		return category;
	}

}
