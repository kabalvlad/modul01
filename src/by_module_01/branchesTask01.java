/**
 *  ���� ��� ���� ������������ (� ��������).
 *  ����������, ���������� �� ����� �����������,
 *   � ���� ��, �� ����� �� �� �������������.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String i;
		int a;
		int b;

		System.out.print("������� ���� A >> ");
		while (!input.hasNextInt()) { // �������� �������� ����� ����� ����
			System.out.print("������� ���� A >>");
			i = input.nextLine(); // ��������� ����
		}
		a = input.nextInt(); // ���������� ��������� ����� ����� ����������

		System.out.print("������� ���� B >> ");
		while (!input.hasNextInt()) {
			System.out.print("������� ���� �>>");
			i = input.nextLine();
		}
		b = input.nextInt();

		// �������� �����
		if (a + b < 180) { // �������� �� ������� ������ ������������
			System.out.println("���� ����� �����������");
			if (a + b == 90) { // ��������� �� �� �������������
				System.out.println("��� ����������� �������������");
			} else {
				System.out.println("������������ �� ������������");
			}
		} else {
			System.out.println("������ ������������ �� ����������");
		}

	}

}
