/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.builderFactories;

import model.builders.GreyMountainsOrkBuilder;
import model.builders.OrkBuilder;
import model.gearFactories.GreyMountainsGearFactory;
import model.gearFactories.OrkGearFactory;

/**
 *
 * @author tsyga
 */
public class GreyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    private final OrkGearFactory gearFactory = new GreyMountainsGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new GreyMountainsOrkBuilder()
                .weapon(gearFactory.createWeapon())
                .armor(gearFactory.createArmor());
    }
}
