package tutorial.consInject;


public class Car {
    private Specification specs;


    public Car(Specification specs) {
        this.specs = specs;
    }

    public void display(){
        System.out.println("car detail: "+ specs);
    }

}
