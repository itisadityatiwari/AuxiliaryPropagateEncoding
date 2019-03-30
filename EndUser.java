import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EndUser implements ActionListener 
{
	JFrame jf;
	Container c;
	JPanel p1,p2;	
	JLabel l1,l2,l3;
	JTextField t1,t2,t3,aa;
	JButton b1,b2;
	int rank; 
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,g44, g55, g66, g77,l8,l9;
	ImageIcon banner;
	JTextArea ta;
	JScrollPane sp;
	String name;
	MenuBar mbr;
	Menu file;
	MenuItem  item2,trust;
	
	@SuppressWarnings("deprecation")
	EndUser(String name, String sign, String group)
	{
		jf = new JFrame("End User::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		c = jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		JOptionPane.showMessageDialog(null,"Group Sign For The User is "+ sign);
		
		mbr = new MenuBar();
		file = new Menu("File");
		item2 = new MenuItem("Search Group Files");
		item2.addActionListener(this);
		
		trust = new MenuItem("View Files");
		trust.addActionListener(this);
		
		//file.add(item2);
		file.add(trust);
		mbr.add(file);
		jf.setMenuBar(mbr);
		
    	ImageIcon banner = new ImageIcon(this.getClass().getResource("EndUser.png"));
		JLabel l5 = new JLabel();
		l5.setIcon(banner);
		l5.setBounds(0, 0,  620,440);
		
		
		ImageIcon banner1 = new ImageIcon(this.getClass().getResource("tree.png"));
		JLabel title = new JLabel();
		title.setIcon(banner1);
		title.setBounds(420, 50, 530, 275);
		
		
		
		
		l1=new JLabel("User Name");
		l1.setBounds(50, 50, 100, 30);
		
		l2=new JLabel("File Name");
		l2.setBounds(50, 115, 100, 30);
		
		l3=new JLabel("Secret Key");
		l3.setBounds(50, 175, 100, 30);
		
		String user=name;
		t1 = new JTextField();
		t1.setBounds(50, 80, 100, 30);
		t1.setText(user);
		t1.setEditable(false);
		
		aa = new JTextField();
		aa.setBounds(50, 80, 100, 30);
		aa.setText(group);
		aa.setVisible(false);
		
		t2 = new JTextField();
		t2.setBounds(50, 140, 100, 30);
		
		t3 = new JTextField();
		t3.setBounds(50, 200, 100, 30);
		
		b1 = new JButton("Req-SK");
		b1.setBounds(50, 250, 100, 30);
		b1.addActionListener(this);
		
		b2 = new JButton("Download");
		b2.setBounds(50, 290, 100, 30);
		b2.addActionListener(this);
		
		ta = new JTextArea();
		ta.setColumns(100);
		ta.setRows(100);
		
		sp = new JScrollPane();
		sp.setViewportView(ta);
		sp.setBounds(230, 70, 315, 250);
		
//		ImageIcon banner = new ImageIcon(this.getClass().getResource("user.png"));
//		JLabel title = new JLabel();
//		title.setIcon(banner);
//		title.setBounds(0, -90,  950,570);
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(sp);
		c.add(b2);
		c.add(b1);
		
		c.add(t1);
		c.add(t2);
		c.add(t3);
//		c.add(title);
		c.add(l5);
//		c.add(username);
		jf.setSize(640,500);
		jf.show();
		
	}


	public void actionPerformed(ActionEvent e1)
	{
		Object o = e1.getSource();
		
		if(o==item2)
		{
			try
			{
				String fname = JOptionPane.showInputDialog(null, "Enter Keyword");
				String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Storage Server");
				
				Socket stm=new Socket(ip,1444);
				ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
				dos3.writeObject(fname); 
				dos3.writeObject(aa.getText()); 
				
				
				ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
				Vector a1=(Vector) ins.readObject();
				System.out.println(a1);
				
				ViewSearchFiles v = new ViewSearchFiles(a1);
				v.setSize(650,400);
				v.setVisible(true);
				
			}catch (Exception e) {
				// TODO: handle exception
			}	
		}
		if(o==trust)
		{
			try
			{
				String ip = JOptionPane.showInputDialog(null, "Enter The IP Address of Storage Server");
				
				Socket stm=new Socket(ip,1555);
				ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream()); 
				dos3.writeObject(aa.getText()); 
				
				
				ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
				Vector a1=(Vector) ins.readObject();
				System.out.println(a1);
					
				if(a1.toString().equals("[]"))
				{
					JOptionPane.showMessageDialog(null, "You Don't Have Permission To Access The File \n Or The Files Doesn't Exist");
				}
				else 
				{
					ViewSearchGroupFiles v = new ViewSearchGroupFiles(a1);
					v.setSize(650,400);
					v.setVisible(true);
				}
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}	
		}
		if(o==b1)
		{
			try {
			String file =t2.getText();
			if(file.equalsIgnoreCase(""))
			{
				JOptionPane.showMessageDialog(null, "Enter The File Name");
				
				
			}
			else
			{
				 String ip = JOptionPane.showInputDialog(null,"Enter Data Owner Ip Address");
					
					Socket g = new Socket(ip,4646);
					DataOutputStream d = new DataOutputStream(g.getOutputStream());
					
					d.writeUTF(file);
					
					DataInputStream dis = new DataInputStream(g.getInputStream());
					
					String msg = dis.readUTF();
					String sk = dis.readUTF();
					
					if(msg.equalsIgnoreCase("key"))
					{
						JOptionPane.showMessageDialog(null, "Got Secret Key");
						t3.setText(sk);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "File Doesn't Exist");
					}
					
				}
				
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(o == b2)
		{
						
			 String user = t1.getText();
			 String file = t2.getText();
			 String sk = t3.getText();
			 
			 try
			 {
					if(file.equalsIgnoreCase("") || sk.equalsIgnoreCase(""))
					{
						JOptionPane.showMessageDialog(null, "Enter The File Name & Secret Key");
					}
					else
					{
						 String ip = JOptionPane.showInputDialog(null,"Enter Group Authority Ip Address");
						 
						 Socket cn2 = new Socket(ip,9988);
						  DataOutputStream oos2 = new DataOutputStream(cn2.getOutputStream());
						  
						  oos2.writeUTF(user);
						  oos2.writeUTF(file);
						  oos2.writeUTF(sk);
						  
						  DataInputStream din = new DataInputStream(cn2.getInputStream());
						  
						  String msg =  din.readUTF();
						  String content =  din.readUTF();
						  
						  if(msg.equalsIgnoreCase("success"))
							{
								ta.setText(content);
									
								String str = ta.getText();
								FileOutputStream fos = new FileOutputStream("EndUser/"+ file);
								fos.write(str.getBytes());
								System.out.println("Received Successfully");
									  
								 JOptionPane.showMessageDialog(null, "File Downloaded Successfully");
							}
						  if(msg.equalsIgnoreCase("failure"))
							{
								JOptionPane.showMessageDialog(null, "Enter Correct Secret Key");
							}
						if(msg.equalsIgnoreCase("nopermit"))
						  {
							  JOptionPane.showMessageDialog(null, "You Don't Have Access Permission \n Please Contact File Owner");
						 }
                                                if(msg.equalsIgnoreCase("nogroup"))
						  {
							  JOptionPane.showMessageDialog(null, "You Are From a Different Group");
						 }
                                                
					}  
				  
			 }catch(Exception e2)
			 {
				 e2.printStackTrace();
			 }
		}
			
			
		}
		
		
	public static void main(String[] args) {
	
		//new EndUser("a","mac","grp");
	}
}