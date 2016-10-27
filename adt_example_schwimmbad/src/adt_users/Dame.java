package adt_users;

import adt_example.Schrank;
import adt_example.VollException;

public class Dame extends SchwimmbadGast {
	
	public Dame(Schrank schrank)
	{ super(schrank); }
	
	@Override
	public void auskleiden() {
		schrank.einschieben(linkerSchuh);
		schrank.einschieben(rechterSchuh);
		schrank.aufhaengen(mantel);
		schrank.aufhaengen(jacke);
		schrank.aufhaengen(hose);
		schrank.aufhaengen(shirt);
		schrank.ablegen(strumpf1);
		schrank.ablegen(strumpf2);
		schrank.ablegen(w3);
		schrank.ablegen(w2);
		schrank.ablegen(w1);
		try {
			schrank.einstellen(tasche);
		} catch (VollException e) {
			// kann einer Dame nicht passieren
		}
	}

	@Override
	public void ankleiden() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
