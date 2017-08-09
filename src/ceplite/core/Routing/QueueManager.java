package ceplite.core.Routing;

import java.util.HashMap;

/**
 * @author njamadag
 *
 */
public class QueueManager {
	
	/*
	 * Logic : Each 'group' of processors have a Queue for each Event.
	 * TODO : find a better strategy for this
	 */
	HashMap<String, HashMap<String,PollingQueue>> queueManager = new HashMap<>();
}
