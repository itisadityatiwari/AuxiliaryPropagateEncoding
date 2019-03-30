import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;
public class GivePrivilages extends JFrame implements ActionListener 
{
	JPanel p1;
	JLabel l1,l2,t1,l3,l4;
	JComboBox cb1,cb2,cb4;
	JButton b1;
	
	JCheckBox c1,c2,c3,c4,c5;
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	public Font f3 = new Font("Times new roman", Font.BOLD, 20);
	
	String name;
	String Owner;
	String download="NO";
	String access="NO";
	
	GivePrivilages(String owner)
	{
		Owner=owner;
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Give Privilages ::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		
		cb4=new JComboBox();
		cb4.setBounds(150,100,150,25);
		cb4.setFont(f2);
		p1.add(cb4);
		try
		{
			Dbcon dbc=new Dbcon();
			Connection connect=dbc.getConnection();
                        ResultSet rs1=connect.createStatement().executeQuery("select fname from ownerfiles where owner='"+Owner+"'");
                       // if(owner !=null)
			//rs1 =connect.createStatement().executeQuery("select Owner from cloudserver where Owner=" + owner);
                        //else
                       // rs1 =connect.createStatement().executeQuery("select fname from ownerfiles");
                        
			ArrayList a1=new ArrayList();
			while(rs1.next()==true)
			{
				a1.add(rs1.getString("fname"));
			}
		//	ArrayList a1=(ArrayList)ios.readObject();
			
			Iterator i1 = a1.iterator();
			while(i1.hasNext())
			{
                      
                            cb4.addItem(i1.next().toString());		
			}
			
		
			
		}catch(Exception es){System.out.println(es);}
		
	

		
		l3=new JLabel("Permit to Other user");
		l3.setBounds(30,150,150,25);
		l3.setFont(f2);
		p1.add(l3);
		
		l4=new JLabel("Select File");
		l4.setBounds(30,100,120,25);
		l4.setFont(f2);
		p1.add(l4);
				
		c4=new JCheckBox("Download");
		c4.setBounds(200,200,120,25);
		c4.setFont(f2);
		p1.add(c4);
		
		c5=new JCheckBox("Search");
		c5.setBounds(200,150,120,25);
		c5.setFont(f2);
		p1.add(c5);
		
		b1=new JButton("Permit");
		b1.setBounds(80,250,150,25);
		b1.setFont(f2);
		p1.add(b1);
		
	
		b1.addActionListener(this);
		c4.addActionListener(this);
		c5.addActionListener(this);
		
//		cb1.addActionListener(this);
		
		
		
		p1.setBackground(Color.orange);
		
		add(p1);
		setSize(350,350);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==c4)
		{
			download="YES";
		}
		if(ae.getSource()==c5)
		{
			access="YES";
		}
		
		if(ae.getSource()==b1)	
		{
			
			try
			{
				Dbcon db=new Dbcon();
				Connection connect=db.getConnection();
				Statement stmt = connect.createStatement();
				
				String ename=cb4.getSelectedItem().toString();
			
				String query1 = "update CloudServer set apermit='"+download+"',spermit='"+access+"' where owner='"+Owner+"'and fname='"+ename+"'";
				stmt.executeUpdate(query1);
				
				JOptionPane.showMessageDialog(null,"Privilages Given to "+ename);
				
			}catch(Exception es){System.out.println(es);}
		}
	}
	public static void main(String[] args) 
	{
	new GivePrivilages(null);
	}
}
