package by_module_01;

/**���� ����������� ����� �,
 *  ������� ������������ ������������ ���������� ������� � ��������. 
 *  ������� ������ �������� ������������ � �����, 
 *  ������� � �������� � ��������� �����: ��� ����� SSc.
*/

import java.util.*;

/**
 * @author kabal
 *
 */
public class task05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����� ����� � ��������");
		int t = 2421;

		int hour = t / 3600; // �������� ���������� �����
		System.out.println(hour + " hour ");
		int min = (t % 3600) / 60; // �������� ���������� �����
		System.out.println(min + " min ");
		int sec = (t % 3600) % 60; // �������� ���������� ������
		System.out.println(sec + " sec");
		// ������
		System.out.println(hour + "� " + min + "��� " + sec + "c.");

	}

}
