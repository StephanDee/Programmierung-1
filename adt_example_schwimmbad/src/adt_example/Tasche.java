package adt_example;

import java.util.EmptyStackException;
import java.util.Stack;

/** Beispielcode zur Verdeutlichung von Konzepten
 *  Kein lauffähiger oder sinnvolles Programm!
 *  Nur zum LV-internen Gebrauch bestimmt!
 *  
 * @author smi
 *
 */
public class Tasche {

		private Stack inhalt = new Stack();
		
		public void hineintun(Object obj) {
			inhalt.push(obj);
		}
		
		public Object entnehmen() // throws EmptyStackException  
		{
			return inhalt.pop();				
		}
}
