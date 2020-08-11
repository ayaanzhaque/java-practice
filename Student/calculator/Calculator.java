package calculator;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	

	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, mult, div, add, sub, eq, AC, ex, back;
	private JTextField t;
	int ans; 

	public Calculator() {
		b1 = new JButton("1");
		b2 = new JButton("2");		
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		mult = new JButton("x");
		div = new JButton("/");
		add = new JButton("+");
		sub = new JButton("-");
		eq = new JButton("eq");
		AC = new JButton("AC");
		ex = new JButton("exit");
		back = new JButton("clear");
		
		t = new JTextField(40);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b0);
		this.add(mult);
		this.add(div);
		this.add(add);
		this.add(sub);
		this.add(eq);
		this.add(AC);
		this.add(ex);
		this.add(back);
		
		this.add(t);
		
		
		
	}

	public static void main(String[] args) {

	}

	
	public void actionPerformed(ActionEvent e) {
		
	}

}
