/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public class DolGuldurGearFactory  implements OrkGearFactory {
    
    @Override 
    public String createWeapon() { 
        return "Копье"; 
    }
    
    @Override 
    public String createArmor() { 
        return "Кольчуга"; 
    }
    
    @Override 
    public String createBanner() { 
        return "Паук"; 
    }
    
    @Override 
    public String getTribe() { 
        return "Дол Гулдур"; 
    }

    @Override
    public void applyAttributes(Ork ork) {
        ork.setStrength((int)(Math.random()*100 + 1));
        ork.setAgility((int)(Math.random()*100 + 1));
        ork.setIntellect((int)(Math.random()*50 + 1));
        ork.setHealth((int)(Math.random()*150 + 50));
    }
}
