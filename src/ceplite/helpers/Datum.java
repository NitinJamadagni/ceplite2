package ceplite.helpers;

/**
 * @author njamadag
 *
 */
public class Datum {
	
	private Object object;
	public Datum(Object _object) {
		this.object = _object;
	}
	public Object getData() {return this.object;}
	public void setData(Object _object) {this.object = _object;}
}
