package adt_users;

import adt_example.Oberbekleidung;
import adt_example.Schrank;
import adt_example.Schuh;
import adt_example.Tasche;
import adt_example.Waesche;

public abstract class SchwimmbadGast {
	
	
	public SchwimmbadGast(Schrank schrank) {
		this.schrank = schrank;
	}
	
	protected Schrank schrank;
	protected Schuh linkerSchuh, rechterSchuh;
	protected Oberbekleidung mantel, jacke, shirt, hose;
	protected Waesche w1, w2, w3, w4, strumpf1, strumpf2;
	protected Tasche tasche;
	
	abstract public void auskleiden();
	
	abstract public void ankleiden();
	
	protected void tascheMitnehmen() {
		// TODO Auto-generated method stub
		
	}

}
