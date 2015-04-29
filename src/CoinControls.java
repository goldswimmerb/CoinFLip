import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CoinControls extends JPanel {
	    
	 private Coin coin;
     private CoinPanel coinPanel;
     private JButton flipBtn;
  
     public CoinControls (CoinPanel coinPanel, Coin coin){
       this.coinPanel = coinPanel;
       this.coin = coin;
       flipBtn = new JButton ("Flip Me!");
       flipBtn.setToolTipText("Flips the Coin.");
       flipBtn.addActionListener(new ButtonListener());
       
       setBackground(Color.WHITE);
       add(flipBtn);
     }
     
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      coin.flip();
      coinPanel.repaint();
    }//end of method
  }//end of internal class
  

}//end of external class