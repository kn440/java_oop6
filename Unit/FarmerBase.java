package Unit;

import java.util.ArrayList;

public abstract class FarmerBase extends BaseUnit{

    protected int harvesting_speed; //скорость сбора урожая
    protected float volume_stocks; // запасы

    public FarmerBase(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type, int harvesting_speed, float volume_stocks) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type);
        this.harvesting_speed=harvesting_speed;
        this.volume_stocks=volume_stocks;
    }
    
    

}
