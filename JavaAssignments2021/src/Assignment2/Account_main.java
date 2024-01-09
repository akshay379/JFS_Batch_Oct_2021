package Assignment2;

public class Account_main {

		public static void main(String [] args)
		{
			Bank newBank= new Bank();
			newBank.showTotal();
			Bank savingAc=new SavingAccount();
			Bank currentAc=new CurrentAccount();
			savingAc.addAmt(1000);
			currentAc.addAmt(2000);
			
			newBank.addToTotalBankCash(currentAc);
			newBank.addToTotalBankCash(savingAc);
			
			currentAc.showTotal();
			savingAc.showTotal();
			newBank.showTotal();
			
			
			
		}
	}

