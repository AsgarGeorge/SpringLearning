package tutorial.tutorial.autowire.byType;


public class Car {
    private Specification specs;


    public void setSpecs(Specification specs) {
        this.specs = specs;
    }

    public void display(){
        System.out.println("car detail: "+ specs);
    }

}
