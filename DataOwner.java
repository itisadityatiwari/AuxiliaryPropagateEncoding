import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.crypto.Cipher;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DataOwner implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JButton b1, b2, b3, b4, b5, b6,b2m,btnGiveAccess;
	JScrollPane sp;
	JTextArea ta;
	JTextField t1, t2, t3;
	MenuBar mbr;
	Menu file;
	MenuItem item;
	Border b11, b22, b33;
	File path;
	JComboBox jb;
	Object type;
	String selItem,mac;
	Cipher encoder;
	Key prKey;
	int rank;
	JLabel ownername;
	JTextField ownertext,grp,gsign;
	
	public static Key pubKey;
	public Font f = new Font("Times new roman", Font.BOLD, 16);
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	String g;
	
	DataOwner(String name, String sign, String group) {
		jf = new JFrame("Data Owner::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		c = jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		JOptionPane.showMessageDialog(null,"Group Sign For The Owner is "+ sign);
		
		ownername = new JLabel("Owner Name");
		ownername.setFont(f);
		ownername.setBounds(110, 170, 120, 30);
		c.add(ownername);
		
		ownertext = new JTextField();
		ownertext.setBounds(95, 200, 120, 30);
		ownertext.setFont(f);
		ownertext.setText(name);
		ownertext.setEditable(false);
		
		c.add(ownertext);
		
		grp = new JTextField();
		grp.setBounds(95, 200, 120, 30);
		grp.setFont(f);
		grp.setText(group);
		grp.setVisible(false);
		c.add(grp);
		
		gsign = new JTextField();
		gsign.setBounds(95, 200, 120, 30);
		gsign.setFont(f);
		gsign.setText(sign);
		gsign.setVisible(false);
		c.add(gsign);
		
		ImageIcon m = new ImageIcon("DataOwner.png");
		l9 = new JLabel();
		l9.setIcon(m);
	
		l9.setBounds(35, 65, 700, 450);

//		Border b11 = BorderFactory.createBevelBorder(0);
//		l1 = new JLabel();
//		l1.setBorder(b11);
//		l1.setBounds(35, 165, 700, 350);
//
//		Border b22 = BorderFactory.createBevelBorder(0);
//		l2 = new JLabel();
//		l2.setBorder(b22);
		

		ImageIcon banner = new ImageIcon(this.getClass().getResource("SourceBack.png"));
		JLabel title = new JLabel();
		title.setIcon(banner);
		title.setBounds(20, 50, 800, 470);

		mbr = new MenuBar();
		file = new Menu("File");
		item = new MenuItem("New User");
		file.add(item);
		
		jf.setMenuBar(mbr);

		ta = new JTextArea();
		ta.setColumns(100);
		ta.setRows(100);

		sp = new JScrollPane();
		sp.setViewportView(ta);
		sp.setBounds(375, 185, 315, 250);

		b1 = new JButton("Browse");
		b2 = new JButton("Upload File");
                btnGiveAccess = new JButton("Give Access Permission");
		b3 = new JButton("Trustworthy");
		b4 = new JButton("SS Details");
		b5 = new JButton("Purchase");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		btnGiveAccess.addActionListener(this);
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.CYAN);
		b3.setBackground(Color.CYAN);
		b4.setBackground(Color.CYAN);
		b5.setBackground(Color.CYAN);
		btnGiveAccess.setBackground(Color.CYAN);
		item.addActionListener(this);

		b1.setBounds(95, 250, 120, 30);
		b2.setBounds(95, 300, 120, 30);
		b3.setBounds(95, 350, 120, 30);
		b4.setBounds(95, 400, 120, 30);
		b5.setBounds(95, 450, 120, 30);
		btnGiveAccess.setBounds(95, 350, 120, 30);
//		ImageIcon banner = new ImageIcon(this.getClass().getResource("Back.png"));
//		JLabel title = new JLabel();
//		title.setIcon(banner);
//		title.setBounds(0, 0,  950,570);
		
		
		
		c.add(sp);
//		c.add(l1);
		
//		c.add(l2);
		c.add(b1);
		c.add(b2);
                c.add(btnGiveAccess);
//		c.add(b3);
//		c.add(b4);
//		c.add(b5);
///		c.add(title);
		c.add(title);
		jf.setSize(840,590);
		jf.show();
		
	}
	public void actionPerformed(ActionEvent e) {
		String strline = "";
		Object o = e.getSource();
		if (o == item) {

			// user.setSize
		}
                
                if(o== btnGiveAccess){
                GivePrivilages v = new GivePrivilages(ownertext.getText());
				v.setSize(350,350);
				v.setVisible(true);
		
                    
                }
		if (o == b1) {
			JFileChooser chooser = new JFileChooser("Database");
			try {
				File f = new File(new File("filename.txt").getCanonicalPath());
				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			int retval = chooser.showOpenDialog(b1);
			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				
				path = chooser.getSelectedFile();
			}

			File curFile = chooser.getSelectedFile();
			try {
				FileInputStream fstream = new FileInputStream(curFile);
				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));
				StringBuffer buffer = new StringBuffer();

				while ((strline = br.readLine()) != null) {
//					System.out.println(strline);
					buffer.append(strline + "\n");
				}
				ta.setText(buffer.toString());
				
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		if (o == b2) {
			try {
				PrintStream out = null;
				String owner = ownertext.getText();
				String content=ta.getText();
				

				String fname = JOptionPane.showInputDialog(null,"Enter the file name");
//				String[] dsname = {"YES", "NO"};
//				
//				 String permit = (String) JOptionPane.showInputDialog(null,
//						"Access Permission", " Permission",
//						JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
				String ip = JOptionPane.showInputDialog(null,"Enter Storage Server Ip Address");
				
				KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA"); 
				 encoder = Cipher.getInstance("RSA"); 
				 KeyPair kp = kg.generateKeyPair(); 
				 prKey = kp.getPrivate(); 
				 pubKey = kp.getPublic(); 
				 
				 // RSA produces 1024 bits Key
				 
				byte[] pub = pubKey.getEncoded();
				 
				String sk=String.valueOf(pub);
				
				out = new PrintStream(new FileOutputStream("Owner\\"+fname));
			    out.print(content);
				out.close();
				
				SimpleDateFormat sd = new SimpleDateFormat();
				
				Date d = new Date();
				
				String dt = sd.format(d);
				
				Dbcon db = new Dbcon();
				Connection connect = db.getConnection();
				Statement stmt = connect.createStatement();
				String query1 = "insert into OwnerFiles values('"+owner+"','"+fname+"','"+sk+"','"+grp.getText()+"','"+dt+"') ";
				stmt.executeUpdate(query1);
				
				Socket soc = new Socket(ip,1111);
				DataOutputStream dout1 = new DataOutputStream(soc.getOutputStream());
				
				dout1.writeUTF(owner);
				dout1.writeUTF(fname);
				dout1.writeUTF(AES.encrypt(content, keyWord));
				dout1.writeUTF(sk);
				dout1.writeUTF(grp.getText());
				dout1.writeUTF(gsign.getText());
//				dout1.writeUTF(permit);
				dout1.writeUTF(dt);
				
				DataInputStream din1 = new DataInputStream(soc.getInputStream());
				String msg1 = din1.readUTF();
				System.out.println(msg1);
				
				if(msg1.equalsIgnoreCase("success"))
				{
					JOptionPane.showMessageDialog(null, "File Stored Successfully");
				}
				if(msg1.equalsIgnoreCase("unauth"))
				{
					JOptionPane.showMessageDialog(null, "You Are Not The Authorized Group User");
				}
				
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			
		}
			
	}


	public static void main(String[] args) {
		
	//new DataOwner("a","mac","grp");
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			}
		});
	}

}
