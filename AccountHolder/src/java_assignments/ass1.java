package java_assignments;
import java.util.Scanner;


class AccountHolder{

	
		private int acno;
		private String acname;
		private float balance;
		
		public AccountHolder()
		{
		
		}

		public AccountHolder(int acno, String acname, float balance) {
		
			this.acno = acno;
			this.acname = acname;
			this.balance = balance;
		}

		public int getAcno() {
			return acno;
		}

		public void setAcno(int acno) {
			this.acno = acno;
		}

		public String getAcname() {
			return acname;
		}

		public void setAcname(String acname) {
			this.acname = acname;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}
	

		
		public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Amount deposited successfully.");
	    }
		
		 public void withdraw(double amount) {
		        if (amount <= balance) 
		        {
		            balance -= amount;
		            System.out.println("Amount withdrawn successfully.");
		        }
		        else 
		        {
		            System.out.println("Insufficient balance. Unable to withdraw amount.");
		        }
		    }
		
}

public class ass1
{ 
	static int i;
	public static void main(String[] args)
	
	
	{
		int count=0;
		Scanner sc= new Scanner(System.in);
		AccountHolder[] arr=new AccountHolder[10];
		
		
		while (true) {
          
            System.out.println("1. Add record for account holder");
            System.out.println("2. Display details of all account holders");
            System.out.println("3. Deposit an amount into particular account");
            System.out.println("4. Withdraw an amount from particular account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                		System.out.print("Enter account number: ");
                		int accountNumber = sc.nextInt();
                		sc.nextLine();
                		System.out.print("Enter account holder name: ");
                		String AccountHolder1Name = sc.nextLine();
                		System.out.print("Enter account balance: ");
                		float accountBalance = sc.nextFloat();
                		AccountHolder AccountHolder1 = new AccountHolder(accountNumber,AccountHolder1Name,accountBalance);
                		arr[count++] = AccountHolder1;
                		System.out.println("Record added successfully.");
                		break;
        
                case 2:		
                	    for (int i = 0; i < count; i++) 
                	    {
                	    	AccountHolder holder = arr[i];
                	    	System.out.println("Account Number: " + holder.getAcno());
                	    	System.out.println("Account Holder Name: " + holder.getAcname());
                	    	System.out.println("Account Balance: " + holder.getBalance());
                	    	
                	    }
	
                	    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = sc.nextInt();
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextFloat();
                    boolean depositFound = false;

                    for (int i = 0; i < count; i++) {
                        AccountHolder depositHolder = arr[i];
                        if (depositHolder.getAcno() == depositAccountNumber) {
                            depositHolder.deposit(depositAmount);
                            depositFound = true;
                            break;
                        }
                    }

                    if (!depositFound) {
                        System.out.println("Account number not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = sc.nextInt();
                    System.out.print("Enter the amount to withdraw: ");
                    float withdrawAmount = sc.nextFloat();
                    boolean withdrawFound = false;

                    for (int i = 0; i < count; i++) {
                        AccountHolder withdrawHolder = arr[i];
                        if (withdrawHolder.getAcno() == withdrawAccountNumber) {
                            withdrawHolder.withdraw(withdrawAmount);
                            withdrawFound = true;
                            break;
                        }
                    }

                    if (!withdrawFound) {
                        System.out.println("Account number not found.");
                    }
                    break;
                	
                case 5:
                	sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            	
	
}
            
                              
}
   
}
	
}
