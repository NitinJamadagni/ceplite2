package ceplite.core.Processors;

public abstract class InputProcessor extends IProcessor {

	public InputProcessor(String _group) {
		super(_group , PROCESSOR_TYPE.INPUT_PROCESSSOR);
	}

	public abstract void getStream();
		
}
