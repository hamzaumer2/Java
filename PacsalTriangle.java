package com.company;
import java.util.Scanner;
public class Main {
static int fact(int last) {
int first;
for (first = 1; last > 1; last--) {
first = first * last;
}
return first;
}
static int ncr(int n, int r) {
int i = fact(n) / fact(n - r) / fact(r);
return i;
}
public static void main(String[] args) {
System.out.println("Enter Number of lines to print: ");
Scanner myObj = new Scanner(System.in);
int n = myObj.nextInt();
for (int i = 0; i <= n - 1; i++) {
for (int j = 0; j <= (n - i); j++) System.out.print(" ");
for (int k = 0; k <= i; k++) System.out.print(" " + ncr(i,
k));
System.out.println();
}
}
}
