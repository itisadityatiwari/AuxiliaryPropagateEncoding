

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Register extends JFrame implements ActionListener{
	
	JPanel p; 
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9; 
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8; 
	//JTextArea tf3;
	JButton b1;
	JComboBox c1;
	
	public Register()
	{
		p=new JPanel();
		p.setLayout(null);
		setTitle("USER REGISTER::Auxiliary Propagate Encoding with Efficient Encryption and Short Ciphertexts");
		p.setBackground(Color.orange);
//		ImageIcon ii=new ImageIcon(this.getClass().getResource("Desert.jpg"));
//		l8=new JLabel();
//		l8.setIcon(ii);
//		l8.setBounds(0, 0, 500, 500);
		
		l1=new JLabel("REGISTERATION");
		l1.setBounds(115, 25, 230 ,50 );
		l1.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
		l1.setForeground(Color.RED);
		
		l2=new JLabel("USER NAME");
		l2.setBounds(70, 80, 120 ,20 );
		l2.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		l3=new JLabel("PASSWORD");
		l3.setBounds(70, 110, 120 ,20 );
		l3.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		l4=new JLabel("ADDRESS");
		l4.setBounds(70, 140, 120 ,20 );
		l4.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		l5=new JLabel("CITY");
		l5.setBounds(70, 190, 120 ,20 );
		l5.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));

		l6=new JLabel("E_MAIL");
		l6.setBounds(70, 220, 120 ,20 );
		l6.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		l7=new JLabel("CONTACT");
		l7.setBounds(70, 220, 120 ,20 );
		l7.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		l8=new JLabel("GROUP");
		l8.setBounds(70, 250, 120 ,20 );
		l8.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		
//		l9=new JLabel("RING SIGN");
//		l9.setBounds(70, 290, 120 ,20 );
//		l9.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,12));
		
		tf1=new JTextField(15);
		tf1.setBounds(180, 80, 150, 20);
		
		tf2=new JPasswordField(15);
		tf2.setBounds(180, 110, 150, 20);
		
		tf3=new JTextField(15);
		tf3.setBounds(180, 140, 150, 40);
		
		tf4=new JTextField(15);
		tf4.setBounds(180, 190, 150, 20);
		

		tf6=new JTextField(15);
		tf6.setBounds(180, 220, 150, 20);

		c1=new JComboBox();
		
		c1.addItem("GROUP1");
		c1.addItem("GROUP2");
		c1.addItem("GROUP3");
		
		c1.setBounds(180, 250, 150, 20);
		c1.addActionListener(this);
		
//		tf8=new JTextField(15);
//		tf8.setBounds(180, 290, 150, 20);
		
		b1=new JButton("REGISTER");
		b1.setBounds(140, 350, 120, 30);
		b1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 14));
		//b1.setBackground(Color.cyan);
		
		
		b1.addActionListener(this);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
//		p.add(l6);
		p.add(l7);
		p.add(l8);
//		p.add(l9);
		p.add(c1);
		
		p.add(tf1);
		p.add(tf2);
		p.add(tf3);
		p.add(tf4);
//		p.add(tf5);
		p.add(tf6);
//		p.add(tf7);
//		p.add(tf8);
		
		p.add(b1);
		
		add(p);
		
	}

	public static void main(String[] args) {
		
		Register r = new Register();
		r.setSize(430,490);
		r.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String t1=tf1.getText(); 
		String t2=tf2.getText();
		String t3=tf3.getText();
		String t4=tf4.getText();
//		String t5=tf5.getText();
		String t6=tf6.getText();
		String t7=c1.getSelectedItem().toString();
		
		if(ae.getSource()==b1)
		{
			try {
			if(t1.equalsIgnoreCase("")  || t2.equalsIgnoreCase("") || t3.equalsIgnoreCase("") || t4.equalsIgnoreCase("") || t6.equalsIgnoreCase("") || t7.equalsIgnoreCase(""))
			{
				JOptionPane.showMessageDialog(null, "FIELDS CANNOT BE BLANK");
				
			}
			else
			{	
				
				String ip = JOptionPane.showInputDialog(null,"Enter Signal Central Authority IP Address");
				
				Socket sc = new Socket(ip,4093);
				DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
				
				dout.writeUTF(t1);
				dout.writeUTF(t2);
				dout.writeUTF(t3);
				dout.writeUTF(t4);
//				dout.writeUTF(t5);
				dout.writeUTF(t6);
				dout.writeUTF(t7);
				
				
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String msg = din.readUTF();
				if(msg.equalsIgnoreCase("success"))
				{
					JOptionPane.showMessageDialog(null, "Registered Successfully");
				}
                                
			
                                else if("error".equals(msg)){
                                    JOptionPane.showMessageDialog(null, "Name "+t1+" already exists" );
                                    }
                                else if("success".equals(msg)){
                                    JOptionPane.showMessageDialog(null, "Registered Successfully");
                                    }
				
			}
			} catch (Exception e) {

			e.printStackTrace();
			
			} 
		}
	}

}
