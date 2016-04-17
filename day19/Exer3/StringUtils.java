public class StringUtils {

	public static int eChecker (String str1, String str2){
		int result =0;
			 if ( (str1.contains("e")) &&  (!str2.contains("e"))) {
				 result =-1;
			 } else if ( (!str1.contains("e")) &&  (str2.contains("e"))) {
				 result =1;
			 }
			 return result;
	}
	
	public static String betterString(String str1, String str2, TwoStringPredicate operation){
		if (operation.isBetter(str1,str2)){
			return (str1);
		}
		else {
			return (str2);
		}
	}

	


}