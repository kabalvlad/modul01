/**
 * ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������. 
 */
package by_module_01;

/**
 * @author kabal
 *
 */
import java.util.Scanner;

public class branchesTask03 {

	public static void main(String[] args) {

		// ��������� ����������
		int xa;
		int ya;
		int xb;
		int yb;
		int xc;
		int yc;
		double AB;
		double BC;
		double CA;
		double poluPirimetr; // ������������
		double square; // �������

		// ������������� ����������
		System.out.print("xa >> ");
		xa = inputINT();
		System.out.print("ya >> ");
		ya = inputINT();

		System.out.print("xb >> ");
		xb = inputINT();
		System.out.print("yb >> ");
		yb = inputINT();

		System.out.print("xc >> ");
		xc = inputINT();
		System.out.print("yc >> ");
		yc = inputINT();

		// ���ר� ������ �������
		AB = distantIJ(xa, ya, xb, yb);
		BC = distantIJ(xb, yb, xc, yc);
		CA = distantIJ(xc, yc, xa, ya);

		// ���ר� ������������� � ������ ������������ �� 3-�� �����
		poluPirimetr = (AB + BC + CA) / 2;
		square = Math.sqrt(poluPirimetr * (poluPirimetr - AB) * (poluPirimetr - BC) * (poluPirimetr - CA));

		// �������� ������� ������
		if (square == 0) {
			System.out.println("����� � � � ����������� �� ����� ������");
		} else {
			System.out.println("����� A B C �� ����������� �� ����� ������");
		}
	}

	// ����� �� ���������� ������ ����� ������
	public static double distantIJ(int x1, int y1, int x2, int y2) {
		double IJ = Math.hypot(x2 - x1, y2 - y1);
		return (IJ);
	}

	// ����� ��� ����� ������ � �������� �� ���� (int) ����� ������� ��������� ������� ���� ���� ��������� ���
	public static int inputINT() {
		Scanner in = new Scanner(System.in);
		while (!in.hasNextInt()) {
			System.out.print(" >> ");
			String i = in.nextLine();
		}
		int per = in.nextInt();
		return (per);
	}

}
