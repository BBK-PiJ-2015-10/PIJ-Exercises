import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Collections;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;

public class Tester {
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	/**
	* Below are 5 testNull methods with slight different signatures. It could have used Lambdas, maybe if time allows.
	*/
	/*
	public void testNull (String input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	
	public void testNull (Calendar input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	
	public void testNull (Set<Contact> input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	
	public void testNull (Integer id){
		if ( id == null) {
			throw new IllegalArgumentException();
		}
	}
	
	public void testNull (Contact input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	*/
	
	public void testNull (String input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	
	public void testNull2 (<?> input ){
	    if ( input == null) {
			throw new NullPointerException();
		}
	}
	
}