package ceplite.exceptions;

public class ConfigParseException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4745348748416540307L;
	String exception;
	public ConfigParseException(String _exception) {
		this.exception = _exception;
	}
	@Override
	public String toString() {
		return "Error in parsing config file : " + exception;
	}
}
