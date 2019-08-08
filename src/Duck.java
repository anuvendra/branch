public abstract class Duck {

    FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void quack(){
        System.out.println("I can quack");
    }
    abstract public void display();
}
