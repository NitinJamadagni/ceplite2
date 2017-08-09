import ceplite.core.CEPManager;

/**
 * @author njamadag
 *
 */
public class Tester {

	public static void main(String[] args) {
		try {
			
			CEPManager manager = new CEPManager("C:\\Users\\njamadag\\eclipse-workspace\\CEPCore\\Configs\\configs.json");
			manager.run();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
