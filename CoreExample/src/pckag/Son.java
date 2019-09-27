package pckag;

public class Son implements father, mother {

	public static  void main(String[] args) {
		father Father = new Son();
		float  amountfromfather =Father.getAmountofFather(30);
		
		mother Mother = new Son();
		float amountfrommother=Mother.getAmountofMother(20);
		
		 System.out.println("amount from father: " +amountfromfather);
		 System.out.println("amount from mother: " +amountfrommother);

	}

	@Override
	public float getAmountofMother(int percentage) {
		// TODO Auto-generated method stub
		return (mother.credit-mother.debit)*percentage/100;
	}

	@Override
	public float getAmountofFather(int percentage) {
		// TODO Auto-generated method stub
		return (father.credit-father.debit)*percentage/100;
	}

}
