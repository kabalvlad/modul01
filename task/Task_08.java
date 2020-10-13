/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 * 8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
 * не обрабатывать
 */
public class Task_08 {

    public static void main(String[] args) {
        String text;

        System.out.print("Введие любой текст >> ");
        text = Imput.input();
        System.out.println(" ");
        wordId(text);

    }

    //основной метод
    public static void wordId(String text) {
        int lengthMax;
        int positionMax;
        boolean value;

        String[] words = text.split("\\s");

        //посик самого длинного слова
        lengthMax = 0;
        positionMax = 0;
        for (int i = 0; i < words.length; i++) {
            if (lengthMax < words[i].length()) {
                positionMax = i;
                lengthMax = words[i].length();
            }
        }

        //проверка сколько самых длинных слов
        value = true;
        for (int i = 0; i < words.length; i++) {
            if (i == positionMax) {
                continue;
            }
            if (lengthMax == words[i].length()) {
                value = false;
            }
        }

        //вводт ответа
        if (value) {
            System.out.println(words[positionMax]);
        } else {
            System.out.println("Введенных строке несколько максимально длинных слов");
        }
    }
}
