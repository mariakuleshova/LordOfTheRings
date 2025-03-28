/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public interface OrkGearFactory {
    String createWeapon();
    String createArmor();
    String createBanner();
    void applyAttributes(Ork ork);
    String getTribe();
}
