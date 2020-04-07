/**
 * ��� ������� ������������ ����� � ���������� �� m �� n 
 * ������� ��� ��������, ����� ������� � ������ �����.
 * m � n �������� � ����������.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask07 {

	public static void main(String[] args) {

		// ��������� ����������
		int m;
		int n;
		int min; // ��� � ��� ��� ���������� ������ ���ר��
		int max;
		int ost;

		// ���� � ������������� ����������
		System.out.println("�������� ��������� �����,  ���������  ���������� >>");
		m = inputInt();
		System.out.println("�������� �������� �����,  ���������  ���������� >>");
		n = inputInt();

		// ������� ������ ���������� ����������, ���������� �����
		min = Math.min(n, m);
		max = Math.max(m, n);

		// �������� �����
		while (min < max) { // ���������� ��� ����� �� ������ �� �����
			for (int del = 2; del < min; del++) { // ������� �������� �����
				ost = min % del; // ���� ������� ������ 0 ����� ���� ��� ��������
				if (ost == 0) {
					System.out.println("��������� ����� " + min + " �������� " + del);
				}
			}
			min++;

		}
	}

	// ����� ��� ����� ������ � �������� �� ���� (int)
	public static int inputInt() {
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			String i = in.nextLine();
		}
		int per = in.nextInt();
		return (per);
	}

}
