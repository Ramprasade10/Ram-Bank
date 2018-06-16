 package ramprasad;
 
 import java.awt.Container;
 import java.awt.EventQueue;
 import java.awt.Font;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.sql.SQLException;
 import java.util.Random;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import javax.swing.GroupLayout;
 import javax.swing.GroupLayout.Alignment;
 import javax.swing.GroupLayout.ParallelGroup;
 import javax.swing.GroupLayout.SequentialGroup;
 import javax.swing.JButton;
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
 
 public class CreateAccount
   extends JFrame
 {
   private JTextField jTextField5;
   private JTextField jTextField4;
   private JTextField jTextField3;
   private JTextField jTextField2;
   private JTextField jTextField1;
   private JPasswordField jPasswordField2;
   private JPasswordField jPasswordField1;
   private JLabel jLabel9;
   private JLabel jLabel8;
   private JLabel jLabel7;
   private JLabel jLabel6;
   private JLabel jLabel5;
   private JLabel jLabel4;
   private JLabel jLabel3;
   private JLabel jLabel2;
   private JLabel jLabel1;
   private JButton jButton3;
   private JButton jButton2;
   private JButton jButton1;
   int max = 100000;
   int min = 10000;
   boolean res1;
   
   public CreateAccount()
   {
     initComponents();
     setTitle("Create New Account");
   }
   
   private void initComponents()
   {
     this.jLabel1 = new JLabel();
     this.jButton1 = new JButton();
     this.jLabel3 = new JLabel();
     this.jTextField1 = new JTextField();
     this.jTextField4 = new JTextField();
     this.jLabel2 = new JLabel();
     this.jButton2 = new JButton();
     this.jLabel4 = new JLabel();
     this.jLabel5 = new JLabel();
     this.jLabel6 = new JLabel();
     this.jLabel7 = new JLabel();
     this.jLabel8 = new JLabel();
     this.jTextField2 = new JTextField();
     this.jPasswordField1 = new JPasswordField();
     this.jPasswordField2 = new JPasswordField();
     this.jButton3 = new JButton();
     this.jTextField3 = new JTextField();
     this.jLabel9 = new JLabel();
     this.jTextField5 = new JTextField();
     
     this.jLabel1.setText("jLabel1");
     
     this.jButton1.setText("jButton1");
     
     this.jLabel3.setText("jLabel3");
     
     this.jTextField1.setText("jTextField1");
     
     this.jTextField4.setText("jTextField4");
     
     setDefaultCloseOperation(3);
     
     this.jLabel2.setFont(new Font("Adobe Arabic", 1, 24));
     this.jLabel2.setText("Create Account");
     
     this.jButton2.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton2.setText("Create");
     this.jButton2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         CreateAccount.this.jButton2ActionPerformed(evt);
       }
     });
     this.jLabel4.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel4.setText("E-Mail Address");
     
     this.jLabel5.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel5.setText("Confirm Password");
     
     this.jLabel6.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel6.setText("Password");
     
     this.jLabel7.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel7.setText("Phone Number");
     
     this.jLabel8.setFont(new Font("Adobe Arabic", 1, 18));
     this.jLabel8.setText("Account Name ");
     
     this.jTextField2.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         CreateAccount.this.jTextField2ActionPerformed(evt);
       }
     });
     this.jButton3.setFont(new Font("Adobe Arabic", 1, 18));
     this.jButton3.setText("Back");
     this.jButton3.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         CreateAccount.this.jButton3ActionPerformed(evt);
       }
     });
     this.jTextField5.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent evt)
       {
         CreateAccount.this.jTextField5ActionPerformed(evt);
       }
     });
     GroupLayout layout = new GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(104, 104, 104).addComponent(this.jLabel2).addContainerGap(-1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(22, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jTextField2, -2, 143, -2).addComponent(this.jPasswordField1, -2, 143, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel9).addGap(151, 151, 151)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton3).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel5).addComponent(this.jLabel8).addComponent(this.jLabel4).addComponent(this.jLabel7)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField5, GroupLayout.Alignment.TRAILING, -2, 143, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jPasswordField2, -1, 143, 32767).addComponent(this.jTextField3)))))).addGap(76, 76, 76)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.jTextField2, -2, -1, -2)).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jLabel8).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.jPasswordField1, -2, -1, -2)))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5).addComponent(this.jPasswordField2, -2, -1, -2)).addGap(13, 13, 13).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField3, -2, -1, -2)).addGap(14, 14, 14).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel7).addComponent(this.jTextField5, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel9).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton2, -2, 35, -2).addComponent(this.jButton3, -2, 35, -2)).addContainerGap(20, 32767)));
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
     pack();
   }
   
   private void jButton2ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton2)
     {
       char[] p = this.jPasswordField1.getPassword();
       String pw = new String(p);
       char[] p1 = this.jPasswordField2.getPassword();
       String pw1 = new String(p1);
       String un = this.jTextField2.getText().trim();
       String em = this.jTextField3.getText();
       String ph1 = this.jTextField5.getText();
       
       int l = 0;String ends = ".com";
       boolean ph12 = true;
       boolean end = !em.endsWith(ends);
       for (int k = 0; k < em.length(); k++)
       {
         char b = em.charAt(k);
         if (b == '@') {
           l++;
         }
       }
       for (int j = 0; j < ph1.length(); j++)
       {
         char b1 = ph1.charAt(j);
         if (!Character.isDigit(b1)) {
           ph12 = false;
         }
       }
        if (un.length()==0) {
         JOptionPane.showMessageDialog(this, "Please Enter a UserName");
       }
else if (pw.length()==0) {
         JOptionPane.showMessageDialog(this, "Please Enter Password");
       }
 else if (pw1.length()==0) {
         JOptionPane.showMessageDialog(this, "Please Confirm your password");
       }
       else if (!pw.equals(pw1)) {
         JOptionPane.showMessageDialog(this, "Passwords did not match");
       }
       else if (ph1.length() != 10) {
         JOptionPane.showMessageDialog(this, "Phone number is not of 10 digits");
       }
       else if (!ph12) {
         JOptionPane.showMessageDialog(this, "Please Enter Phone Number as Digits");
       }
       else if ((l > 1) || (end == true) || (l == 0))
       {
         JOptionPane.showMessageDialog(this, "Verify Email Address");
       }
       else
       {
         int ph = Integer.parseInt(ph1);
         int id = random();
         DB db = new DB();
         try
         {
           boolean res = db.info(id, un, pw1, em, ph);this.res1 = res;
         }
         catch (ClassNotFoundException|SQLException ex)
         {
           Logger.getLogger(CreateAccount.class.getName()).log(Level.SEVERE, null, ex);
         }
         if (res1 == true)
         {
           JOptionPane.showMessageDialog(this, "Registration Sucessful Your Account Number is " + id);
           Bank bk = new Bank();
           bk.setVisible(true);
           dispose();
         }
         else
         {
           JOptionPane.showConfirmDialog(this, "Registration Unsuccessful");
         }
       }
     }
   }
   
   private void jButton3ActionPerformed(ActionEvent evt)
   {
     if (evt.getSource() == this.jButton3)
     {
       Bank h = new Bank();
       h.setVisible(true);dispose();
     }
   }
   
   private void jTextField2ActionPerformed(ActionEvent evt) {}
   
   private void jTextField5ActionPerformed(ActionEvent evt) {}
   
   public static void main(String[] args)
   {
     
     EventQueue.invokeLater(new Runnable()
     {
       public void run()
       {
         new CreateAccount().setVisible(true);
       }
     });
   }
   
   public int random()
   {
     Random foo = new Random();
     int randomNumber = foo.nextInt(this.max + 1 - this.min) + this.min;
     
     return randomNumber;
   }
 }



