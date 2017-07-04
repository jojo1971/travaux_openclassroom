package projet1;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

import javax.management.monitor.StringMonitor;

public class Reflexivite {

	public static void main(String[] args) {

		Class c = String.class;
		Field[] m = c.getDeclaredFields();
		
		System.out.println("La classe String a "+m.length+" champs");
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].getName());
		}
	}

}
