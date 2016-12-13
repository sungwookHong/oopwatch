package oopwatch.concept;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class conceptMath extends JFrame {

	private JPanel contentPane1;
	
	private JPanel[] contentPane = new JPanel[7] ;
	
	private ImageIcon im;
	/**
	 * Launch the application.
	 */
	public static void show_Math(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conceptMath frame = new conceptMath();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public conceptMath() {
		setBounds(100, 100, 400, 400);
		contentPane1 = new JPanel();
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);

		contentPane[0] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept1.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		contentPane[1] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept2.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		
		contentPane[2] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept3.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		contentPane[3] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept4.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		contentPane[4] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept5.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		contentPane[5] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept6.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		contentPane[6] = new JPanel() {
			public void paintComponent(Graphics g) {
				im = new ImageIcon("./concept7.jpg");
				g.drawImage(im.getImage(), 0, 0, this.getWidth(),this.getHeight(),null);
				setOpaque(false); // 그림을 표시하게 설정,투명하게 조절
				super.paintComponent(g);
			}
		};
		for(int j=1; j<7;j++){
			contentPane[j].setVisible(false);
		}
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i =0; i<7; i++){
					if(contentPane[i].isVisible()){
						if(i==0){
							
						}else{
							contentPane[i].setVisible(false);
							contentPane[i-1].setVisible(true);
						}
						break;
					}
						
				}
			}
		});
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i =0; i<7; i++){
					if(contentPane[i].isVisible()){
						if(i==6){
							
						}else{
							contentPane[i].setVisible(false);
							contentPane[i+1].setVisible(true);
						}
						break;
					}
						
				}
			}
		});

				
		GroupLayout gl_contentPane = new GroupLayout(contentPane1);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contentPane[0], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[1], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[2], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[3], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[4], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[5], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addComponent(contentPane[6], GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(41)
					.addComponent(btnPrevious)
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(contentPane[0], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[1], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[2], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[3], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[4], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[5], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(contentPane[6], GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPrevious)
						.addComponent(btnNext))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane1.setLayout(gl_contentPane);
	}
}
