package DEN.REPOS.DataType;

import java.util.Scanner;

public class DataType{

    public static Scanner sc = new Scanner(System.in);

    public static void average(){
        int sum = 0;
        int[] array = {3, 6, 8, 8};

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Среднее арифметическое массива: " + sum);
    }

    public static void factorial(int b){
        if(b <= 0) System.out.println("Ваше число отрицательное!");
        else {
            int sum = 1;
            for (int i = 1; i <= b; i++) {
                sum *= i;
            }
            System.out.println("Факториал числа: " + sum);
        }
    }

    public static void priceOfProd(){
        int[] Products = {156, 245, 252, 222, 211};
        System.out.print("Введите код(Id) товара >> ");
        int action = sc.nextInt(); sc.nextLine();
        if(action >= Products.length || action < 0) System.out.println("Введен неверный код товара!");
        else System.out.println("Цена товара: " + Products[action] + "$");
    }

    public static void number(){
        System.out.print("Введите число: ");
        int n = sc.nextInt(); sc.nextLine();
        if(n % 2 == 0) System.out.println("Введеное число четное!");
        else System.out.println("Введеное число нечетное!");
    }

    public static void stringArray(){
        String[] str1 = {"pr", "i", "ve", "t", "world"};
        String str2 = "";

        for(int i = 0; i < str1.length; i++){
            str2 = str2.concat(str1[i] + " ");
        }
        System.out.print("Строка: " + str2 + "\nМассив:");

        str1 = str2.split(" ");

            for(int i = 0; i < str1.length; i++){
                System.out.print(str1[i] + " ");
            }
    }

    public static void stringHello(){
        String[] str = {"dot", "cat", "pet"};
        for(int i = 0; i < str.length; i++){
            str[i] = str[i].concat("hello");
            System.out.println(str[i]);
        }
    }

    public static void boolNumber(){
        int[] intArray = {3, 5, 2, 5, 0, -3};
        boolean[] boolArray = new boolean[intArray.length];
        System.out.println("Массив: ");
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] <= 0) boolArray[i] = false;
            else boolArray[i] = true;
            System.out.print(boolArray[i] + " ");
        }
    }
}
