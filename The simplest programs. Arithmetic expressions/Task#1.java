/* Task # 1. Display the number Pi to the nearest hundredth.
 * Задача № 1. Вывести на экран число Pi с точностью до сотых.*/

package com.gmail.sklprime;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {

		Formatter form = new Formatter();
		form.format("%.2f", Math.PI);

		String text = form.toString();
		form.close();

		System.out.println("PI = " + text);

	}

}
