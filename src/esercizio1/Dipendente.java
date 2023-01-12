package esercizio1;

public class Dipendente {
	private static double stipendioBase = 1000;
	private static int matricola;
	private static double stipendio;
	private static double importoOrarioStraordinario;
	private static Livello livello;
	private static Dipartimento dipartimento;
	//------------------------- constructors -------------------------
	// constructor 1
	public Dipendente(int matricola, Dipartimento dipartimento) {
		//super();
		Dipendente.matricola = matricola;
		Dipendente.dipartimento = dipartimento;
		Dipendente.stipendio = stipendioBase;
		Dipendente.importoOrarioStraordinario = 30;
		Dipendente.livello = Livello.OPERAIO;
	}
	
	// constructor 2
	public Dipendente(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario,
			Livello livello, Dipartimento dipartimento) {
		//super();
		Dipendente.stipendioBase = stipendioBase;
		Dipendente.matricola = matricola;
		Dipendente.stipendio = stipendio;
		Dipendente.importoOrarioStraordinario = importoOrarioStraordinario;
		Dipendente.livello = livello;
		Dipendente.dipartimento = dipartimento;
	}
	
	//------------------------- get -------------------------
	public double getStipendioBase() {
		return stipendioBase;
	}
	
	public int getMatricola() {
		return matricola;
	}
	
	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	
	public Livello getLivello() {
		return livello;
	}
	
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	//------------------------- set -------------------------
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		Dipendente.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	
	public void setDipartimento(Dipartimento dipartimento) {
		Dipendente.dipartimento = dipartimento;
	}
	
	public void setLivello(Livello livello) { 
		Dipendente.livello = livello;
	}
	
	//------------------------- metodi -------------------------
	public void stampaDatiDipendente() {
		System.out.printf("Matricola: %d%n Stipendio base: %.02f%n Stipendio: %.02f%n Importo orario straordinario: %.02f%n Livello: %s%n Dipartimento: %s%n"
, getMatricola(), getStipendioBase(), getStipendio(), getImportoOrarioStraordinario(), getLivello(), getDipartimento());
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void promuovi() {
		switch(livello ) {
		case OPERAIO:
			setLivello(Livello.IMPIEGATO);
			System.out.println("Sei stato promosso a Impiegato");
			double stipendio1 = getStipendio();
			stipendio1 = getStipendioBase() * 2;
			break;
		case IMPIEGATO:
			setLivello(Livello.QUADRO);
			System.out.println("Sei stato promosso a Quadro");
			break;
		case QUADRO:
			setLivello(Livello.DIRIGENTE);
			System.out.println("Sei stato promosso a Dirigente");
			break;
		default:
			System.out.println("Sei già dirigente.... Cosa vuoi di piu??");
			break;
		}
	}
}
/* 
Definire i seguenti metodi

  Il metodo aggiorna inoltre lo stipendio del dipendente con la seguente logica
	- IMPIEGATO = stipendioBase * 1,2
	- QUADRO = stipendioBase * 1,5
	- DIRIGENTE = stipendioBase * 2
 Infine il metodo ritorna il nuovo livello del dipendente

Definire i seguenti metodi statici:
- calcolaPaga - accetta un'istanza di dipendente e ne ritorna lo stipendio mensile
- calcolaPaga - accetta un'istanza di dipendente ed un parametro intero con le ore di straordinario e ritorna lo stipendio mensile comprensivo di straordinario
 */