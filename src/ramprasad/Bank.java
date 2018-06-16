 package ramprasad;
 
 import java.awt.Container;
 import java.awt.EventQueue;
 import java.awt.Font;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.SQLException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.mail.MessagingException;
 import javax.swing.GroupLayout;
 import javax.swing.GroupLayout.Alignment;
 import javax.swing.GroupLayout.ParallelGroup;
 import javax.swing.GroupLayout.SequentialGroup;
 import javax.swing.JButton;
 import javax.swing.JDialog;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JPasswordField;
 import javax.swing.JTextField;
import javax.swing.LayoutStyle;
 import javax.swing.LayoutStyle.ComponentPlacement;
 import javax.swing.UIManager;
 import javax.swing.UIManager.LookAndFeelInfo;
 import javax.swing.UnsupportedLookAndFeelException;
 
 public class Bank
   extends JFrame
 {
   int i = 0;
   boolean chk;
   String mm;
   int idid;
   String nm1;
   private JButton jButton1;
   private JButton jButton2;
   private JDialog jDialog1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JPasswordField jPasswordField1;
   private JTextField jTextField1;
   
   public Bank()
   {
     initComponents();
     setTitle("Ram Banking Applicatiom");
   }
   
   private void initComponents()
   {
     this.jDialog1 = new JDialog();
     this.jLabel1 = new JLabel();
     this.jLabel2 = new JLabel();
     this.jLabel3 = new JLabel();
     this.jButton1 = new JButton();
     this.jTextField1 = new JTextField();
     this.jPasswordField1 = new JPasswordField();
     this.jButton2 = new JButton();
     this.jLabel4 = new JLabel();
     
     GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
     this.jDialog1.getContentPane().setLayout(jDialog1Layout);
     jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, 32767));
     
 
 
     jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, 32767));
     
 
 
 
     setDefaultCloseOperation(3);
     
     this.jLabel1.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel1.setText("SIGN IN  TO RAM-BANK");
     
     this.jLabel2.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel2.setText("Account Number");
     
     this.jLabel3.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel3.setText("Password");
     
     this.jButton1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton1.setText("Submit");
     this.jButton1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
    try {
                 Bank.this.jButton1ActionPerformed(evt);
        
    } catch (MessagingException ex) {
        Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
     });
     this.jTextField1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Bank.this.jTextField1ActionPerformed(evt);
       }
     });
     this.jButton2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton2.setText("Create New Account ");
     this.jButton2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Bank.this.jButton2ActionPerformed(evt);
       }
     });
     this.jLabel4.setText("All Rights Reserved @2014 Ramprasad Naik");
     
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1, -2, 158, -2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(9, 9, 9).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel1).addContainerGap(83, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPasswordField1, GroupLayout.Alignment.TRAILING, -2, 158, -2).addComponent(this.jTextField1, GroupLayout.Alignment.TRAILING, -2, 158, -2))))).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel4).addContainerGap()));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jPasswordField1, -2, -1, -2)).addGap(29, 29, 29).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, 32767).addComponent(this.jLabel4)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     pack();
   }
   
   private void jButton1ActionPerformed(ActionEvent evt) throws MessagingException
   {
     if (evt.getSource() == this.jButton1)
     {
       char[] ab = this.jPasswordField1.getPassword();
       String PW = new String(ab);
       
       String ID1 = this.jTextField1.getText();
       if ((PW.trim().length() != 0) && (ID1.trim().length() != 0))
       {   
         int id = Integer.parseInt(ID1);
         try
         {
           DB data = new DB();
           boolean ch = data.check(id, PW);
           this.chk = ch;
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
         }
         if (this.chk == true)
         {
           
           
           try
           {
   
    DB ad = new DB();
             String nm = ad.name();
             this.nm1 = nm;
           }
           catch (SQLException ex)
           {
             Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch (ClassNotFoundException ex)
           {
             Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
           } MAIN A = new MAIN();
           A.jLabel3.setText(this.nm1);
           
           A.setVisible(true);
           dispose();
         }
         if(chk==false)
         {
           this.i += 1;JOptionPane.showMessageDialog(this, "Invalid Credentials");
           if (this.i == 3)
           {
             
               try
               {
                 DB dt = new DB();
                 String mailmail = dt.mail();
                 this.mm = mailmail;
               }
               catch (SQLException ex)
               {
                 Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
               }
               catch (ClassNotFoundException ex)
               {
                 Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
               }
               SendMail.send(this.mm);
             }
            
             Bank ab1 = new Bank();
             ab1.setVisible(true);
             dispose();
           }
         }
       
       else
       {
         if (PW.trim().length() == 0) {
           JOptionPane.showMessageDialog(this, "Please Enter Password");
         }
         if (ID1.trim().length() == 0) {
           JOptionPane.showMessageDialog(this, "Please Enter Account ID");
         }
       }
     }}
   
   
   private void jTextField1ActionPerformed(ActionEvent evt) {}
   
   private void jButton2ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton2)
     {
       CreateAccount a = new CreateAccount();
       
       a.setVisible(true);
       dispose();
     }
   }
   
   public static void main(String[] args)
   {
     
     EventQueue.invokeLater(new Runnable()
     {
       public void run()
       {
         new Bank().setVisible(true);
       }
     });
   }}
   
   



 package ramprasad;
 
 import java.awt.Container;
 import java.awt.EventQueue;
 import java.awt.Font;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.SQLException;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.mail.MessagingException;
 import javax.swing.GroupLayout;
 import javax.swing.GroupLayout.Alignment;
 import javax.swing.GroupLayout.ParallelGroup;
 import javax.swing.GroupLayout.SequentialGroup;
 import javax.swing.JButton;
 import javax.swing.JDialog;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JPasswordField;
 import javax.swing.JTextField;
