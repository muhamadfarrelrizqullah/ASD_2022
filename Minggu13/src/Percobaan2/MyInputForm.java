/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton aButton;
    private JButton bButton;
    private JPanel panel;
    
    public MyInputForm(){
        createTextField();
        createButtonA();
        createButtonB();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_WIDTH);
    }
    
    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButtonA(){
        aButton = new JButton("Kali");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: "+ c);
            }
        }
        ActionListener listener = new AddInterestListener();
        aButton.addActionListener(listener);
    }
    
    private void createButtonB(){
    bButton = new JButton("Bagi");
        class AddInterestListener implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a / b;
                cLabel.setText("Hasil: "+ c);
            }
        }
        ActionListener listener = new AddInterestListener();
        bButton.addActionListener(listener);
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(aButton);
        panel.add(bButton);
        panel.add(cLabel);
        add(panel);
    }
    
    
}
