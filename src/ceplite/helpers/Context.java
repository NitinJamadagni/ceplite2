package ceplite.helpers;

/**
 * @author njamadag
 *
 */
public class Context {

	/*
	 * Context variables , add more later like delay factor , other options . 
	 * For now only the event name is passed in the Context
	 */
	private String eventName;
	
	public Context(String _eventName) {
		this.eventName = _eventName;
	}
	
	public String getEventName() {return this.eventName;}
	public void setEventName(String _eventName) {this.eventName = _eventName;}

}
