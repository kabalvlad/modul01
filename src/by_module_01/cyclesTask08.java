/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask08 {

	public static void main(String[] args) {

		int i;
		int j;
		int k = 10;
		int provI;
		int provJ;
		int z; // переменная чтоб второй цикл вайл начал рабоатать заново

		System.out.print("введите первое число>>");
		i = inputInt();
		System.out.print("введите второе число>>");
		j = inputInt();

		System.out.println("В составе чисел " + i + " и  " + j + " входят числа: ");
		while (i > 0) {
			provI = i % k;
			i = i / k;
			z = j;
			while (z > 0) {
				provJ = z % k;
				z = z / k;
				if (provI == provJ) {
					System.out.println(" - " + provJ);
				}

			}

		}

	}

	// МЕТОД ДЛЯ ВВОДА ДАННЫХ И ПРОВЕРКИ ИХ ТИПА (int)
	public static int inputInt() {
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			String i = in.nextLine();
		}
		int per = in.nextInt();
		return (per);
	}
}
