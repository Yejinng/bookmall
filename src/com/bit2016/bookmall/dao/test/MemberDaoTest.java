package com.bit2016.bookmall.dao.test;

import java.util.List;

import com.bit2016.bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
		// insert test
		insertTest();
		getListTest();
	}

	public static void insertTest() {
		MemberDao dao = new MemberDao();

		MemberVo vo1 = new MemberVo();
		vo1.setName("박예진");
		vo1.setTel("010-1234-5678");
		vo1.setEmail("dldkfj@naver.com");
		vo1.setPassword("dsfhks2323");
		dao.insert(vo1);

		MemberVo vo2 = new MemberVo();
		vo2.setName("박현진");
		vo2.setTel("010-7654-3456");
		vo2.setEmail("qqujjj@naver.com");
		vo2.setPassword("dhjky574");
		dao.insert(vo2);


	}

	public static void getListTest() {
		MemberDao dao = new MemberDao();
		List<MemberVo> list = dao.getList();

		System.out.println("===============================================");
		for (MemberVo vo : list) {
			// System.out.println(vo.getNo() + ":" + vo.getName());
			System.out.println(vo);
		}
		System.out.println("===============================================");
	}
}
