/**
 *  ��������� �������� �������:
 *  ������ �5 ���������
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask05 {

	public static void main(String[] args) {

		// ���������� ���� � ������������� ����������
		double fx;
		System.out.println("������� x >>");
		int x = inputINT();

		// ������� �������
		if (x <= 3) {
			fx = x * x - 3 * x + 9;
			System.out.println(fx);
		} else {

			fx = 1 / (Math.pow(x, 3) + 6);
			System.out.println(fx);
		}

	}

	// ����� ��� ����� ������ � �������� �� ���� (int)
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
