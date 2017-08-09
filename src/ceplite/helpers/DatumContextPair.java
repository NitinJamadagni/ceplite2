package ceplite.helpers;

/**
 * @author njamadag
 *
 */
public class DatumContextPair {
	
	private Context context;
	private Datum datum;
	public DatumContextPair(Context _context , Datum _datum) {
		this.context = _context;
		this.datum = _datum;
	}
	public Context getContext() {return this.context;}
	public Datum getDatum() {return this.datum;}
	public void setContext(Context _context) {this.context = _context;}
	public void setDatum(Datum _datum) {this.datum = _datum;}

}
