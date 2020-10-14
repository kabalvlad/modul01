/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и
 * позволяющее выполнять с текстом три различных операции: отсортировать абзацы
 * по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 */
import java.util.regex.*;

public class Task_3_1 {

    public static void main(String[] args) {
        String text;
        int amount; // число предложение в абзаце

        System.out.print("Введие любой текст >> ");
        text = Imput.input();
        System.out.println(" ");
        System.out.print("Введие число предложение которое должно быть в обзаце >> ");
        amount = InputInt.inInt();

        Pattern pat = Pattern.compile("[.!?][\\s]{amount}",Pattern.CASE_INSENSITIVE);
        String[] title = pat.split(text);
        for (String i : title) {
            System.out.println(i + " ||||");
        }

    }

}
