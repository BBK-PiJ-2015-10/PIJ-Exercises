public class School3 <T> {
	public <T> T returnFirstElment(List<T> stack) {
		return stack.get(0);
		}
	public int returnElementCont(List<? extends Person> stack){
		return stack.size();
		}
}		