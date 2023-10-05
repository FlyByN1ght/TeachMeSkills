package LessonTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        int value = 1;
        while (value <= 25){     //итерация
            if (value % 2 != 0){
                System.out.print(value + " ");
            }
            value++;
            //i + 2; sout(i + " "); - второе решение
        }
    }
}
