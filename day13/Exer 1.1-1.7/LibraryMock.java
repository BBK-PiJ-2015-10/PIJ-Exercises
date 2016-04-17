public class LibraryMock implements Library {

	private String libraryname;
	
	public LibraryMock(String libraryname){
		this.libraryname = libraryname;
	}
	
	public int getID() {
		return 100;
	}
	
	public String getLibraryName (){
		return "British Library";
	}
	
	

}