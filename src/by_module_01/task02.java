package by_module_01;

/**
 * @author kabal
 *
 */
// ������ �2 �� �������

public class task02 {

	public static void main(String[] args) {
		// ���������� ���������� � �� �������������
		double a = 9;
		double b = 8;
		double c = 7;

		double chast = 2 * a; // ��� �����
		double cheslit = b + Math.sqrt(b * b + 4 * a * c); // ���� �����
		System.out.println(cheslit); // �������� �������
		double razn = Math.pow(a, 3) * c; // �������� � �����
		System.out.println(razn); // �������� �������
		double sum = Math.pow(b, (-2)); // �������� � �����
		System.out.println(sum); // �������� �������
		double otvet = cheslit / chast + razn - sum;
		System.out.println("������� ������� = " + otvet); // ����� �� ������
	}

}
