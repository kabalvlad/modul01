/**
 * ���� �������� ��� � ��������� ����� �. 
 * ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
 * ��������� �. ����� ���� ���� ����� ���:
 * ������ �5
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class cyclesTask05 {

	public static void main(String[] args) {
		double b = 100; // ����� ��������� ����
		double n = 1; // ������ ��������� ����
		double e = 0.001; // ����� �
		double an; // ���� ����
		double sum = 0; // ����� ����

		while (n < b) {
			an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(an) >= e) {
				sum = sum + an;
			}
			n++;
		}
		System.out.println("����� ������ ���� ����� = " + sum);

	}

}
