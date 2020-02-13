public class Impiegato extends Lavoratore
{
    public Impiegato(String nome, String cognome) throws IllegalArgumentException {
        super(nome, cognome);
    }

    public double Stipendio(int giorni) {
        double stipBase = super.Stipendio(giorni);
        return stipBase = 10*giorni;
    }

    public String toString() {
        return "Impiegato{" +
                "nome='" + super.getNome() + '\'' +
                ", cognome='" + super.getCognome() + '\'' +
                '}';
    }
}
