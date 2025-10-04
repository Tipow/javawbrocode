public abstract class Shape {

    abstract double area(); //abstract(must be instantiated)

    void display(){ //concreate(it is inherited)
        System.out.println("This is a Shape");
    }
}
