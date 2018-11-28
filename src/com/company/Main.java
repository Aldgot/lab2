package com.company;

public class Main {

    public void stepen (int n)
    {
        System.out.println("Значение выражения 2^n");
        int pow = 1;
        int a = 2;
        for (int i = 1; i <= n; i++)
        {
            pow *= a;
            System.out.println(a + "^" + i + " = " + pow);
        }
    }

    public int faktorial (int n) {
        System.out.println("\nРасчёт факториала");
        int factorial = 1;
        if ( n < 1 )
            System.out.println("Некорректный ввод!");
        else
            for (int i = 1; i <= n; i++)
                factorial *= i;

        return factorial;
    }


    public void vichislenie (int a, int b) {
        System.out.println("\nСумма, разность, произведение 2-х чисел");
        int sum, dif, multi;
        sum = a + b;
        dif = a - b;
        multi = a * b;
        System.out.println("Сумма: " + sum +
                "\nРазность: " + dif +
                "\nПроизведение: " + multi);
    }

    public void vremPadenia (int h) {
        System.out.println("\nВычисление времени свободного падения");
        final int g = 10;
        int t = 0;
        t = (int)Math.sqrt(2*h/g);
        System.out.println("Время свободного падения: " + t);
    }

    public void katet (int c, int a) {
        System.out.println("\nНахождение длины катета");
        int b = 0;
        if (c < 0 && a < 0)
            System.out.println("Некорректный ввод!");
        else
        {
            b = (int)Math.sqrt(a*a + c*c);
            System.out.println("Длина катета: " + b);
        }

    }


    public static void main (String[] args) {
        Main myLab2 = new Main();

        myLab2.stepen(5);
        System.out.println("Факториал равен: " + myLab2.faktorial(7));
        myLab2.vremPadenia(200);
        myLab2.vichislenie(5,7);
        myLab2.katet(6,9);
    }
}