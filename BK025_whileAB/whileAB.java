package BK025_whileAB;

import java.util.Scanner;

public class whileAB {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int re = 0;

		while (re < 10) {
			re++;

			System.out.println(a + b + "\n");
		}

	}
}

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//https://www.acmicpc.net/problem/10952
