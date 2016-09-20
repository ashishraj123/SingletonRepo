package thread.singleton;

import java.util.Collections;
import java.util.List;

public class SingletonImpl {

	private static List<Employee> singletonList = null;

	protected SingletonImpl() {

	}
	// Lazy Initialization (If required then only)
	public static List<Employee> getSingletonInstance() {
		if (singletonList == null) {
			// Thread Safe. Might be costly operation in some case
			synchronized (SingletonImpl.class) {
				if (singletonList == null) {
					singletonList = Collections.singletonList(new Employee());
				}
			}
		}
		return singletonList;

	}

}
