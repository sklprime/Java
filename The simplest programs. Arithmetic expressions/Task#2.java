/* Task # 1. Display the number e (the base of the natural logarithm) to within a tenth.
 * Задача № 1. Вывести на экран число e (основание натурального логарифма) с точностью до десятых.*/

package com.gmail.sklprime;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {

		Formatter form = new Formatter();
		form.format("%.1f", Math.E);

		String text = form.toString();
		form.close();

		System.out.println("e = " + text);

	}

}
