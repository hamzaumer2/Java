package com.company;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
public static void main(String[] args) {
out.println("Enter String to Convert to Character: ");
Scanner myObj = new Scanner(System.in);
String str = myObj.nextLine();
char[] var;
var = new char[str.length()];
for (int i = 0; i < str.length(); i++) var[i] = str.charAt(i);
out.println("PRINTING IN CHARACTER FORMAT");
for (char c : var) {
out.print(c);
out.print(", ");
}
}
}
