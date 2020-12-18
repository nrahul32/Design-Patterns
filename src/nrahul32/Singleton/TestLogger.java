package nrahul32.Singleton;

public class TestLogger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Calling the static getObject method multiple times to access the single object
		Logger log1 = Logger.getObject();
		Logger log2 = Logger.getObject();
		
		// Both the variables point to the same object
		System.out.println(log1.hashCode());
		System.out.println(log2.hashCode());

	}

}
