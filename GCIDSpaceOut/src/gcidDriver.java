import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import ui.MainWindow;

/**
 * Project: GCIDSpacer
 * File: gcidDriver.java
 * Date: Feb. 24, 2020
 * Time: 2:56:54 p.m.
 */

/**
 * @author Eric Lau, A01027727
 *
 */
public class gcidDriver {

  public static void main(final String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
              UIManager.setLookAndFeel(info.getClassName());
              break;
            }
          }
        } catch (Exception e) {
          // If Nimbus is not available, use the default.
        }

        try {
          MainWindow frame = new MainWindow();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
