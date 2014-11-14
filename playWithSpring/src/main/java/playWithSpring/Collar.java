package playWithSpring;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Collar {
	private int size=5;
	private static final Logger log = Logger.getLogger("Collar");

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void logMessage(){
		log.info("LogMessage invoked");
	}

}
