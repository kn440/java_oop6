package Unit;

import java.util.ArrayList;

public abstract class Warrior extends BaseUnit{
    protected int bumbum; // дополнительный параметр
    public Warrior(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type,int bumbum, int bahbah) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type);
        this.bumbum=bumbum;
    }
    
    
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        if (bumbum>0 && this.health>0)
        {
            
            BaseUnit target = team.get(0);
            double minDistance = this.position.getDistance(team.get(0));
            for (BaseUnit unit:team)
            {
                if (this.position.getDistance(unit)<minDistance){
                minDistance=this.position.getDistance(unit);
                    target=unit;
                
                }
            }
            
            
            this.position.direction(target.position, friends);
            this.bumbum--;
        }
        
    }
    
    
    

}
    