import javax.swing.LayoutStyle;
 import javax.swing.LayoutStyle.ComponentPlacement;
 import javax.swing.UIManager;
 import javax.swing.UIManager.LookAndFeelInfo;
 import javax.swing.UnsupportedLookAndFeelException;
 
 public class Bank
   extends JFrame
 {
   int i = 0;
   boolean chk;
   String mm;
   int idid;
   String nm1;
   private JButton jButton1;
   private JButton jButton2;
   private JDialog jDialog1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JPasswordField jPasswordField1;
   private JTextField jTextField1;
   
   public Bank()
   {
     initComponents();
     setTitle("Ram Banking Applicatiom");
   }
   
   private void initComponents()
   {
     this.jDialog1 = new JDialog();
     this.jLabel1 = new JLabel();
     this.jLabel2 = new JLabel();
     this.jLabel3 = new JLabel();
     this.jButton1 = new JButton();
     this.jTextField1 = new JTextField();
     this.jPasswordField1 = new JPasswordField();
     this.jButton2 = new JButton();
     this.jLabel4 = new JLabel();
     
     GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
     this.jDialog1.getContentPane().setLayout(jDialog1Layout);
     jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 400, 32767));
     
 
 
     jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 300, 32767));
     
 
 
 
     setDefaultCloseOperation(3);
     
     this.jLabel1.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel1.setText("SIGN IN  TO RAM-BANK");
     
     this.jLabel2.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel2.setText("Account Number");
     
     this.jLabel3.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel3.setText("Password");
     
     this.jButton1.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton1.setText("Submit");
     this.jButton1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
    try {
                 Bank.this.jButton1ActionPerformed(evt);
        
    } catch (MessagingException ex) {
        Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
     });
     this.jTextField1.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Bank.this.jTextField1ActionPerformed(evt);
       }
     });
     this.jButton2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton2.setText("Create New Account ");
     this.jButton2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         Bank.this.jButton2ActionPerformed(evt);
       }
     });
     this.jLabel4.setText("All Rights Reserved @2014 Ramprasad Naik");
     
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton1, -2, 158, -2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(9, 9, 9).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel1).addContainerGap(83, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPasswordField1, GroupLayout.Alignment.TRAILING, -2, 158, -2).addComponent(this.jTextField1, GroupLayout.Alignment.TRAILING, -2, 158, -2))))).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel4).addContainerGap()));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jPasswordField1, -2, -1, -2)).addGap(29, 29, 29).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, 32767).addComponent(this.jLabel4)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     pack();
   }
   
   private void jButton1ActionPerformed(ActionEvent evt) throws MessagingException
   {
     if (evt.getSource() == this.jButton1)
     {
       char[] ab = this.jPasswordField1.getPassword();
       String PW = new String(ab);
       
       String ID1 = this.jTextField1.getText();
       if ((PW.trim().length() != 0) && (ID1.trim().length() != 0))
       {   
         int id = Integer.parseInt(ID1);
         try
         {
           DB data = new DB();
           boolean ch = data.check(id, PW);
           this.chk = ch;
         }
         catch (SQLException ex)
         {
           Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
         }
         catch (ClassNotFoundException ex)
         {
           Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
         }
         if (this.chk == true)
         {
           
           
           try
           {
   
    DB ad = new DB();
             String nm = ad.name();
             this.nm1 = nm;
           }
           catch (SQLException ex)
           {
             Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
           }
           catch (ClassNotFoundException ex)
           {
             Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
           } MAIN A = new MAIN();
           A.jLabel3.setText(this.nm1);
           
           A.setVisible(true);
           dispose();
         }
         if(chk==false)
         {
           this.i += 1;JOptionPane.showMessageDialog(this, "Invalid Credentials");
           if (this.i == 3)
           {
             
               try
               {
                 DB dt = new DB();
                 String mailmail = dt.mail();
                 this.mm = mailmail;
               }
               catch (SQLException ex)
               {
                 Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
               }
               catch (ClassNotFoundException ex)
               {
                 Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
               }
               SendMail.send(this.mm);
             }
            
             Bank ab1 = new Bank();
             ab1.setVisible(true);
             dispose();
           }
         }
       
       else
       {
         if (PW.trim().length() == 0) {
           JOptionPane.showMessageDialog(this, "Please Enter Password");
         }
         if (ID1.trim().length() == 0) {
           JOptionPane.showMessageDialog(this, "Please Enter Account ID");
         }
       }
     }}
   
   
   private void jTextField1ActionPerformed(ActionEvent evt) {}
   
   private void jButton2ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton2)
     {
       CreateAccount a = new CreateAccount();
       
       a.setVisible(true);
       dispose();
     }
   }
   
   public static void main(String[] args)
   {
     
     EventQueue.invokeLater(new Runnable()
     {
       public void run()
       {
         new Bank().setVisible(true);
       }
     });
   }}
   
   



