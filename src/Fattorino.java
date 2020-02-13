public class Fattorino extends Lavoratore
{
    public Fattorino(String nome, String cognome) throws IllegalArgumentException {
        super(nome, cognome);
    }

    public double Stipendio(int giorni) {
        double stipBase = super.Stipendio(giorni);
        return stipBase = 5*giorni;
    }

    public String toString() {
        return "Fattorino{" +
                "nome='" + super.getNome() + '\'' +
                ", cognome='" + super.getCognome() + '\'' +
                '}';
    }
}
