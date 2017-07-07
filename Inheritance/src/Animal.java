/**
 * Created by johnsabilla on 7/7/2017.
 */
public class Animal
{
    public int age = 0;
    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void eat(){
        System.out.println("An animal is eating.");
    }

    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat(22);
        d.ruff();
        c.meow();
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();

        System.out.println(a.age);
        System.out.println(c.age);


        //What happens?
        Animal o = new Dog();
        o.eat();

        //a subclass can be generalized to a superclass
        //a superclass cannot be more specific subclass
    }
}
