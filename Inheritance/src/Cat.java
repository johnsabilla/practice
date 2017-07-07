/**
 * Created by johnsabilla on 7/7/2017.
 */
public class Cat extends Animal
{
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created.");
    }

    public void meow(){
        System.out.println("A cat meows.");
    }

    public void prance(){
        System.out.println("A cat is prancing!");
    }
}
