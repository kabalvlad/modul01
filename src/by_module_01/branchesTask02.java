/**
 * ����� max{min(a, b), min(c, d)}.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ��������� ����������
		int A;
		int B;
		int C;
		int D;
		String i;

		// �� ���� � �������������
		System.out.print("A >> ");
		while (!input.hasNextInt()) { // �������� �������� ����� ����� ����
			System.out.print("A >>");
			i = input.nextLine(); // ��������� ����
		}
		A = input.nextInt(); // ���������� ��������� ����� ����� ����������
		System.out.print("B >> ");
		while (!input.hasNextInt()) {
			System.out.print("B >>");
			i = input.nextLine();
		}
		B = input.nextInt();
		System.out.print("C >> ");
		while (!input.hasNextInt()) {
			System.out.print("C >> ");
			i = input.nextLine();
		}
		C = input.nextInt();
		System.out.print("D >> ");
		while (!input.hasNextInt()) {
			System.out.print("D >>");
			i = input.nextLine();
		}
		D = input.nextInt();

		// ������ ������ �� 2 �� �����
		reshen2(A, B, C, D);
		//reshen1(A, B, C, D);
	
	}

	public static void reshen1(int A, int B, int C, int D) {
		int minAB;
		int minCD;
		int max;

		minAB = Math.min(A, B);
		minCD = Math.min(C, D);
		max = Math.max(minAB, minCD);
		System.out.println(max);
	}

	public static void reshen2(int A, int B, int C, int D) {
		int ab;
		int cd;

		if (A <= B) {
			ab = A;
		} else {
			ab = B;
		}
		if (C <= D) {
			cd = C;
		} else {
			cd = D;
		}
		if (ab >= cd) {
			System.out.println(ab);
		} else {
			System.out.println(cd);
		}
	}

}
