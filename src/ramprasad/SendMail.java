 package ramprasad;
 
 import java.util.Properties;
import javax.mail.Message;
 import javax.mail.Message.RecipientType;
 import javax.mail.MessagingException;
 import javax.mail.Session;
 import javax.mail.Transport;
 import javax.mail.internet.AddressException;
 import javax.mail.internet.InternetAddress;
 import javax.mail.internet.MimeMessage;
 
 public class SendMail
 {
   static Properties mailServerProperties;
   static Session getMailSession;
   static MimeMessage generateMailMessage;
   
   public static void send(String mail)
     throws AddressException, MessagingException
   {
     mailServerProperties = System.getProperties();
     mailServerProperties.put("mail.smtp.port", "587");
     mailServerProperties.put("mail.smtp.auth", "true");
     mailServerProperties.put("mail.smtp.starttls.enable", "true");
     
 
 
     getMailSession = Session.getDefaultInstance(mailServerProperties, null);
     generateMailMessage = new MimeMessage(getMailSession);
     generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
     
     generateMailMessage.setSubject("Hello User");
     String emailBody = "We would like to inform you that there were 3 Invalid Logins  <br>If it was you then ignore the message<br>Regards,<br>Ram Bank";
     generateMailMessage.setContent(emailBody, "text/html");
     
 
 
 
     Transport transport = getMailSession.getTransport("smtp");
     
     transport.connect("smtp.gmail.com", "bankingapp10@gmail.com", "password");
     transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
     transport.close();
   }
 }



