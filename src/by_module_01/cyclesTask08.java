/**
 * ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask08 {

	public static void main(String[] args) {

		int i;
		int j;
		int k = 10;
		int provI;
		int provJ;
		int z; // ���������� ���� ������ ���� ���� ����� ��������� ������

		System.out.print("������� ������ �����>>");
		i = inputInt();
		System.out.print("������� ������ �����>>");
		j = inputInt();

		System.out.println("� ������� ����� " + i + " �  " + j + " ������ �����: ");
		while (i > 0) {
			provI = i % k;
			i = i / k;
			z = j;
			while (z > 0) {
				provJ = z % k;
				z = z / k;
				if (provI == provJ) {
					System.out.println(" - " + provJ);
				}

			}

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
