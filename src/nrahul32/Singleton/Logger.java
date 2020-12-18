package nrahul32.Singleton;

public class Logger {
	
	// This variable holds the single object that this class is meant to create
	private static Logger singleLogger;
	
	// Marking the constructor as private, so that no other class can use it to create objects
	private Logger(){}
	
	// Adding a static method for other classes to use, when they want to access the single object
	public static Logger getObject(){
		
		// Only when this method is called for the 1st time, an object is created. For subsequent calls, it returns the created object
		if(singleLogger == null){
			singleLogger = new Logger();
		}
		return singleLogger;
	}

}
