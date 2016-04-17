import java.util.List;
import java.util.LinkedList;
import java.util.function.Predicate;

public class StringUtils {

	public static List<String> allMatches(List<String> list, Predicate<String> operation){
		List<String> resultlist = new LinkedList<String>();
		for (int i=0;i<list.size();i++){
			if (operation.test(list.get(i))){
				resultlist.add(list.get(i));
			}
		}
		return resultlist;
	}


}