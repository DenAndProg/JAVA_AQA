package DEN.REPOS.Threads;

public class UnSyncThread extends Thread{

    private String name;

    public UnSyncThread(String name){
        this.name = name;
    }

    public void run(){
        MySynchrony.outTextUnSync(currentThread().getName());
    }
}
