package by_module_01;

// задача №4
/**  Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

import java.util.*;

/**
 * @author kabal
 *
 */
public class task04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Введите число вида nnn.ddd");
		double x = input.nextDouble();
		double y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println(y);
	}

}
