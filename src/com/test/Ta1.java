package com.test;

public class Ta1 {

	public static void main(String[] args) {
		//show();
		//System.out.println(showch("Google"));
		arrSort();
	}

	private static void arrSort() {
	int arr[] = new int[] {3,8,5,2,1,8,6};
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
		
	}

	private static String showch(String s) {
		String ss="";
		//char arr[]=new char[] {'g','o','o','g','l','e'};
		char arr[]=s.toLowerCase().toCharArray();
		int fr[] = new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//System.out.println(arr[j]);
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited) {
			//System.out.println(arr[i] + " -- " + fr[i]);
				ss+=arr[i] + "-" + fr[i] + ", ";
			}
		}
		return ss;
	}
	

	private static void show() {
		int arr[] = new int[] { 2, 4, 3, 2, 2, 7, 8, 8, 6, 2, 8, 5, 3, 5, 9 };
		int fr[] = new int[arr.length];
		
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println(arr[i] + " | " + fr[i]);
			}
		}

	}
}
