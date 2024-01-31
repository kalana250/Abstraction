public abstract class Bike {
    Bike(){
        System.out.println("Bike is working!");
    }
    abstract void ride();
    void changeGear(){
        System.out.println("Gear Change to 4!");
    }
}
class CBHornet extends Bike{
    @Override
    void ride() {
        System.out.println("Running Safety!");
    }
}
class Test1{
    public static void main(String[] args) {
        Bike b = new CBHornet();
        b.ride();
        b.changeGear();
    }
}