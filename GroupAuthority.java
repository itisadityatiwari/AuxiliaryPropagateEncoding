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
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class GroupAuthority implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JPanel p1, p2;
	JButton b2, b3, b4;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1;
	MenuBar mbr;
	Menu file;
	MenuItem  item2, users,csfile,exit;
	Border b11, b22, b33;
	JScrollPane pane;
	String Scheme1, rank;
	String f1 = "", f2 = "", f3 = "", f4 = "", f5 = "", f6 = "", f7 = "",f8 = "";
	int count = 0;
	Timer timer;
	ImageIcon gol,one,two,three,four,five,six,seven,eight,arrow1,arrow2,arrow3,a1,a2,arrow4,arrow5,arrow6,arrow7,arrow8,arrow9,end,end1;
	JLabel gol1,onel,twol,threel,fourl,fivel,sixl,sevenl,eightl,arrow1l,arrow2l,a1l,a2l,arrow3l,arrow4l,arrow5l,arrow6l,arrow7l,arrow8l,arrow9l,endl,end1l;
	JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10,lab11;
	
	
	public Font f = new Font("Times new roman", Font.BOLD, 14);
	public Font font = new Font("Times new roman", Font.BOLD, 18);
	
	JLabel mg1, mg2, mg3, mg4, mg5, mg6, mg7, mg8, mg9, mg10, g11, g22, g33,
			g44, g55, g66, g77;
	
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";

	GroupAuthority() {
		jf = new JFrame("Group Authority :: Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.WHITE);
		timer = new Timer(0, null);

		one = new ImageIcon(this.getClass().getResource("main.png"));
		onel=new JLabel();
		onel.setIcon(one);
		onel.setBounds(220, 0, 300, 200);
		c.add(onel);
		
		
		
		
		two = new ImageIcon(this.getClass().getResource("g1.png"));
		twol=new JLabel();
		twol.setIcon(two);
		twol.setBounds(90, 200, 300, 200);
		c.add(twol);
//		
		three = new ImageIcon(this.getClass().getResource("g2.png"));
		threel=new JLabel();
		threel.setIcon(three);
		threel.setBounds(240, 210, 300, 200);
		c.add(threel);
//		
		four = new ImageIcon(this.getClass().getResource("g3.png"));
		fourl=new JLabel();
		fourl.setIcon(four);
		fourl.setBounds(390, 205, 300, 200);
		c.add(fourl);

		arrow1 = new ImageIcon(this.getClass().getResource("l1.png"));
		arrow1l=new JLabel();
		arrow1l.setIcon(arrow1);
		arrow1l.setBounds(150, 100, 300, 200);
		c.add(arrow1l);
//		
		arrow2 = new ImageIcon(this.getClass().getResource("l2.png"));
		arrow2l=new JLabel();
		arrow2l.setIcon(arrow2);
		arrow2l.setBounds(240, 110, 300, 200);
		c.add(arrow2l);
		
		arrow3 = new ImageIcon(this.getClass().getResource("l3.png"));
		arrow3l=new JLabel();
		arrow3l.setIcon(arrow3);
		arrow3l.setBounds(320, 100, 300, 200);
		c.add(arrow3l);
//		

		lab1 = new JLabel("REGISTER");
		lab1.setFont(f);
		lab1.setBounds(370, 100, 300, 200);
		lab1.setVisible(false);
		c.add(lab1);
		
		lab2 = new JLabel("LOGIN");
		lab2.setFont(f);
		lab2.setBounds(370, 100, 300, 200);
		lab2.setVisible(false);
		c.add(lab2);
		
		lab3 = new JLabel("DOWNLOAD");
		lab3.setFont(f);
		lab3.setBounds(370, 100, 300, 200);
		lab3.setVisible(false);
		c.add(lab3);
		
		lab4 = new JLabel("RE-REGISTER");
		lab4.setFont(f);
		lab4.setBounds(370, 100, 300, 200);
		lab4.setVisible(false);
		c.add(lab4);
//		
		lab5 = new JLabel("UPLOAD");
		lab5.setFont(f);
		lab5.setBounds(370, 100, 300, 200);
		lab5.setVisible(false);
		c.add(lab5);
		
		lab6 = new JLabel("VERIFY");
		lab6.setFont(f);
		lab6.setBounds(370, 100, 300, 200);
		lab6.setVisible(false);
		c.add(lab6);
		
//		b1 = new JButton("View Cloud Files");
//		b1.setForeground(Color.BLACK);
//
//		b1.setBounds(270, 370, 200, 30);
//		b1.addActionListener(this);


		ImageIcon banner = new ImageIcon(this.getClass().getResource("tree.png"));
		JLabel title = new JLabel();
		title.setIcon(banner);
		title.setBounds(420, 50, 530, 275);
		
		
		mbr = new MenuBar();
		file = new Menu("View");
		item2 = new MenuItem("View Registered Users");
		users = new MenuItem("View Group Users");
		csfile = new MenuItem("View Group Sign");
		exit = new MenuItem("Exit");
		
		item2.addActionListener(this);
		users.addActionListener(this);
		csfile.addActionListener(this);
		exit.addActionListener(this);
		
		file.add(item2);
		file.add(users);
		file.add(csfile);
		
		file.add(exit);
		mbr.add(file);
		jf.setMenuBar(mbr);

//		c.add(l2);
		
		c.add(title);
//		c.add(b1);
		jf.setBounds(-10, 0, 910,480);
		jf.show();

		int[] ports = new int[] {5757,4093,4094,1234,2222,1333};
		
		for (int i = 0; i < 6; i++) {
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
				new GroupAuthority();
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		

		if (o == item2) {
			
			ViewRegisteredUsers v = new ViewRegisteredUsers();
			v.setSize(650, 400);
			v.setVisible(true);
			
			}
			

		if (o == users) {
			
			GroupView v1 = new GroupView();
			v1.setSize(200, 400);
			v1.setVisible(true);
		}
		if (o == csfile) {
			
			ViewGroupSign vv =new ViewGroupSign();
			vv.setSize(670,400);
			vv.setVisible(true);
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
				if (this.port == 5757) {
                                    System.out.println(1);
					Socket s = null;
					try {
						//Socket s;
							ServerSocket sc =new ServerSocket(5757);
							Dbcon done=new Dbcon();
							Connection connect = done.getConnection();
							while(true)
							{
							
							s = sc.accept();
							
							DataInputStream din = new DataInputStream(s.getInputStream());
							
							
							String name = din.readUTF();
                                                        //NAME=name;
							String pass = din.readUTF();
							String addr = din.readUTF();
							String city = din.readUTF();
							String contact =din.readUTF();
							String group = din.readUTF();
                                                        
							String user = "Owner";
							if(group.equalsIgnoreCase("GROUP1"))
							{       System.out.println(2);
								String file="GroupSign";
								String content1="group1";
								PrintStream out1 = new PrintStream(new FileOutputStream("GroupSign\\"+file));
								out1.print(content1);
								out1.close();
								
								MessageDigest md1 = MessageDigest.getInstance("SHA1");
								FileInputStream in11 = new FileInputStream("GroupSign\\"+ file);
								DigestInputStream dis21 = new DigestInputStream(in11, md1);
								BufferedInputStream bd1 = new BufferedInputStream(dis21);

								while (true) {
									int b2 = bd1.read();
									if (b2 == -1)
										break;
								}

								BigInteger bi21 = new BigInteger(md1.digest());
								String mac1 = bi21.toString(16);
								System.out.println(mac1);
								connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac1+"','"+user+"')");
								connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac1+"')");
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("success");
							}
							
							if(group.equalsIgnoreCase("GROUP2"))
							{       System.out.println(3);
								String fname1="GroupSign";
								String content2="group2";
								PrintStream out2 = new PrintStream(new FileOutputStream("GroupSign\\"+fname1));
								out2.print(content2);
								out2.close();
								
								MessageDigest md2 = MessageDigest.getInstance("SHA1");
								FileInputStream in12 = new FileInputStream("GroupSign\\"+ fname1);
								DigestInputStream dis22 = new DigestInputStream(in12, md2);
								BufferedInputStream bd2 = new BufferedInputStream(dis22);

								while (true) {
									int b2 = bd2.read();
									if (b2 == -1)
										break;
								}

								BigInteger bi22 = new BigInteger(md2.digest());
								String mac2 = bi22.toString(16);
								System.out.println(mac2);
								connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac2+"','"+user+"')");
								connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac2+"')");
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("success");
							}
							
							if(group.equalsIgnoreCase("GROUP3"))
							{        System.out.println(4);
								String fname3="GroupSign";
								String content3="group3";
								PrintStream out3 = new PrintStream(new FileOutputStream("GroupSign\\"+fname3));
								out3.print(content3);
								out3.close();
								
								MessageDigest md3 = MessageDigest.getInstance("SHA1");
								FileInputStream in13 = new FileInputStream("GroupSign\\"+ fname3);
								DigestInputStream dis23 = new DigestInputStream(in13, md3);
								BufferedInputStream bd3 = new BufferedInputStream(dis23);

								while (true) {
									int b2 = bd3.read();
									if (b2 == -1)
										break;
								}

								BigInteger bi23 = new BigInteger(md3.digest());
								String mac3 = bi23.toString(16);
								System.out.println(mac3);
								connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac3+"','"+user+"')");
								connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac3+"')");
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("success");
							}
							
							}
						} catch (SQLException e) {
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
                                                        dout.writeUTF("error");
						} catch (Exception e){
                                                e.printStackTrace();
                                                }
					
					} 
				if (this.port == 4093) {
					 Socket s = null;
					try {
						
							ServerSocket sc =new ServerSocket(4093);
							
							Dbcon done=new Dbcon();
							Connection connect = done.getConnection();
							while(true)
							{
								
								s = sc.accept();
								
								DataInputStream din = new DataInputStream(s.getInputStream());
								
								
								String name = din.readUTF();
                                                              
								String pass = din.readUTF();
								String addr = din.readUTF();
								String city = din.readUTF();
								String contact =din.readUTF();
								String group = din.readUTF();
						
								String user = "End User";
								if(group.equalsIgnoreCase("GROUP1"))
								{
									String file="GroupSign";
									String content1="group1";
									PrintStream out1 = new PrintStream(new FileOutputStream("GroupSign\\"+file));
									out1.print(content1);
									out1.close();
									
									MessageDigest md1 = MessageDigest.getInstance("SHA1");
									FileInputStream in11 = new FileInputStream("GroupSign\\"+ file);
									DigestInputStream dis21 = new DigestInputStream(in11, md1);
									BufferedInputStream bd1 = new BufferedInputStream(dis21);

									while (true) {
										int b2 = bd1.read();
										if (b2 == -1)
											break;
									}

									BigInteger bi21 = new BigInteger(md1.digest());
									String mac1 = bi21.toString(16);
									System.out.println(mac1);
									connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac1+"','"+user+"')");
									connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac1+"')");
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF("success");
								}
								
								if(group.equalsIgnoreCase("GROUP2"))
								{
									String fname1="GroupSign";
									String content2="group2";
									PrintStream out2 = new PrintStream(new FileOutputStream("GroupSign\\"+fname1));
									out2.print(content2);
									out2.close();
									
									MessageDigest md2 = MessageDigest.getInstance("SHA1");
									FileInputStream in12 = new FileInputStream("GroupSign\\"+ fname1);
									DigestInputStream dis22 = new DigestInputStream(in12, md2);
									BufferedInputStream bd2 = new BufferedInputStream(dis22);

									while (true) {
										int b2 = bd2.read();
										if (b2 == -1)
											break;
									}

									BigInteger bi22 = new BigInteger(md2.digest());
									String mac2 = bi22.toString(16);
									System.out.println(mac2);
									connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac2+"','"+user+"')");
									connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac2+"')");
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF("success");
								}
								
								if(group.equalsIgnoreCase("GROUP3"))
								{
									String fname3="GroupSign";
									String content3="group3";
									PrintStream out3 = new PrintStream(new FileOutputStream("GroupSign\\"+fname3));
									out3.print(content3);
									out3.close();
									
									MessageDigest md3 = MessageDigest.getInstance("SHA1");
									FileInputStream in13 = new FileInputStream("GroupSign\\"+ fname3);
									DigestInputStream dis23 = new DigestInputStream(in13, md3);
									BufferedInputStream bd3 = new BufferedInputStream(dis23);

									while (true) {
										int b2 = bd3.read();
										if (b2 == -1)
											break;
									}

									BigInteger bi23 = new BigInteger(md3.digest());
									String mac3 = bi23.toString(16);
									System.out.println(mac3);
									connect.createStatement().executeUpdate("insert into register values('"+name+"','"+pass+"','"+addr+"','"+city+"','"+contact+"','"+group+"','"+mac3+"','"+user+"')");
									connect.createStatement().executeUpdate("insert into GroupDetails values('"+name+"','"+group+"','"+mac3+"')");
									DataOutputStream dout =new DataOutputStream(s.getOutputStream());
									dout.writeUTF("success");
								}
								
								}
					}	catch (SQLException e) {
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
                                                        dout.writeUTF("error");
                                                        
						}
							catch (Exception e) {
							e.printStackTrace();
						}
							
							
					}
				if (this.port == 4094) {
					 
					try {
						Socket s;
							ServerSocket sc =new ServerSocket(4094);
							
							Dbcon done=new Dbcon();
							Connection connect = done.getConnection();
							while(true)
							{
							
							s = sc.accept();
							
							DataInputStream din = new DataInputStream(s.getInputStream());
							
							String name = din.readUTF();
							String pass = din.readUTF();
							String grp = din.readUTF();
							
							if(grp.equalsIgnoreCase("GROUP1"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow1l.setVisible(false);
								Thread.sleep(100);
								arrow1l.setVisible(true);
								Thread.sleep(100);
								arrow1l.setVisible(false);
								Thread.sleep(100);
								arrow1l.setVisible(true);
								
								Thread.sleep(500);
								twol.setVisible(false);
								Thread.sleep(100);
								twol.setVisible(true);
								Thread.sleep(100);
								twol.setVisible(false);
								Thread.sleep(100);
								twol.setVisible(true);
							}
							if(grp.equalsIgnoreCase("GROUP2"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow2l.setVisible(false);
								Thread.sleep(100);
								arrow2l.setVisible(true);
								Thread.sleep(100);
								arrow2l.setVisible(false);
								Thread.sleep(100);
								arrow2l.setVisible(true);
								
								Thread.sleep(500);
								threel.setVisible(false);
								Thread.sleep(100);
								threel.setVisible(true);
								Thread.sleep(100);
								threel.setVisible(false);
								Thread.sleep(100);
								threel.setVisible(true);
							}
							if(grp.equalsIgnoreCase("GROUP3"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow3l.setVisible(false);
								Thread.sleep(100);
								arrow3l.setVisible(true);
								Thread.sleep(100);
								arrow3l.setVisible(false);
								Thread.sleep(100);
								arrow3l.setVisible(true);
								
								Thread.sleep(500);
								fourl.setVisible(false);
								Thread.sleep(100);
								fourl.setVisible(true);
								Thread.sleep(100);
								fourl.setVisible(false);
								Thread.sleep(100);
								fourl.setVisible(true);
							}
							String user="Owner";
							ResultSet r1=connect.createStatement().executeQuery("select * from register where name='"+name+"' and pass='"+pass+"' and grp='"+grp+"' and user='"+user+"'");
							
							if(r1.next()==true)
							{
								String sig= r1.getString(7);
								
								DataOutputStream dout = new DataOutputStream(s.getOutputStream());
								dout.writeUTF("success");
								dout.writeUTF(sig);
								
							}
							else
							{
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("no");
								dout.writeUTF("no");
							}
							
						}
					}	
							catch (Exception e) {
							e.printStackTrace();
						}
							
							
					}
				if (this.port == 1234) {
					 
					try {
						Socket s;
							ServerSocket sc =new ServerSocket(1234);
							
							Dbcon done=new Dbcon();
							Connection connect = done.getConnection();
							while(true)
							{
							
							s = sc.accept();
							
							DataInputStream din = new DataInputStream(s.getInputStream());
							
							String name = din.readUTF();
							String pass = din.readUTF();
							String group = din.readUTF();
							
							if(group.equalsIgnoreCase("GROUP1"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow1l.setVisible(false);
								Thread.sleep(100);
								arrow1l.setVisible(true);
								Thread.sleep(100);
								arrow1l.setVisible(false);
								Thread.sleep(100);
								arrow1l.setVisible(true);
								
								Thread.sleep(500);
								twol.setVisible(false);
								Thread.sleep(100);
								twol.setVisible(true);
								Thread.sleep(100);
								twol.setVisible(false);
								Thread.sleep(100);
								twol.setVisible(true);
							}
							if(group.equalsIgnoreCase("GROUP2"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow2l.setVisible(false);
								Thread.sleep(100);
								arrow2l.setVisible(true);
								Thread.sleep(100);
								arrow2l.setVisible(false);
								Thread.sleep(100);
								arrow2l.setVisible(true);
								
								Thread.sleep(500);
								threel.setVisible(false);
								Thread.sleep(100);
								threel.setVisible(true);
								Thread.sleep(100);
								threel.setVisible(false);
								Thread.sleep(100);
								threel.setVisible(true);
							}
							if(group.equalsIgnoreCase("GROUP3"))
							{

								Thread.sleep(500);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								Thread.sleep(100);
								onel.setVisible(false);
								Thread.sleep(100);
								onel.setVisible(true);
								
								Thread.sleep(500);
								arrow3l.setVisible(false);
								Thread.sleep(100);
								arrow3l.setVisible(true);
								Thread.sleep(100);
								arrow3l.setVisible(false);
								Thread.sleep(100);
								arrow3l.setVisible(true);
								
								Thread.sleep(500);
								fourl.setVisible(false);
								Thread.sleep(100);
								fourl.setVisible(true);
								Thread.sleep(100);
								fourl.setVisible(false);
								Thread.sleep(100);
								fourl.setVisible(true);
							}
							String user="End User";
							ResultSet r1=connect.createStatement().executeQuery("select * from register where name='"+name+"' and pass='"+pass+"' and grp='"+group+"' and user='"+user+"'");
							
							if(r1.next()==true)
							{
								String sig= r1.getString(7);
								
								DataOutputStream dout = new DataOutputStream(s.getOutputStream());
								dout.writeUTF("success");
								dout.writeUTF(sig);
								
							}
							else
							{
								DataOutputStream dout =new DataOutputStream(s.getOutputStream());
								dout.writeUTF("no");
								dout.writeUTF("no");
							}
							
		
						}
					}	
							catch (Exception e) {
							e.printStackTrace();
						}
							
							
					}
				if (this.port == 2222) {
					 
					try {
						Socket s;
						ServerSocket sc =new ServerSocket(2222);
						
						Dbcon done=new Dbcon();
						Connection connect = done.getConnection();
						while(true)
						{
						
						s = sc.accept();
						
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String owner = din.readUTF();
						String gsign = din.readUTF();
						
						
						String user="Owner";
						ResultSet r1=connect.createStatement().executeQuery("select * from register where name='"+owner+"' and sign='"+gsign+"' and user='"+user+"'");
						
						if(r1.next()==true)
						{
							DataOutputStream dout = new DataOutputStream(s.getOutputStream());
							dout.writeUTF("correct");
							
						}
						else
						{
							DataOutputStream dout =new DataOutputStream(s.getOutputStream());
							dout.writeUTF("incorrect");
						}
						
	
					}
				}	
							catch (Exception e) {
							e.printStackTrace();
						}
							
							
					}
				if (this.port == 1333)
				{

					try
					{
						ServerSocket server909 = new ServerSocket(1333);
						Socket con777;
						
						Dbcon db=new Dbcon();
						Connection connect=db.getConnection();
						while (true) 
						{
							
						con777 = server909.accept();
						
						ObjectInputStream in3=new ObjectInputStream(con777.getInputStream());
						
						String cs=in3.readObject().toString();
						
						Vector data = new Vector();
						
						ResultSet r1=connect.createStatement().executeQuery("select user,grp,mac from groupdetails");

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
//						System.out.println(data);
						ObjectOutputStream dout = new ObjectOutputStream(con777.getOutputStream());
						dout.writeObject(data);
						
						}
					}catch (Exception e) {
						e.printStackTrace();
					}
				
				
				}
				
                            }catch (Exception e) {
				e.printStackTrace();
                            }
                    // Duplicate entry
                    // Other SQL Exception
                    
	}

		 void clear() throws InterruptedException {
			// TODO Auto-generated method stub
			 
			 Thread.sleep(500);
			 lab1.setVisible(false);
			 lab2.setVisible(false);
			 lab3.setVisible(false);
				lab4.setVisible(false);
				
				lab5.setVisible(false);
				lab6.setVisible(false);
			
		}

}
	
}
