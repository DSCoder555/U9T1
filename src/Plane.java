public class Plane extends Vehicle {
    private int wings;

    public Plane(String name, int wheels, int wings){
        super(name, wheels);
        this.wings = wings;
    }

    public int getWings(){
        return wings;
    }

    public void rise(int height){
        System.out.println(getName() + " ascended " + height + " feet.");
    }

    public void dive(int height){
        System.out.println(getName() + " descended " + height + " feet.");
    }
}
