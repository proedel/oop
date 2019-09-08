package oop;

public class Main {
	public static void main(String[] srgs) {
		//Car porsche = new Car();
//		Car tesla = new Car();
	//	porsche.setModel("carrera");
		//System.out.println("Porsche model is " + porsche.getModel());
		
		/*SimpleCalculator calc = new SimpleCalculator();
		calc.setFirstNumber(12);
		calc.setSecondNumber(6);
		System.out.println(calc.getAdditionResults());*/
	/*
		Person person = new Person();
		person.setAge(24);
		person.setFirstName("Payton");
		person.setLastName("Roedel");
		
		System.out.println(person.getFullName());
		System.out.println(person.isTeen()); */
		
		BankAccount bank = new BankAccount();
		
		System.out.println(bank.getBalance() + " is in checking.");
		bank.depositFunds(200);
		bank.withdrawFunds(1200);
		System.out.println(bank.getBalance()+ "$ is in checking.");
		
		System.out.println("");
		BankAccount savings = new BankAccount();
		
		System.out.println(savings.getBalance() + " is in savings.");
		savings.withdrawFunds(600);
		System.out.println(savings.getBalance() + "$ is in savings.");
		
		BankAccount myBank = new BankAccount("901 601 4155", 2600, "Payton", "pro");
		System.out.println(myBank.getBalance());
		
		
		
		
	}
	
	
}
