package test1;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class testView {

	private JFrame frame;
	private LaunchPage browser;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testView window = new testView();
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
	public testView()
	{
		browser = new LaunchPage();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(450, 8, 482, 110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true); 
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\pressEntered.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\press.png"));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				browser.launchFacebook();
			}
		});
		
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\press.png"));
		btnNewButton.setBounds(24, 29, 82, 73);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\youtubePress.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\youtube.png"));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				browser.launchYoutube();
			}
		});
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\youtube.png"));
		btnNewButton_1.setBounds(142, 29, 82, 73);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\instagramPress.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\instagram.png"));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				browser.launchInstagram();
			}
		});
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\instagram.png"));
		btnNewButton_2.setBounds(260, 29, 72, 73);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\githubPress.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\github (1).png"));
			}
			@Override
			public void mousePressed(MouseEvent e) 
			{
				browser.launchGitHub();
			}
		});
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\github (1).png"));
		
		btnNewButton_3.setBounds(375, 29, 72, 73);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Camera Roll\\white-cube-pattern-4k-bu.jpg"));
		lblNewLabel.setBounds(0, 11, 482, 91);
		frame.getContentPane().add(lblNewLabel);
	}
}
