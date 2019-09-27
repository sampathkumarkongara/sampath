
public class Break {

	public static void main(String[] args) {
		System.out.println("forloop:");
		for(int a=0;a<=5;a++) {
			 if(a==3) {
				 break;
			 }
			System.out.println("2*"+a+"="+2*a);
			}
		
		System.out.println("while loop:");
		int sub=10;
		while(sub>0) {
			System.out.print("  " +sub);
			sub=sub-2;
		}
	    System.out.println( );
	    
		System.out.println("do while:");
		int p=0;
		do {
			p=p+2;
			p++;
			//System.out.println(p);
		}while(p<=10);
	System.out.println(p);
		
	
		
		}

	}


