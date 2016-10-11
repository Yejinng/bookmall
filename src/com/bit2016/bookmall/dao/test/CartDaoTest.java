package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
		// insert test
		//insertTest();
		getListTest();
	}

	/*public static void insertTest() {
		CartDao dao = new CartDao();

		CartVo vo1 = new CartVo();
		vo1.setTitle("아프니까 청춘이다");
		vo1.setPrice(5000L);
		vo1.setCategory_no(4L);
		dao.insert(vo1);

		CartVo vo2 = new CartVo();
		vo2.setTitle("해리포터");
		vo2.setPrice(10000L);
		vo2.setCategory_no(2L);
		dao.insert(vo2);

	}*/

	public static void getListTest() {
		CartDao dao = new CartDao();
		List<CartVo> list = dao.getList();

		System.out.println("===============================================");
		for (CartVo vo : list) {
			// System.out.println(vo.getNo() + ":" + vo.getName());
			System.out.println(vo);
		}
		System.out.println("===============================================");
	}
}
