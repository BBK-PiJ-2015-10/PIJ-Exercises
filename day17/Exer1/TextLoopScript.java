public class TextLoopScript {

	public static void main(String args []){
		int count =0;
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))){
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println("      mode 0: without threats");
			System.out.println("      mode 1: with threats");	
		}
		else if (args[0].equals("0")){
			for (int i = 0; i < 10; i++){
				Runnable r = new TextLoop("Thread " + i);
				r.run();
			}
		} else  {
			   for (int i = 0; i < 10; i++){
				   Runnable r = new TextLoop("Thread " + i);
				   Thread t = new Thread(r);
				   t.start();
			   }
		 }
	}






}