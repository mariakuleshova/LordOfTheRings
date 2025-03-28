/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author maria
 */
public class Controller {
    private final List<Ork> army = new ArrayList<>();
    private final OrkDirector director = new OrkDirector();
    private final Map<String, OrkBuilderFactory> factories = new HashMap<>();

    public Controller() {
        factories.put("Мордор", new MordorOrkBuilderFactory());
        factories.put("Дол Гулдур", new DolGuldurOrkBuilderFactory());
        factories.put("Мглистые Горы", new MistyMountainsOrkBuilderFactory());
    }

    public void createOrk(String tribe, String role) {
        OrkBuilder builder = factories.get(tribe).createBuilder();
        Ork ork = switch(role.toUpperCase()) {
            case "LEADER" -> director.createLeaderOrk(builder);
            case "SCOUT" -> director.createScoutOrk(builder);
            default -> director.createBasicOrk(builder);
        };
        army.add(ork);
    }

    public List<Ork> getArmy() {
        return new ArrayList<>(army);
    }
    
    public String[] getAvailableTribes() {
//        return new String[]{"Мордор", "Дол Гулдур", "Мглистые Горы"};
        return factories.keySet().toArray(new String[0]);
    }

    public Map<String, List<String>> getArmyStructure() {
        Map<String, List<String>> structure = new HashMap<>();
        army.forEach(ork -> {
            structure.computeIfAbsent(ork.getTribe(), k -> new ArrayList<>())
                    .add(ork.getName());
        });
        return structure;
    }

    
     public Map<String, Object> getOrkInfo(String orkName) {
        Ork ork = army.stream()
                .filter(o -> o.getName().equals(orkName))
                .findFirst()
                .orElse(null);

        if (ork == null) {
            return Collections.emptyMap();
        }

        Map<String, Object> info = new HashMap<>();
        info.put("name", ork.getName());
        info.put("tribe", ork.getTribe());
        info.put("weapon", ork.getWeapon());
        info.put("armor", ork.getArmor());
        info.put("banner", ork.getBanner());
        info.put("strength", ork.getStrength());
        info.put("agility", ork.getAgility());
        info.put("intellect", ork.getIntellect());
        info.put("health", ork.getHealth());
        
        return info;
    }
//    
//     public Ork getOrkByName(String name) {
//        return army.stream()
//                .filter(ork -> ork.getName().equals(name))
//                .findFirst()
//                .orElse(null);
//    }
}
