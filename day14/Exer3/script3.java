import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class script3 {

       public static void main ( String [] args) {
		   
	   script3 first = new script3(); 
	   first.launch();	
		   
	   }
	   
	   public void launch (){
		   
		   Exer3 test = new Exer3();
		   //test.hailstone(3, null);
		   List<Integer> output = new LinkedList<Integer>();
		   output = test.hailstone(9, null);
		   //System.out.println(output.size());
		   for (int i=0; i< output.size();i++) {
			   System.out.println(output.get(i));
		   }
		   
		   
	   }
}	   
		