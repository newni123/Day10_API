package com.iu.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 주민등록번호를 입력 991222-1234567
		// 9 7 1 2 2 2 1 2 3 4 5 6 7 (검증용 번호)
		// * * * * * * * * * * * *
		// 2 3 4 5 6 7 8 9 2 3 4 5 (1)
		// 18+ 21+ 4+ 10+ 12+ 14+ 8+ 18+ 6+ 12+ 20+ 30 = 173 (2)
		// 173 / 11 (3)
		// 11 - ↑ 나머지 = 결과값 (4)
		// 결과값이 두자리라면 결과값 / 10 => 나머지를 결과값에 대입 (4-1)
		// 결과값 == 검증용번호 확인 (5)

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String idNum = sc.nextLine();
		String num = idNum.substring(0, 6);
		num = num + idNum.substring(7, 14);
		idNum = num;
		int sum = 0;
		int idx = 2;
		// String idNum = sc.nextLine();

		// 1.split
		String[] idNums = idNum.split("");

		// 2.substring
		for (int i = 0; i < idNum.length()-1; i++) {
			String n1 = idNum.substring(i, i + 1);
			int n = Integer.parseInt(n1);
			// System.out.println(n1);
		}

		// 3.charAt
		for (int i = 0; i < idNum.length()-1; i++) {
			char ch = idNum.charAt(i);
			String n1 = String.valueOf(ch);

			int n = Integer.parseInt(n1);
			sum = sum + n * idx;
			idx++;
			if (idx == 10)
				idx = 2;

		}
		sum = sum % 11;
		if (sum <= 10)
			sum = sum % 10;
		
		sum = 11 - sum;
		
		int result = Integer.parseInt(String.valueOf(idNum.charAt(idNum.length()-1)));
		
		if(sum == result)
			System.out.println("맞는 번호");
		else 
			System.out.println("틀린 번호");
		

	}

}
