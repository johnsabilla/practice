/**
 * Created by johnsabilla on 7/7/2017.
 */
public class Dog extends Animal
{


    public Dog(){
        //call parent class constructor
        super(15);
        System.out.println("A dog has been created.");
    }

    public void ruff(){
        System.out.println("Dog says ruff.");
    }

    public void run() {
        System.out.println("A dog is running.");
    }
}
