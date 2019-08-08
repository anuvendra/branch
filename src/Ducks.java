import java.util.ArrayList;
import java.util.List;

public class Ducks {

    List<Duck> ducks = new ArrayList<>();

    public void addDuck(Duck duck){
        ducks.add(duck);
    }

    public Duck findBy(int index){
        return ducks.get(index);
    }
}
