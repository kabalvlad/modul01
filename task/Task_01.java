/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/*
 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
 */
public class Task_01 {

    public static void main(String[] args) {
        String text;

        System.out.print("Введие любой текст >> ");
        text = Imput.input();
        System.out.println(" ");
        SeachVoid(text);
    }

    public static void SeachVoid(String text) {
        char value;
        int count;
        int countMax;
        countMax = 0;
        for (int i = 0; i < text.length(); i++) {
            value = text.charAt(i);
            if (value == ' ') {
                count = 1;
                for (int j = i + 1; j < text.length(); j++) {
                    value = text.charAt(j);
                    if (value != ' ') {
                        break;
                    }
                    count++;
                }
                countMax = Math.max(count, countMax);
            }
        }
        System.out.println(" Максимальное число пробелов равно " + countMax);
    }
}
