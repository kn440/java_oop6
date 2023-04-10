package Unit;
import java.util.ArrayList;
public interface UnitInterface {
    void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends);
    String getInfo();
    String getName();
    void getDamage(int attack);
    String toString();
    Position getPosition();
}

