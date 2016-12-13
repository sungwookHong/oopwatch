package oopwatch.concept;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

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

public class conceptScience extends JFrame {

   private JPanel contentPane1;

   private JPanel[] contentPane = new JPanel[13]; //to show 13 pictures
   
   private ImageIcon im;
   /**
    * Launch the application.
    */
   public static void show_Science(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               conceptScience frame = new conceptScience();
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
   public conceptScience() {
      setBounds(100, 100, 350, 500);
      contentPane1 = new JPanel(); 
      contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane1);
      
      contentPane[0] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_1.jpg"); 
            g.drawImage(im.getImage(), 0, 0, null); 
            setOpaque(false); //to show picture, not opaque
            super.paintComponent(g); 
         }
      };
      contentPane[1] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_2.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      
      contentPane[2] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_3.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[3] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_4.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false);
            super.paintComponent(g);
         }
      };
      contentPane[4] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_5.jpg");
            g.drawImage(im.getImage(), 0, 0, null); 
            setOpaque(false);
            super.paintComponent(g);
         }
      };
      contentPane[5] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_6.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[6] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_7.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[7] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_8.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[8] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_9.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[9] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_10.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[10] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_11.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[11] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_12.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      contentPane[12] = new JPanel() {
         public void paintComponent(Graphics g) {
            im = new ImageIcon("./cs_13.jpg");
            g.drawImage(im.getImage(), 0, 0, null);
            setOpaque(false); 
            super.paintComponent(g);
         }
      };
      
      for(int j=1; j<13;j++){
         contentPane[j].setVisible(false);
      }

      

      JButton btnPrevious = new JButton("Previous");
      btnPrevious.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            for(int i =0; i<13; i++){
               if(contentPane[i].isVisible()){
                  if(i==0){
                     //if i is 0, get out of the for statement
                  }else{
                     contentPane[i].setVisible(false); // if you click previous, set this panel invisible
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
            for(int i =0; i<13; i++){
               if(contentPane[i].isVisible()){
                  if(i==12){
                     //if i is 12, get out of the for statement
                  }else{
                     contentPane[i].setVisible(false); // if you click next, set this panel invisible
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
               .addComponent(contentPane[0], GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
               .addComponent(contentPane[1], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[2], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[3], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[4], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[5], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[6], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[7], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[8], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[9], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[10], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[11], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addComponent(contentPane[12], GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
               .addContainerGap())
            .addGroup(gl_contentPane.createSequentialGroup()
               .addGap(47)
               .addComponent(btnPrevious)
               .addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
               .addComponent(btnNext)
               .addGap(56))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addContainerGap()
               .addComponent(contentPane[0], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[1], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[2], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[3], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[4], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[5], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[6], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[7], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[8], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[9], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[10], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[11], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addComponent(contentPane[12], GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.UNRELATED)
               .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                  .addComponent(btnPrevious)
                  .addComponent(btnNext))
               .addContainerGap(36, Short.MAX_VALUE))
      );
      contentPane1.setLayout(gl_contentPane);
   }
}