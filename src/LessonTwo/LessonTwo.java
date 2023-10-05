package LessonTwo;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //создание сканера

        //ввод переменной
        int ourValue = scanner.nextInt();

        //вывод переменной
        System.out.println("Your value: " + ourValue);
        System.out.println("New value: " + scanner.nextInt());

        //проверка на тип данных , scanner.hasNext
        if (ourValue > scanner.nextInt()){
            System.out.println("real");
        }else {
            System.out.println("here we go again");
        }
         int age = scanner.nextInt();
        /*switch (age){
            case 10:
                System.out.println("Da, eto 10");//1 вариант
                break;
            case 20:
                System.out.println("20");
                break;
            case 13:
                System.out.println("eto 13");
                break;
            default:
                System.out.println("i dont know");
        }*/
        switch (age){
            case 1 -> {
                System.out.println("da eto 1");
                System.out.println("infa 100");
            }
            case 20 -> System.out.println("eto 20");
            case 13 -> System.out.println("verno");
            default -> System.out.println("i dont know");
        }
        // switch можно записать в переменную


        //while - до тех пор пока...
        int number = 1;

        while (number <= 10){
            System.out.println(number++);
        }
        //do-while -сначала делает, 1 итерация всегда будет
        //for(первый;второй(условие);третий)

        //break, continue, return
        int i = 1;
        while (i < 10){
            System.out.println(++i);
            if (i == 7){
                break;
            }
        }
    }
}
