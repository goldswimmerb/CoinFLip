
import java.awt.*;

import javax.swing.*;
import javax.swing.ImageIcon;


public class CoinPanel extends JPanel{
	
	 //instance fields
	  private Coin coin;
	  private ImageIcon headsIcon, tailsIcon;
	  private JLabel imgLabel;
	  
	  //constructor
	  public CoinPanel(Coin coin){
	     //sets Coin field to the coin object we created in the Runner 
	     this.coin = coin;
	     //sets heads and tails variables to the correct image for each side of the coin
	     headsIcon = new ImageIcon("romanheads.png");
	     tailsIcon = new ImageIcon("romantails.png");
	     //creates a label on the panel that contains text and an image
	     imgLabel = new JLabel("Coin Game", headsIcon, SwingConstants.CENTER);
	     //positions of the label in the panel
	     imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
	     imgLabel.setVerticalTextPosition(SwingConstants.TOP);
	     //adds the label to the panel
	     add(imgLabel);
	     //sets the background of the panel
	     setBackground(Color.WHITE);
	     //sets the size of the panel
	     setPreferredSize(new Dimension(400,400));
	  }//end of constructor
	  
	  //methods
	  public void repaint(){
	    
	    if (coin != null) {
	      System.out.println("Coin: " + coin);
	    if(coin.getFace().equals("Heads")){ imgLabel.setIcon(headsIcon); }
	    if(coin.getFace().equals("Tails")){ imgLabel.setIcon(tailsIcon); }
	    //imgLabel.repaint();
	    }
	    super.repaint();
	  }
	 }//end of external class