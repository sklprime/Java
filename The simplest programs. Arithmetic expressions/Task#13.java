/* Task # 13. Make the output program the following information:
a)
2 kg
13 17
b)
a 1
19 b
c)
x y
5 y
Note
a, b, x and y are integer-type variables whose values are entered from the keyboard
 and must be output in place of the value names.
 * Задача № 13. Составить программу вывода на экран следующей информации:
а)
2 кг
13 17
б)
a 1
19 b
в)
x y
5 y
Примечание
a, b, x и y — переменные величины целого типа, значения которых вводятся с клавиатуры
 и должны быть выведены вместо имен величин.*/

package com.gmail.sklprime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int aOne;
		aOne = 2;
		String aTwo;
		aTwo = "kg";
		int aThree;
		aThree = 13;
		int aFour;
		aFour = 17;

		System.out.println("a) " + aOne + " " + aTwo);
		System.out.println("   " + aThree + " " + aFour);

		System.out.print("Enter the value of a: ");
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		System.out.print("Enter the value of b: ");
		int b;
		b = in.nextInt();

		int bOne;
		bOne = a;
		int bTwo;
		bTwo = 1;
		int bThree;
		bThree = 19;
		int bFour;
		bFour = b;
		
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
		cTwo = y;
		int cThree;
		cThree = 5;
		int cFour;
		cFour = y;
		
		System.out.println("c) " + cOne + " " + cTwo);
		System.out.println("   " + cThree + " " + cFour);

	}

}
