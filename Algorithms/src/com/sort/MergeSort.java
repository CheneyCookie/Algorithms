package com.sort;

import java.util.Arrays;
import java.util.Scanner;

//归并排序
@SuppressWarnings("resource")
public class MergeSort {
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
				System.out.println("4:重新输入数组");
				int type = sc.nextInt();

				switch (type) {
				case 1:
					System.out.println("原数组为："+Arrays.toString(ints));
					up();
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
		sort(ints,0,length-1);
		System.out.println("升序后的数组为："+Arrays.toString(ints));
	}

	
	public static void sort(int[] arrs,int left,int right){
		if(left<right){
			//中间索引
			int center=(left+right)/2;
			//对左边数组递归
			sort(arrs, left, center);
			//对右边数组递归
			sort(arrs, center+1, right);
			//排序合并
			merge(arrs, left, right, center);
		}
	}
	
	public static void merge(int[] arrs,int left,int right,int center){
		int[] newInts=new int[right+1];
		int i=center+1;
		int j=left;
		int k=left;
		while(left<=center&&i<=right){
			if(arrs[j]<arrs[i]){
				newInts[j++]=arrs[left++];
			}else{
				newInts[j++]=arrs[i++];
			}
			
		}
		
		while(i<=right){
			newInts[j++]=arrs[i++];
		}
		
		while(left<=center){
			newInts[j++]=arrs[left++];
		}
		while(k<=right){
			ints[k]=newInts[k];
			k++;
		}
	}
}
