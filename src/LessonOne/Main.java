package LessonOne;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //целочисленные
        byte age = 13;// поле/характеристика/перменная
        short ageShort  = 13;// поле/характеристика/перменная
        int ageInt = 13;// поле/характеристика/перменная, default
        long ageLong = 13;// поле/характеристика/перменная
        System.out.println(age);
        System.out.println(ageShort);
        System.out.println(ageInt);
        System.out.println(ageLong);

        //с плавающей точкой (дробные)
        float a = 2.1f;
        double b = 2.1;//default

        //логические
        boolean flagF = false;
        boolean flagT = true;

        //символьные
        char z = 'z';
        char characterU = '\u1111';//из таблицы ASCII

        System.out.println(characterU);
        String line = new String("Java");//строки
        System.out.println(line);

        //преобразование
        int x = 10;
        long y = x;//неявное преобразование

        System.out.println(y);
        long u = 150;
        byte j = (byte) u;//явное преобразование

        //операторы - + / *
        int c = 10;
        int v = 20;
        System.out.println(v/c);
        int n = c + v;
        System.out.println(n);

        //инкремент/декремент
        System.out.println(c++);
        System.out.println(v--);
        System.out.println(++c);
        System.out.println(--v);

        //остаток
        System.out.println(10%2);
        System.out.println(10%3);

        int m = 11;
        System.out.println(m % 2 == 0);//проверка на чётность

        //операторы
        int s = 10;
        int d = 10;

        if (s == d){
            System.out.println("cool!");
        }else System.out.println("not cool");

        //&& - И, || - или

        //тернарный оператор
        int ega = 20;
        System.out.println(ega < 17?"cовершен":"не совершен");
    }
}