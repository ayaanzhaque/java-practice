package jrJava.memoryCardGame_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import resources.SoundPlayer;


public class DrawingPanel extends JPanel implements MouseListener {

	public static final int NUM_OF_CARDS = 42;
	public static final int NUM_OF_COLS = 7;
	public static final int MARGIN = 10;
	
	private JFrame frame;
	private Card[] cards;
	private int score = 100;
	private long lastTimeCardSelected;
	
	private boolean noneSelected = true, oneSelected, twoSelected;
	private Card firstSelected, secondSelected;
	
	private static SoundPlayer buzz, chime, tick;
	
	static{
		buzz = new SoundPlayer("jr/java/memoryCardGame_3/buzz.wav");
		chime = new SoundPlayer("jr/java/memoryCardGame_3/chime.wav");
		tick = new SoundPlayer("jr/java/memoryCardGame_3/tick.wav");
	}
	
	public DrawingPanel(){
		
		int width = 2*MARGIN + NUM_OF_COLS*Card.SIZE;
		int height = 2*MARGIN + (NUM_OF_CARDS/NUM_OF_COLS)*Card.SIZE;
		if(NUM_OF_CARDS%NUM_OF_COLS!=0) height += Card.SIZE;
		
		frame = new JFrame("Score: " + score);
		frame.setBounds(200, 50, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(width, height));
		frame.getContentPane().add(this);
		
		cards = new Card[NUM_OF_CARDS];
		for(int i=0; i<cards.length; i++){
			cards[i] = new Card(i/2, 10 + i%NUM_OF_COLS*Card.SIZE, 10+i/NUM_OF_COLS*Card.SIZE);
		}
		
		
		frame.pack();
		frame.setVisible(true); 
		
		this.addMouseListener(this);
	}
	
	
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		for(int i=0; i<cards.length; i++){
			//cards[i].show();
			cards[i].draw(g);
		}
	}
	
	
	public void applyGameLogic(){
		if(!twoSelected || System.currentTimeMillis()-lastTimeCardSelected<2000) return;
		
		if(firstSelected.matchWith(secondSelected)){
			firstSelected.setMatched();
			secondSelected.setMatched();
			score+=10;
			frame.setTitle("Score: " + score);
			chime.play();
		}
		
		else{
			firstSelected.hide();
			secondSelected.hide();
			score-=5;
			frame.setTitle("Score: " + score);
			buzz.play();
		}

		twoSelected = false;
		noneSelected = true;
		firstSelected = null;
		secondSelected = null;
	}
	
	
	public void mousePressed(MouseEvent e){ 
		
		for(int i=0; i<cards.length; i++){
			if(!cards[i].hasBeenMatched() && cards[i].isSelected(e.getX(), e.getY())){
				
				if(noneSelected){
					firstSelected = cards[i];
					firstSelected.show();
					noneSelected = false;
					oneSelected = true;
					tick.play();
				}
				else if(oneSelected){
					if(cards[i]==firstSelected) return;
					secondSelected = cards[i];
					secondSelected.show();
					oneSelected = false;
					twoSelected = true;
					lastTimeCardSelected = System.currentTimeMillis();
					tick.play();
				}
				this.repaint();
				break;
			}
			
		}
	}
	 
	
	
	public void mouseReleased(MouseEvent e){ }
	public void mouseClicked(MouseEvent e){ }
	public void mouseEntered(MouseEvent e){ }
	public void mouseExited(MouseEvent e){ }
	
	 
	
	public static void main(String[] args){
		DrawingPanel panel = new DrawingPanel();
		
		
		
		
		
		while(true){
			panel.applyGameLogic();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}
	
}







