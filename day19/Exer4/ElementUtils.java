public class ElementUtils {

	//Since you are not creating the class type <T>, we add the extra <T> to the method.

	public static <T> T betterElement(T element1, T element2, TwoElementPredicate<T> operation){
		if (operation.isBetter(element1,element2)){
			return (element1);
		}
		else {
			return(element2);
	
		}
	}

	


}