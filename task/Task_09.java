/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

/**
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class Task_09 {
      public static void main(String[] args) {
        String text;

        System.out.print("Введие любой текст >> ");
        text = Imput.input();
        System.out.println(" ");
        text.matches("[a-zA-Z]");
        System.out.println(text);
        

    }
    
    
}
