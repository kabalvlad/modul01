/**
 *  �������� ���������, ��� ������������ ������
 *   ����� ����� ������������� �����. � ��������� ��������� 
 *  ��� ����� �� 1 �� ���������� ������������� �����.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask01 {

	public static void main(String[] args) {
		int sum = 0;
		int x;
		System.out.print("������� ����� ����� ������������� ����� >>");
		x = inputInt();

		for (int i = 1; i < x; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
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
