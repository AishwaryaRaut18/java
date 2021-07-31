/*1.  Create new account
Input : account details

2.  Display  details of all accounts 

3. Get acct summary --- 
Input  : acct number 
o/p --- error via custom exception if account doesn't exist OR  account details

4.Close account
Input  : acct number 
o/p --- error via custom exception if account doesn't exist OR  ac */
package newTester;
import java.util.Scanner;
import day12fresh.BankAccount;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import static NewUtils.ValidationRule.*;

public class Tester{
	public static SimpleDateFormat sdf;
		static {
			sdf=new SimpleDateFormat("dd-MM-yyy");
		}	
	 	static int accountNumber;
		static String customerName;
		static String accountType;
		static String date;
		static double amount;
		static double  rate;
		static String password;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, BankAccount> account1=new HashMap<>();
	
		BankAccount BA;
		boolean exit=false;
		
		while(!exit) {
			
			System.out.println("1.Create new account \n2.Display \n3.Account Detail \n4.Close account \n5.exit \nSelect option");
	
		try {
			switch(sc.nextInt()){
				
			case 1:System.out.println("Enter Account Number(8 digit),customer name,account type,creation date,money deposit and password");
				   accountNumber=sc.nextInt();
		        	customerName=sc.next();
		        	accountType=sc.next();
		        	date=sc.next();
		        	rate=sc.nextDouble();
		           amount=rate;
		        	password=sc.next();	
				BA=new BankAccount(validateAccountNumber(accountNumber), validateCustomerName(customerName), validateAccountType(accountType), ConvertDate(date), validateDepositMoney(amount), validatePassword(password));
					account1.putIfAbsent(accountNumber, BA);
						break;
				
			case 2:
				
					for(BankAccount b :account1.values())
						System.out.println(b);
					System.out.println("");
					
					break;
				
				case 3:{
					System.out.println("Enter account number and password");
					int accN=sc.nextInt();
					boolean check=checkAccountDetail(accN,sc.next(),account1);
					if(check==true) {
						
					System.out.println("Your account detail:");
						System.out.println(account1.get(accN));
					boolean exit1=false;
					while(!exit1) {
					System.out.println("1.Withdraw funds   2.Deposit funds   3.Transfer funds enter 4.Display Balance 5.Exit\nEnter option");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter amount you want to withdraw:");
						double withdrawMoney=sc.nextDouble();
						if(withdrawMoney<=((amount)-100)) {
							if(withdrawMoney<=50000) {
							amount=(amount-withdrawMoney);
						
							}
							else {
								System.out.println("One time withdrawal limit is 50000");
							}
						}
						else {
							System.out.println("Fund not sufficient, yoou have to keep atleast 100 rupees in account");
						}
						break;
					case 2:
						System.out.println("Enter amount you want to deposit:");
						double depositMoney=sc.nextDouble();
						amount=amount+depositMoney;
						break;
					case 3:
						System.out.println("Enter amount you want to transfer:");
						double transferAmount=sc.nextDouble();
						if(transferAmount<=(amount)) {
							if(transferAmount<=10000) {
							amount=amount-transferAmount;
							}
							else {
								System.out.println("One time transfer limit is 50000");
							}
						}
						else {
							System.out.println("Fund not sufficient");
						}
						
                       break;
                       
					case 4: System.out.println("Balance: "+amount);
					
					break;
					
					case 5:
						exit1=true;
						break;
					}
					BankAccount temp=account1.get(accN);
						temp.setBalance(amount);
						
					Date date1=sdf.parse(date);
					LocalDate localdate=LocalDate.now();
					String ld=localdate.toString();
					Date date2=sdf.parse(ld);
					long difference=date2.getTime()-date1.getTime();
					int year=Math.round((difference/(1000*60*60*24*365)));
					if(year>1) {
					double SI=((year*8*rate)/100);
					amount=amount+SI;
					}
					}
				}
				}
				break;
				case 4:
					
					System.out.println("Enter the account number and password:");
					int account=sc.nextInt();
					boolean checkAgain=checkAccountDetail(account,sc.next(),account1);
					if(checkAgain==true) {
						account1.remove(account);
						System.out.println("Bank Account removed");
					}
					break;
				
				case 5:
					exit=true;
					break;
				
				default:
					System.out.println("Invalid option");
					System.exit(0);
						
			}
			}
		catch(Exception e){
			System.out.println(e);
		}
		sc.nextLine();
		}
		
		sc.close();
		}

}
