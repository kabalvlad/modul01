/**
 *  ��������� �������� ������� �� ������� [�,b] c ����� h:
 *  ������ �2
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask02 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double sta;
		double fin;
		double x;
		double y;

		 System.out.println("������� ����� � >>");
		 a = inputDouble();
		 System.out.println("������� ����� B >>");
		 b = inputDouble();
		 System.out.println("������� ���>>");
		 h = inputDouble();

		// ������ ������ ������� � �����
		sta = Math.min(a, b);
		fin = Math.max(a, b);

		// ���� �������
		x = sta;
		while (x <= fin) {
			if (x > 2) {
				y = x;
				System.out.println(y);
			} else {
				y = (-x);
				System.out.println(y);
			}
			x = x + h;
		}

	}

	// ����� ��� ����� ������ � �������� �� ���� (double)
	public static double inputDouble() {
		Scanner in = new Scanner(System.in);
		while (!in.hasNextDouble()) {
			System.out.print(" >> ");
			String i = in.nextLine();
		}
		double per = in.nextDouble();
		return (per);
	}

}
