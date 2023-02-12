package DEN.REPOS.Interfaces;

public class Dog implements Animal{
    @Override
    public float height() {
        return 1;
    }
    public float height(float heights) {
        return heights;
    }

    @Override
    public float weight() {
        return 1;
    }
    public float weight(float weights){
        return weights;
    }

    @Override
    public String move() {
        return "move";
    }
    public String move(String mov){
        return "move " + mov;
    }

    @Override
    public boolean isThere() {
        return true;
    }
    public boolean isThere(boolean bool){
        return bool;
    }
}
