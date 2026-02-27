abstract class BankAccount {
    //2. ENCAPSULATION: Private fields protected from direct access
    private String accountNumber;
    private double balance;
    
    //CSS-style Constants (ANSI Colors) for "Styling" the output
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String BG_GRAY = "\u001B[47m\u001B[30m";
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        }
        
        //Abstract method: Interest calculation differd by account type
        public abstract void calculateInterest();
        
        //Encapsulation: Getter for balance
        public double getBalance(){
            return balance;
            }
            
            //Encapsulation: Controlled method to modify balance
            protected void deposit(double amount) {
                if (amount>0) balance += amount;
                }
                
                public void displayAccountInfo() {
                    System.out.println(BG_GRAY + " ACCOUNT ID: " + accountNumber + " " + RESET) 
                    System.out.println(BLUE + "Current Balance: $" + balance + RESET);
                    }
    }
    
    //3. INHERITANCE: SavingsAccount 'is-a' BankAccount
    class SavingsAccount extends BankAccount {
        private double interestRate = 0.05;
        
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
            }
            
            //4. POLYMORPHISM: Specific implementation of interest for Savings
            @Override
            public void calculateInterest() {
                double interest = getBalance() * interestRate;
                deposit(interest);
                System.out.println(GREEN + BOLD + "Savings Interest Added: $" + interest + RESET);
            }
        }
        
        class CheckingAccount extends BankAccount {
            private double fee = 2.50;
            
            public CheckingAccount(String accountNumber, double balance) {
                super(accountNumber, balance);
                }
                
                //4. POLYMORPHISM: Specific implementation of "interest" (or lack thereof) for checking
                @Override
                public void calculateInterest() {
                    System.out.println(RED + "Checking accountd do not earn interest.Processing fee: $" + fee + RESET);
                    }
            }
            
            public class Main {
                public static void main(String[] args) {
                    BankAccount mySavings = new SavingsAccount(accountNumber: "SAV_9910", balance: 1000.00);
                    BankAccount myChecking = new CheckingAccount(accountNumber: "CHK-4452", balance: 500.00);
                    
                    System.out.println("\n" + BankAccount.BOLD + "--- BANKING SYSTEM DASHBOARD ---" + BankAccount.RESET);
                    
                    mySavings.displayAccountInfo();
                    mySavings.calculateInterest();
                    System.out.println("Updated Savings: $" + mySavings.getBalance());
                    
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    
                    myChecking.displayAccountInfo();
                    myChecking.calculateInterest();
                    
                    System.out.println(BankAccount.BOLD + "Transaction Complete" + BankAccount.RESET);
                    }
                }
