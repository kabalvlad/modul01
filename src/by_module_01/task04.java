package by_module_01;

// ������ �4
/**  ���� �������������� ����� R ���� nnn.ddd 
 * (��� �������� ������� � ������� � ����� ������). 
 * �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
 */

import java.util.*;

/**
 * @author kabal
 *
 */
public class task04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������� ����� ���� nnn.ddd");
		double x = input.nextDouble();
		double y = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println(y);
	}

}
