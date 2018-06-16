 package ramprasad;
 
 import java.io.PrintStream;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 
 class DB
 {
   boolean stat5 = false;
   boolean stat4 = false;
   boolean stat3 = false;
   boolean stat2 = false;
   boolean stat1 = false;
   static double balance;
   static int j;
   static double dep1;
   String mailid;
   static int i;
   static double amtwith1;
   static int acid1;
   static double amt;
   String name1;
   String a12;
   boolean status2;
   boolean status1;
   
   public boolean info(int id1, String name, String pass, String mail, int pho)
     throws ClassNotFoundException, SQLException
   {
     boolean status = false;
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       PreparedStatement stmt = con.prepareStatement("insert into RAM values(?,?,?,?,?,?)");
       stmt.setInt(1, id1);
       stmt.setString(2, name);
       stmt.setString(3, pass);
       stmt.setInt(4, pho);
       stmt.setString(5, mail);
       stmt.setInt(6, 1000);
       
       stmt.executeUpdate();
       con.close();
       
 
 
       status = true;
       this.status1 = status;
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.status1;
   }
   
   public boolean check(int acid, String pwd)
     throws SQLException, ClassNotFoundException
   {
     acid1 = acid;
     try
     {
       boolean status20 = false;
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       
       Statement stmt = con.createStatement();
       String q = "select * from RAM where ACCOUNTID=" + acid;
       ResultSet rs = stmt.executeQuery(q);
       while (rs.next())
       {
         String a123 = rs.getString(3);
         this.a12 = a123;
       }
       if (this.a12.equals(pwd))
       {
         status20 = true;
         this.status1 = status20;
       }
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.status1;
   }
   
   public static double with(double with)
     throws SQLException, ClassNotFoundException
   {
     double balinst = bal();
     double chk = balinst - with;
     if ((chk < 1000.0D) || (with > balinst)) {
       return 1.0D;
     }
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt2 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt2.executeQuery(q);
       double amtwith;
       if (rs.next()) {
         amtwith = rs.getDouble(6);
       }
       amtwith1 = balinst - with;
       rs.updateDouble(6, amtwith1);
       
       rs.updateRow();amtwith1 = 0.0D;
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return amtwith1;
   }
   
   public static void dep(double dep)
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next()) {
         amt = rs.getDouble(6);
       }
       dep1 = amt + dep;
       rs.updateDouble(6, dep1);
       
       rs.updateRow();
       dep1 = 0.0D;
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
   }
   
   public static double bal()
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt = con.createStatement();
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       ResultSet rs = stmt.executeQuery(q);
       while (rs.next())
       {
         double balc = rs.getDouble(6);
         balance = balc;
       }
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return balance;
   }
   
   public String mail()
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt = con.createStatement();
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       ResultSet rs = stmt.executeQuery(q);
       while (rs.next())
       {
         String mailid1 = rs.getString(5);
         this.mailid = mailid1;
       }
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.mailid;
   }
   
   public boolean updateun(String up)
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next())
       {
         rs.updateString(2, up);rs.updateRow();
         con.close();this.stat1 = true;
       }
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.stat1;
   }
   
   public boolean updatepw(String up)
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next())
       {
         rs.updateString(3, up);rs.updateRow();
         con.close();this.stat2 = true;
       }
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.stat2;
   }
   
   public boolean updateph(String up)
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next())
       {
         rs.updateInt(4, Integer.parseInt(up));rs.updateRow();
         con.close();this.stat3 = true;
       }
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.stat3;
   }
   
   public boolean updateem(String up)
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next())
       {
         rs.updateString(5, up);rs.updateRow();
         con.close();this.stat4 = true;
       }
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.stat4;
   }
   
   public boolean delete()
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt = con.createStatement();
       String q = "delete from RAM where ACCOUNTID=" + acid1;
       stmt.executeUpdate(q);
       
       con.close();
       this.stat5 = true;
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.stat5;
   }
   
   public String name()
     throws SQLException, ClassNotFoundException
   {
     try
     {
       Class.forName("org.apache.derby.jdbc.ClientDriver");
       
       Connection con = DriverManager.getConnection("jdbc:derby:
       Statement stmt1 = con.createStatement(1005, 1008);
       
       String q = "select * from RAM where ACCOUNTID=" + acid1;
       
       ResultSet rs = stmt1.executeQuery(q);
       if (rs.next())
       {
         String name = rs.getString(2);
         this.name1 = name;
       }
       con.close();
     }
     catch (Exception e)
     {
       System.out.println(e);
     }
     return this.name1;
   }
 }



