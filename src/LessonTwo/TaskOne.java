package LessonTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* if (month >=1 && month <= 3){
            System.out.println("it's winter");
        }if (month>=4 && month <= 6){
            System.out.println("it's osen");
        }
        if (month >=7 && month <= 9){
            System.out.println("its vesna");
        }if (month >= 10 && month <= 12){
            System.out.println("its leto");
        }*/
        if (scanner.hasNextInt()){
            int month = scanner.nextInt();
            switch (month){
                 case 1, 2, 12 -> System.out.println("It's zima");
                case 3, 4, 5 -> System.out.println("It's osen");
                case 6, 7, 8 -> System.out.println("It's leto");
                case 9, 10, 11 -> System.out.println("It's vesna");
            }
        }
    }
}
