/**
 * ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
 *  ����������, ������� �� ������ ����� ���������.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask04 {

	public static int A = 0; // ��������� � ������������ ������ ��������� ����� ���������� ����������
	public static int B = 0;

	public static void main(String[] args) {
		// ���������� ����������
		int x;
		int y;
		int z;
		int c;

		// ������������� ����������
		System.out.print("������� ������ �������� � >>");
		A = inputINT();
		System.out.print("������� ������ �������� B >>");
		B = inputINT();
		System.out.print("������� ������ ������� x >>");
		x = inputINT();
		System.out.print("������� ������ ������� y >>");
		y = inputINT();
		System.out.print("������� ������ ������� � >>");
		z = inputINT();

		// �������� ����� ������� � ���������
		c = chek(x, y);
		if (c == 0) {
			System.out.println("������ ������ �����  ��������� ��������� " + A + "x" + B + " ������ x � y ");
		}
		c = chek(y, z);
		if (c == 0) {
			System.out.println("������ ������ �����  ��������� ��������� " + A + "x" + B + " ������ y � z ");
		}
		c = chek(z, x);
		if (c == 0) {
			System.out.println("������ ������ �����  ��������� ��������� " + A + "x" + B + " ������ z � x ");
		}
	}

	// ����� ��� ��������� ������� ����� ������� ����� ���������
	public static int chek(int i, int j) {
		int noy;
		if (A > i && B > j || A > j && B > i) {
			noy = 0; // ��� ��������� 0 ��������
		} else {
			noy = 1; // ��� ��������� 1 �� ��������
		}
		return (noy);
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
