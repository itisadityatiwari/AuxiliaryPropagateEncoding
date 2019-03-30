import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class EndUserLogin implements ActionListener 
{
  JFrame jf;
  Container c;
  JLabel l1,l2,l3,a3;
  JTextField t1;
  JPasswordField t2;
  JButton b1,b2,b3;
  JComboBox jb,c1;
  
  public Font f = new Font("Times new roman", Font.BOLD, 16);

  
  @SuppressWarnings("deprecation")
EndUserLogin()
  {
	  jf = new JFrame("UserLogin ::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
	  c = jf.getContentPane();
	  c.setLayout(null);
	  c.setBackground(Color.pink);
	  
	  l1 = new JLabel("Username");
	  l1.setFont(f);
	  
	  l2 = new JLabel("Password");
	  l2.setFont(f);
	  
	  t1 = new JTextField(15);
	  t2 = new JPasswordField(15);
	  t2.setEchoChar('*');
	  
	  b1 = new JButton("Login");
	  b2 = new JButton("Register");
	  b3 = new JButton("Reset");
	  
	  a3 = new JLabel("Group");
		a3.setFont(f);
		a3.setBounds(70,170,110,35);
		c.add(a3);
		
		c1=new JComboBox();
		
		c1.addItem("GROUP1");
		c1.addItem("GROUP2");
		c1.addItem("GROUP3");
		
		c1.setBounds(175, 178, 130, 25);
		c1.addActionListener(this);
		c.add(c1);
	  l1.setBounds(75, 70, 110, 35);
	  l2.setBounds(75, 120, 110, 35);
	
	  t1.setBounds(175, 77, 130, 25);
	  t2.setBounds(175, 128, 130, 25);
	  
	  b1.setBounds(80, 250, 80, 30);
	  b2.setBounds(170, 250, 100, 30);
	  b3.setBounds(280, 250, 80, 30);
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  
	  c.add(l1);c.add(l2);//c.add(l3);
	  c.add(t1);c.add(t2);
	  c.add(b1);c.add(b2);c.add(b3);
	  jf.setBounds(550,220,400, 350);
	  jf.show();	  
  }
  public void actionPerformed(ActionEvent e)
  {
	  Object o = e.getSource();
	  if(o == b1)
	  {
		  String name = t1.getText();
		  String pwd = t2.getText();
		  
		  String ip=JOptionPane.showInputDialog("Enter the Signal Central Authority IP address");
		  
		  try
		  {
			  Socket cn11 = new Socket(ip,1234);
			  DataOutputStream dos1 = new DataOutputStream(cn11.getOutputStream());
			  
			  dos1.writeUTF(name);
			  dos1.writeUTF(pwd);
			  String grp=c1.getSelectedItem().toString();
			  dos1.writeUTF(grp);
			  
			  DataInputStream din1 = new DataInputStream(cn11.getInputStream());
			  
			  String status=din1.readUTF();
			  String sign=din1.readUTF();
			  
			  if(status.equals("success"))
			  {
				  JOptionPane.showMessageDialog(null, "Login Success");
				  new EndUser(name,sign,grp);
				  
			  }
			  else 
			  {
				  JOptionPane.showMessageDialog(null, "You are not a Valid User");
			  }
			  
			  System.out.println("Checking login");
			  
		  }catch(Exception ee)
		  {
			  ee.printStackTrace();
		  }
	  }
	  if(o == b2)
	  {
		  Register user = new Register();
		  user.setSize(400, 440);
		  user.setVisible(true);
	  }
  }
  public static void main(String[] args) {
	new EndUserLogin();
}
  
  
  
}
