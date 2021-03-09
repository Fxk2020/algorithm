package com.fxk.ccf20209;

import java.util.Scanner;

public class T1 {
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		int cokes[] = new int[n];//记录蛋糕的重量
		int countPeople = 0;//记录分到蛋糕的朋友数
		
		for (int i = 0; i < n; i++) {
			cokes[i] = in.nextInt();
		}
		
		int j=0;
		while(j<n) {
			if(cokes[j]>=k) {
				countPeople++;
				j++;
			}else {
				j = sumNext(j,cokes,k)+1;
				countPeople++;
			}
		}
		
		in.close();
		System.out.println(countPeople);
	}

	private static int sumNext(int j, int[] cokes,int k) {
		if (j==cokes.length-1) {
			return j;
		}else {
			int sum = cokes[j]+cokes[j+1];
			j++;//下一块蛋糕
			cokes[j]=sum;
			if (cokes[j]>=k) {
				return j;
			}else {
				return sumNext(j, cokes, k);
			}
		}
	}

}
