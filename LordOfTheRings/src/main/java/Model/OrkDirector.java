/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author maria
 */
public class OrkDirector {
    public Ork createBasicOrk(OrkBuilder builder) {
        return builder.withRole("BASIC").build();
    }
    
    public Ork createLeaderOrk(OrkBuilder builder) {
        return builder.withRole("LEADER").build();
    }
    
    public Ork createScoutOrk(OrkBuilder builder) {
        return builder.withRole("SCOUT").build();
    }
}
