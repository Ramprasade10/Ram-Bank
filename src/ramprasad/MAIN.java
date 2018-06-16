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
 
 public class MAIN
   extends JFrame
 {
   double w1;
   double b11;
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JComboBox jComboBox1;
   private JComboBox jComboBox2;
   private JComboBox jComboBox3;
   private JLabel jLabel1;
   private JLabel jLabel2;
   public JLabel jLabel3;
   private JLabel jLabel4;
   private JTextField jTextField1;
   
   public MAIN()
   {
     initComponents();
     setTitle("Preocess Transaction");
   }
   
   private void initComponents()
   {
     this.jComboBox2 = new JComboBox();
     this.jLabel1 = new JLabel();
     this.jLabel2 = new JLabel();
     this.jComboBox1 = new JComboBox();
     this.jTextField1 = new JTextField();
     this.jButton1 = new JButton();
     this.jButton2 = new JButton();
     this.jLabel4 = new JLabel();
     this.jComboBox3 = new JComboBox();
     this.jButton3 = new JButton();
     this.jLabel3 = new JLabel();
     
     this.jComboBox2.setModel(new DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
     
     setDefaultCloseOperation(3);
     
     this.jLabel1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel1.setText("Transaction Type");
     
     this.jLabel2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel2.setText("Transaction Amount");
     
     this.jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Deposit", "Withdraw" }));
     this.jComboBox1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jComboBox1ActionPerformed(evt);
       }
     });
     this.jTextField1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jTextField1ActionPerformed(evt);
       }
     });
     this.jButton1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton1.setText("Process");
     this.jButton1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jButton1ActionPerformed(evt);
       }
     });
     this.jButton2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton2.setText("Check Balance");
     this.jButton2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jButton2ActionPerformed(evt);
       }
     });
     this.jLabel4.setFont(new Font("Adobe Arabic", 1, 36));
     this.jLabel4.setText("Welcome");
     this.jLabel4.setToolTipText("");
     this.jLabel4.setVerticalAlignment(3);
     
     this.jComboBox3.setFont(new Font("Adobe Arabic", 1, 18));
     this.jComboBox3.setModel(new DefaultComboBoxModel(new String[] { "Update", "Delete", "Logout" }));
     this.jComboBox3.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jComboBox3ActionPerformed(evt);
       }
     });
     this.jButton3.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton3.setText("OK");
     this.jButton3.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         MAIN.this.jButton3ActionPerformed(evt);
       }
     });
     this.jLabel3.setFont(new Font("Adobe Arabic", 1, 36));
     
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 216, -2).addComponent(this.jButton1, -2, 119, -2).addComponent(this.jLabel2, -2, 257, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel4).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767).addComponent(this.jLabel3, -2, 209, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jComboBox1, 0, 111, 32767).addComponent(this.jTextField1)).addComponent(this.jButton2, GroupLayout.Alignment.TRAILING)).addGroup(layout.createSequentialGroup().addComponent(this.jComboBox3, -2, 120, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 73, -2))).addContainerGap()));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4, -2, 48, -2).addComponent(this.jComboBox3, -2, -1, -2).addComponent(this.jButton3).addComponent(this.jLabel3, -2, 48, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jComboBox1, -2, -1, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2, -2, 20, -2).addComponent(this.jTextField1, -2, -1, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addContainerGap(44, 32767)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     pack();
   }
   
   private void jComboBox1ActionPerformed(ActionEvent evt) {}
   
   private void jButton1ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton1)
     {
       String c = this.jComboBox1.getSelectedItem().toString();
       if (c.equals("Deposit")) {
         try
         {
           double amt1 = Double.parseDouble(this.jTextField1.getText());
           
           DB.dep(amt1);
           double b = DB.bal();
           JOptionPane.showMessageDialog(this, "Deposit Successful and Your Balance After the Transction.." + b);
         }
         catch (SQLException ex)
         {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
         }
       }
       if (c.equals("Withdraw"))
       {
         double amt12 = Double.parseDouble(this.jTextField1.getText());
         try
         {
           double w = DB.with(amt12);
           this.w1 = w;
         }
         catch (SQLException ex)
         {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
         }
         if (this.w1 == 1.0D)
         {
           JOptionPane.showMessageDialog(this, "Invalid Transaction");
         }
         else
         {
           try
           {
             double b1 = DB.bal();
             this.b11 = b1;
           }
           catch (SQLException ex)
           {
             Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch (ClassNotFoundException ex)
           {
             Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
           }
           JOptionPane.showMessageDialog(this, "Withdraw Successful and your Balance After the Transction.." + this.b11);
         }
       }
     }
   }
   
   private void jTextField1ActionPerformed(ActionEvent evt) {}
   
   private void jButton2ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton2) {
       try
       {
         JOptionPane.showMessageDialog(this, "Your Account Current Balance is " + DB.bal());
       }
       catch (SQLException ex)
       {
         Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch (ClassNotFoundException ex)
       {
         Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
   }
   
   private void jComboBox3ActionPerformed(ActionEvent evt) {}
   
   private void jButton3ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton3)
     {
       String c1 = this.jComboBox3.getSelectedItem().toString();
       if (c1.equals("Update"))
       {
         Update up = new Update();
         up.setVisible(true);
         dispose();
       }
       if (c1.equals("Logout"))
       {
         Bank b = new Bank();
         b.setVisible(true);
         dispose();
       }
       if (c1.equals("Delete"))
       {
         DB db = new DB();
         boolean ch = db.delete();
         if (ch == true)
         {
           JOptionPane.showMessageDialog(this, "Your Account has been successfully deleted...Logging out");
           Bank M = new Bank();
           M.setVisible(true);
           dispose();
         }
         else
         {
           JOptionPane.showMessageDialog(this, "Your Account could not be deleted");
         }
       }
     }
   }
   
   public static void main(String[] args)
   {
    
     EventQueue.invokeLater(new Runnable()
     {
       public void run()
       {
         new MAIN().setVisible(true);
       }
     });
   }
 }



