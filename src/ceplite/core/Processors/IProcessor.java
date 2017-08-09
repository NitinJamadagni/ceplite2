package ceplite.core.Processors;


/**
 * @author njamadag
 *
 */
public abstract class IProcessor {
	
	/*
	 * TODO : add implementation for input and output rules ingestion 
	 */
	protected String group;
	public enum PROCESSOR_TYPE {
		INPUT_PROCESSSOR , SIMPLE_PROCESSOR , OUTPUT_PROCESSOR , GENERIC_PROCESSOR
	}
	protected PROCESSOR_TYPE type; 
	public IProcessor(String _group, PROCESSOR_TYPE _type) {
		this.type = _type;
		this.group = _group;
	}
	
	public String getGroup() { return this.group; }
	public PROCESSOR_TYPE getType() { return this.type; }
	public abstract void initialize();
	public abstract void implement();
	public abstract void postProcess();
	
}
