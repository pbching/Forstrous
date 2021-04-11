
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Menu extends JPanel{
	private JLabel lbbackground;
	private JLabel lbPlayGame;
	private JLabel lbOption;
	private JLabel lbExit;
	private ImageIcon backgroundIcon;
	public void initComps(){
		lbPlayGame = setLabel(0, 0, "/Images/Play.png");
		lbOption = setLabel(0,0, "/Images/Option.png");
		lbExit = setLabel(0,0, "/Images/Exit.png");
		
		lbPlayGame.addMouseListener(mMouseAdapter);
		lbOption.addMouseListener(mMouseAdapter);
		lbExit.addMouseListener(mMouseAdapter);
		
		add(lbPlayGame);
		add(lbOption);
		add(lbExit);
		
	}
	
	public void initbackground(){
		lbbackground = new JLabel();
		lbbackground.setBackground(Color.BLACK);
		backgroundIcon = new ImageIcon(getClass().getResource("/Images/background_Menu.png"));
		lbbackground.setIcon(backgroundIcon);
		add(lbbackground);
	}
	
	public JLabel setLabel(int x, int y, String ImageIcon){
		JLabel label = new JLabel();
		ImageIcon Icon = new ImageIcon(getClass().getResource(ImageIcon));
		label.setBounds(x, y, Icon.getIconWidth(), Icon.getIconHeight());
		label.setIcon(Icon);
		return label;
	}
	
	private MouseAdapter mMouseAdapter = new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==lbPlayGame){
				ImageIcon playIcon = new ImageIcon(getClass().getResource("/Images/Play2.png"));
				lbPlayGame.setIcon(playIcon);
			}
			if(e.getSource()==lbOption){
				ImageIcon optionIcon = new ImageIcon(getClass().getResource("/Images/Option2.png"));
				lbOption.setIcon(optionIcon);
			}
			if(e.getSource()==lbHigthScore){
				ImageIcon hightScoreIcon = new ImageIcon(getClass().getResource("/Images/HightScore2.png"));
				lbHigthScore.setIcon(hightScoreIcon);
			}
			if(e.getSource()==lbExit){
				ImageIcon exitIcon = new ImageIcon(getClass().getResource("/Images/Exit2.png"));
				lbExit.setIcon(exitIcon);
			}
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource()==lbPlayGame){
				ImageIcon playIcon = new ImageIcon(getClass().getResource("/Images/Play.png"));
				lbPlayGame.setIcon(playIcon);
			}
			if(e.getSource()==lbOption){
				ImageIcon optionIcon = new ImageIcon(getClass().getResource("/Images/Option.png"));
				lbOption.setIcon(optionIcon);
			}
			if(e.getSource()==lbExit){
				ImageIcon exitIcon = new ImageIcon(getClass().getResource("/Images/Exit.png"));
				lbExit.setIcon(exitIcon);
			}
		}
	}
}
