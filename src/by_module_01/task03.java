package by_module_01;
// ������ �3 

import java.util.*;

/**
 * @author kabal
 *
 */
public class task03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // �������� ������� ����� ��� ������ Scanner
		// ��������� ���������� x � y � �� �������������
		System.out.println("������� ���� X �� 0 �� 90 ");
		double x = input.nextDouble();
		System.out.println("������� ���� Y �� 0 �� 90 ");
		double y = input.nextDouble();

		// ������� �������� � �������
		double rx = Math.toRadians(x);
		double ry = Math.toRadians(y);
		System.out.println(" X � �������� = " + rx + " Y � �������� = " + ry);

		// ������ ���������
		double chisl = Math.sin(rx) + Math.cos(ry);
		double chast = Math.cos(rx) + Math.sin(ry);

		// �������� �������� cos � sin
		System.out.println(Math.cos(rx) + " " + Math.sin(rx) + " " + Math.cos(ry) + " " + Math.sin(ry));
		double sum = Math.tan(rx * ry);
		double znach = chisl / chast * sum;
		System.out.println("�������� ������� = " + znach);
	}

}
