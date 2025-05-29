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
public class DolGuldurOrkBuilder extends OrkBuilder {
    public DolGuldurOrkBuilder() {
        super(Ork.Tribe.DOL_GULDUR);
    }

    @Override
    protected void generateBaseAttributes() {
        strength = random.nextInt(70) + 30;
        agility = random.nextInt(70) + 30;
        intelligence = random.nextInt(30) + 20;
        health = random.nextInt(101) + 100;
    }
}