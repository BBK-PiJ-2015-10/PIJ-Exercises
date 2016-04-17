import java.util.List;
import java.util.LinkedList;
import java.util.function.Function;

public class ElementtransformedList {

	public static <T> List<T> transformedList (List<T> inputlist, Function<T, T> evaluator){
		List<T> result = new LinkedList<T>();
		for (int i=0; i<inputlist.size();i++){
			result.add(evaluator.apply(inputlist.get(i)));
		}
		return result;
	}

}