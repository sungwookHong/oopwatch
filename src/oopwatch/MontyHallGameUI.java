package oopwatch;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MontyHallGameUI implements ActionListener {

	private JFrame frame;
	JButton[] buttons = new JButton[3];
	JLabel[] labels = new JLabel[6];
	JLabel lblNewLabel_1 = new JLabel("\u2605 Select one of the three boxex above");
	JComboBox comboBox = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	MontyHallGameUIController controller = new MontyHallGameUIController();

	int State = 0;

	/**
	 * Launch the application.
	 */
	public static void open_montyhall() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MontyHallGameUI window = new MontyHallGameUI();
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
	public MontyHallGameUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("< MontyHall Game >");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 14));

		ImageIcon question = new ImageIcon("question.jpg");
		JButton button0 = new JButton("0");
		button0.setIcon(question);
		JButton button1 = new JButton("1");
		button1.setIcon(question);
		JButton button2 = new JButton("2");
		button2.setIcon(question);

		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 13));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);

		JButton btnNewButton_1 = new JButton("All Clear");

		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 17));

		JButton btnBackToMain = new JButton("Back to Main");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnBackToMain.setFont(new Font("±¼¸²", Font.BOLD, 17));

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 173,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnBackToMain,
										GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(button0, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addGap(12)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1).addComponent(lblNewLabel))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(lblNewLabel).addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button0, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_1).addGap(18)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 41,
										Short.MAX_VALUE)
								.addComponent(btnBackToMain, GroupLayout.PREFERRED_SIZE, 41,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		JButton btnNewButton = new JButton("Auto Go!");
		
		JLabel lblNewLabel_2 = new JLabel("Auto System");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 13));

		JLabel lblNewLabel_3 = new JLabel("Run");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 13));

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "10", "100", "1000" }));

		JLabel lblNewLabel_4 = new JLabel("times and");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 13));

		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "keep", "change" }));

		JLabel lblNewLabel_5 = new JLabel("the choice : ");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2
				.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
						gl_panel_2.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
										.createSequentialGroup().addGap(10).addGroup(gl_panel_2
												.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_2.createSequentialGroup().addComponent(lblNewLabel_3)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(lblNewLabel_4))
												.addGroup(gl_panel_2.createSequentialGroup()
														.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(lblNewLabel_5)))
										.addGap(39).addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 112,
												GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNewLabel_2))
								.addContainerGap(27, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5))
						.addGap(16))
				.addGroup(Alignment.LEADING,
						gl_panel_2.createSequentialGroup().addGap(48)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(19, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JLabel label3 = new JLabel("Change Choice : 0 times");
		label3.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 13));

		JLabel label4 = new JLabel("Win : 0 Gold ( 0% )");
		label4.setFont(new Font("±¼¸²", Font.PLAIN, 13));

		JLabel label5 = new JLabel("Losses : 0 sheep ( 0% )");
		label5.setFont(new Font("±¼¸²", Font.PLAIN, 13));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
										Short.MAX_VALUE)))
				.addContainerGap(144, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(label4).addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
						.addComponent(label5).addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		JLabel label0 = new JLabel("Keep Choice : 0 times");
		label0.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 13));

		JLabel label1 = new JLabel("Win : 0 Gold ( 0% )");
		label1.setFont(new Font("±¼¸²", Font.PLAIN, 13));

		JLabel label2 = new JLabel("Losses : 0 sheep ( 0% )");
		label2.setFont(new Font("±¼¸²", Font.PLAIN, 13));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label0, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(label1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166,
										Short.MAX_VALUE)))
				.addContainerGap(156, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(label0).addGap(18)
						.addComponent(label1).addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
						.addComponent(label2).addContainerGap()));
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);

		buttons[0] = button0;
		buttons[1] = button1;
		buttons[2] = button2;
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);

		labels[0] = label0;
		labels[1] = label1;
		labels[2] = label2;
		labels[3] = label3;
		labels[4] = label4;
		labels[5] = label5;

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String count = (String) comboBox.getSelectedItem();
				int count_num = 0;
				if (count == "10") {
					count_num = 10;
				} else if (count == "100") {
					count_num = 100;
				} else if (count == "1000") {
					count_num = 1000;
				}

				String auto_type = (String) comboBox_1.getSelectedItem();
				
				//This is the real auto selection
				for (int i = 0; i < count_num; i++) {
					if (auto_type.equals("keep")) {
						controller.first_select(buttons, lblNewLabel_1, 2);
						controller.second_select(buttons, labels, lblNewLabel_1, 2);
						controller.shuffle(buttons, lblNewLabel_1);
					} else {
						int question = controller.first_select(buttons, lblNewLabel_1, 2);
						controller.second_select(buttons, labels, lblNewLabel_1, question);
						controller.shuffle(buttons, lblNewLabel_1);
					}
				}
			}
		});

		
		controller.shuffle(this.buttons, lblNewLabel_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.init_UIinMonty(buttons, labels, lblNewLabel_1);
				controller.startGame();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		JButton button = (JButton) arg0.getSource();
		if (State == 0) {
			// first select
			controller.first_select(buttons, lblNewLabel_1, Integer.parseInt(button.getText()));
			State = 1;
		} else if (State == 1) {
			// secont select
			boolean check = controller.second_select(buttons, labels, lblNewLabel_1,
					Integer.parseInt(button.getText()));
			if (check == true) {
				State = 2;
			}
		} else if (State == 2) {
			// third select
			controller.shuffle(this.buttons, lblNewLabel_1);
			State = 0;
		}

	}
}
