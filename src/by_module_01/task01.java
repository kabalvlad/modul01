package by_module_01;

/**
 * @author kabal
 *
 */
import java.util.Random;
//������� �������� �������:
//z = ( (a � 3 ) * b / 2) + c.
import java.util.Scanner; // ������ ������ 

public class task01 {

	public static void main(String[] args) {
		// ���������� ����������
		double a;
		double b;
		int c;
		double z;

		Scanner input = new Scanner(System.in); // �������� ������� ����� ��� ������ Scanner
		Random rand = new Random(); // �������� ������� ��� �������� ���������� ����� "c"

		System.out.println("������� ����� - a");
		a = input.nextDouble();
		System.out.println("������� ����� - b");
		b = input.nextDouble();
		c = rand.nextInt(100); // �������� ����� �������� �� 0 �� 100
		System.out.println(c + " - �����  �");
		System.out.println(" ����� '�' - " + a + " ����� 'b' - " + b + " ����� 'c' - " + c);
		z = ((a - 3) * b / 2) + c; // ������ �������
		System.out.println("�������� ������� z = " + z);

	}

}
