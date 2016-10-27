package adt_users;

import adt_example.Schrank;
import adt_example.VollException;

public class Jugendlicher extends SchwimmbadGast {
	
	public Jugendlicher(Schrank schrank) 
	{ super(schrank);  }
	
	@Override
	public void auskleiden() {
		schrank.einschieben(linkerSchuh);
		schrank.einschieben(rechterSchuh);
		schrank.ablegen(mantel);
		schrank.ablegen(jacke);
		schrank.ablegen(hose);
		schrank.ablegen(shirt);
		schrank.ablegen(strumpf1);
		schrank.ablegen(strumpf2);
		schrank.ablegen(w3);
		schrank.ablegen(w2);
		schrank.ablegen(w1);
		try {
			schrank.einstellen(tasche);
		}catch (VollException e)  { 
			tascheMitnehmen();
		}
	}

	@Override
	public void ankleiden() {
		// TODO Auto-generated method stub
		
	}
	
	

}
