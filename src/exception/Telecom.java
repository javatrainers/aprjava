package exception;

public class Telecom {
	public void call(long phoneNum) throws InvalidPhoneException {
		if(phoneNum < 1000000000 || phoneNum > 9999999999l ) {
		// if phone number	is smaller or greater than 10 digit number
			// throw business related user-defined exception
			InvalidPhoneException bizExcep=new InvalidPhoneException("the phone number should be 10 digit");
			throw bizExcep;
		}
		System.out.println("dialing...");
	}
}
