


import javax.swing.*;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.net.*;

public class ViewStorageServerFiles extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel label1;
  JTextField  text1;
  Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;

JLabel imglabel;
ViewStorageServerFiles() 
 {

setTitle("Storage Server Files::Auxialiary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
c= getContentPane();
c.setLayout (null);
c.setBackground(Color.pink);

label1 = new JLabel();
label1.setText("Enter Username");

 text1 = new JTextField(20);
   property=new JButton("View Property");

   property.addActionListener(this);


//c.add(label1);
//c.add(text1);
//c.add(property);





try {
	Dbcon dbc=new Dbcon();
	Connection connect=dbc.getConnection();
    Statement stmt = connect.createStatement();

    Vector heading = new Vector();
	 
	heading.addElement("Owner Name");
	heading.addElement("File Name");
	heading.addElement("Sk");
	heading.addElement("Group");
	heading.addElement("Search Permit");
	heading.addElement("Access Permit");
	heading.addElement("Date");
	
    Vector data = new Vector();
 	  
    String query = "SELECT * FROM cloudserver";
    ResultSet rs = stmt.executeQuery(query);
    ResultSetMetaData rsm=rs.getMetaData();
    int col=rsm.getColumnCount();

    while(rs.next())
    {
	   Vector row = new Vector();
	   for(int i = 1; i <=col; i++)
	   {
       row.addElement(rs.getObject(i));

	   }

	   data.addElement(row);
    }
  
   JTable table = new JTable(data,heading);
  
   pane = new JScrollPane(table);
 
   pane.setBounds(30,50,600,200);
   c.add(pane);
 
	} 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 

  }


public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();

if(o==property)
{
		
}

}

}