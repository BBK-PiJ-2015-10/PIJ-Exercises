public class Person {

   public String getInitials(String fullName) {
	   String result = "";
	   String [] words = fullName.split(" ");
	   //System.out.println(words[0]);
	   //System.out.println(words[1]);
	   //System.out.println(words[2]);
	   //System.out.println(words[0].length());
	   //System.out.println(words[1].length());
	   //System.out.println(words[2].length());
	   
	   for (int i=0; i <= words.length; i++) {
		   String nextInitial = "" +words[i].charAt(0);
		   result = result + nextInitial.toUpperCase();
	   }
	   
	   return result;
   }
   
   
   

}