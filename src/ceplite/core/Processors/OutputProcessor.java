package ceplite.core.Processors;

public abstract class OutputProcessor extends IProcessor {

	public OutputProcessor(String _group) {
		super(_group , PROCESSOR_TYPE.OUTPUT_PROCESSOR);
	}
	
	public abstract void outputStream();

}
