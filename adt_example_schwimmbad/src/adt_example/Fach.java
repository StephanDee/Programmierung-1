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
public class Fach  {
	private int groesse;
	private Stack stack;
	
	public Fach() { 	
		this(5);
	}
	public Fach(int groesse ) {  
		stack = new Stack();
		this.groesse = groesse;
	}
	
	public void push(Object obj)  
	{
		if (stack.size()==groesse)  
			;       // Exception!! 
		stack.push(obj);
	}	
	public Object pop() throws LeerException
	{	
		try {
				return stack.pop();
		} catch (EmptyStackException ex) {
			throw new LeerException();
		}
						
		
	}
	public Object peek() 
	{
		return stack.peek(); // Exception!!
	}
}
