package oopwatch;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Application {

	private JFrame frmOopwatch;
	private JTextField txtEnterYourName;
	
	MontyHallGameUI montyhall = new MontyHallGameUI();
	RankUI rank = new RankUI();
	conceptMath cm = new conceptMath();
	conceptScience cs = new conceptScience();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frmOopwatch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOopwatch = new JFrame();
		frmOopwatch.setTitle("OOPWATCH");
		frmOopwatch.setBounds(100, 100, 355, 505);
		frmOopwatch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOopwatch.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel MainPanel = new JPanel();
		
		frmOopwatch.getContentPane().add(MainPanel, "name_1116643293198723");
		MainPanel.setLayout(null);
		
		JButton btnMontyHall = new JButton("Monty Hall");
		btnMontyHall.setBounds(12, 226, 315, 67);
		MainPanel.add(btnMontyHall);
		btnMontyHall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				montyhall.open_montyhall();
			}
		});
		
		JButton btnMemoryGame = new JButton("Memory Game");
		
		btnMemoryGame.setBounds(12, 303, 315, 67);
		MainPanel.add(btnMemoryGame);
		
		JButton btnRanking = new JButton("Ranking");
		btnRanking.setBounds(12, 380, 315, 67);
		MainPanel.add(btnRanking);
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rank.show_ranking();
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 189, 339, 2);
		MainPanel.add(separator);
		
		JButton btnWhatIsProbability = new JButton("What is probability?");
		btnWhatIsProbability.setBounds(12, 35, 315, 67);
		MainPanel.add(btnWhatIsProbability);
		btnWhatIsProbability.addActionListener(new ActionListener() {
				@Override
			public void actionPerformed(ActionEvent e) {
				cm.show_Math(null);
			}
		});
		
		JButton btnWhatIsChunking = new JButton("What is Chemical Equipment?");
		btnWhatIsChunking.setBounds(12, 112, 315, 67);
		MainPanel.add(btnWhatIsChunking);
		btnWhatIsChunking.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {
			cs.show_Science(null);
		}
	});
		
		JLabel lblLearningSection = new JLabel("Learning section");
		lblLearningSection.setBounds(12, 10, 138, 15);
		MainPanel.add(lblLearningSection);
		
		JLabel lblGameSection = new JLabel("Game section");
		lblGameSection.setBounds(12, 201, 138, 15);
		MainPanel.add(lblGameSection);
		
		JPanel MontyHallPanel = new JPanel();
		MontyHallPanel.setLayout(null);
		frmOopwatch.getContentPane().add(MontyHallPanel, "name_1118090985241840");
		
		JLabel lblMontyHall = new JLabel("Monty Hall");
		lblMontyHall.setBounds(12, 10, 105, 15);
		MontyHallPanel.add(lblMontyHall);
		JPanel MemoryGamePanel = new JPanel();
		
		frmOopwatch.getContentPane().add(MemoryGamePanel, "name_1116690997937877");
		MemoryGamePanel.setLayout(null);
		
		JLabel lblMemoryGame = new JLabel("Memory Game");
		lblMemoryGame.setBounds(12, 10, 105, 15);
		MemoryGamePanel.add(lblMemoryGame);
		
		JPanel RankingPanel = new JPanel();
		RankingPanel.setLayout(null);
		frmOopwatch.getContentPane().add(RankingPanel, "name_1118671542800225");
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(12, 10, 105, 15);
		RankingPanel.add(lblRanking);
		
		JPanel Probability = new JPanel();
		Probability.setLayout(null);
		frmOopwatch.getContentPane().add(Probability, "name_1118889367006347");
		
		JLabel lblProbability = new JLabel("Probability");
		lblProbability.setBounds(12, 10, 105, 15);
		Probability.add(lblProbability);
		
		JPanel Chunking = new JPanel();
		Chunking.setLayout(null);
		frmOopwatch.getContentPane().add(Chunking, "name_1118917894756657");
		
		JLabel lblChunking = new JLabel("Chunking");
		lblChunking.setBounds(12, 10, 105, 15);
		Chunking.add(lblChunking);
		
		
		JButton btnMemoryGameBackButton = new JButton("Back");
		btnMemoryGameBackButton.setBounds(12, 433, 315, 23);
		MemoryGamePanel.add(btnMemoryGameBackButton);
		

		JButton btnMemoryButton1 = new JButton("New button");
		btnMemoryButton1.setBounds(33, 35, 60, 60);
		MemoryGamePanel.add(btnMemoryButton1);
		
		JButton btnMemoryButton2 = new JButton("New button");
		btnMemoryButton2.setBounds(105, 35, 60, 60);
		MemoryGamePanel.add(btnMemoryButton2);
		
		JButton btnMemoryButton3 = new JButton("New button");
		btnMemoryButton3.setBounds(177, 35, 60, 60);
		MemoryGamePanel.add(btnMemoryButton3);
		
		JButton btnMemoryButton4 = new JButton("New button");
		btnMemoryButton4.setBounds(249, 35, 60, 60);
		MemoryGamePanel.add(btnMemoryButton4);
		
		JButton btnMemoryButton5 = new JButton("New button");
		btnMemoryButton5.setBounds(33, 105, 60, 60);
		MemoryGamePanel.add(btnMemoryButton5);
		
		JButton btnMemoryButton6 = new JButton("New button");
		btnMemoryButton6.setBounds(105, 105, 60, 60);
		MemoryGamePanel.add(btnMemoryButton6);
		
		JButton btnMemoryButton7 = new JButton("New button");
		btnMemoryButton7.setBounds(177, 105, 60, 60);
		MemoryGamePanel.add(btnMemoryButton7);
		
		JButton btnMemoryButton8 = new JButton("New button");
		btnMemoryButton8.setBounds(249, 105, 60, 60);
		MemoryGamePanel.add(btnMemoryButton8);
		
		JButton btnMemoryButton9 = new JButton("New button");
		btnMemoryButton9.setBounds(33, 175, 60, 60);
		MemoryGamePanel.add(btnMemoryButton9);
		
		JButton btnMemoryButton10 = new JButton("New button");
		btnMemoryButton10.setBounds(105, 175, 60, 60);
		MemoryGamePanel.add(btnMemoryButton10);
		
		JButton btnMemoryButton11 = new JButton("New button");
		btnMemoryButton11.setBounds(177, 175, 60, 60);
		MemoryGamePanel.add(btnMemoryButton11);
		
		JButton btnMemoryButton12 = new JButton("New button");
		btnMemoryButton12.setBounds(249, 175, 60, 60);
		MemoryGamePanel.add(btnMemoryButton12);
		
		JButton btnMemoryButton13 = new JButton("New button");
		btnMemoryButton13.setBounds(33, 245, 60, 60);
		MemoryGamePanel.add(btnMemoryButton13);
		
		JButton btnMemoryButton14 = new JButton("New button");
		btnMemoryButton14.setBounds(105, 245, 60, 60);
		MemoryGamePanel.add(btnMemoryButton14);
		
		JButton btnMemoryButton15 = new JButton("New button");
		btnMemoryButton15.setBounds(177, 245, 60, 60);
		MemoryGamePanel.add(btnMemoryButton15);
		
		JButton btnMemoryButton16 = new JButton("New button");
		btnMemoryButton16.setBounds(249, 245, 60, 60);
		MemoryGamePanel.add(btnMemoryButton16);
		
		JLabel lblTimerLabel = new JLabel("time elapsed: 0 , game stopped.");
		lblTimerLabel.setBounds(12, 315, 315, 15);
		MemoryGamePanel.add(lblTimerLabel);
		
		JButton btnStartMemoryGame = new JButton("Start memory game");
		btnStartMemoryGame.setBounds(12, 371, 315, 23);
		MemoryGamePanel.add(btnStartMemoryGame);
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setText("");
		txtEnterYourName.setBounds(12, 340, 315, 21);
		MemoryGamePanel.add(txtEnterYourName);
		txtEnterYourName.setColumns(10);

		// these codes must be under the definitions.
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		// memory game buttons..
		ArrayList<JButton> memoryGameButtons = new ArrayList<JButton>();
		memoryGameButtons.add(btnMemoryButton1); memoryGameButtons.add(btnMemoryButton2); memoryGameButtons.add(btnMemoryButton3); memoryGameButtons.add(btnMemoryButton4);
		memoryGameButtons.add(btnMemoryButton5); memoryGameButtons.add(btnMemoryButton6); memoryGameButtons.add(btnMemoryButton7); memoryGameButtons.add(btnMemoryButton8);
		memoryGameButtons.add(btnMemoryButton9); memoryGameButtons.add(btnMemoryButton10); memoryGameButtons.add(btnMemoryButton11); memoryGameButtons.add(btnMemoryButton12);
		memoryGameButtons.add(btnMemoryButton13); memoryGameButtons.add(btnMemoryButton14); memoryGameButtons.add(btnMemoryButton15); memoryGameButtons.add(btnMemoryButton16);
		
		// UI Controller
		MemoryGameUIController memoryGameUIController = new MemoryGameUIController(memoryGameButtons, lblTimerLabel, txtEnterYourName);
		//MontyHallUIController montyHallUIController = new MontyHallUIController();
				
		// ui transition
		btnMemoryGame.addMouseListener(memoryGameUIController.changeUIAfterClick(MainPanel, MemoryGamePanel, true));
		btnMemoryGameBackButton.addMouseListener(memoryGameUIController.changeUIAfterClick(MemoryGamePanel, MainPanel, true));
		
		// start game
		btnStartMemoryGame.addMouseListener(memoryGameUIController.startGameAfterClick());
		
		for(int i=0;i<memoryGameButtons.size();i++) {
			memoryGameButtons.get(i).addMouseListener(memoryGameUIController.memoryBtnClick(i));
		}
		
		memoryGameUIController.setName(txtEnterYourName.getText());
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		// end
	}
}
