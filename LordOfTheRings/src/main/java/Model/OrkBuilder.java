/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.github.javafaker.*;
/**
 *
 * @author maria
 */
public class OrkBuilder {
    private final Ork ork = new Ork();
    private final OrkGearFactory gearFactory;
    private final Faker faker = new Faker();

    public OrkBuilder(OrkGearFactory factory) {
        this.gearFactory = factory;
        ork.setName(faker.lordOfTheRings().character());
        ork.setTribe(factory.getTribe());
    }

    public OrkBuilder withRole(String role) {
        gearFactory.applyAttributes(ork);
        ork.setWeapon(gearFactory.createWeapon());
        ork.setArmor(gearFactory.createArmor());
        ork.setBanner(gearFactory.createBanner());
        switch (role.toUpperCase()) {
            case "LEADER":
                ork.setBanner(ork.getBanner() + " + Горн");
                break;
            case "SCOUT":
                ork.setWeapon("Лук");
                break;
        }
        return this;
    }

    public Ork build() {
        return ork;
    }
}