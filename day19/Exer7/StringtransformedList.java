import java.util.List;
import java.util.LinkedList;
import java.util.function.Function;

public class StringtransformedList {

	public static List<String> transformedList (List<String> inputlist, Function<String, String> evaluator){
		List<String> result = new LinkedList<String>();
		for (int i=0; i<inputlist.size();i++){
			result.add(evaluator.apply(inputlist.get(i)));
		}
		return result;
	}

}