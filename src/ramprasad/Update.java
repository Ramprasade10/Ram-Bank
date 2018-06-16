 package ramprasad;
 
 import java.awt.Container;
 import java.awt.EventQueue;
 import java.awt.Font;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.SQLException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.swing.DefaultComboBoxModel;
 import javax.swing.GroupLayout;
 import javax.swing.GroupLayout.Alignment;
 import javax.swing.GroupLayout.ParallelGroup;
 import javax.swing.GroupLayout.SequentialGroup;
 import javax.swing.JButton;
 import javax.swing.JComboBox;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JTextField;
import javax.swing.LayoutStyle;
 import javax.swing.LayoutStyle.ComponentPlacement;
 import javax.swing.UIManager;
 import javax.swing.UIManager.LookAndFeelInfo;
 import javax.swing.UnsupportedLookAndFeelException;
 
 public class Update
   extends JFrame
 {
   private JButton jButton1;
   private JButton jButton2;
   private JComboBox jComboBox1;
   private JLabel jLabel1;
   private JTextField jTextField1;
   
   public Update()
   {
     initComponents();
     setTitle("Update Details");
   }
   
   private void initComponents()
   {
     this.jLabel1 = new JLabel();
     this.jComboBox1 = new JComboBox();
     this.jTextField1 = new JTextField();
     this.jButton1 = new JButton();
     this.jButton2 = new JButton();
     
     setDefaultCloseOperation(3);
     
     this.jLabel1.setFont(new Font("Adobe Arabic", 1, 36));
     this.jLabel1.setText("Update Details");
     
     this.jComboBox1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Username", "Password", "Phone", "E-Mail" }));
     this.jComboBox1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Update.this.jComboBox1ActionPerformed(evt);
       }
     });
     this.jTextField1.setFont(new Font("Adobe Arabic", 1, 18));
     
     this.jButton1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton1.setText("Update");
     this.jButton1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Update.this.jButton1ActionPerformed(evt);
       }
     });
     this.jButton2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton2.setText("Back");
     this.jButton2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Update.this.jButton2ActionPerformed(evt);
       }
     });
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jComboBox1, 0, -1, 32767).addComponent(this.jTextField1)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 141, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, 126, 32767).addComponent(this.jButton2, -1, -1, 32767)).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(53, 53, 53)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.jButton1)).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jComboBox1, -2, -1, -2))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addComponent(this.jTextField1, -2, -1, -2)).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jButton2))).addContainerGap(24, 32767)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     pack();
   }
   
   private void jButton1ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton1)
     {
       String a = this.jComboBox1.getSelectedItem().toString();
       
       DB db = new DB();
       if (a.equals("Username")) {
         try
         {
           String b = this.jTextField1.getText().trim();
           boolean st = db.updateun(b);
           if (b.length() == 0) {
             JOptionPane.showMessageDialog(this, "Please Enter a UserName to update");
           } else if (st == true) {
             JOptionPane.showMessageDialog(this, "Successfully Updated");
           } else {
             JOptionPane.showMessageDialog(this, "Update Unsuccessful");
           }
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
       if (a.equals("Password")) {
         try
         {
           String b = this.jTextField1.getText();
           if (b.length() == 0)
           {
             JOptionPane.showMessageDialog(this, "Please Enter a Password to update");
           }
           else
           {
             boolean st = db.updatepw(b);
             if (st == true) {
               JOptionPane.showMessageDialog(this, "Successfully Updated");
             } else {
               JOptionPane.showMessageDialog(this, "Update Unsuccessful");
             }
           }
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
       if (a.equals("Phone")) {
         try
         {
           String b = this.jTextField1.getText();
           
           boolean ph12 = true;
           for (int j = 0; j < b.length(); j++)
           {
             char b1 = b.charAt(j);
             if (!Character.isDigit(b1)) {
               ph12 = false;
             }
           }
           if (b.length() != 10) {
             JOptionPane.showMessageDialog(this, "Phone number is not of 10 digits");
           }
           if (!ph12) {
             JOptionPane.showMessageDialog(this, "Please Enter Phone Number as Digits");
           }
           if ((b.length() == 10) && (ph12 == true))
           {
             boolean st = db.updateph(b);
             if (st == true) {
               JOptionPane.showMessageDialog(this, "Successfully Updated");
             }
           }
           else
           {
             JOptionPane.showMessageDialog(this, "Update Unsuccessful");
           }
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
       if (a.equals("E-Mail")) {
         try
         {
           String b = this.jTextField1.getText();
           int l = 0;String ends = ".com";boolean end = !b.endsWith(ends);
           for (int k = 0; k < b.length(); k++)
           {
             char bc = b.charAt(k);
             if (bc == '@') {
               l++;
             }
           }
           if ((l > 1) || (end == true) || (l == 0)) {
             JOptionPane.showMessageDialog(this, "Verify Email Address");
           }
           if ((l == 1) && (!end))
           {
             boolean st = db.updateem(b);
             if (st == true) {
               JOptionPane.showMessageDialog(this, "Successfully Updated");
             }
           }
           else
           {
             JOptionPane.showMessageDialog(this, "Update Unsuccessful");
           }
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
     }
   }
   
   private void jComboBox1ActionPerformed(ActionEvent evt) {}
   
   private void jButton2ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton2)
     {
       MAIN m = new MAIN();
       m.setVisible(true);
       dispose();
     }
   }
   
   public static void main(String[] args)
   {
     
     EventQueue.invokeLater(new Runnable()
     {
       public void run()
       {
         new Update().setVisible(true);
       }
     });
   }
 }



