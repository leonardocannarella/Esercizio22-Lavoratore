public class Lavoratore
{
    private String nome, cognome;
    private double stipendio;
    private static final double STIPENDIO_GIORNALIERO=25;

    public Lavoratore(String nome, String cognome) throws IllegalArgumentException {
        try {
            if(nome!="" && cognome!="") {
                setNome(nome);
                setCognome(cognome);
            }
            else
            {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Errore!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double Stipendio(int giorni)
    {
        stipendio = giorni*STIPENDIO_GIORNALIERO;
        return stipendio;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", stipendio='" + stipendio + '\'' +
                '}';
    }
}
