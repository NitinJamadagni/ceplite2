package ceplite.core.Processors;

public abstract class SimpleProcessor extends IProcessor{

	public SimpleProcessor(String _group) {
		super(_group , PROCESSOR_TYPE.SIMPLE_PROCESSOR);
	}

}
