package com.sort;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("resource")
public class BubblingSort {
	static int length;
	static int[] ints;

	public static void main(String[] args) {
		while (true) {

			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("请输入数组长度：");
				length = sc.nextInt();
				ints = new int[length];

				System.out.println("请输入数组：");
				for (int i = 0; i < length; i++) {
					ints[i] = sc.nextInt();
				}
			} catch (Exception e) {
				System.out.println("输入错误，请重新输入");
				continue;
			}

			boolean key = true;
			while (key) {
				System.out.println("请选择排序方式：");
				System.out.println("1:升序");
				System.out.println("2:降序");
				System.out.println("3:使用两种排序");
				System.out.println("4:重新输入数组");
				int type = sc.nextInt();

				switch (type) {
				case 1:
					System.out.println("原数组为："+Arrays.toString(ints));
					up();
					break;

				case 2:
					System.out.println("原数组为："+Arrays.toString(ints));
					down();
					break;
				case 3:
					System.out.println("原数组为："+Arrays.toString(ints));
					up();
					down();
					break;
				case 4:
					key = false;
					break;
				default:
					System.out.println("输入出错，请重新输入");
					continue;
				}
			}
		}
	}

	public static void up() {
		int a;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1;j++){
				if(ints[j]>ints[j+1]){
					a=ints[j+1];
					ints[j+1]=ints[j];
					ints[j]=a;
				}
			}
		}

		System.out.println("升序后的数组为："+Arrays.toString(ints));
	}

	public static void down() {
		int a;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1;j++){
				if(ints[j]<ints[j+1]){
					a=ints[j+1];
					ints[j+1]=ints[j];
					ints[j]=a;
				}
			}
		}
		System.out.println("降序后的数组为："+Arrays.toString(ints));
	}
}
