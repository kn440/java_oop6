package Unit;

import java.util.ArrayList;

public abstract class MagicMan extends BaseUnit{

    protected int power; // уровень магии

    public MagicMan(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type, int power) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type);
        this.power=power;
    }
    
   

}
