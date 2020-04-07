/**
 * ƒл€ данной области составить линейную программу,
 * котора€ печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false Ч в противном случае: 
 * задача є6
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class task06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String i; // переменна€ дл€ ввода данных

		System.out.print("¬ведите x >> ");
		while (!it.hasNextInt()) { // ѕроверка веденого числа через цикл
			System.out.print("¬ведите целое число>>");
			i = it.nextLine(); // повторный ввод
		}
		int x = it.nextInt(); // присвоение введеного числа нашей переменной

		System.out.print("¬ведите y >> ");
		while (!it.hasNextInt()) {
			System.out.print("¬ведите целое число >>");
			i = it.nextLine();
		}
		int y = it.nextInt();

		// основной метод
		if (x == 0 && y == -1) {
			System.out.println("false");
		} else {
			if (x >= -1 && x <= 1 && y >= -2 && y <= 3) {
				System.out.println("true");
			} else {
				if (x >= -3 && x <= -2 && y >= -2 && y <= -1) {
					System.out.println("true");
				} else {
					if (x >= 2 && x <= 3 && y >= -2 && y <= -1) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
				}

			}
		}

	}

}
