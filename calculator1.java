import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator1 extends JFrame implements ActionListener
{
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	String s1,s2,s3,s4,s5;
	long c,n;
	//Panel p;
	//FloatLayout g;
	calculator1()
	{
		
	//	p=new Panel();
	//	g=new FloatLayout(FloatLayout.LEFT);
		t=new JTextField();
		t.setBounds(40,40,244,30);

		b1=new JButton("0");
		b1.setBounds(40,80,50,30);
		b2=new JButton("1");
		b2.setBounds(90,80,50,30);
		b3=new JButton("2");
		b3.setBounds(140,80,50,30);
		b4=new JButton("3");
		b4.setBounds(190,80,50,30);
		b5=new JButton("4");
		b5.setBounds(230,80,50,30);
		b6=new JButton("5");
		b6.setBounds(40,110,50,30);
		b7=new JButton("6");
		b7.setBounds(90,110,50,30);
		b8=new JButton("7");
		b8.setBounds(140,110,50,30);
		b9=new JButton("8");
		b9.setBounds(190,110,50,30);
		b10=new JButton("9");
		b10.setBounds(230,110,50,30);
		b11=new JButton("+");
		b11.setBounds(40,140,50,30);
		b12=new JButton("-");
		b12.setBounds(90,140,50,30);
		b13=new JButton("*");
		b13.setBounds(140,140,50,30);
		b14=new JButton("/");
		b14.setBounds(190,140,50,30);
		b15=new JButton("%");
		b15.setBounds(230,140,50,30);
		b16=new JButton("=");
		b16.setBounds(40,170,125,30);
		b17=new JButton("C");
		b17.setBounds(165,170,116,30);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		
		add(t);
		//add(p);
		//p.setLayout(g);
		setTitle("calculator");
		setLocation(600,200);
		setLayout(null);
		setSize(330,260);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{ 
		if(e.getSource()==b1)
		{
			s1=t.getText();
			s2="0";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b2)
		{
			s1=t.getText();
			s2="1";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b3)
		{
			s1=t.getText();
			s2="2";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b4)
		{
			s1=t.getText();
			s2="3";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b5)
		{
			s1=t.getText();
			s2="4";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b6)
		{
			s1=t.getText();
			s2="5";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b7)
		{
			s1=t.getText();
			s2="6";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b8)
		{
			s1=t.getText();
			s2="7";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b9)
		{
			s1=t.getText();
			s2="8";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b10)
		{
			s1=t.getText();
			s2="9";
			s3=s1+s2;
			t.setText(s3);
		}

		if(e.getSource()==b11)
		{
			s4=t.getText();
			t.setText("");
			c=1;
		}

		if(e.getSource()==b12)
		{
			s4=t.getText();
			t.setText("");
			c=2;
		}

		if(e.getSource()==b13)
		{
			s4=t.getText();
			t.setText("");
			c=3;
		}

		if(e.getSource()==b14)
		{
			s4=t.getText();
			t.setText("");
			c=4;
		}

		if(e.getSource()==b15)
		{
			s4=t.getText();
			t.setText("");
			c=5;
		}

		if(e.getSource()==b16)
		{
			s5=t.getText();
			if(c==1)
			{
				n=Integer.parseInt(s4)+Integer.parseInt(s5);
				t.setText(String.valueOf(n));
			}

			else if(c==2)
			{
				n=Integer.parseInt(s4)-Integer.parseInt(s5);
				t.setText(String.valueOf(n));
			}

			else if(c==3)
			{
				n=Integer.parseInt(s4)*Integer.parseInt(s5);
				t.setText(String.valueOf(n));
			}

			if(c==4)
			{
				if(s5=="0")
				{
					t.setText("0");
				}
				else
				{
					n=Integer.parseInt(s4)/Integer.parseInt(s5);
					t.setText(String.valueOf(n));
				}
			}

			if(c==5)
			{
				n=Integer.parseInt(s4)%Integer.parseInt(s5);
				t.setText(String.valueOf(n));
			}

		}

		if(e.getSource()==b17)
		{
			t.setText("");
		}
	}
	public static void main(String args[])
	{
		new calculator1();
	}
}