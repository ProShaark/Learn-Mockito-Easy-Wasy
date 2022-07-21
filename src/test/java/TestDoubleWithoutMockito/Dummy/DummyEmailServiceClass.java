package TestDoubleWithoutMockito.Dummy;

import TestDoubleWithoutMockito.DummyTestDouble.EmailService;

public class DummyEmailServiceClass implements EmailService {

	@Override
	public void sendEmail() {
		throw new AssertionError("Method Not Implemented !");
		
	}

}
