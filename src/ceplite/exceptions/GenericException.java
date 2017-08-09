package ceplite.exceptions;

public class GenericException extends Exception{
	String exception_details;
	String filename;
	
	public GenericException(String _exception , String _filename) {
		this.exception_details = _exception;
		this.filename = _filename;
	}
	
	@Override
	public String toString() {
		return "Error in file : " + filename + " : " + exception_details;
	}
	
	
}
