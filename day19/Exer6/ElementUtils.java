import java.util.List;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ElementUtils {

	public static <T> List<T> allMatches(List<T> list, Predicate<T> operation){
		List<T> resultlist = new LinkedList<T>();
		for (int i=0;i<list.size();i++){
			if (operation.test(list.get(i))){
				resultlist.add(list.get(i));
			}
		}
		return resultlist;
	}


}