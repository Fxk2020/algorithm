package com.fxk.ccf202012;

import java.util.Scanner;
/**
 * 直接两层循环做的话会导致运行超时！
 * @author yuanbao
 *
 */

public class T2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int y[] = new int[n];
		int result[] = new int[n];
		int prediction[] = new int[n];//作为阈值时，正确预测的数值
		
		for (int i = 0; i < n; i++) {
			y[i] = scanner.nextInt();
			result[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			prediction[i] = 0;
			for (int j = 0; j < n; j++) {
				if (y[j]>=y[i]&&result[j]==1) {
					prediction[i]++;
				}else if (y[j]<y[i]&&result[j]==0) {
					prediction[i]++;
				}
			}
		}
		
		int temp_number = prediction[0];
		int temp_value = 0;
		for (int i = 0; i < n; i++) {
			if (prediction[i]>temp_number||(prediction[i]==temp_number&&y[i]>temp_value)) {
				temp_number = prediction[i];
				temp_value = y[i];		
			}
		}
		scanner.close();
		System.out.print(temp_value);
		
	}

}
