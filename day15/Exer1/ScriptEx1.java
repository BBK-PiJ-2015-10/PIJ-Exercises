public class ScriptEx1 {

	public static void main (String [] args) {
		
		ScriptEx1 one = new ScriptEx1();
		one.launch2();
	}

	public void launch2(){
		
		Exer1 two = new Exer1();
		Exer1b three = new Exer1b();
		Exer1c four = new Exer1c();
		two.launch(2);
		System.out.println("Now without try and catch");
		three.launch(2);
		System.out.println("Now with try and catch, but no stack printout");
		four.launch(2);
		
		
	}
}