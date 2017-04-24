package com.sort;

import java.util.Scanner;

//二分查找法
@SuppressWarnings("resource")
public class BinaryChop {
	
	static int[] arrs=new int[]{8,12,36,54,66};
	static int length=arrs.length;
	static int v;
	public static void main(String[] args){
		while(true){
			int a=0;
			
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("请输入一个数字：");
				a=sc.nextInt();
	
			} catch (Exception e) {
				System.out.println("输入错误，请重新输入");
			}
			
			sort(a,0,length-1);
		}
	}
	
	public static void sort(int i,int left,int right){
		int len=(left+right)/2;
		if(arrs[len]<i&&(right-len)!=0){
			sort(i,len+1,right);
		}else if(arrs[len]>i&&(len-left)!=0){
			sort(i,left,len);
		}else if(arrs[len]==i){
			System.out.println("len:"+len+"v:"+v+"arrs["+len+"]:"+arrs[len]);
		}else{
			v=0;
			System.out.println(v);
		}
	}
}
