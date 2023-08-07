package verify.send;

import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	
	
	public int sendEmail(String toEmail,String password,String messg,String subject)
	{
		String result;
		int i=0;
		// Get recipient's email-ID, message & subject-line from index.html page

		//final String to = request.getParameter("mail");

		

		

		// Sender's email ID and password needs to be mentioned

		final String from = "desakash2243@gmail.com";

		final String pass = "d.akash@2243";

		// Defining the gmail host

		String host = "smtp.gmail.com";

		// Creating Properties object

		Properties props = new Properties();

		// Defining properties

		props.put("mail.smtp.host", host);

		props.put("mail.transport.protocol", "smtp");

		props.put("mail.smtp.auth", "true");

		props.put("mail.smtp.starttls.enable", "true");

		props.put("mail.user", from);

		props.put("mail.password", pass);

		props.put("mail.port", "443");

		// Authorized the Session object.

		Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {

			@Override

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(from, pass);

			}

		});

		try {

			// Create a default MimeMessage object.

			MimeMessage message = new MimeMessage(mailSession);

			// Set From: header field of the header.

			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.

			message.addRecipient(Message.RecipientType.TO,

					new InternetAddress(toEmail));

			// Set Subject: header field

			message.setSubject(subject);

			// Now set the actual message

			message.setText(messg);

			// Send message

			Transport.send(message);

			result = "Your mail sent successfully....";
			

		} catch (MessagingException mex) {

			mex.printStackTrace();

			result = "Error: unable to send mail....";
			i=1;
		}
		return i;
	}
}
