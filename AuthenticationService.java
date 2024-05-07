package edu.sbi.atm.service;
import edu.sbi.atm.iservice.IAuthenticationService;
public class AuthenticationService implements IAuthenticationService{
	private static int passcode=8945;
	public boolean authentication(Integer pin) {
		return (this.passcode==pin);
	}
	public boolean resetpin(Integer newpin) {
		boolean ischange=false;
		try {
			this.passcode=newpin;
			ischange=true;
		}
		catch(Exception ex){
			System.out.println("exception raised while changing pin");
		}
		return ischange;
	}
	
	
}
