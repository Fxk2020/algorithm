package com.fxk.ccf20209;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		Student student[] = new Student[n+1];
		int i=1;
		while(i<=n) {
			student[i] = new Student(i);
			i++;
		}
		
		for (int j = 0; j < m; j++) {
			int p = in.nextInt();
			int q = in.nextInt();
			
			int k=0;//记录同学p的位置
			if (q>0) {
				k = findP(p,student);//查找学号是p的学生的位置
				int k2;
				for ( k2 = 0; k2 < q; k2++) {
					student[k+k2].setId( student[k+k2+1].getId());
				}
				student[k+k2].setId(p);
				
			}else {
				k = findP(p,student);//查找学号是p的学生的位置
				int l;
				for (l = 0; l > q; l--) {
					student[k+l].setId(student[k+l-1].getId());
				}
				student[k+l].setId(p);
			}
		}
		
		in.close();
		for (int j = 1; j < student.length; j++) {
			System.out.print(student[j].getId()+" ");
		}
		
		
		
	}

	private static int findP(int p, Student[] student) {
		
		for (int i = 1; i < student.length; i++) {
			if (student[i].getId()==p) {
				return i;
			}
		}
		return 0;
		
	}

}

class Student{
	int id;
	
	public Student() {
		
	}
	
	public Student(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
