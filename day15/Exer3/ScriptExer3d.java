public class ScriptExer3d {

	public static void main (String[] args){
		
		ScriptExer3d script = new ScriptExer3d();
		script.launch();
		
	}
	
	public void launch (){
		
		Exer3d calcmean = new Exer3d();
		System.out.println(calcmean.mean());
		
	}

}