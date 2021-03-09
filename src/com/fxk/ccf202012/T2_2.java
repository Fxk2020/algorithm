package com.fxk.ccf202012;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//工具类，将y和result绑定在一起
class Element {
	int y;
	int result;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}

//比较器，x坐标从小到大排序；x相同时，按照y从小到大排序
class MyComprator implements Comparator<Object> {
	public int compare(Object arg0, Object arg1) {
		Element e1=(Element)arg0;
        Element e2=(Element)arg1;
        if(e1.getY() != e2.getY())
            return e1.getY()>e2.getY()? 1:-1;
        else
            return e1.getResult()>e2.getResult()? 1:-1;
	}
}

public class T2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		Element elementsElement[] = new Element[n];
		int prediction[] = new int[n];// 作为阈值时，正确预测的数值

		for (int i = 0; i < n; i++) {
			elementsElement[i] = new Element();
			elementsElement[i].setY(scanner.nextInt());
			elementsElement[i].setResult(scanner.nextInt());
		}

		// 对所有分组按y值大小进行排序
		Arrays.sort(elementsElement, new MyComprator());
//		for (int i = 0; i < n; i++) {
//			System.out.println(elementsElement[i].getY());
//		}
		
		//计算正确预测的值
		for (int i = 0; i < n; i++) {
			prediction[i] = 0;
			for (int j = 0; j < i; j++) {
				prediction[i] += elementsElement[j].getResult()==0&&elementsElement[j].getY()!=elementsElement[i].getY()?1:0;
			}
			for (int j = i; j < n; j++) {
				prediction[i] += elementsElement[j].getResult();
			}
		}
		
		int temp_number = elementsElement[0].getY();
		int temp_value = prediction[0];
		for (int i = 0; i < n; i++) {
			if (prediction[i]>=temp_value) {
				temp_value = prediction[i];
				temp_number = elementsElement[i].getY();
			}
		}
		
		scanner.close();
		System.out.println(temp_number);
		
	}

}
