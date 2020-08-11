package jrJava.graphics3_cardLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutTest implements ItemListener{

	private JFrame frame;
	private JPanel mainPanel, comboBoxPanel, cardsPanel;
	private JPanel card1, card2, card3;
	private JComboBox comboBox;
	
	public CardLayoutTest(){
		frame = new JFrame("CardLayoutTest");
		frame.setBounds(200,100,300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.getContentPane().add(mainPanel);
		
		comboBoxPanel = new JPanel();
		String[] comboBoxItems = {"First card", "2nd card", "card #3"};
		comboBox = new JComboBox(comboBoxItems);
		comboBox.addItemListener(this);
		comboBoxPanel.add(comboBox);
		
		cardsPanel = new JPanel();
		cardsPanel.setLayout(new CardLayout());
		
		card1 = new JPanel();
		//card1.setBackground(Color.orange);
		card1.add(new JButton("Button 1"));
		card1.add(new JButton("Button 2"));
		card1.add(new JButton("Button 3"));
		card1.add(new JButton("Button 4"));
		cardsPanel.add(card1, "First card");
		
		card2 = new JPanel();
		//card2.setBackground(Color.cyan);
		card2.add(new JTextField("Type in something."));
		card2.add(new JTextField("Type in something."));
		card2.add(new JTextField("Type in something."));
		card2.add(new JTextField("Type in something."));
		cardsPanel.add(card2, "2nd card");
		
		card3 = new JPanel();
		//card3.setBackground(Color.pink);
		card3.setLayout(new BorderLayout());
		card3.add(new JLabel("Hi there"), BorderLayout.NORTH);
		card3.add(new JLabel("How are you"), BorderLayout.SOUTH);
		card3.add(new JLabel(" Im fine. Thank you."), BorderLayout.EAST);
		card3.add(new JLabel("How are you"), BorderLayout.WEST);
		cardsPanel.add(card3, "card #3");
		
		
		
		mainPanel.add(comboBoxPanel, BorderLayout.NORTH);	
		mainPanel.add(cardsPanel, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		new CardLayoutTest();
		
		

	}



	
	public void itemStateChanged(ItemEvent e) {
		String itemName = (String) e.getItem();
		CardLayout cardLayout = (CardLayout) cardsPanel.getLayout();
		cardLayout.show(cardsPanel, itemName);
		
	}

}
