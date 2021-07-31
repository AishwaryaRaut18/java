/*
 Fresh scenario
Simple Banking system.
Create BankAccount class to store
acctNo(int), customer name, account type (enum : SAVING,CURRENT,FD,LOAN) , creationDate(Date),balance.
Unique ID : acctNo
Add suitable constructor & toString.
Add business logic methods for the following
Withdraw funds
Deposit funds
Transfer Funds
Apply interest (Use Simple interest formula = period*principle*rate /100) 
Update the account balance by the applied simple interest

Store bank account details in a suitable data structure ,which ensures constant time performance
for adding data n retrieving data or for searching.
 */
package day12fresh;
import java.util.Date;

public class BankAccount {
private int acctNo;
private String customerName;
private AccountType accountType;
private Date creationDate;
private double balance;
private String password;
//Account Number,customer name,account type,creation date,money deposit and password
public BankAccount(int acctNo, String customerName, AccountType accountType, Date creationDate, double balance,String password) {
	super();
	this.acctNo = acctNo;
	this.customerName = customerName;
	this.accountType = accountType;
	this.creationDate = creationDate;
	this.balance = balance;
	this.password=password;
}



public BankAccount(int acctNo) {
	super();
	this.acctNo = acctNo;
}




public void setAcctNo(int acctNo) {
	this.acctNo = acctNo;
}



public void setCustomerName(String customerName) {
	this.customerName = customerName;
}



public void setAccountType(AccountType accountType) {
	this.accountType = accountType;
}



public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}



public void setBalance(double balance) {
	this.balance = balance;
}



public void setPassword(String password) {
	this.password = password;
}



public int getAcctNo() {
	return acctNo;
}



public String getCustomerName() {
	return customerName;
}



public AccountType getAccountType() {
	return accountType;
}



public Date getCreationDate() {
	return creationDate;
}



public double getBalance() {
	return balance;
}



public String getPassword() {
	return password;
}



@Override
public String toString() {
	return "BankAccount [acctNo= " + acctNo + ", customerName= " + customerName + ", accountType= " + accountType
			+ ", creationDate= " + creationDate + ", balance= " + balance + "]";
}



}
