package com.metanit;

/*
    20
    Даны целые положительные числа N и K. Найти сумму 1K + 2K + … + NK.
    Чтобы избежать целочисленного переполнения, вычислять слагаемые этой суммы
    с помощью вещественной переменной и выводить результат как вещественное число.

 */

import java.util.Scanner;

public class Main {

   public static double GetResult(int n, int k) {

       double sum = 0.0;

       for (int i = 1; i <= n; i++)
           sum += Math.pow(i, k);

       return sum;

   } // Метод для нахождения суммы

    public static void Print() {

        Scanner input = new Scanner(System.in);

        int n, k;

        System.out.print("Введите N: ");
        n = input.nextInt();

        System.out.print("Введите K: ");
        k = input.nextInt();

        System.out.println("Их сумма 1^k + 2^K + ... +N^K: " + GetResult(n, k));

    } // Метод для задания значений пользователем

    public static void main(String[] args) {

        Print();

    }
}
