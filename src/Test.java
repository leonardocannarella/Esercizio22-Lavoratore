public class Test
{
    public static void main(String[] args) {
        int i=1;
        Lavoratore [] personale = new Lavoratore[10];
        Capo c1 = new Capo("", "Signoretti");
        Capo c = new Capo("Cristian", "Signoretti");
        personale[0]=c;

        String nomi[] = new String[] {"Nuriel","Andrea","Matteo"};
        String cognomi[] = new String[] {"Crescentini","Paolinelli","Ciaroni"};
        int stipendi[] = new int[] {6, 8, 9};

        for(i=0; i<3; i++)
        {
            personale[i+1] = new Lavoratore(nomi[i], cognomi[i]);
            personale[i+1].Stipendio(stipendi[i]);
        }

        for(i=0; i<9; i++)
        {
            if(personale[i]!=null)
                System.out.println(personale[i].toString()+"\n");
        }
    }
}
