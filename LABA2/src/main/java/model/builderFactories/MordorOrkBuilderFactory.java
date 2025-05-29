/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.builderFactories;

import model.builders.MordorOrkBuilder;
import model.builders.OrkBuilder;
import model.gearFactories.MordorGearFactory;
import model.gearFactories.OrkGearFactory;

/**
 *
 * @author tsyga
 */
public class MordorOrkBuilderFactory implements OrkBuilderFactory {
    private final OrkGearFactory gearFactory = new MordorGearFactory();

    @Override
    public OrkBuilder createOrkBuilder() {
        return new MordorOrkBuilder()
                .weapon(gearFactory.createWeapon())
                .armor(gearFactory.createArmor());
    }
}
