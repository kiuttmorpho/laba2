/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.gearFactories;

/**
 *
 * @author tsyga
 */
public class MistyMountainsGearFactory implements OrkGearFactory {
    @Override
    public String createWeapon() {
        return "Топор";
    }
    @Override 
    public String createArmor() {
        return "Кожаная броня";
    }
    @Override 
    public String createBanner() {
        return "Знамя с Луной";
    }
}