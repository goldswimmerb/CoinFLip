//import java.util.Scanner;
import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
//advanced windows toolkit

public class Runner {
	//private static Scanner Reader;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner reader = new Scanner(System.in); // creates input for scanner
		//creates external graphics frame
	    JFrame frame = new JFrame("Coin Game");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Coin coin = new Coin();
	    CoinPanel coinPanel = new CoinPanel(coin);
	    CoinControls controls = new CoinControls(coinPanel, coin);

	    JPanel panel = new JPanel();
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	    panel.add(coinPanel);
	    panel.add(controls);

	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
			//creates an image icon
			//ImageIcon icon = new ImageIcon("romanheads.png");
			// create a label for the title
			//JLabel label1 = new JLabel("Coin Game", icon, SwingConstants.CENTER);
			// Create center label
			//label1.setHorizontalTextPosition(SwingConstants.CENTER);
			//puts label at top of the pannel
			//label1.setVerticalTextPosition(SwingConstants.TOP);
			//creates a new panel
			//JPanel panel = new JPanel();
			//sets pannel background white
			//panel.setBackground(Color.WHITE);
			//sets size of the pannel
			//panel.setPreferredSize(new Dimension(400,400));
			//adds the label to the panel
			//panel.add(label1);
			//add panel
			//frame.getContentPane().add(panel);
			//frame.pack();
			//frame.setVisible(true);
		//Coin myCoin = new Coin(); //creates instance of object
		
		/*System.out.println("Welcome to my coin flip game"); // creates welcome message
		String playAgain = "yes";
		while (playAgain.equals("yes")){
			System.out.println("how many times would you like to play");
			int rounds = reader.nextInt();//scan in number from user using next integer and assign it to the variable rounds
			for(int count = 0; count < rounds; count++) {
				//for loop that flips coin number of times requested by user
				myCoin.flip();//flips coin
			//System.out.println(myCoin);
			//myCoin.setFace("Heads");
			//System.out.println(myCoin);
				System.out.println(myCoin.toString());//prints result
		}//end of loop
			System.out.println("Do you want to play again?");
			playAgain = reader.next();
			if (playAgain.equals("no")){System.out.println ("Thanks for playing");}*/
		}//end of game loop
	}//end of main loop

//end of class
