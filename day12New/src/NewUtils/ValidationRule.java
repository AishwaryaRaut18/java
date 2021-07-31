/*Validation Rules 
1. In any transaction(eg withdraw or transfer ) or while opening an account ,balance should be always > 1000 
(min balance condition should be checked) Otherwise throw custom exception.
2. Account type must be valid
3. A/C creation date must be in the current financial year.
*/
package NewUtils;

import java.text.ParseException;
import NewCustomException.BankExceptionHandling;
import day12fresh.AccountType;
import day12fresh.BankAccount;
import java.util.Date;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import static day12fresh.AccountType.*;

public class ValidationRule {
	public static final int MIN_accountNumber,MAX_accountNumber,MIN_customerName,MAX_customerName,moneyDeposit,MIN_password;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyy");
		MIN_accountNumber=9999999;
		MAX_accountNumber=100000000;
		MIN_customerName=3;
		MAX_customerName=15;
		moneyDeposit=5000;
		MIN_password=7;
	}
	public static int validateAccountNumber(int accNum) throws BankExceptionHandling {
		if((accNum)<MIN_accountNumber || (accNum)>=MAX_accountNumber)
			throw new BankExceptionHandling("Invalid account number");
		else
			return accNum;
		
	}
	public static String validateCustomerName(String custName) throws BankExceptionHandling {
		if((custName.length())<=MIN_customerName || (custName.length()>=MAX_customerName))
			throw new BankExceptionHandling("Invalid customer name");
		else
			return custName;
	}
	public static AccountType validateAccountType(String accountType) throws BankExceptionHandling {
		try{
			return valueOf(accountType.toUpperCase());
		}
		catch(Exception e)
		{
			throw new BankExceptionHandling("Invalid account type");
	}		
	}
	public static Date ConvertDate(String date) throws ParseException {
		Date d1= sdf.parse(date);
		Date d2=sdf.parse("01-04-2021");
		Date d3=sdf.parse("31-03-2022");
			
		if(d1.before(d2) || d1.after(d3)) {
			throw new ParseException("Invalid date",0);
		}
		    return d1;
		
	}
	
	
	public static double validateDepositMoney(double depositMoney) throws BankExceptionHandling {
		if(depositMoney<moneyDeposit)
			throw new BankExceptionHandling("Deposit  money should be greater than 5000 ");
		else
			return depositMoney;
	}
	
	public static String validatePassword(String password) throws BankExceptionHandling {
		if((password.length())<MIN_password)
			throw new BankExceptionHandling("Password is small");
		else
			return password;
	}
	
	public static boolean checkAccountDetail(int accNum,String password,HashMap<Integer, BankAccount> List) throws BankExceptionHandling{
	    BankAccount tempBankAccount= List.get(accNum);
	    if(tempBankAccount==null) {
	    	throw new BankExceptionHandling("account not found");
	    }else
	    {
	    	return (tempBankAccount.getPassword().equals(password));
	    }
	}
}
