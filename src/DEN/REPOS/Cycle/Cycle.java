package DEN.REPOS.Cycle;

import java.util.Scanner;

public class Cycle {

    public static Scanner sc = new Scanner(System.in);

    public static void factorial(){
        System.out.print("Введите число, чтобы найти его факториал: ");
        int number = sc.nextInt();
        if(number < 0) {System.out.println("Ваше число отрицательное!"); return;}
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Факториал числа: " + factorial);
    }

    public static void condition(){
        int number = 15;

        do{
            System.out.print(number + " ");
            number--;
        }while(number >= 10);


        number = 15;
        while(number >= 10){
            System.out.print(number + " ");
            number--;
        }
    }

    public static void myForEach(){
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 11);
        }
        for(int arr : array){
            if(arr == 5) System.out.println(5);
        }
    }
}
