package DEN.REPOS.Modifiers;

public class FirstClass {

    public static int count;

    public void one(){
        System.out.println("public one()");
    }

    protected void two(){
        System.out.println("protected two()");
    }

    private void three(){
        System.out.println("private three()");
    }

    public static int count(){
        count++;
        return count;
    }
}
