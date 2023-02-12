package DEN.REPOS;

import DEN.REPOS.Classes.Test;
import DEN.REPOS.Cycle.Cycle;
import DEN.REPOS.DataType.DataType;
import DEN.REPOS.Generic.Gener;
import DEN.REPOS.HashMap.Collections;
import DEN.REPOS.Modifiers.SecondClass;
import DEN.REPOS.Operators.Operators;
import DEN.REPOS.Threads.MyThreadsSycn ;
import DEN.REPOS.Threads.UnSyncThread;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
	    int[] sum = {1, 3, 5, 6};
       // DataType.average();
       // DataType.factorial(6);
       // DataType.priceOfProd();
       // DataType.number();
        // DataType.stringArray();
      //DataType.stringHello();
       // DataType.boolNumber();
        //Operators.diary();
        //Cycle.factorial();
       // Cycle.condition();
        //Cycle.myForEach();
      // Collections.myMap();
       // Gener.gener("dfd");

        MyThreadsSycn threads1 = new MyThreadsSycn("thread1");
        MyThreadsSycn  threads2 = new MyThreadsSycn("thread2");
        threads1.start();
        threads2.start();

        UnSyncThread[] myArray = new UnSyncThread[10];
        for(int i = 0; i < 10; i++){
            myArray[i] = new UnSyncThread("name");
            myArray[i].start();
        }

    }
}
