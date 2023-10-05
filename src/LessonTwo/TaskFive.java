package LessonTwo;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 1; i <= num;i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}