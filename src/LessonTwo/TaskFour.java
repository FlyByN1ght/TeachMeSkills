package LessonTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n > 25 && n < 100 ? "в диапазоне" :"не в диапазоне");
    }
}
