/* Task # 3. Create a program to display the number entered on the keyboard.
 * The message must be preceded by the message "You entered a number".
 * Задача № 3. Составить программу вывода на экран числа, вводимого с клавиатуры.
 * Выво-димому числу должно предшествовать сообщение "Вы ввели число".*/

package com.gmail.sklprime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int number;
		number = in.nextInt();
		in.close();

		System.out.println("You entered a number: " + number);

	}

}
