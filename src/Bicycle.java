public class Bicycle extends Vehicle{
    private int gearCount;
    public Bicycle(String name, int wheels, int gearCount){
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public void ring(){
        System.out.println("Bell rung. Ring, ring!");
    }

    public int getGearCount(){
        return gearCount;
    }
}