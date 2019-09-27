
public class Son extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Father father =new Son();
		float amount=father.getAmount(60);
		System.out.println("amount to son:"+amount);
	}

	@Override
	public float getAmount(int percentage) {
		// TODO Auto-generated method stub
		return (super.credit-super.debit)*percentage/100;
	}
		

	}

