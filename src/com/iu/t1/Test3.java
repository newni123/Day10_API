package com.iu.t1;

public class Test3 {

	public static void main(String[] args) {
		double d = Math.ceil(6.72);
		System.out.println(d); // 올림
		d = 6.72;
		d = Math.floor(d);
		System.out.println(d); // 내림
		d = 6.4999999999999999; // 0.9xxx 15개 부터 1취급 해주는 듯
		d = Math.round(d);
		System.out.println(d); // 반올림

		d = Math.random();
		System.out.println(d);

		// 0 ~ 9 중 하나를 뽑기
		System.out.println((int) (d * 10));

	}

}
