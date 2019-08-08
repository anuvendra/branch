public class Main {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehaviour(new FlyNoWay());

        Ducks ducks = new Ducks();
        ducks.addDuck(mallardDuck);
        ducks.addDuck(rubberDuck);

        Pond pond = new Pond(ducks);
        pond.makeThemFly(0);
        pond.makeThemFly(1);



    }
}
