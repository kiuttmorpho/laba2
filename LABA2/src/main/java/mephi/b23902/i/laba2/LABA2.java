
package mephi.b23902.i.laba2;

import controller.ArmyController;
import javax.swing.SwingUtilities;

public class LABA2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArmyController controller = new ArmyController();
            controller.launchApplication();
        });
    }
}