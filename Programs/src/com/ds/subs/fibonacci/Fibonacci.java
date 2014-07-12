package com.ds.subs.fibonacci;

public class Fibonacci {
	
	//0 1 1 2 3 5
	//0 1 2 3 4 5
	public static int fib( int n ) {
		int sum=-1;
		if(n==0) return 0;
		else if(n==1 || n==2) return 1;
		else {
			int prevbutone=1;
			int last=1;
			for(int k=2;k<n;k++) {
				sum=last+prevbutone;
				prevbutone=last;
				last=sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(7));
	}

}
