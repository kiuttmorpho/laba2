/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.builders;

import model.Ork;

/**
 *
 * @author tsyga
 */
public class MistyMountainsOrkBuilder extends OrkBuilder {

    public MistyMountainsOrkBuilder() {
        super(Ork.Tribe.MISTY_MOUNTAINS);
    }

    @Override
    protected void generateBaseAttributes() {
        strength = random.nextInt(50) + 1;
        agility = random.nextInt(71) + 30;
        intelligence = random.nextInt(20) + 1; 
        health = random.nextInt(101) + 50;
    }
}
