/**
 * ��� ������ ������� ��������� �������� ���������,
 * ������� �������� true, ���� ����� � ������������ (�, �) 
 * ����������� ����������� �������, � false � � ��������� ������: 
 * ������ �6
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class task06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String i; // ���������� ��� ����� ������

		System.out.print("������� x >> ");
		while (!it.hasNextInt()) { // �������� �������� ����� ����� ����
			System.out.print("������� ����� �����>>");
			i = it.nextLine(); // ��������� ����
		}
		int x = it.nextInt(); // ���������� ��������� ����� ����� ����������

		System.out.print("������� y >> ");
		while (!it.hasNextInt()) {
			System.out.print("������� ����� ����� >>");
			i = it.nextLine();
		}
		int y = it.nextInt();

		// �������� �����
		if (x == 0 && y == -1) {
			System.out.println("false");
		} else {
			if (x >= -1 && x <= 1 && y >= -2 && y <= 3) {
				System.out.println("true");
			} else {
				if (x >= -3 && x <= -2 && y >= -2 && y <= -1) {
					System.out.println("true");
				} else {
					if (x >= 2 && x <= 3 && y >= -2 && y <= -1) {
						System.out.println("true");
					} else {
						System.out.println("false");
					}
				}

			}
		}

	}

}
