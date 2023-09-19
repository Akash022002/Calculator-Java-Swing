import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.Math;
public class Calculator {

	private JFrame frame;
	private JTextField t3a;
	private JButton add;
	private JButton total;
	private JButton dot;
	private JButton mul;
	private JButton div;
	private JButton clear;
	private JButton Ac;
	private JButton e;
	private JButton mue;
	private JButton sin;
	private JButton degree;
	double a;
	int b;
	// values which are ant of store in the calculator after click button
	double first,second;
	int totalall;
	double last;
	String temp;
	String firstvar;
	String secondvar;
	String firstans;
	String secondans;
	String action;
	String answer;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBackground(new Color(224, 255, 255));
		lblNewLabel.setBounds(124, 22, 157, 35);
		frame.getContentPane().add(lblNewLabel);
		
		t3a = new JTextField();
		t3a.setHorizontalAlignment(SwingConstants.RIGHT);
		t3a.setFont(new Font("Tahoma", Font.PLAIN, 38));
		t3a.setBounds(35, 101, 376, 54);
		frame.getContentPane().add(t3a);
		t3a.setColumns(10);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=0;
				// Code for the add an the value after click the 0 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		btnNewButton.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.setBounds(35, 565, 181, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=1;
			// Code for the add an the value after click the 1 button of the calculator
				if(first==0)
				{
					first=buttonvalue;
					firstans = Double.toString(first);
					t3a.setText(firstans);
					
				}
				else
				{
					//int secondtest = Integer.parseInt(secondvar); 
					second=buttonvalue;
					firstans = Double.toString(first);
					secondans = secondvar + second;
					t3a.setText(secondans);
				}
			}
		});
		b1.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b1.setBounds(35, 491, 79, 54);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=2;
				// Code for the add an the value after click the 2 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
						
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b2.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b2.setBounds(137, 491, 79, 54);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=3;
				// Code for the add an the value after click the 3 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b3.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b3.setBounds(236, 491, 79, 54);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=4;
				// Code for the add an the value after click the 4 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b4.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b4.setBounds(35, 410, 79, 54);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=5;
				// Code for the add an the value after click the 5 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b5.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b5.setBounds(137, 410, 79, 54);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=6;
				// Code for the add an the value after click the 6 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b6.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b6.setBounds(236, 410, 79, 54);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=7;
				// Code for the add an the value after click the 7 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b7.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b7.setBounds(35, 325, 79, 54);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=8;
				// Code for the add an the value after click the 8 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b8.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b8.setBounds(137, 325, 79, 54);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double buttonvalue=9;
				// Code for the add an the value after click the 9 button of the calculator
					if(first==0)
					{
						first=buttonvalue;
						firstans = Double.toString(first);
						t3a.setText(firstans);
					}
					else
					{
						second=buttonvalue;
						firstans = Double.toString(first);
						secondans = secondvar + second;
						t3a.setText(secondans);
					}
			}
		});
		b9.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		b9.setBounds(236, 325, 79, 54);
		frame.getContentPane().add(b9);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(b1.getText());
				//b = Integer.parseInt(b2.getText());
				
				//totalall = a-b;
				//String d = String.valueOf(totalall);
				//t3a.setText(d);
				
				action = "-";
				secondvar = first + action;
				t3a.setText(secondvar);
				double a = first - second;
				answer = Double.toString(a);
			}
		});
		sub.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		sub.setBounds(332, 325, 79, 54);
		frame.getContentPane().add(sub);
		
		add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(t3a.getText());
				//t3a.setText("");
				action = "+";
				secondvar = first + action;
				t3a.setText(secondvar);
				a = first +second;
				answer = Double.toString(a);
				
				
			}
		});
		add.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		add.setBounds(332, 410, 79, 94);
		frame.getContentPane().add(add);
		
		total = new JButton("=");
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(action=="+")
				{
					last = first + second;
					t3a.setText(Double.toString(last));
					
				}
				else if(action == "-")
				{
					last = first - second;
					t3a.setText(Double.toString(last));
				}
				else if(action == "*")
				{
					last = first * second;
					t3a.setText(Double.toString(last));
				}
				else if(action == "/")
				{
					last = first / second;
					t3a.setText(Double.toString(last));
				}
				else if(action == "e")
				{
					double last = Math.log(first);
					t3a.setText(Double.toString(last));
				}
				else if(action == "x2")
				{
					last = first*first;
					t3a.setText(Double.toString(last));
				}
				else if(action == "clr")
				{
					t3a.setText("");
					first = 0;
					second = 0;
					firstvar = "";
					firstans = "";
					a = 0;
				}
				else if(action == "Ac")
				{
					//t3a.setText(Double.toString());
				}
				else if(action=="deg")
				{
					double last = Math.toDegrees(first);
					String checkans = Double.toString(last);
					t3a.setText(checkans);
				}
				else
				{
					
				}
			}
		});
		total.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		total.setBounds(332, 519, 79, 100);
		frame.getContentPane().add(total);
		
		dot = new JButton(".");
		dot.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		dot.setBounds(236, 565, 79, 54);
		frame.getContentPane().add(dot);
		
		mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(b1.getText());
				//b = Integer.parseInt(b2.getText());
				
				//totalall = a*b;
				//String d = String.valueOf(totalall);
				//t3a.setText(d);
				
				action = "*";
				secondvar = first + action;
				t3a.setText(secondvar);
				double a = first * second;
				answer = Double.toString(a);
			}
		});
		mul.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 40));
		mul.setBounds(332, 247, 79, 54);
		frame.getContentPane().add(mul);
		
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//a = Integer.parseInt(b1.getText());
				//b = Integer.parseInt(b2.getText());
				
				//totalall = a/b;
				//String d = String.valueOf(totalall);
				//t3a.setText(d);
				
				action = "/";
				secondvar = first + action;
				t3a.setText(secondvar);
				double a = first / second;
				answer = Double.toString(a);
			}
		});
		div.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 33));
		div.setBounds(236, 247, 79, 54);
		frame.getContentPane().add(div);
		
		clear = new JButton("cl");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3a.setText("");
				a = 0;
				//a = Integer.parseInt(b1.getText());
				//b = Integer.parseInt(b2.getText());
				
				//totalall = a+b;
				//String d = String.valueOf(totalall);
				//t3a.setText(d);
				//TextEditingController.clear(c);
			}
		});
		clear.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 32));
		clear.setBounds(137, 247, 79, 54);
		frame.getContentPane().add(clear);
		
		Ac = new JButton("Ac");
		Ac.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 27));
		Ac.setBounds(35, 247, 79, 54);
		frame.getContentPane().add(Ac);
		
		e = new JButton("log");
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "e";
				String check = "log("+first+")";
				t3a.setText(check);
			}
		});
		e.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 24));
		e.setBounds(35, 176, 79, 48);
		frame.getContentPane().add(e);
		
		mue = new JButton("x2");
		mue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "x2";
				String check = first +"*" +first;
				t3a.setText(check);
			}
		});
		mue.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 30));
		mue.setBounds(137, 176, 79, 48);
		frame.getContentPane().add(mue);
		
		sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action="sin";
				String sincheck = "sin("+first+")";	
				t3a.setText(sincheck);
			}
		});
		sin.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 25));
		sin.setBounds(236, 176, 79, 48);
		frame.getContentPane().add(sin);
		
		degree = new JButton("deg");
		degree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "deg";
				String degcheck = "deg("+first+")";
				t3a.setText(degcheck);
			}
		});
		degree.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 24));
		degree.setBounds(332, 176, 79, 48);
		frame.getContentPane().add(degree);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
