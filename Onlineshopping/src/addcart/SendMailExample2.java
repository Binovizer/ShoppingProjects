package addcart;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.smtp.SMTPSSLTransport;

public class SendMailExample2 
{
static String mail;
static String password;
static String uname;
SendMailExample2(String mail,String uname,String password)
{
this.mail=mail;
this.password=password;
this.uname=uname;
//System.out.println(mail);
sendMail();
}

public static void sendMail()
{
String from = "surya@apextgi.com";
String to = mail;
String subject = "Test Message";
String message = "This mail is sent by shopperdeals \n your Address is :"+uname+"\n and your password is :"+password+" \n Thanks for using this service.\n Enjoy shoppersdeal...\n For any Query\n Contact : Shopperdeal\n https://www.facebook.com/msstalk15 Thank you.";
SendMail2 sendMail = new SendMail2(from, to, subject, message);
sendMail.send();
}
}