
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import ceplite.core.Workflow.Workflow;
import ceplite.core.Workflow.WorkflowRunner;
import ceplite.exceptions.ConfigParseException;
import ceplite.exceptions.GenericException;


/**
 * @author njamadag
 *
 */
public class CEPManager {
	
	private final static Logger logger = LogManager.getLogger(CEPManager.class);
	private Workflow workflow;
	
	/*
	 * Configuration variables
	 */
	private boolean LOGGING_ENABLED = true;
	private boolean DISTRIBUTED = false;
	private HashMap<String, String> NODE_MAP;
	
	public CEPManager(String configFilePath) throws ConfigParseException, IOException, ParseException{
		
		
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(new File(configFilePath));
		JSONObject config = (JSONObject)parser.parse(reader);
		reader.close();
		this.NODE_MAP = new HashMap<String,String>(){
			private static final long serialVersionUID = -797995038726404148L;

			@Override
			public String toString() {
				StringBuilder returnValue = new StringBuilder("");
				for (Entry<String,String> entry : this.entrySet()) {
					returnValue.append(entry.getKey());returnValue.append(":");returnValue.append(entry.getValue()+"||");
				}
				return returnValue.toString();
			}
		};
		populateConfigVariables(config);
						
	}
	
	@SuppressWarnings("unchecked")
	private void populateConfigVariables(JSONObject config) throws ConfigParseException {
		
		this.LOGGING_ENABLED = (config.get("LOGGING_ENABLED") != null) ? (Boolean)config.get("LOGGING_ENABLED") : false;
		
		this.DISTRIBUTED = (config.get("DISTRIBUTED") != null) ? (Boolean)config.get("DISTRIBUTED") : false;
		
		if (this.DISTRIBUTED) {
			if (config.get("NODE_MAP") == null) {throw new ConfigParseException("DISTRIBUTED is enabled, but node map isn't supplied");}
			JSONObject nodemap = (JSONObject)config.get("NODE_MAP");
			for (String key : (Set<String>)nodemap.keySet()) {
				NODE_MAP.put(key, (String)nodemap.get(key));
			}
		}
		
	}
	
	public void addWorkflow(Workflow _workflow) {
		workflow = _workflow;
	}
	
	public void run() throws GenericException {
		
		if (LOGGING_ENABLED) {
			logger.info("Starting CEPManager on node : " + NODE_MAP.get("MASTER"));
			logger.info("Staring the workflow on :" + NODE_MAP.toString());
		}
		
		if (this.workflow == null) {
			throw new GenericException("Initialize workflow before starting it!" , this.getClass().getName());
		}
		if (DISTRIBUTED)
			WorkflowRunner.start(workflow , NODE_MAP , DISTRIBUTED , LOGGING_ENABLED);
		else
			WorkflowRunner.start(workflow , LOGGING_ENABLED);
		
		
				
	
	}
	
}
