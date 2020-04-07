package by_module_01;
// задача №3 

import java.util.*;

/**
 * @author kabal
 *
 */
public class task03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // создание обьекта ввода для класса Scanner
		// обявление переменных x и y и их инициализация
		System.out.println("Введите угол X от 0 до 90 ");
		double x = input.nextDouble();
		System.out.println("Введите угол Y от 0 до 90 ");
		double y = input.nextDouble();

		// перевод градусов в радианы
		double rx = Math.toRadians(x);
		double ry = Math.toRadians(y);
		System.out.println(" X в радианах = " + rx + " Y в радианах = " + ry);

		// Расчёт выражения
		double chisl = Math.sin(rx) + Math.cos(ry);
		double chast = Math.cos(rx) + Math.sin(ry);

		// Проверка значений cos и sin
		System.out.println(Math.cos(rx) + " " + Math.sin(rx) + " " + Math.cos(ry) + " " + Math.sin(ry));
		double sum = Math.tan(rx * ry);
		double znach = chisl / chast * sum;
		System.out.println("Значение функции = " + znach);
	}

}
