package com.july21.java;

class BankofEng 
{
	public void BOE1 ()
	{
		System.out.println("Bank of Eng is parent bank instructing to provide loans");
	}
}

class barclays extends BankofEng
{
	public void Barc1 ()
	{
		System.out.println("Barclays inheriting properties of BOE to provide loans");
	}
}

class Habibbank1 extends BankofEng
{
	public void habib1 ()
	{
		System.out.println("habib inherit prop of BOE");
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		
		barclays b = new barclays ();
		b.BOE1();
		
		b.Barc1();
		System.out.println("******************");
		Habibbank1 h = new Habibbank1 ();
		h.BOE1();
	
		h.habib1();		
	}

}
