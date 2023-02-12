package DEN.REPOS.Threads;

public class MySynchrony {

    public synchronized static void OutText(String name){
        System.out.println("Запустился.. метод синхронизирован  " + name);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = (int) (20 +  Math.random() * 40);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


    public static void outTextUnSync(String name){
        System.out.println("Запустился.. метод НЕ синхронизирован  " + name);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = (int) (20 +  Math.random() * 40);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}
