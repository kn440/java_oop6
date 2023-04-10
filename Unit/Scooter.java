package Unit;

import java.util.ArrayList;

public abstract class Scooter extends Warrior {

    protected int bahbah; 

    public Scooter(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type,int bumbum,int bahbah) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type,bumbum,bahbah);
        this.bahbah=bahbah;
    }

   
   
 

}


