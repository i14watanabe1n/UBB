package ex5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 {

	private JFrame frame;
	private CurrentColor currBckColor = new CurrentColor();
	private CurrentColor currForeColor = new CurrentColor();
	private DiskPanel colorPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 window = new Ex5();
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
	public Ex5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colorPanel = new DiskPanel();
		frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
		
		JButton btnLarge = new JButton("Large");
		btnLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorPanel.setRadius(250);
			}
		});
		colorPanel.add(btnLarge);
		
		JButton btnMedium = new JButton("Medium");
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorPanel.setRadius(150);
			}
		});
		colorPanel.add(btnMedium);
		
		JButton btnSmall = new JButton("Small");
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorPanel.setRadius(50);
			}
		});
		colorPanel.add(btnSmall);
		
		//後面変更ボタン
		JPanel btnPanel = new JPanel();
		frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currBckColor.changeRed();
				colorPanel.setBackground(currBckColor.getColor());
			}
		});
		btnPanel.add(btnRed);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currBckColor.changeGreen();
				colorPanel.setBackground(currBckColor.getColor());
			}
		});
		btnPanel.add(btnGreen);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currBckColor.changeBlue();
				colorPanel.setBackground(currBckColor.getColor());
			}
		});
		btnPanel.add(btnBlue);
		
		//前面変更ボタン
		JPanel fBtnPanel = new JPanel();
		frame.getContentPane().add(fBtnPanel, BorderLayout.SOUTH);
		
		JButton fBtnRed = new JButton("fRed");
		fBtnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currForeColor.changeRed();
				colorPanel.setForeground(currForeColor.getColor());
			}
		});
		fBtnPanel.add(fBtnRed);
		
		JButton fBtnGreen = new JButton("fGreen");
		fBtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currForeColor.changeGreen();
				colorPanel.setForeground(currForeColor.getColor());
			}
		});
		fBtnPanel.add(fBtnGreen);
		
		JButton fBtnBlue = new JButton("fBlue");
		fBtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currForeColor.changeBlue();
				colorPanel.setForeground(currForeColor.getColor());
			}
		});
		fBtnPanel.add(fBtnBlue);

	}

}
