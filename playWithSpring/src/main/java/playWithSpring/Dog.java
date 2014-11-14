package playWithSpring;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author gbatra
 *
 */
@Component
public class Dog {
	
	private Collar collar;
	private static final Logger log = Logger.getLogger("Dog");
	//private String name;
	
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
	public Dog(){
		
	}
	
	@Autowired(required = false)
	public Dog(Collar collar){
		this.collar = collar;
	}
	
	
	/**
	 * @return Collar
	 */
	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
		log.info("Called inside setCollar");
	}

	

}
