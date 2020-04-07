package by_module_01;

/**
 * @author kabal
 *
 */
import java.util.Random;
//Найдите значение функции:
//z = ( (a – 3 ) * b / 2) + c.
import java.util.Scanner; // импорт класса 

public class task01 {

	public static void main(String[] args) {
		// обьявление переменных
		double a;
		double b;
		int c;
		double z;

		Scanner input = new Scanner(System.in); // создание обьекта ввода для класса Scanner
		Random rand = new Random(); // создания обьекта для создания рандомного числа "c"

		System.out.println("Введите число - a");
		a = input.nextDouble();
		System.out.println("Введите число - b");
		b = input.nextDouble();
		c = rand.nextInt(100); // выбирает число случайно от 0 до 100
		System.out.println(c + " - число  с");
		System.out.println(" Число 'а' - " + a + " Число 'b' - " + b + " Число 'c' - " + c);
		z = ((a - 3) * b / 2) + c; // расчет функции
		System.out.println("Значение функции z = " + z);

	}

}
