import ceplite.core.CEPManager;

/**
 * @author njamadag
 *
 */
public class Tester {

	public static void main(String[] args) {
		try {
			String configFile = "C:\\Users\\njamadag\\eclipse-workspace\\CEPCore\\Configs\\configs.json";
			CEPManager manager = new CEPManager(configFile);
			manager.run();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
