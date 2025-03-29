/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public class MistyMountainsOrkBuilderFactory  implements OrkBuilderFactory {
    
    @Override 
    public OrkBuilder createBuilder() {
        return new OrkBuilder(new MistyMountainsGearFactory());
    }
}
