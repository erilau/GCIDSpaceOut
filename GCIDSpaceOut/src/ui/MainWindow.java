package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

/**
 * Project: GCIDSpacer
 * File: MainWindow.java
 * Date: Feb. 24, 2020
 * Time: 2:59:12 p.m.
 */

/**
 * @author Eric Lau, A01027727
 *
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame {
  private JTextField userInputField;
  private JTextField storeNumberField;
  private JTextField textField_2;
  private JTextField textField_3;
  private JTextField textField_4;
  private JButton submitButton;
  private JLabel lblGcid;
  private JButton btnCopy;
  private JButton button;
  private JButton button_1;
  private JButton button_2;
  private JLabel lblStoreNumber;
  private JLabel lblDate;
  private JLabel lblTransaction;
  private JLabel lblIiii;

  public MainWindow() {
    getContentPane().setBackground(Color.ORANGE);

    // setIconImage(image);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    setSize(300, 250);

    getContentPane().setLayout(new MigLayout("", "[][][grow][]", "[][][][][][][]"));

    // For GCID
    lblGcid = new JLabel("GCID");
    getContentPane().add(lblGcid, "cell 0 1 2 1");

    userInputField = new JTextField();
    getContentPane().add(userInputField, "cell 2 1,growx");
    userInputField.setColumns(10);

    submitButton = new JButton("Submit");
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // When user enters string split into corresponding text fields
        String GCID = userInputField.getText();

        if (GCID.trim().length() == 15 && GCID != null) {
          storeNumberField.setText(StringSpacer.storeNumber(GCID));
          textField_2.setText(StringSpacer.datePart(GCID));
          textField_3.setText(StringSpacer.transactionPart(GCID));
          textField_4.setText(StringSpacer.incidentPart(GCID));
        }

        if (GCID.trim().length() != 15) {
          Component frame = null;
          JOptionPane.showMessageDialog(frame, "GCID entered is invalid!");
        }

      }
    });
    getContentPane().add(submitButton, "cell 2 2");

    // For Store Number
    lblStoreNumber = new JLabel("Store Number");
    getContentPane().add(lblStoreNumber, "cell 0 3");

    storeNumberField = new JTextField();
    getContentPane().add(storeNumberField, "cell 2 3,growx");
    storeNumberField.setColumns(10);

    btnCopy = new JButton("Copy");
    btnCopy.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StringSelection stringSelection = new StringSelection(storeNumberField.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

      }
    });
    getContentPane().add(btnCopy, "cell 3 3");

    // For Date
    lblDate = new JLabel("Date");
    getContentPane().add(lblDate, "cell 0 4");

    textField_2 = new JTextField();
    getContentPane().add(textField_2, "cell 2 4,growx");
    textField_2.setColumns(10);

    button = new JButton("Copy");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StringSelection stringSelection = new StringSelection(textField_2.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
      }
    });
    getContentPane().add(button, "cell 3 4");

    // For Till #
    lblTransaction = new JLabel("Till #");
    getContentPane().add(lblTransaction, "cell 0 5");

    textField_3 = new JTextField();
    getContentPane().add(textField_3, "cell 2 5,growx");
    textField_3.setColumns(10);

    button_1 = new JButton("Copy");
    button_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StringSelection stringSelection = new StringSelection(textField_3.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
      }
    });
    getContentPane().add(button_1, "cell 3 5");

    // For Transaction #
    lblIiii = new JLabel("Transaction #");
    getContentPane().add(lblIiii, "cell 0 6");

    textField_4 = new JTextField();
    getContentPane().add(textField_4, "cell 2 6,growx");
    textField_4.setColumns(10);

    button_2 = new JButton("Copy");
    button_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        StringSelection stringSelection = new StringSelection(textField_4.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
      }
    });
    getContentPane().add(button_2, "cell 3 6");

  }

}
