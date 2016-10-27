package adt_users;

import adt_example.Schrank;
import adt_example.VollException;

public class Schueler extends SchwimmbadGast {
	
	public Schueler(Schrank schrank) {
		super(schrank);
	}

	public void auskleiden() {

		tasche.hineintun(linkerSchuh);
		tasche.hineintun(linkerSchuh);
		tasche.hineintun(mantel);
		tasche.hineintun(jacke);
		tasche.hineintun(hose);
		tasche.hineintun(shirt);
		tasche.hineintun(strumpf1);
		tasche.hineintun(strumpf2);
		tasche.hineintun(w2);
		tasche.hineintun(w1);
		try {
			schrank.einstellen(tasche);
		} catch (VollException e) {
			tascheMitnehmen();
		}
	}

	@Override
	public void ankleiden() {
		// TODO Auto-generated method stub
	}
}
