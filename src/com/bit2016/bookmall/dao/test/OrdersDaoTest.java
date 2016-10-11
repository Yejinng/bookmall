package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.vo.OrdersVo;

public class OrdersDaoTest {

	public static void main(String[] args) {
		// insert test
		insertTest();
		//getListTest();
	}

	public static void insertTest() {
		OrdersDao dao = new OrdersDao();

		OrdersVo vo1 = new OrdersVo();
		vo1.setPrice(50000L);
		vo1.setAddress("서울시 양천구 233-2");
		dao.insert(vo1);

		OrdersVo vo2 = new OrdersVo();
		vo2.setPrice(80000L);
		vo2.setAddress("서울시 마포구 544-12");
		dao.insert(vo2);

	}

	public static void getListTest() {
		OrdersDao dao = new OrdersDao();
		List<OrdersVo> list = dao.getList();

		System.out.println("===============================================");
		for (OrdersVo vo : list) {
			// System.out.println(vo.getNo() + ":" + vo.getName());
			System.out.println(vo);
		}
		System.out.println("===============================================");
	}
}
