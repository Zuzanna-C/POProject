package windowForms;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class EndView {

	private JFrame frame;
	private String award;
	private JLabel background;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndView window = new EndView("");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EndView(String award_) {
		award = award_;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zuzia\\Pictures\\Screenshots\\millioners.png"));
		frame.setBounds(100, 100, 381, 223);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(screenSize.width/2-frame.getSize().width/2, screenSize.height/2-frame.getSize().height/2);
		
		JLabel lblNewLabel = new JLabel("Congratulation!");
		lblNewLabel.setForeground(new Color(176, 224, 230));
		lblNewLabel.setFont(new Font("Source Serif Pro", Font.PLAIN, 20));
		lblNewLabel.setBounds(109, 12, 152, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You won " + award );
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setFont(new Font("Source Serif Pro", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(119, 62, 135, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Play again");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameView form = new GameView();
				form.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Source Serif Pro", Font.PLAIN, 12));
		btnNewButton.setBounds(50, 124, 100, 30);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Source Serif Pro", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartingPageView form = new StartingPageView();
				form.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(204, 124, 100, 30);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setFocusPainted(false);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Zuzia\\Downloads\\background.jpg"));
		lblNewLabel_2.setBounds(0, 0, 367, 186);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}