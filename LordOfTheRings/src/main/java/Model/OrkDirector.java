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
    private OrkBuilder builder;

    public void setBuilder(OrkBuilder builder) {
        this.builder = builder;
    }
    
    public Ork createBasicOrk() {
        return builder.withRole("BASIC").build();
    }
    
    public Ork createLeaderOrk() {
        return builder.withRole("LEADER").build();
    }
    
    public Ork createScoutOrk() {
        return builder.withRole("SCOUT").build();
    }
}
