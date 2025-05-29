/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.builderFactories;

import model.builders.DolGuldurOrkBuilder;
import model.builders.OrkBuilder;
import model.gearFactories.DolGuldurGearFactory;
import model.gearFactories.OrkGearFactory;

/**
 *
 * @author tsyga
 */
public class DolGuldurOrkBuilderFactory implements OrkBuilderFactory {
    private final OrkGearFactory gearFactory = new DolGuldurGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new DolGuldurOrkBuilder()
                .weapon(gearFactory.createWeapon())
                .armor(gearFactory.createArmor());
    }
}
