public class Capo extends Lavoratore
{
    public Capo(String nome, String cognome) throws IllegalArgumentException {
        super(nome, cognome);
    }

    public double Stipendio(int giorni) {
        double stipBase = super.Stipendio(giorni);
        return stipBase = 50*giorni;
    }

    public String toString() {
        return "Capo{" +
                "nome='" + super.getNome() + '\'' +
                ", cognome='" + super.getCognome() + '\'' +
                '}';
    }
}
