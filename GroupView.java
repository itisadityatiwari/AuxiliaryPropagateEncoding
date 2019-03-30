

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreePath;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class GroupView extends JFrame {
	int n;
	String users="";


JTextField jtf;      
JTree tree;
  public GroupView()

  {


JTextField jtf=new JTextField(50);      

add(jtf);



	  setTitle("Group View ::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
	  
	  try
	  {

		  Dbcon db=new Dbcon();
		  DefaultMutableTreeNode r=new DefaultMutableTreeNode("Groups");

		  DefaultMutableTreeNode r1=new DefaultMutableTreeNode("Group1");

                  r.add(r1);
             
		

		  

		  DefaultMutableTreeNode r2=new DefaultMutableTreeNode("Group2");

                 r.add(r2);
 DefaultMutableTreeNode r3=new DefaultMutableTreeNode("Group3");

                 r.add(r3);
		
		
		


          if(true)
		  {

			int a=0;
			String[] strs;
			
			Connection con = db.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select * from GroupDetails where grp='Group1'";
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()==true)
			{
				a=a+1;
			}
			int j=0;
			strs=new String[a];
			Statement stmt1= con.createStatement();
			String sql1 = "select * from GroupDetails where grp='Group1'";
			
			ResultSet rs1 = stmt1.executeQuery(sql1);
			while(rs1.next()==true && j<a)
			{
				strs[j]=rs1.getString(1);
				j=j+1;
					
			}
			
		  //n = db.getUsersCount("group1");
		 
		  //String[] strs = db.getUsers("group1",n);
          DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[strs.length];
		  for(int i=0;i<strs.length;i++)  
		  {  
		  	//System.out.println("Else part" +strs[i]);
			nodes[i] = new DefaultMutableTreeNode(strs[i]);
			r1.add(nodes[i]);

		  }
		  }



//---------------------------------For Group 2
	
		



if(true)
		  {
	
	
	int a=0;
	String[] strs;
	
	Connection con = db.getConnection();
	Statement stmt = con.createStatement();
	String sql = "select * from GroupDetails where grp='Group2'";
	
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()==true)
	{
		a=a+1;
	}
	int j=0;
	strs=new String[a];
	Statement stmt1= con.createStatement();
	String sql1 = "select * from GroupDetails where grp='Group2'";
	
	ResultSet rs1 = stmt1.executeQuery(sql1);
	while(rs1.next()==true && j<a)
	{
		strs[j]=rs1.getString(1);
		j=j+1;
		
		
	}
	
	
	
	

		  //n = db.getUsersCount("AccessPointB");
		  //System.out.println("users are "+n);
		 // String[] strs = db.getUsers("AccessPointB",n);
          DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[strs.length];
		  for(int i=0;i<strs.length;i++)  
		  {                               
		   
	       nodes[i] = new DefaultMutableTreeNode(strs[i]);
		   r2.add(nodes[i]);
			} 
		  }

//---------------------------------For Group 3
	
		



if(true)
		  {
	
	
	int a=0;
	String[] strs;

	Connection con = db.getConnection();
	Statement stmt = con.createStatement();
	String sql = "select * from GroupDetails where grp='Group3'";
	
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()==true)
	{
		a=a+1;
	}
	int j=0;
	strs=new String[a];
	Statement stmt1= con.createStatement();
	String sql1 ="select * from GroupDetails where grp='Group3'";
	
	ResultSet rs1 = stmt1.executeQuery(sql1);
	while(rs1.next()==true && j<a)
	{
		strs[j]=rs1.getString(1);
		j=j+1;
		
		
	}
	
	
	

	  //n = db.getUsersCount("AccessPointC");
		//  System.out.println("users are "+n);
		  //String[] strs = db.getUsers("AccessPointC",n);
          DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[strs.length];
		  for(int i=0;i<strs.length;i++)  
		  {                               
		   
	       nodes[i] = new DefaultMutableTreeNode(strs[i]);
		   r3.add(nodes[i]);
			}
		  }







		  r.add(r1);
		  r.add(r2);
            		 r.add(r3);
                  


		   tree = new JTree(r);
		  tree.setEditable(true);
		  JScrollPane sp = new JScrollPane(tree);

		  getContentPane().add(sp, BorderLayout.CENTER);

 




     	  this.setSize(300, 300);
          this.setLocation(350,250);
		  this.setVisible(true);
		  this.setBackground(Color.red);
		 
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  //JOptionPane.showMessageDialog(this,"The Users  Cannot have Controllers");
	  }
  }





  public static void main(String args[])
  {
	  //System.out.println("Zones");


GroupView ut=new GroupView();

ut.setSize(400,400);
ut.setVisible(true);

  }
}


