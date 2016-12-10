package oopwatch;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RankUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void show_ranking() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RankUI window = new RankUI();
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
	public RankUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		RankManager rankmanager = new RankManager();
		ArrayList<Rank_Set> rank_list = rankmanager.outputRank_Set();

		frame = new JFrame();
		frame.setBounds(100, 100, 355, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("< Ranking >");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		
		JButton btnNewButton = new JButton("Back to Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
								.addComponent(lblNewLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(103)
							.addComponent(btnNewButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel.setLayout(new GridLayout(11, 4, 5, 5));

		panel.add(new JLabel("number"));
		panel.add(new JLabel("Name"));
		panel.add(new JLabel("Score"));
		panel.add(new JLabel("Time"));
		
		for (int i = 0; i < 10; i++) {
			int num = i + 1;
			if (i >= rank_list.size()) {
				panel.add(new JLabel("none"));
				panel.add(new JLabel("none"));
				panel.add(new JLabel("none"));
				panel.add(new JLabel("none"));
			} else {
				panel.add(new JLabel(num + "."));
				panel.add(new JLabel(rank_list.get(i).getId()));
				panel.add(new JLabel(String.valueOf(rank_list.get(i).getScore())));
				panel.add(new JLabel(rank_list.get(i).getTime()));
			}

		}

		frame.getContentPane().setLayout(groupLayout);
	}
}
