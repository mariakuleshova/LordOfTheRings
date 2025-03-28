/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public class MordorGearFactory implements OrkGearFactory{
    @Override public String createWeapon() { 
        return "Тяжелый меч"; }
    @Override public String createArmor() { 
        return "Стальная броня"; }
    @Override public String createBanner() { 
        return "Красное Око"; }
    @Override public String getTribe() { 
        return "Мордор"; }

    @Override
    public void applyAttributes(Ork ork) {
        ork.setStrength((int)(Math.random()*70 + 30)); // +30% силы
        ork.setAgility((int)(Math.random()*70));
        ork.setIntellect((int)(Math.random()*50));
        ork.setHealth((int)(Math.random()*150 + 50));
    }
}
