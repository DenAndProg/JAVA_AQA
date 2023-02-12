package DEN.REPOS.Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TestByZero {
    public static void check(){

        try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){
            System.out.println("Нельзя делить на 0!");
        }


        FileInputStream fis = null;
        Integer num = null;
        int numm;
        try {
            numm = num;
            fis = new FileInputStream("");
        } catch (NullPointerException ex) {
            System.out.println("ссылка на объект, к которому вы обращаетесь хранит null");
        } catch (IOException e) {
            System.out.println("Ошибка ввода, вывода");
        }
    }
}
