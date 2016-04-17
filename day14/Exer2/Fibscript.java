public class Fibscript {

	public static void main ( String[] args){
		
		Fibscript one = new Fibscript();
		one.launch();
		
	}
	
	public void launch () {
		
		Exer1a fibo1 = new Exer1a();
		System.out.println(fibo1.fib(4));
		
		Exer1b fibo2 = new Exer1b();
		System.out.println(fibo2.fib(4));
		
		
		
		
	}

}