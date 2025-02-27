

interface flyable{
    abstract void fly();
}
interface swimmable{
    abstract void swim();
}

class A implements flyable , swimmable{


@Override
public void swim() {
    System.out.println("Fish can swim");
}

@Override
public void fly() {
    System.out.println("Birds can fly");
}


}
public class Que3 {
    public static void main(String [] args){
A obj=new A();
obj.swim();
obj.fly();
    }
}
