

import java.util.HashMap;

public class TabletHashMap {
	public static HashMap<String, Tablet> apple = new HashMap<String, Tablet>();
	public static HashMap<String, Tablet> microsoft = new HashMap<String, Tablet>();
	public static HashMap<String, Tablet> samsung = new HashMap<String, Tablet>();
	
	public static String string_apple = "Apple";
	public static String string_microsoft = "Microsoft";
	public static String string_samsung = "Samsung";
	
	public TabletHashMap() {
		if(apple.isEmpty()){
			Tablet apple_ipadpro = new Tablet("iPad Pro",799.00,"ipadpro.jpg","Apple","New",10);
			Tablet apple_ipadair3 = new Tablet("iPad Air 2",399.00,"ipadair3.jpg","Apple","New",10);
			Tablet apple_ipadmini4 = new Tablet("iPad Mini 4",399.00,"ipadmini4.jpg","Apple","New",10);
			
			apple.put("apple_ipadpro", apple_ipadpro);
			apple.put("apple_ipadair3", apple_ipadair3);
			apple.put("apple_ipadmini4", apple_ipadmini4);
		}
		if(microsoft.isEmpty()){
			Tablet microsoft_surface4 = new Tablet("Surface Pro 4",899.00,"surface4.jpg","Microsoft","New",10);
			Tablet microsoft_surface3 = new Tablet("Surface Pro 3",799.00,"surface3.jpg","Microsoft","New",10);
			
			microsoft.put("microsoft_surface4", microsoft_surface4);
			microsoft.put("microsoft_surface3", microsoft_surface3);
		}
		if(samsung.isEmpty()){
			Tablet samsung_TabPro = new Tablet("Galaxy TabPro S",899.00,"TabPro.jpg","Samsung","New",10);
			Tablet samsung_galaxyview = new Tablet("Galaxy View",549.00,"galaxyview.jpg","Samsung","New",10);
			
			samsung.put("samsung_TabPro", samsung_TabPro);
			samsung.put("samsung_galaxyview", samsung_galaxyview);

		}
	}
}
