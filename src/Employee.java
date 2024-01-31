public abstract class Employee {
    private String name;
    Employee(String name){
        this.name = name;
    }
    abstract void Work();
    public String getName(){
        return name;
    }
}
class SE extends Employee{
    SE(String name){
        super (name);
    }

    @Override
    void Work() {
        System.out.println(getName() +"Working on tikTok project!");
    }
}
class ITEngineer extends Employee{
    ITEngineer(String name){
        super(name);
    }

    @Override
    void Work() {
        System.out.println(getName() + "Working on computer issues{!");
    }
}
class Test3{
    public static void main(String[] args) {
        Employee e,em;
        e = new SE("Lahiru");
        em = new ITEngineer("Malith");
        e.Work();
        em.Work();
    }
}