package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		// insert test
		insertTest();
		getListTest();
	}

	public static void insertTest() {
		BookDao dao = new BookDao();

		BookVo vo1 = new BookVo();
		vo1.setTitle("아프니까 청춘이다");
		vo1.setPrice(5000L);
		vo1.setCategory_no(4L);
		dao.insert(vo1);

		BookVo vo2 = new BookVo();
		vo2.setTitle("해리포터");
		vo2.setPrice(10000L);
		vo2.setCategory_no(2L);
		dao.insert(vo2);

	}

	public static void getListTest() {
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();

		System.out.println("===============================================");
		for (BookVo vo : list) {
			// System.out.println(vo.getNo() + ":" + vo.getName());
			System.out.println(vo);
		}
		System.out.println("===============================================");
	}
}
