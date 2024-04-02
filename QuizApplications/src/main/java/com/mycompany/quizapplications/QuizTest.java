/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizapplications;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
/**
 *
 * @author Home
 */
public class QuizTest extends JFrame implements ActionListener{
    
    JLabel label;
    JRadioButton radioButtons[] =new JRadioButton[5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    
    QuizTest(String s){
        super(s);
        label =new Jlabel();
        add(label);
        bg =new ButtonGroup();
        for(int i=0;i<5;i++){
            radioButton[i]=new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        btnNext=new JButton("Next");
        btnResult =new JButton("Result");
        btnResult.setVisible(false);
        btnResult.addActionListener(this);
        btnNext.addActionListener(this);
        add(btnNext);
        add(btnResult);
        setData();
        label.setBounds(30,40,450,20);
        radioButtons[0].setBound(50,80,450,20);
        radioButtons[1].setBound(50,110,200,20);
        radioButtons[2].setBound(50,140,200,20);
        radioButtons[3].setBound(50,170,200,20);
        btnNext.setBounds(100,240,100,30);
        btnResult.setBound(270,240,100,30);
        setDefaultCloseOperation(JFrame,EXIT ON CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
        
    }
    void setData(){
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("Q1 : Which is the official language for Android Development");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("C++");
            radioButtons[2].setText("Kotlin");
            radioButtons[3].setText("Python");
        }
        if(current ==1){
            label.setText("Q2 : Which one is oops concept in java ?");
            radioButtons[0].setText("Inheritence");
            radioButtons[1].setText("not known");
            radioButtons[2].setText("interface");
            radioButtons[3].setText("null");
        }
       
        if(current ==2){
            label.setText("Q3 : What we can learn from greeksforgreek ?");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("C++");
            radioButtons[2].setText("All of the above");
            radioButtons[3].setText("Python");
        }
        if(current ==3){
            label.setText("Q4 : Which is the official language for interpretor");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("C++");
            radioButtons[2].setText("all of the above");
            radioButtons[3].setText("Python");
        }
        if(current ==4){
            label.setText("Q5 : Which is the official language for compiler ?");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("C++");
            radioButtons[2].setText("not known");
            radioButtons[3].setText("Python");
        }
        if(current ==5){
            label.setText("Q6 : Which is the official language for Android Development");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("C++");
            radioButtons[2].setText("Kotlin");
            radioButtons[3].setText("Python");
        }
        if(current ==6){
            label.setText("Q7 : Which of the following is thread safe ?");
            radioButtons[0].setText("StringBuilder");
            radioButtons[1].setText("StringBufer");
            radioButtons[2].setText("not known");
            radioButtons[3].setText("Both");
        }
        if(current ==8){
            label.setText("Q8 : What is the default value of boolean variable");
            radioButtons[0].setText("True");
            radioButtons[1].setText("False");
            radioButtons[2].setText("not known");
            radioButtons[3].setText("null");
        }
        if(current ==9){
            label.setText("Q9 : What is the Default value of Long variable");
            radioButtons[0].setText("0");
            radioButtons[1].setText("0.0");
            radioButtons[2].setText("0 L");
            radioButtons[3].setText("not known");
        }
        
        label.setBounds(30,40,50,60);
        for(int i=0,j=0;i<=90;i+=30,j++){
            radioButtons[j].setBounds(50,80+i,200,20);
        }
    }
    boolean checkAns(){
        if(current==0){
            return(radioButtons[1].isSelected());
        }
         if(current==1){
            return(radioButtons[1].isSelected());
        }
          if(current==2){
            return(radioButtons[3].isSelected());
        }
           if(current==3){
            return(radioButtons[4].isSelected());
        }
            if(current==4){
            return(radioButtons[1].isSelected());
        }
             if(current==5){
            return(radioButtons[1].isSelected());
        }
              if(current==6){
            return(radioButtons[2].isSelected());
        }
               if(current==7){
            return(radioButtons[1].isSelected());
        }
                if(current==8){
            return(radioButtons[3].isSelected());
        }
                 if(current==9){
            return(radioButtons[1].isSelected());
        }
        return false
    }
    public static void main(String[] args){
        new QuizTest("Simple Quiz App")
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource ()==btnNext){
         if(checkAns())
         count = count +1 ;
         current++;
         setData();
         if(current==9){
             btnNext.setEnabled(false);
             btnResult.setVisible(true);
             btnResult.setText("Result");
         }
     }
     if(e.getActionCommand().equals("Result")){
         if(checkAns())
             count = count + 1 ;
         current++;
         JOptionPane.showMessageDialog(this,"Correct Answer are"+count);
         System.exit(0);
     }
    }
            
}
