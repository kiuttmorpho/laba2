/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.builderFactories;

import model.builders.MistyMountainsOrkBuilder;
import model.builders.OrkBuilder;
import model.gearFactories.MistyMountainsGearFactory;
import model.gearFactories.OrkGearFactory;

/**
 *
 * @author tsyga
 */
public class MistyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    private final OrkGearFactory gearFactory = new MistyMountainsGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new MistyMountainsOrkBuilder()
                .weapon(gearFactory.createWeapon())
                .armor(gearFactory.createArmor());
    }
}
