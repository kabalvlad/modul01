package by_module_01;

/**Дано натуральное число Т,
 *  которое представляет длительность прошедшего времени в секундах. 
 *  Вывести данное значение длительности в часах, 
 *  минутах и секундах в следующей форме: ННч ММмин SSc.
*/

import java.util.*;

/**
 * @author kabal
 *
 */
public class task05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введи время в секундах");
		int t = 2421;

		int hour = t / 3600; // проверка вычесление часов
		System.out.println(hour + " hour ");
		int min = (t % 3600) / 60; // првоерка вычисление минут
		System.out.println(min + " min ");
		int sec = (t % 3600) % 60; // провекра вычесления секунд
		System.out.println(sec + " sec");
		// ввывод
		System.out.println(hour + "ч " + min + "мин " + sec + "c.");

	}

}
