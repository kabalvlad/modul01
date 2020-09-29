/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task_02 {

    public static void main(String[] args) {
        String text;

        System.out.print("Введие любой текст >> ");
        text = Imput.input();
        System.out.println(" ");
        SeachLetters(text);

    }

    public static void SeachLetters(String text) {
        char value;
        StringBuilder sBuText = new StringBuilder(text);
        for (int i = 0; i < sBuText.length(); i++) {
            value = sBuText.charAt(i);
            if (value == 'a') {
                sBuText = sBuText.insert((i + 1), 'b');
                i++;
            }
        }
        System.out.println(sBuText.toString());

    }

}
