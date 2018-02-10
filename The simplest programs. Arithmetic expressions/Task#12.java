/* Task # 12. Make the output program the following information:
a)
5 10
7 cm
b)
100 t
1949 v
c)
x 25
x y
Note
t, v, x and y are integer-type variables whose values ​​are entered from the keyboard
 and must be output in place of the value names.
 * Задача № 12. Составить программу вывода на экран следующей информации:
а)
5 10
7 см
б)
100 t
1949 v
в)
x 25
x y
Примечание
t, v, x и y — переменные величины целого типа, значения которых вводятся с клавиатуры
 и должны быть выведены вместо имен величин.*/

package com.gmail.sklprime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int aOne;
		aOne = 5;
		int aTwo;
		aTwo = 10;
		int aThree;
		aThree = 7;
		String aFour;
		aFour = "cm";

		System.out.println("a) " + aOne + " " + aTwo);
		System.out.println("   " + aThree + " " + aFour);

		System.out.print("Enter the value of t: ");
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		System.out.print("Enter the value of v: ");
		int v;
		v = in.nextInt();

		int bOne;
		bOne = 100;
		int bTwo;
		bTwo = t;
		int bThree;
		bThree = 1949;
		int bFour;
		bFour = v;
		
		System.out.println("b) " + bOne + " " + bTwo);
		System.out.println("   " + bThree + " " + bFour);
		
		System.out.print("Enter the value of x: ");
		int x;
		x = in.nextInt();
		System.out.print("Enter the value of y: ");
		int y;
		y = in.nextInt();
		in.close();
		
		int cOne;
		cOne = x;
		int cTwo;
		cTwo = 25;
		int cThree;
		cThree = x;
		int cFour;
		cFour = y;
		
		System.out.println("c) " + cOne + " " + cTwo);
		System.out.println("   " + cThree + " " + cFour);

	}

}
