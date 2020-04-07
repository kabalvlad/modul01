/**
 * Çàäàíû ðàçìåðû À, Â ïðÿìîóãîëüíîãî îòâåðñòèÿ è ðàçìåðû õ, ó, z êèðïè÷à.
 *  Îïðåäåëèòü, ïðîéäåò ëè êèðïè÷ ÷åðåç îòâåðñòèå.
 */
package by_module_01;

import java.util.Scanner;

/**
 * @author kabal
 *
 */
public class branchesTask04 {

	public static int A = 0; // ÎÁßÂËÅÍÈÅ È ÈÍÈÖÈÀËÈÇÀÈß ÐÀÇÌÅÐ ÎÒÂÅÐÑÒÈß ×ÅÐÅÇ ÃËÎÁÀËÜÍÛÅ ÏÅÐÅÌÅÍÍÛÅ
	public static int B = 0;

	public static void main(String[] args) {
		// ÎÁÚßÂËÅÍÈÅ ÏÅÐÅÌÅÍÍÛÕ
		int x;
		int y;
		int z;
		int c;

		// ÈÍÈÖÈÀËÈÇÀÖÈß ÏÅÐÅÌÅÍÍÛÕ
		System.out.print("Ââåäèòå äëèííó îòâðñòèÿ À >>");
		A = inputINT();
		System.out.print("Ââåäèòå øèðèíó îòâðñòèÿ B >>");
		B = inputINT();
		System.out.print("Ââåäèòå äëèííó êèðïè÷à x >>");
		x = inputINT();
		System.out.print("Ââåäèòå øèðèíó êèðïè÷à y >>");
		y = inputINT();
		System.out.print("Ââåäèòå âûñîòó êèðïè÷à ÿ >>");
		z = inputINT();

		// ÏÐÎÂÅÐÊÀ ÂÕÎÄÀ ÊÈÐÏÈ×À Â ÎÒÂÅÐÑÒÈÅ
		c = chek(x, y);
		if (c == 0) {
			System.out.println("Êèðïè÷ ïðîéä¸ò ÷åðåç  îòâåðñòèå ðàçìåðàìè " + A + "x" + B + " ãðÿíìè x è y ");
		}
		c = chek(y, z);
		if (c == 0) {
			System.out.println("Êèðïè÷ ïðîéä¸ò ÷åðåç  îòâåðñòèå ðàçìåðàìè " + A + "x" + B + " ãðÿíìè y è z ");
		}
		c = chek(z, x);
		if (c == 0) {
			System.out.println("Êèðïè÷ ïðîéä¸ò ÷åðåç  îòâåðñòèå ðàçìåðàìè " + A + "x" + B + " ãðÿíìè z è x ");
		}
	}

	// ÌÅÒÎÄ ÄËß ÏÐÎÂÅÊÐÊÈ ÏÐÎÕÎÄÀ ÃÐÀÍÈ ÊÈÐÏÈ×À ×ÅÐÅÇ ÎÒÂÅÐÑÒÈÅ
	public static int chek(int i, int j) {
		int noy;
		if (A > i && B > j || A > j && B > i) {
			noy = 0; // ÏÐÈ ÏÎËÓ×ÅÍÈÅ 0 ÏÐÎÕÎÄÈÒ
		} else {
			noy = 1; // ÏÐÈ ÏÎËÓ×ÅÍÈÅ 1 ÍÅ ÏÐÎÕÎÄÈÒ
		}
		return (noy);
	}

	// ÌÅÒÎÄ ÄËß ÂÂÎÄÀ ÄÀÍÍÛÕ È ÏÐÎÂÅÐÊÈ ÈÕ ÒÈÏÀ (int)
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
