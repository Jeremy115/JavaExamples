package com.TestProject.Hello;

/**
 * This is a basic to-do app using the javax.swing GUI
 * This program should open a frame that displays a lists of tasks and their due dates
 *
 * Jacob Ogle
 * 08/24/2022
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.FlowView;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.Stack;

public class JacobsCode {

    private JFrame frame; //Frame that will hold everything
    private JTable taskTable; //Task Table.
    private JPanel taskPanel; //Panel for the button to go in.
    private JButton taskButton; //Button for adding task.
    private JScrollPane sp; //Scrollpane for the table to go in.

    //Main Driver method
    public static void main(String[] args){

        JacobsCode gui = new JacobsCode();
        gui.prepareGUI();

    }

    public void prepareGUI(){

        //Create an instance of frame
        frame = new JFrame("To-Do List");

        //Set up size params of frame
        frame.setSize(500, 500);

        //set the default close operation to DO_NOTHING when closed
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //Set up close window action.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {

                //When closing window open an option page with the message.
                if (JOptionPane.showConfirmDialog(frame,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


        //Create instance of taskButton
        taskButton = new JButton("Add Task");
        //Set up the action of the button
        taskButton.addActionListener(e ->  {

            //Call method if user clicks add task button.
            //prepareNewGUI();
            //Create an instance of a new frameTwo
            frameTwo = new JFrame("Add Task");
            //Set up the params of frameTwo
            frameTwo.setBounds(50, 50, 500, 500);
            //Set Frame two as visible.
            frameTwo.setVisible(true);
            //Ask user to enter task.
            JTextField tasks = new JTextField("Enter task here: ");

            //Add the text field into the frame created.
            frameTwo.add(tasks);


            //Setup Table to hold values.
            String[][] data = {{tasks.getText()}};

            //Adds into the table the contents.
            DefaultTableModel model = (DefaultTableModel)taskTable.getModel();
            model.addRow(data);

        });

        //Call the table which host the row and columns.
        //We ask user to add in the method then call here.

        frame = new JFrame("To-Do List");
        //Create instance of taskPanel
        taskPanel = new JPanel();

        //Setup Table
        String[][] data = {{"Test"}};
        String[] columnNames = {"Dates"};

        //Create an instance of taskTable
        taskTable = new JTable(data, columnNames);
        taskTable.setModel(new DefaultTableModel(data, columnNames));


        //Create an instance of sp
        sp = new JScrollPane(taskTable);

        //add taskButton to taskPanel
        taskPanel.add(taskButton);

        //add sp to taskPanel
        taskPanel.add(sp);

        //add taskpanel to the frame
        frame.add(taskPanel);

        //setframe as visible
        frame.setVisible(true);

    }



    public String[] task; //String that will hold the task
    public Date[] dueDate; //Variable that will hold the due date of the task
    public JFrame frameTwo; //Frame that will load when you want to add a task

    /**
     * This Method is going to be used to set up the new
     * frame that will be used to add a task to the list.
     */

}