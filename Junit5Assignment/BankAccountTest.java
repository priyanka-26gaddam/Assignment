package com.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BankAccountTest {
	int i;
	double bal1[]= {5500.0,10000.0,25000.0,55000.0,85000.0};
	double bal2[]= {2000.0,18000.0,19000.0,17500.0,19900.0};
	
	
	@ParameterizedTest
	@ValueSource(doubles = {10000, 17300, 15000,18999,19999}) //limit values less than 20000
	void testdrawLimitExpectedException(double w) {
		
			for(i=0;i<bal1.length;i++) {
			//throws WithdrawLimitException
			 assertThrows(WithdrawLimitException.class,
						()->BankAccount.withdraw(w,bal1[i]));
			}		
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {21000, 30000, 50000, 39000,85000,60000}) //withdraw values more than 20000 
	void testInsuffExpectedException(double w) {
		
		for(i=0;i<bal2.length;i++) {
		 //throws InsufficientFundsException
		 assertThrows(InsufficientFundsException.class,
				()->BankAccount.withdraw(w,bal2[i]));
		}
		
	}

	@ParameterizedTest
	@ValueSource(doubles = {-10000, -17300, -15000,-18999,-99,-19999,-900}) //values less than 0
	void InvalidEntryException(double w) {
		
			for(i=0;i<bal1.length;i++) {
			//throws InvalidEntryException
			 assertThrows(InvalidEntryException.class,
						()->BankAccount.withdraw(w,bal1[i]));
			 assertThrows(InvalidEntryException.class,
						()->BankAccount.withdraw(w,bal2[i]));
			}		
	}
}
