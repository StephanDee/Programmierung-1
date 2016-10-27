package adt_example;

/** Beispielcode zur Verdeutlichung von Konzepten
 *  Kein lauff‰higer oder sinnvolles Programm!
 *  Nur zum LV-internen Gebrauch bestimmt!
 *  
 * @author smi
 *
 */

public class Schrank {
	
	private int schluesselnummer;
	private boolean offen;
	private Fach buegel;
	private Fach regal;
	private Fach schuhfach;
	private Tasche taschenfach;
	
	// GETTER UND SETTER
	public int getSchluesselnummer() {
		return schluesselnummer;
	}
	public void setSchluesselnummer(int schluesselnummer) {
		this.schluesselnummer = schluesselnummer;
	}
	public boolean isOffen() {
		return offen;
	}
	private void setOffen(boolean offen) {
		this.offen = offen;
	}
	
	//÷FFENTLICHE ZUGRIFFSMETHODEN - EXCEPTIONS BEACHTEN!
	public void oeffnen() {
		setOffen(true);
	}
	public void schlieﬂen() {
		setOffen(false);
	}	
	public void aufhaengen(Oberbekleidung kstueck) 
	{
		buegel.push(kstueck);
	}
	public Oberbekleidung abnehmen() 
	{
		return (Oberbekleidung)(buegel.pop());
	}
	public void ablegen(Kleidung wstueck)
	{
		regal.push(wstueck);
	}
	public Kleidung aufnehmen() 
	{
		return (Kleidung)(regal.pop());
	}
	public void einschieben(Schuh schuh)
	{
		schuhfach.push(schuh);
	}
	public Schuh herausziehen()
	{
		return (Schuh)(schuhfach.pop());
	}
	public void einstellen(Tasche tasche) throws VollException
	{	
		if (taschenfach!=null) throw new VollException();
		taschenfach = tasche;		
	}
	public Tasche herausholen() throws LeerException 
	{
		if (taschenfach==null) throw new LeerException();
		Tasche tasche = taschenfach; 
		taschenfach = null;
		return taschenfach;		
	}
}
