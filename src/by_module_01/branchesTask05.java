/**
 *  ¬˚˜ËÒÎËÚ¸ ÁÌ‡˜ÂÌËÂ ÙÛÌÍˆËË:
 *  «¿ƒ¿◊¿ π5 ¬≈“¬À≈Õ»ﬂ
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask05 {

	public static void main(String[] args) {

		// Œ¡⁄ﬂ¬À≈Õ»≈ ¬¬Œƒ » »Õ»÷»¿À»«¿÷»ﬂ œ≈–≈Ã≈ÕÕ€’
		double fx;
		System.out.println("¬‚Â‰ËÚÂ x >>");
		int x = inputINT();

		// –≈ÿ≈Õ»≈ ‘”Õ ÷»»
		if (x <= 3) {
			fx = x * x - 3 * x + 9;
			System.out.println(fx);
		} else {

			fx = 1 / (Math.pow(x, 3) + 6);
			System.out.println(fx);
		}

	}

	// Ã≈“Œƒ ƒÀﬂ ¬¬Œƒ¿ ƒ¿ÕÕ€’ » œ–Œ¬≈– » »’ “»œ¿ (int)
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			String i = in.nextLine();
		}
		int per = in.nextInt();
		return (per);
	}

}
