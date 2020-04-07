package by_module_01;

/**
 * @author kabal
 *
 */
// задача №2 из задания

public class task02 {

	public static void main(String[] args) {
		// обьявление переменных и их инициализация
		double a = 9;
		double b = 8;
		double c = 7;

		double chast = 2 * a; // низ дроби
		double cheslit = b + Math.sqrt(b * b + 4 * a * c); // верх дроби
		System.out.println(cheslit); // проверка функции
		double razn = Math.pow(a, 3) * c; // разность к числу
		System.out.println(razn); // проверка функции
		double sum = Math.pow(b, (-2)); // сложение к числу
		System.out.println(sum); // проверка функции
		double otvet = cheslit / chast + razn - sum;
		System.out.println("решение функции = " + otvet); // ответ на задачу
	}

}
