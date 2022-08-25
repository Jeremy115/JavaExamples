package com.TestProject.Hello;


import javax.swing.*;

class guiInterfaces extends JFrame {

    public void TableToJpanel() {

        addToGuimethod();               //For now just call a method below. But can add upon this program.

        JFrame frame = new JFrame();                           //Create Frame for display
        JPanel panel = new JPanel();                           //Create Panel

        String[][] row = {{ "Test 1"}};                          //Row
        String[] column = { "Test 2" };                          //Column
        JTable table = new JTable(row, column);                //Add rows and columns into table


        panel.add(new JScrollPane(table));                     //add table into a JScrollPane and parse into a panel.
        frame.add(panel);                                      //add panel that parsed table into the frame.
        frame.setSize(550, 400);                   //size the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Close program when closed.
        frame.setVisible(true);                                //let the frame be visible to user.

    }
    private void addToGuimethod(){
        //Add anything here we want to add upon the program.
        System.out.println("hi!!");
    }
}