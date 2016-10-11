package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		// insert test
		insertTest();
		getListTest();
	}

	public static void insertTest() {
		CategoryDao dao = new CategoryDao();

		CategoryVo vo1 = new CategoryVo();
		vo1.setName("수필");
		dao.insert(vo1);

		CategoryVo vo2 = new CategoryVo();
		vo2.setName("에세이");
		dao.insert(vo2);

	}

	public static void getListTest() {
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();

		System.out.println("===============================================");
		for (CategoryVo vo : list) {
			// System.out.println(vo.getNo() + ":" + vo.getName());
			System.out.println(vo);
		}
		System.out.println("===============================================");
	}
}
