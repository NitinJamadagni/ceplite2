package ceplite.core.Processors;

public class GenericProcessor extends IProcessor {

	public GenericProcessor(String _group) {
		super(_group , PROCESSOR_TYPE.GENERIC_PROCESSOR);
	}
	
	public void getStream() {}

	@Override
	public void initialize() {
		
	}

	@Override
	public void implement() {
		
	}

	@Override
	public void postProcess() {
		
	}
	
	public void outputStream() {}

}
