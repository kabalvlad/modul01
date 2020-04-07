/**
 * Äàíû òðè òî÷êè À(õ1,ó1), Â(õ2,ó2) è Ñ(õ3,ó3). Îïðåäåëèòü, áóäóò ëè îíè ðàñïîëîæåíû íà îäíîé ïðÿìîé. 
 */
package by_module_01;

/**
 * @author kabal
 *
 */
import java.util.Scanner;

public class branchesTask03 {

	public static void main(String[] args) {

		// ÎÁÚßÂËÅÈÅ ÏÅÐÅÌÅÍÍÛÕ
		int xa;
		int ya;
		int xb;
		int yb;
		int xc;
		int yc;
		double AB;
		double BC;
		double CA;
		double poluPirimetr; // ÏÎËÓÏÅÐÈÌÅÒÐ
		double square; // ÏËÎÙÀÄÜ

		// ÈÍÈÖÈÀËÈÇÀÖÈß ÏÅÐÅÌÅÍÍÛÕ
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

		// ÐÀÑ×¨Ò ÄËÈÍÍÛ ÂÅÊÒÎÐÂ
		AB = distantIJ(xa, ya, xb, yb);
		BC = distantIJ(xb, yb, xc, yc);
		CA = distantIJ(xc, yc, xa, ya);

		// ÐÀÑ×¨Ò ÏÎËÓÏÈÐÅÌÅÒÐÀ È ÏÎÙÀÄÈ ÒÐÅÃÓÎËÜÍÈÊÀ ÈÇ 3-¨Õ ÒÎ×ÅÊ
		poluPirimetr = (AB + BC + CA) / 2;
		square = Math.sqrt(poluPirimetr * (poluPirimetr - AB) * (poluPirimetr - BC) * (poluPirimetr - CA));

		// ÏÐÎÂÅÐÊÀ ÓÑËÎÂÈß ÇÀÄÀ×È
		if (square == 0) {
			System.out.println("Òî÷êè À Â Ñ ðàñïîëîæåíû íà îäíîé ïðÿìîé");
		} else {
			System.out.println("Òî÷êè A B C íå ðàñïîëîæåíû íà îäíîé ïðÿìîé");
		}
	}

	// ÌÅÒÎÄ ÏÎ ÍÀÕÎÆÄÅÍÈÞ ÄÍÈÍÍÛ ÌÅÆÄÓ ÒÎ×ÊÌÈ
	public static double distantIJ(int x1, int y1, int x2, int y2) {
		double IJ = Math.hypot(x2 - x1, y2 - y1);
		return (IJ);
	}

	// ÌÅÒÎÄ ÄËß ÂÂÎÄÀ ÄÀÍÍÛÕ È ÏÐÎÂÅÐÊÈ ÈÕ ÒÈÏÀ (int) ÐÅØÈË ÂÂÛÅÑÒÈ ÎÒÄÅËÜÍÛÌ ÌÅÒÎÄÎÌ ÂÂÎÄ ×ÒÎÁ ÓÌÅÍÜØÈÒÜ ÊÎÄ
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
