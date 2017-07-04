package projet1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflexivite_3 {
	public static void main(String[] args) {                                
		  String nom = Paire.class.getName();
		  try {
		    //On cr�e un objet Class
		    Class cl = Class.forName(nom);
		    //Nouvelle instance de la classe Paire
		    Object o = cl.newInstance();
		                                
		    //On cr�e les param�tres du constructeur
		    Class[] types = new Class[]{String.class, String.class};
		    //On r�cup�re le constructeur avec les deux param�tres
		    Constructor ct = cl.getConstructor(types);      
		    //On instancie l'objet avec le constructeur surcharg� !
		    Object o2 = ct.newInstance(new String[]{"valeur 1 ", "valeur 2"} );

		    //On va chercher la m�thode toString, elle n'a aucun param�tre
		    Method m = cl.getMethod("toString", null);
		    //La m�thode invoke ex�cute la m�thode sur l'objet pass� en param�tre
		    //Pas de param�tre, donc null en deuxi�me param�tre de la m�thode invoke !
		                                
		    System.out.println("----------------------------------------");
		    System.out.println("M�thode " + m.getName() + " sur o2: " +m.invoke(o2, null));
		    System.out.println("M�thode " + m.getName() + " sur o: " +m.invoke(o, null));
		                                
		  } catch (SecurityException e) {
		    e.printStackTrace();
		  } catch (IllegalArgumentException e) {
		    e.printStackTrace();
		  } catch (ClassNotFoundException e) {
		    e.printStackTrace();
		  } catch (InstantiationException e) {
		    e.printStackTrace();
		  } catch (IllegalAccessException e) {
		    e.printStackTrace();
		  } catch (NoSuchMethodException e) {
		    e.printStackTrace();
		  } catch (InvocationTargetException e) {
		    e.printStackTrace();
		  }
		
}
}
