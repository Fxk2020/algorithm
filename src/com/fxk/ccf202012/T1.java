package com.fxk.ccf202012;
/**
 * 简单的逻辑分析即可！
 */
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int score[] = new int[n];
		int wi[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			score[i] = scanner.nextInt();
			wi[i] = scanner.nextInt();
		}
		
		int y=0,temp=0;
		for (int i = 0; i < n; i++) {
			temp += score[i]*wi[i];
		}
		
		if (temp>y) {
			y = temp;
		}
		scanner.close();
		System.out.print(y);
		

	}

}
