package com.iu.t1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 스캐너를 사용
		// 주민등록번호를 입력받음 991122-1234567

		// 나이
		// 계절
		// 성별

		boolean check = true;
		while (check) {
			Scanner sc = new Scanner(System.in);
			System.out.print("주민등록번호를 입력하세요 : ");
			String idNum = sc.nextLine();
			if (idNum.length() == 14) {
				String gender;
				String season;
				int age;

				if (Integer.parseInt(idNum.substring(7)) % 2 == 1)
					gender = "남자";
				else
					gender = "여자";
				int birthYear = Integer.parseInt(idNum.substring(0, 2));
				if (birthYear <= 99 && birthYear > 19)
					birthYear += 1900;
				else
					birthYear += 2000;
				age = 2019 - birthYear + 1;
				int birthMonth = Integer.parseInt(idNum.substring(2, 4));
				if (birthMonth >= 3 && birthMonth <= 5)
					season = "봄";
				else if (birthMonth >= 6 && birthMonth <= 8)
					season = "여름";
				else if (birthMonth >= 9 && birthMonth <= 11)
					season = "가을";
				else
					season = "겨울";
				System.out.println("성별 : " + gender);
				System.out.println("나이 : " + age);
				System.out.println("생년 : " + birthYear);
				System.out.println("생월 : " + birthMonth);
				System.out.println("태어난 계절 : " + season);
				check = false;
			} else {
				System.out.println("-을 포함한 주민번호 13자리를 입력");
				System.out.println();
			}

		}
	}
}
