/* Task # 1. Create a program to display the number entered on the keyboard.
 * After the output number should follow the message "- that's what number you entered".
 * Задача № 1. Составить программу вывода на экран числа, вводимого с клавиатуры.
 * После выводимого числа должно следовать сообщение " - вот какое число Вы ввели".*/

package com.gmail.sklprime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		in.close();

		System.out.println(number+" - that's what number you entered");

	}

}
