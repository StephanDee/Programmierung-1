package adt_example;

/** Beispielcode zur Verdeutlichung von Konzepten
 *  Kein lauffähiger oder sinnvolles Programm!
 *  Nur zum LV-internen Gebrauch bestimmt!
 *  
 * @author smi
 *
 */

public class BasisSchrank {
	
	private int schluesselnummer;
	
	private boolean offen;
	private Fach buegel;
	private Fach regal;
	private Fach schuhfach;
	private Tasche taschenfach = null;
	
	// GETTER UND SETTER
	public int getSchluesselnummer() {
		return schluesselnummer;
	}
	public void setSchluesselnummer(int schluesselnummer) {
		this.schluesselnummer = schluesselnummer;
	}
	private boolean isOffen() {
		return offen;
	}
	public void setOffen(boolean offen) {
		this.offen = offen;
	}
	
	//ÖFFENTLICHE ZUGRIFFSMETHODEN
	public void oeffnen() {
		setOffen(true);
	}
	public void schliessen() {
		setOffen(false);
	}
	
	public void aufhaengen(Oberbekleidung kstueck) 
	{
		
	}
	public Oberbekleidung abnehmen() 
	{
		return null;
	}
	public void ablegen(Waesche wstueck)
	{
		
	}
	public Waesche aufnehmen() 
	{
		return null;
	}
	public void einschieben(Schuh schuh)
	{
		
	}
	public Schuh herausziehen()
	{
		return null;
	}
	public void einstellen(Tasche tasche) throws VollException 
 {
		if (taschenfach != null) throw new VollException();
		taschenfach = tasche;

	}
	

	
	public Tasche herausholen() throws LeerException 
	{
		if (taschenfach==null)throw new LeerException();
		Tasche t = taschenfach;
		taschenfach=null;
		return t;			
	}
	
	
	

}
