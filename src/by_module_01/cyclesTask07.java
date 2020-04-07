/**
 * Для каждого натурального числа в промежутке от m до n 
 * вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask07 {

	public static void main(String[] args) {

		// ОБЯВЛЕНИЕ ПЕРЕМЕННЫХ
		int m;
		int n;
		int min; // МИН И МАХ ДЛЯ НАХОЖДЕНИЯ НАЧАЛО ОТСЧЁТА
		int max;
		int ost;

		// ВВОД И ИНИЦИАЛИЗАЦИЯ ПЕРЕМЕННЫХ
		System.out.println("Укажтите начальное число,  числового  промежутка >>");
		m = inputInt();
		System.out.println("Укажтите конечное число,  числового  промежутка >>");
		n = inputInt();

		// НАХОДИМ НАЧАЛО ЧИСЛВОГОГО ПРОМЕЖУТКА, НАИМЕНЬШЕЕ ЧИСЛО
		min = Math.min(n, m);
		max = Math.max(m, n);

		// ОСНОВНОЙ МЕТОД
		while (min < max) { // ПЕРЕБИРАЕМ ВСЕ ЧИСЛА ОТ НАЧАЛА ДО КОНЦА
			for (int del = 2; del < min; del++) { // НАХОДИМ ДЕЛИТЕДИ ЧИСЛА
				ost = min % del; // ЕСЛИ ОСТАТОК РАВНЕН 0 ЭТОТИ ЕСТЬ НАШ ДЕЛИТЕЛЬ
				if (ost == 0) {
					System.out.println("Делителем числа " + min + " является " + del);
				}
			}
			min++;

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
