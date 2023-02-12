package DEN.REPOS.Operators;

import java.util.Scanner;

public class Operators {

    private static String time;
    private static double money;

    public static void diary(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время в формате hh:mm:ss ");
        time = sc.next();
        String[] str = time.split(":");
        if(Integer.parseInt(str[0]) > 23 || Integer.parseInt(str[0]) < 0 ||
                Integer.parseInt(str[1]) > 59 || Integer.parseInt(str[1]) < 0 ||
                    Integer.parseInt(str[2]) > 59 || Integer.parseInt(str[2]) < 0)
            System.out.println("Неверный формат времени!");

            int hour = Integer.parseInt(str[0]);
        System.out.println("Введите сколько у вас денег в формате");
        money = sc.nextDouble();

        if(hour >= 8 && hour <= 12 && money > 10) System.out.println("Идем в магазин..");
        else if(hour > 12 && money > 50) System.out.println("Идем в кафе..");
        else if(hour < 19 && money < 50) System.out.println("Идем к соседу..");
        else if(hour >= 19 && hour < 22 ) System.out.println("Смотрим телевизор..");
        else if(hour >= 22) System.out.println("Спим..");
        else System.out.println("Свободное время..");
    }
}
