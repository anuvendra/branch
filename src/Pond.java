public class Pond {
    private Ducks ducks;

    public Pond(Ducks ducks) {
        this.ducks = ducks;
    }

    public void makeThemFly(int i){
        Duck duck = this.ducks.findBy(i);
        duck.performFly();
    }
}
