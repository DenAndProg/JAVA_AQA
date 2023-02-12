package DEN.REPOS.Threads;

public class MyThreadsSycn extends Thread{

    private String name;

    public MyThreadsSycn(String name){
        this.name = name;
    }

   public void run(){
        MySynchrony.OutText(currentThread().getName());
   }
}
