package conParaUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {
	
	private JPanel contentPane;
	protected JButton btnJuega;
	protected JLabel label;
	protected JLabel label_3;



	/**
	 * Create the frame.
	 */
	public UI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		label = new JLabel("1");
		label.setName("1");
		panel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label.setSize(new Dimension(25, 25));
		label.setPreferredSize(new Dimension(25, 25));
		label.setMinimumSize(new Dimension(25, 25));
		
		JLabel label_1 = new JLabel("1");
		label_1.setName("2");
		panel.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setSize(new Dimension(25, 25));
		label_1.setPreferredSize(new Dimension(25, 25));
		label_1.setMinimumSize(new Dimension(25, 25));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel label_2 = new JLabel("1");
		label_2.setName("3");
		panel.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setSize(new Dimension(25, 25));
		label_2.setPreferredSize(new Dimension(25, 25));
		label_2.setMinimumSize(new Dimension(25, 25));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		label_3 = new JLabel("1");
		label_3.setName("4");
		panel.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setSize(new Dimension(25, 25));
		label_3.setPreferredSize(new Dimension(25, 25));
		label_3.setMinimumSize(new Dimension(25, 25));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel label_4 = new JLabel("1");
		label_4.setSize(new Dimension(25, 25));
		label_4.setPreferredSize(new Dimension(25, 25));
		label_4.setMinimumSize(new Dimension(25, 25));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setSize(new Dimension(25, 25));
		label_5.setPreferredSize(new Dimension(25, 25));
		label_5.setMinimumSize(new Dimension(25, 25));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("1");
		label_6.setSize(new Dimension(25, 25));
		label_6.setPreferredSize(new Dimension(25, 25));
		label_6.setMinimumSize(new Dimension(25, 25));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("1");
		label_7.setSize(new Dimension(25, 25));
		label_7.setPreferredSize(new Dimension(25, 25));
		label_7.setMinimumSize(new Dimension(25, 25));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(label_7);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel label_8 = new JLabel("1");
		label_8.setSize(new Dimension(25, 25));
		label_8.setPreferredSize(new Dimension(25, 25));
		label_8.setMinimumSize(new Dimension(25, 25));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("1");
		label_9.setSize(new Dimension(25, 25));
		label_9.setPreferredSize(new Dimension(25, 25));
		label_9.setMinimumSize(new Dimension(25, 25));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("1");
		label_10.setSize(new Dimension(25, 25));
		label_10.setPreferredSize(new Dimension(25, 25));
		label_10.setMinimumSize(new Dimension(25, 25));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("1");
		label_11.setSize(new Dimension(25, 25));
		label_11.setPreferredSize(new Dimension(25, 25));
		label_11.setMinimumSize(new Dimension(25, 25));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(label_11);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel label_12 = new JLabel("1");
		label_12.setSize(new Dimension(25, 25));
		label_12.setPreferredSize(new Dimension(25, 25));
		label_12.setMinimumSize(new Dimension(25, 25));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("1");
		label_13.setSize(new Dimension(25, 25));
		label_13.setPreferredSize(new Dimension(25, 25));
		label_13.setMinimumSize(new Dimension(25, 25));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("1");
		label_14.setSize(new Dimension(25, 25));
		label_14.setPreferredSize(new Dimension(25, 25));
		label_14.setMinimumSize(new Dimension(25, 25));
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("1");
		label_15.setSize(new Dimension(25, 25));
		label_15.setPreferredSize(new Dimension(25, 25));
		label_15.setMinimumSize(new Dimension(25, 25));
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(label_15);
		
		btnJuega = new JButton("Juega");
		
		contentPane.add(btnJuega, BorderLayout.CENTER);
	}

}
