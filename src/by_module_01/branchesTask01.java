/**
 *  Даны два угла треугольника (в градусах).
 *  Определить, существует ли такой треугольник,
 *   и если да, то будет ли он прямоугольным.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String i;
		int a;
		int b;

		System.out.print("Введите угол A >> ");
		while (!input.hasNextInt()) { // Проверка веденого числа через цикл
			System.out.print("Введите угол A >>");
			i = input.nextLine(); // повторный ввод
		}
		a = input.nextInt(); // присвоение введеного числа нашей переменной

		System.out.print("Введите угол B >> ");
		while (!input.hasNextInt()) {
			System.out.print("Введите угол В>>");
			i = input.nextLine();
		}
		b = input.nextInt();

		// основная часть
		if (a + b < 180) { // проверка на наличие такого треугольника
			System.out.println("есть такой треугольник");
			if (a + b == 90) { // являеться ли он прямоугольным
				System.out.println("это треугольник прямоугольный");
			} else {
				System.out.println("треугольныик не прямоуголный");
			}
		} else {
			System.out.println("даного треугольника не сущетсвует");
		}

	}

}
