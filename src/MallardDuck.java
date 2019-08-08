public class MallardDuck extends Duck implements FlyBehaviour {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("My name is Mallard");
    }

    public  void fly(){
        flyBehaviour.fly();

    }



}
