package com.company;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
static void arr(int[] a, int rl, int cl) {
var two = new int[rl][cl];
System.out.println("Array in Two Dimensions (2D-ARRAY Conversion):
");
int i = 0;
for (int y = 0; y < rl; y++) {
for (int x = 0; x < cl; x++) {
two[y][x] = a[i];
i++;
System.out.print(two[y][x] + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
System.out.println("Enter Number of Elements of Array: ");
Scanner s = new Scanner(System.in);
int size = s.nextInt();
System.out.println("Enter Values of Array: ");
int[] myArray = new int[size];
for (int i = 0; i < size; i++) {
System.out.println("Enter Value Number " + (i + 1) + ": ");
myArray[i] = s.nextInt();
}
System.out.println();
System.out.println("Array in One Dimension(1-D ARRAY INPUT): " +
Arrays.toString(myArray));
arr(myArray,
(int) Math.ceil(size / 2),
size / 2);
}
}
