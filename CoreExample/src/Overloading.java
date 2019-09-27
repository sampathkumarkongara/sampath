
public class Overloading {
	int i,j;
	Overloading(int a,int b){
		i=a;
		j=b;
	}
	void show() {
		System.out.println("i and j"+i+" "+j);
	}
	class sub extends Overloading{
		int k;

		sub(int a, int b, int c) {
			super(a, b);
			k=c;
		}
		void show() {
			System.out.println("k:"+k);
		}
	}
     class Override{
    	 public void main(String[] args) {
		
		
	}

}
}
