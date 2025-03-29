/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import java.util.ArrayList;
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
            case "КОМАНДИР", "LEADER" -> director.createLeaderOrk(builder);
            case "РАЗВЕДЧИК", "SCOUT" -> director.createScoutOrk(builder);
            default -> director.createBasicOrk(builder);
        };
        army.add(ork);  
    }
    
    public String[] getAvailableTribes() {
        return factories.keySet().toArray(new String[0]);
    }

//    Получение структуры армии для заполнения дерева в View
    public Map<String, List<String>> getArmyStructure() {
        Map<String, List<String>> structure = new HashMap<>();
        for (Ork ork : army) {
            String tribe = ork.getTribe();
            if (!structure.containsKey(tribe)) {
                structure.put(tribe, new ArrayList<>());
            }
            structure.get(tribe).add(ork.getName());
        }
        return structure;
    }

//    Получение информации об орке для заполнения labels в View
    public Map<String, Object> getOrkInfo(String orkName) {
        Ork foundOrk = null;
        for (Ork ork : army) {
            if (ork.getName().equals(orkName)) {
                foundOrk = ork;
                break;
            }
        }

        Map<String, Object> info = new HashMap<>();
        if (foundOrk != null) {
            info.put("name", foundOrk.getName());
            info.put("tribe", foundOrk.getTribe());
            info.put("weapon", foundOrk.getWeapon());
            info.put("armor", foundOrk.getArmor());
            info.put("banner", foundOrk.getBanner());
            info.put("strength", foundOrk.getStrength());
            info.put("agility", foundOrk.getAgility());
            info.put("intellect", foundOrk.getIntellect());
            info.put("health", foundOrk.getHealth());
        }
        return info;
    }
}
