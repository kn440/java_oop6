package Unit;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseUnit implements UnitInterface {
    
    public ArrayList <BaseUnit> name;
    protected int attack, defence, maxHealth, supply, gangSize;
    public float health;	 
    protected int speed;	
    protected int[] damage;
    protected Position position;
    public String type;
    

    

    public BaseUnit (ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type)
    {
        
        this.name=name;
        this.attack= attack;
        this.defence=defence; 
        this.maxHealth=maxHealth; 
        this.supply=0; 
        this.gangSize=gangSize;
        this.health=health;	 
        this.speed=speed;	
        this.damage=damage;
        this.position=new Position(x,y);
        this.type=this.getClass().getName().split("\\.")[1];

    }

    
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getInfo()
    {
        String outStr=String.format("\t %-3s\t %-3d\t %-3d\t %-3d%%\t %-3d\t      ", type,attack,defence,(int)health*100/maxHealth,(damage[0]+damage[1])/2);
        return outStr;
    }
    
    @Override
    public String toString() {
        
        return "Name: "+name+", Type: "+getInfo()+", Attack: "+attack+", Defence: "
        +defence+", Damage: "+Arrays.toString(damage)+", Health: "
        +health+", Speed: "+speed;
    }

   @Override
   public Position getPosition() {
      
    return this.position;
   }

@Override
public String getName() {
    return this.getClass().getName().split("\\.")[1];
}
   @Override
   public void getDamage(int attack) {
            if (this.health - attack > 0) {
                this.health -= attack;
            } else
                this.health = 0;
        }
   }


