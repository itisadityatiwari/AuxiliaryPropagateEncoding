import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class StorageServer implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JPanel p1, p2;
	JButton b1, b2, b3, b4;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1;
	MenuBar mbr;
	Menu file;
	MenuItem  assign,item2, users,csfile,kdc,server,trans,exit;
	Border b11, b22, b33;
	JScrollPane pane;
	String Scheme1, rank;
	String f1 = "", f2 = "", f3 = "", f4 = "", f5 = "", f6 = "", f7 = "",f8 = "";
	int count = 0;
	Timer timer;

	
	public Font f = new Font("Times new roman", Font.BOLD, 12);
	public Font font = new Font("Times new roman", Font.BOLD, 18);
	
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,
			g44, g55, g66, g77;
	

	
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	ImageIcon one,two,three,four,five,six,seven,eight,arrow1,arrow2,arrow3,arrow4,arrow5,arrow6,end,end1;
	JLabel onel,twol,threel,fourl,fivel,sixl,sevenl,eightl,arrow1l,arrow2l,arrow3l,arrow4l,arrow5l,arrow6l,arrow7l,arrow8l,endl,end1l;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
	
	
	StorageServer() {
		jf = new JFrame("Storage Server :: Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.white);
		timer = new Timer(0, null);

		b1=new JButton("View All Files");
		b1.setBounds(220,300,200,30);
		b1.addActionListener(this);

		one = new ImageIcon(this.getClass().getResource("StorageServer.jpg"));
		onel=new JLabel();
		onel.setIcon(one);
		onel.setBounds(210, -20, 300, 200);
		c.add(onel);
		
		two = new ImageIcon(this.getClass().getResource("DataOwner.jpg"));
		twol=new JLabel();
		twol.setIcon(two);
		twol.setBounds(90, 180, 300, 200);
		c.add(twol);
//		
		three = new ImageIcon(this.getClass().getResource("EndUser.jpg"));
		threel=new JLabel();
		threel.setIcon(three);
		threel.setBounds(370, 180, 300, 200);
		c.add(threel);


		arrow1 = new ImageIcon(this.getClass().getResource("arrow1.png"));
		arrow1l=new JLabel();
		arrow1l.setIcon(arrow1);
		arrow1l.setBounds(225, 175, 300, 200);
		c.add(arrow1l);
//		
		arrow2 = new ImageIcon(this.getClass().getResource("arrow2.png"));
		arrow2l=new JLabel();
		arrow2l.setIcon(arrow2);
		arrow2l.setBounds(210, 190, 300, 200);
		c.add(arrow2l);
		
		arrow3 = new ImageIcon(this.getClass().getResource("arrow3.png"));
		arrow3l=new JLabel();
		arrow3l.setIcon(arrow3);
		arrow3l.setBounds(135, 80, 300, 200);
		c.add(arrow3l);
		
		arrow4 = new ImageIcon(this.getClass().getResource("arrow4.png"));
		arrow4l=new JLabel();
		arrow4l.setIcon(arrow4);
		arrow4l.setBounds(140, 100, 300, 200);
		c.add(arrow4l);
//		
		arrow5 = new ImageIcon(this.getClass().getResource("arrow5.png"));
		arrow5l=new JLabel();
		arrow5l.setIcon(arrow5);
		arrow5l.setBounds(315, 85, 300, 200);
		c.add(arrow5l);
		
		arrow6 = new ImageIcon(this.getClass().getResource("arrow6.png"));
		arrow6l=new JLabel();
		arrow6l.setIcon(arrow6);
		arrow6l.setBounds(300, 80, 300, 200);
		c.add(arrow6l);
		
		lab1 = new JLabel("UPLOAD");
		lab1.setFont(f);
		lab1.setBounds(240, 100, 300, 200);
		lab1.setVisible(false);
		c.add(lab1);
		
		lab2 = new JLabel("REQ-SK");
		lab2.setFont(f);
		lab2.setBounds(240, 100, 300, 200);
		lab2.setVisible(false);
		c.add(lab2);
		
		lab3 = new JLabel("DOWNLOAD");
		lab3.setFont(f);
		lab3.setBounds(235, 100, 300, 200);
		lab3.setVisible(false);
		c.add(lab3);
		
		mbr = new MenuBar();
//		csfile = new MenuItem("Schedule Key Exchange");
		kdc = new MenuItem("Give Access Permission");
		file = new Menu("Storage Server Files");
		assign= new MenuItem("View File Attackers");
		item2 = new MenuItem("View Group Users");
		users = new MenuItem("View Storage Server Files");
//		server= new MenuItem("View Attackers");
//		trans= new MenuItem("View Blocked Users");
		exit = new MenuItem("Exit");
		
		kdc.addActionListener(this);
		assign.addActionListener(this);
		item2.addActionListener(this);
		users.addActionListener(this);
////		csfile.addActionListener(this);
//		server.addActionListener(this);
//		trans.addActionListener(this);
		exit.addActionListener(this);
		
//		file.add(csfile);
		//file.add(kdc);
		file.add(assign);
		file.add(item2);
		file.add(users);
		
		ImageIcon banner1 = new ImageIcon(this.getClass().getResource("group.jpg"));
		JLabel title = new JLabel();
		title.setIcon(banner1);
		title.setBounds(560, 50, 530, 275);
		
//		
//		file.add(server);
//		file.add(trans);
		
		file.add(exit);
		mbr.add(file);
		jf.setMenuBar(mbr);

//		c.add(l2);
		
		c.add(title);
//		c.add(b1);
		jf.setBounds(0, 0,920	,420);
		jf.show();

		int[] ports = new int[] {1111,4646,9988,1444,1555};
		
		for (int i = 0; i < 5; i++) {
			Thread t2 = new Thread(new PortListener(ports[i]));
			t2.start();
		}
	}

	public static void main(String args[])
	{
//		new CloudServer();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StorageServer();
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if (o == assign) {
			try
			{
				ViewAttackers v = new ViewAttackers();
				v.setSize(680,320);
				v.setVisible(true);
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
		if (o == kdc) {
			
			try
			{
				
				
				GivePrivilages v = new GivePrivilages(null);
				v.setSize(350,350);
				v.setVisible(true);
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if (o == item2) {
		try
		{
			String dat="view";
			Socket stm=new Socket("localhost",1333);
			ObjectOutputStream dos3=new ObjectOutputStream(stm.getOutputStream());
			dos3.writeObject(dat); 
			
			ObjectInputStream ins=new ObjectInputStream(stm.getInputStream());
			Vector a1=(Vector) ins.readObject();
			System.out.println(a1);
			
			ViewGroupDetails v = new ViewGroupDetails(a1);
			v.setSize(670,400);
			v.setVisible(true);
			
		}catch(Exception es){System.out.println(es);}
		
	}
		if (o == users) {
		try
		{
			ViewStorageServerFiles v = new ViewStorageServerFiles();
			v.setSize(680,320);
			v.setVisible(true);
			
		}catch(Exception es){System.out.println(es);}
		
	}
		if (o == csfile) {
			
			try
			{
				
			}catch (Exception e4) {
				// TODO: handle exception
			}
			
		}
		if (o == server) {
//	
//		ViewAttackers v =new ViewAttackers();
//		v.setSize(580, 400);
//		v.setVisible(true);
}
		if (o == trans) {
			
//			ViewBlocked d = new ViewBlocked();
//			d.setSize(580, 400);
//			d.setVisible(true);
		}
		if(o == exit)
		{
			System.exit(0);
		}
	}

class PortListener implements Runnable {
		
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() {
			try{
			
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
			Socket s;
			 
		 if (this.port == 1111) {
			
			try {
					ServerSocket sc =new ServerSocket(1111);
					
					while(true)
					{
					s = sc.accept();
					DataInputStream din = new DataInputStream(s.getInputStream());
					
					
					String owner = din.readUTF();
					String fname = din.readUTF();
					String content = din.readUTF();
					String sk = din.readUTF();
					String grp = din.readUTF();
					String grpsign = din.readUTF();
					String dt = din.readUTF();
					
					Thread.sleep(500);
					twol.setVisible(false);
					Thread.sleep(200);
					twol.setVisible(true);
					Thread.sleep(200);
					twol.setVisible(false);
					Thread.sleep(200);
					twol.setVisible(true);
					
					Thread.sleep(500);
					arrow3 = new ImageIcon(this.getClass().getResource("arrow3g.png"));
					arrow3l.setIcon(arrow3);
					
					lab1.setVisible(true);
					Thread.sleep(100);
					lab1.setVisible(false);
					Thread.sleep(100);
					lab1.setVisible(true);
					Thread.sleep(100);
					lab1.setVisible(false);
					Thread.sleep(100);
					lab1.setVisible(true);
					
					Thread.sleep(500);
					onel.setVisible(false);
					Thread.sleep(200);
					onel.setVisible(true);
					Thread.sleep(200);
					onel.setVisible(false);
					Thread.sleep(200);
					onel.setVisible(true);
					
					Thread.sleep(500);
					arrow4 = new ImageIcon(this.getClass().getResource("arrow4g.png"));
					arrow4l.setIcon(arrow4);
					
					Thread.sleep(500);
					twol.setVisible(false);
					Thread.sleep(200);
					twol.setVisible(true);
					Thread.sleep(200);
					twol.setVisible(false);
					Thread.sleep(200);
					twol.setVisible(true);
					
					clear();
					
						Socket soc = new Socket("localhost",2222);
						DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
						dout.writeUTF(owner);
						dout.writeUTF(grpsign);
						
						DataInputStream din1 = new DataInputStream(soc.getInputStream());
						String msg = din1.readUTF();
					
						if(msg.equalsIgnoreCase("correct"))
						{
							Statement stmt = connect.createStatement();
							String acc="NO";
							String query1 = "insert into CloudServer values('"+owner+"','"+fname+"','"+sk+"','"+grp+"','"+acc+"','"+acc+"','"+dt+"')";
							stmt.executeUpdate(query1);
							
							PrintStream out = null;
							out = new PrintStream(new FileOutputStream("StorageServer\\"+fname));
						    out.print(content);
							out.close();
							
							DataOutputStream dout1 = new DataOutputStream(s.getOutputStream());
							dout1.writeUTF("success");
						}
						if(msg.equalsIgnoreCase("incorrect"))
						{
							DataOutputStream dout1 = new DataOutputStream(s.getOutputStream());
							dout1.writeUTF("unauth");
						}
					
					}
					
				}catch (Exception e) {
					e.printStackTrace();
			}
			
		 }
		 if(this.port==4646)
			{
				String mac=null;
				try
				{
					ServerSocket server1 = new ServerSocket(4646);
	                Socket con5 = null;
					while (true) 
					{
						con5=server1.accept();
						
						DataInputStream dis = new DataInputStream(con5.getInputStream());
						String file	= dis.readUTF();
						
						Thread.sleep(500);
						threel.setVisible(false);
						Thread.sleep(200);
						threel.setVisible(true);
						Thread.sleep(200);
						threel.setVisible(false);
						Thread.sleep(200);
						threel.setVisible(true);
						
						Thread.sleep(500);
						arrow2 = new ImageIcon(this.getClass().getResource("arrow2g.png"));
						arrow2l.setIcon(arrow2);
						
						lab2.setVisible(true);
						Thread.sleep(100);
						lab2.setVisible(false);
						Thread.sleep(100);
						lab2.setVisible(true);
						Thread.sleep(100);
						lab2.setVisible(false);
						Thread.sleep(100);
						lab2.setVisible(true);
						
						Thread.sleep(500);
						twol.setVisible(false);
						Thread.sleep(200);
						twol.setVisible(true);
						Thread.sleep(200);
						twol.setVisible(false);
						Thread.sleep(200);
						twol.setVisible(true);
						
						Thread.sleep(500);
						arrow1 = new ImageIcon(this.getClass().getResource("arrow1g.png"));
						arrow1l.setIcon(arrow1);
						
						Thread.sleep(500);
						threel.setVisible(false);
						Thread.sleep(200);
						threel.setVisible(true);
						Thread.sleep(200);
						threel.setVisible(false);
						Thread.sleep(200);
						threel.setVisible(true);
						
						clear();
						
						ResultSet r1=connect.createStatement().executeQuery("select * from CloudServer where fname='"+file+"'");
						
						if(r1.next()==true)
						{
							String k= r1.getString(3);
							
							DataOutputStream dos1 = new DataOutputStream(con5.getOutputStream());
							
							dos1.writeUTF("key");
							dos1.writeUTF(k);
							
						}
						if(r1.next()==false)
						{
							DataOutputStream dos1 = new DataOutputStream(con5.getOutputStream());
							dos1.writeUTF("no");
							dos1.writeUTF("no");
							
						}
						
					}

				}catch(Exception es){System.out.println(es);}
			}
		 if (this.port == 9988)
			{
				try
				{
					ServerSocket server909 = new ServerSocket(9988);
					Socket con777;

					while (true) 
					{
						
					con777 = server909.accept();
					
					DataInputStream dis = new DataInputStream(con777.getInputStream());
					String user	= dis.readUTF();
					String file	= dis.readUTF();
					String sk	= dis.readUTF();
					
					Thread.sleep(500);
					threel.setVisible(false);
					Thread.sleep(200);
					threel.setVisible(true);
					Thread.sleep(200);
					threel.setVisible(false);
					Thread.sleep(200);
					threel.setVisible(true);
					
					Thread.sleep(500);
					arrow6 = new ImageIcon(this.getClass().getResource("arrow6g.png"));
					arrow6l.setIcon(arrow6);
					
					lab3.setVisible(true);
					Thread.sleep(100);
					lab3.setVisible(false);
					Thread.sleep(100);
					lab3.setVisible(true);
					Thread.sleep(100);
					lab3.setVisible(false);
					Thread.sleep(100);
					lab3.setVisible(true);
					
					Thread.sleep(500);
					onel.setVisible(false);
					Thread.sleep(200);
					onel.setVisible(true);
					Thread.sleep(200);
					onel.setVisible(false);
					Thread.sleep(200);
					onel.setVisible(true);
					
					Thread.sleep(500);
					arrow5 = new ImageIcon(this.getClass().getResource("arrow5g.png"));
					arrow5l.setIcon(arrow5);
					
					Thread.sleep(500);
					threel.setVisible(false);
					Thread.sleep(200);
					threel.setVisible(true);
					Thread.sleep(200);
					threel.setVisible(false);
					Thread.sleep(200);
					threel.setVisible(true);
					
					clear();
					
					SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
						
					Date d = new Date();
						
					String dt = sd.format(d);
                                        String Usergrp = null;
                                        String Filegrp = null;
                                        //String Filegrp=null;
					String permit="YES";
                                        ResultSet usergrp=connect.createStatement().executeQuery("select grp from register where name='"+user+"'" );
                                        ResultSet filegrp=connect.createStatement().executeQuery("select grp from cloudserver where fname='"+file+"'" );
                                        if(usergrp.next()==true)
                                        Usergrp=usergrp.getString("grp");
                                        if(filegrp.next()==true)
                                        Filegrp=filegrp.getString("grp");
                                        
                                        System.out.println(Usergrp);
                                        System.out.println(Filegrp);
                                        
                                        if(Usergrp.equals(Filegrp))
                                        { 
					ResultSet r1=connect.createStatement().executeQuery("select * from cloudserver where fname='"+file+"' and apermit='"+permit+"'");
                                        
					if(r1.next()==true)
					{
						ResultSet r2=connect.createStatement().executeQuery("select * from cloudserver where fname='"+file+"' and sk='"+sk+"'");
						
						if(r2.next()==true)
						{
							FileInputStream fs = new FileInputStream("StorageServer\\"+file);
							byte bs1[] = new byte[fs.available()];
							fs.read(bs1);
							String content = new String(bs1);
							
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							AES a = new AES();
							dos1.writeUTF("success");
							dos1.writeUTF(a.decrypt(content, keyWord));
						}
						if(r2.next()!=true)
						{
							connect.createStatement().executeUpdate("insert into Attacker values ('"+user+"','"+file+"','"+sk+"','"+dt+"')");
							
							DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
							dos1.writeUTF("failure");
							dos1.writeUTF("failure");
						}
							
					}
					if(r1.next()!=true)
						{
						
						DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						dos1.writeUTF("nopermit");
						dos1.writeUTF("nopermit");
						
							
						}		
						
					
					}else {
                                        DataOutputStream dos1 = new DataOutputStream(con777.getOutputStream());
						dos1.writeUTF("nogroup");
						dos1.writeUTF("nogroup");
                                        
                                        }
                                        }
                                             
                                              
                                        
					
					}catch (Exception e) {
					
				}
			
			}
		 if (this.port == 1444)
			{

				try
				{
					ServerSocket server909 = new ServerSocket(1444);
					Socket con777;
					
					while (true) 
					{
						
					con777 = server909.accept();
					
					ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
					
					String fname=in3.readObject().toString();
					String group=in3.readObject().toString();
					Vector data = new Vector();
					
					ResultSet r1=connect.createStatement().executeQuery("select owner,fname from cloudserver where fname like '%"+fname+"%' and grp='"+group+"'");

					ResultSetMetaData rsm=r1.getMetaData();
					int col=rsm.getColumnCount();
					 
					while(r1.next()==true)
					{
						Vector row = new Vector();
		            	for(int i = 1; i <=col; i++){
		                row.addElement(r1.getObject(i));

		             }
		            	data.addElement(row);
					}	

					ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
					dout.writeObject(data);
					
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			
			
			}
			if (this.port == 1555)
			{

				try
				{
					ServerSocket server909 = new ServerSocket(1555);
					Socket con777;
					
					while (true) 
					{
						
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						String group=in3.readObject().toString();
						
						if(group.equalsIgnoreCase("GROUP1"))
						{
							//String[] dsname = {"GROUP2","GROUP3"};
							
							String dataname = "GROUP1";//(String) JOptionPane.showInputDialog(null,"Select GROUP", "Group",
									//JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
							 
							 if(dataname.equalsIgnoreCase("GROUP1"))
							 {
								 Vector data = new Vector();
									
									String yes="YES";
									ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%'");

									ResultSetMetaData rsm=r1.getMetaData();
									int col=rsm.getColumnCount();
									 
									while(r1.next()==true)
									{
										Vector row = new Vector();
						            	for(int i = 1; i <=col; i++){
						                row.addElement(r1.getObject(i));

						             }

						            	data.addElement(row);
									}	
//									System.out.println(data);
									ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
									dout.writeObject(data);
										
									
							 	}
									
									/*if(dataname.equalsIgnoreCase("GROUP3"))
									 {
										 Vector data = new Vector();
											
											String yes="YES";
											ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%' and spermit='"+yes+"'");

											ResultSetMetaData rsm=r1.getMetaData();
											int col=rsm.getColumnCount();
											 
											while(r1.next()==true)
											{
												Vector row = new Vector();
								            	for(int i = 1; i <=col; i++){
								                row.addElement(r1.getObject(i));

								             }

								            	data.addElement(row);
											}	
//											System.out.println(data);
											ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
											dout.writeObject(data);
												
											
									 	}*/
											
									 }
						
						if(group.equalsIgnoreCase("GROUP2"))
						{
							//String[] dsname = {"GROUP1", "GROUP3"};
							
							 String dataname = "GROUP2";/*(String) JOptionPane.showInputDialog(null,"Select GROUP", "Group",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);*/
							 
							 if(dataname.equalsIgnoreCase("GROUP2"))
							 {
								 Vector data = new Vector();
									
									String yes="YES";
									ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%'");

									ResultSetMetaData rsm=r1.getMetaData();
									int col=rsm.getColumnCount();
									 
									while(r1.next()==true)
									{
										Vector row = new Vector();
						            	for(int i = 1; i <=col; i++){
						                row.addElement(r1.getObject(i));

						             }

						            	data.addElement(row);
									}	
//									System.out.println(data);
									ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
									dout.writeObject(data);
										
									
							 	}
									
									/*if(dataname.equalsIgnoreCase("GROUP3"))
									 {
										 Vector data = new Vector();
											
											String yes="YES";
											ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%' and spermit='"+yes+"'");

											ResultSetMetaData rsm=r1.getMetaData();
											int col=rsm.getColumnCount();
											 
											while(r1.next()==true)
											{
												Vector row = new Vector();
								            	for(int i = 1; i <=col; i++){
								                row.addElement(r1.getObject(i));

								             }

								            	data.addElement(row);
											}	
//											System.out.println(data);
											ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
											dout.writeObject(data);
												
											
									 	}*/
							 }
						if(group.equalsIgnoreCase("GROUP3"))
						{
							//String[] dsname = {"GROUP1", "GROUP2"};
							
							 String dataname = "GROUP3";/*(String) JOptionPane.showInputDialog(null,"Select GROUP", "Group",
									JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);*/
							 
							 if(dataname.equalsIgnoreCase("GROUP3"))
							 {
								 Vector data = new Vector();
									
									String yes="YES";
									ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%'");

									ResultSetMetaData rsm=r1.getMetaData();
									int col=rsm.getColumnCount();
									 
									while(r1.next()==true)
									{
										Vector row = new Vector();
						            	for(int i = 1; i <=col; i++){
						                row.addElement(r1.getObject(i));

						             }

						            	data.addElement(row);
									}	
//									System.out.println(data);
									ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
									dout.writeObject(data);
										
									
							 	}
									
									/*if(dataname.equalsIgnoreCase("GROUP2"))
									 {
										 Vector data = new Vector();
											
											String yes="YES";
											ResultSet r1=connect.createStatement().executeQuery("select owner,fname from CloudServer where grp like '%"+dataname+"%' and spermit='"+yes+"'");

											ResultSetMetaData rsm=r1.getMetaData();
											int col=rsm.getColumnCount();
											 
											while(r1.next()==true)
											{
												Vector row = new Vector();
								            	for(int i = 1; i <=col; i++){
								                row.addElement(r1.getObject(i));

								             }

								            	data.addElement(row);
											}	
//											System.out.println(data);
											ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
											dout.writeObject(data);
												
											
									 	}*/
							 }
						
						}
						
						
						
				}catch (Exception e) {
					e.printStackTrace();
				}
			
			
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		}


		 void clear() throws InterruptedException {
			// TODO Auto-generated method stub
			 
			 	Thread.sleep(2000);
			 	
			 	arrow1 = new ImageIcon(this.getClass().getResource("arrow1.png"));
				arrow1l.setIcon(arrow1);
//				
				arrow2 = new ImageIcon(this.getClass().getResource("arrow2.png"));
				arrow2l.setIcon(arrow2);
				
				arrow3 = new ImageIcon(this.getClass().getResource("arrow3.png"));
				arrow3l.setIcon(arrow3);
				
				arrow4 = new ImageIcon(this.getClass().getResource("arrow4.png"));
				arrow4l.setIcon(arrow4);
//				
				arrow5 = new ImageIcon(this.getClass().getResource("arrow5.png"));
				arrow5l.setIcon(arrow5);
				
				arrow6 = new ImageIcon(this.getClass().getResource("arrow6.png"));
				arrow6l.setIcon(arrow6);
				
				lab1.setVisible(false);
				lab2.setVisible(false);
				lab3.setVisible(false);
		}
}