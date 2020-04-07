package com.jay.ds;

public class Stars {
public static void print(int n) {
System.out.println("Number of stars to be printed: " + n);
int rows =1;
int sum = 0;
while(n > sum) {
sum =sum + rows;
rows++;
}
rows--;
System.out.println("Rows: "+ rows);
sum = 0;
for(int i=1;i <=rows; i++ ) {
	for(int j=1; j<=(rows-i); j++ ) {
		System.out.print("\t");
	}
	for(int k=1;k <=i; k++ ) {
		System.out.print("*");
		sum++;
if(sum == n) {
break;
}
		System.out.print("\t\t");
	}
if(sum == n) {
break;
}
	System.out.println("\n");	
}
}
public static void main(String[] args) {
	print(13);
}
}
