/**
 *  Найти сумму квадратов первых ста чисел.
 */
package by_module_01;

/**
 * @author kabal
 *
 */
public class cyclesTask03 {

	public static void main(String[] args) {
		int sum = 0;
		int x;

		for (int i = 1; i < 101; i++) {
			x = i;
			sum = sum + x * x;
			System.out.println(x+" "+ sum +" " +x*x);
		}
		System.out.println("Сумма квадратов первых 100 чисел равна " + sum);
	}

}
