import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class OwnerRegister implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel b1,b2,b3,b4,b5,b6;
	JButton submit,reset;
	JTextField t1,t3,t4,t5;
	JPasswordField t2;
	JLabel lab1;
	JComboBox cb,c1;
	public Font f = new Font("Times new roman", Font.BOLD, 14);
	public OwnerRegister() 
	{
		frame = new JFrame("Owner Register ::Auxialiary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.orange);
		
		b1 = new JLabel("Owner Name");
		b1.setBounds(80, 50, 80, 20);
		b1.setFont(f);
		b2 = new JLabel("Password");
		b2.setBounds(80, 100, 80, 20);
		b2.setFont(f);
		b3 = new JLabel("Address");
		b3.setBounds(80, 150, 80, 30);
		b3.setFont(f);
		b4 = new JLabel("City");
		b4.setBounds(80, 200, 80, 30);
		b4.setFont(f);
		b5 = new JLabel("Mobile");
		b5.setBounds(80, 250, 80, 30);
		b5.setFont(f);
		b6 = new JLabel("Group");
		b6.setBounds(80, 300, 80, 30);
		b6.setFont(f);
		
		t1 = new JTextField();
		t1.setBounds(180, 50, 150, 20);
		t2 = new JPasswordField();
		t2.setBounds(180, 100, 150, 20);
		t3 = new JTextField();
		t3.setBounds(180, 150, 150, 20);
		t4 = new JTextField();
		t4.setBounds(180, 200, 150, 20);
		t5 = new JTextField();
		t5.setBounds(180, 250, 150, 20);
		
		submit = new JButton("Register");
		submit.setBounds(110, 370, 100, 30);
		
		reset = new JButton("Reset");
		reset.setBounds(230, 370, 80, 30);
		
		submit.addActionListener(this);
		reset.addActionListener(this);
	
		cb=new JComboBox();
		c1=new JComboBox();
		
		c1.addItem("GROUP1");
		c1.addItem("GROUP2");
		c1.addItem("GROUP3");
		
		c1.setBounds(180, 300, 150, 20);
		c1.addActionListener(this);
//		ImageIcon img1 = new ImageIcon(this.getClass().getResource("register.jpg"));
//		lab1 = new JLabel();
//		lab1.setIcon(img1);
//		lab1.setBounds(120, 10, 400, 350);
		
		cb.addItem("DATA SET 1");
		cb.addItem("DATA SET 2");
		cb.addItem("DATA SET 3");
		cb.addItem("DATA SET 4");
		cb.addItem("DATA SET 5");
		
		cb.setBounds(180, 330, 150, 30);
		cb.addActionListener(this);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		
		panel.add(t1);
		panel.add(t2);
		panel.add(t3);
		panel.add(t4);
		panel.add(t5);
		panel.add(submit);
		panel.add(reset);
//		panel.add(lab1);
		panel.add(c1);
//		panel.setBackground(Color.white);
		frame.add(panel);
		
		frame.setSize(430, 480);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void main(String[] args) 
		{
		//new OwnerRegister();
		}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==submit)
		{
			try{
			String name = t1.getText();
			String password = t2.getText();
			String addr = t3.getText();
			String city = t4.getText();
			String mob = t5.getText();
			String grp=c1.getSelectedItem().toString();
			
			
			String ip = JOptionPane.showInputDialog(null,"Enter Signal Central Authority IP Address");
			
				Socket sc = new Socket(ip,5757);
				DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
				
				dout.writeUTF(name);
				dout.writeUTF(password);
				dout.writeUTF(addr);
				dout.writeUTF(city);
				dout.writeUTF(mob);
				dout.writeUTF(grp);
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String msg = din.readUTF();
                                System.out.println(msg);
				if("error".equals(msg)){
                                    JOptionPane.showMessageDialog(null, "Name "+name+" already exists" );
                                    }
                                else if("success".equals(msg)){
                                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                                    }
                                
                                
			
			}catch (Exception e1) {
				// TODO: handle exception
			}
			
		}
		
		if(e.getSource()==reset)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
	}
	
}
