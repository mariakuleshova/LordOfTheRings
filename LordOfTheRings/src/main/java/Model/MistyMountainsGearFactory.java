/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public class MistyMountainsGearFactory implements OrkGearFactory {
    @Override public String createWeapon() { 
        return "Топор"; }
    @Override public String createArmor() { 
        return "Кожаная броня"; }
    @Override public String createBanner() { 
        return "Луна"; }
    @Override public String getTribe() { 
        return "Мглистые Горы"; }

    @Override
    public void applyAttributes(Ork ork) {
        ork.setAgility((int)(Math.random()*70 + 30));
        ork.setIntellect((int)(Math.random()*35 + 1));
        ork.setStrength((int)(Math.random()*100 + 1));
        ork.setHealth((int)(Math.random()*150 + 50));
    }
}
