/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.lg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author marve
 */
public class AppleLogin extends JFrame{
    
    public JPanel tittle;
    public JPanel loginBox;
    public JPanel username;
    public JPanel password;
    public JPanel buttons;
    public JPanel main;
    
    public JLabel usernamelb;
    public JLabel passwordlb;
    public JLabel tittlelb;
    
    public JTextField surnametf;
    
    public JPasswordField passwordpf;
    
    public JButton submitbt;
    public JButton clearbt;
    public JButton exitbt;
    
    public AppleLogin()
    {
        setTitle("APPLE LOGIN");
        setSize(450, 400);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
      tittle = new JPanel(new FlowLayout(FlowLayout.LEFT));
      loginBox = new JPanel(new GridLayout(2,1,2,2));
      loginBox.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Login Details"));
      
      username = new JPanel(new FlowLayout(FlowLayout.LEFT));
      password = new JPanel(new FlowLayout(FlowLayout.LEFT));
      buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
      main = new JPanel(new BorderLayout());
      
      usernamelb = new JLabel("UserName: ");
      passwordlb = new JLabel("PassWord: ");
      tittlelb = new JLabel("APPLE LOGIN");
      tittlelb.setForeground(Color.red);
      
      surnametf = new JTextField(12);
      surnametf.setFocusable(true);
      
      passwordpf = new JPasswordField(12);
      
      submitbt = new JButton("Submit");
      clearbt = new JButton("Clear");
      exitbt = new JButton("Exit");
      
      tittle.add(tittlelb);
      
      username.add(usernamelb);
      username.add(surnametf);
      
      password.add(passwordlb);
      password.add(passwordpf);
      
      loginBox.add(username);
      loginBox.add(password);
      
      buttons.add(submitbt);
      buttons.add(clearbt);
      buttons.add(exitbt);
      
      main.add(loginBox, BorderLayout.NORTH);
      main.add(buttons, BorderLayout.CENTER);
      main.add(tittle, BorderLayout.SOUTH);
      
        add(main);
        pack();
        setVisible(true);
              
    }
}
