package besinciGunOdevi.nLayeredDemo.business.concretes;

import besinciGunOdevi.nLayeredDemo.business.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void send() {
		System.out.println("Email gönderildi");
	}
	
}
