import java.util.ArrayList;

public class Logika
{
    private ArrayList<Rower> rowery = new ArrayList<Rower>();
    private ArrayList<Klient> klienci = new ArrayList<Klient>();
    private ArrayList<Wypozyczone> wypozyczenia= new ArrayList<Wypozyczone>();

    public void dodaj_rower(int id, int status, String kolor)
    {
        if(status==1)
        {
            int tr_ue=0;
            for(Rower rower: rowery)
            {
                if(rower.getId()==id) tr_ue=1;
            }
            if (tr_ue==1) System.out.println("Nie mozna dodac roweru o takim id. ");
            else
            {
                Rower Rower = new Rower(id, status, kolor);
                rowery.add(Rower);
            }
        }
        else
            System.out.println("Nie mozna dodac roweru  o takim stanie. ");
    }

    public void dodaj_klienta(int id, String imie, String nazwisko)
    {
        int tr_ue=0;
        for(Klient klient: klienci)
        {
            if(klient.getId()==id) tr_ue=1;
        }
        if (tr_ue==1) System.out.println("Nie mozna dodac klienta o takim id. ");
        else
        {
            Klient klient = new Klient(id, imie, nazwisko);
            klienci.add(klient);
        }
    }



    public void wypozycz(int id_wyb_row, int id_klient, double data_wypozyczenia)
    {
        int numer_na_liscie = (-2);
        int id_row;
        for(int i=0; i<rowery.size(); i++)
        {
           if(Rower.getId()==id_wyb_row)
           {
                numer_na_liscie = i;
                id_row= Rower.getId(i);
           }
        }
        if(numer_na_liscie==(-2))System.out.println("nie znaleziono roweru");
        else
        {
            Wypozyczone wypozyczone = new Wypozyczone(id_klient, id_row, data_wypozyczenia);
            wypozyczenia.add(wypozyczone);
        }

    }

    public void oddaj()
    {

    }

    public void lista_klientow()
    {
        int i=0;
        for(Klient klient: klienci)
        {
            System.out.println("Id: " + klient.getId() + ". " + klient.getImie() + " " + klient.getNazwisko());
            i++;
        }
        if(i==0) System.out.println("Nie ma dostępnych klientow. ");

    }
    public void dostepne_rowery()
    {
        int i=0;
        for(Rower rower: rowery)
        {
            if (rower.getStatus()==1)
            {
                System.out.println("Id: " + rower.getId()+ ". " + rower.getKolor());
                i++;
            }
        }
        if(i==0) System.out.println("Nie ma dostępnych rowerow. ");
    }



//    public void wyswietl() {
//        for(int i=0; i<rowery.size(); i++)
//        {
//            System.out.println(rowery.get(i).getKolor()+" "+rowery.get(i).getStatus()+" "+rowery.get(i).getId());
//        }
//        for(Rower rower: rowery){
//            System.out.println(rower.getKolor());
//        }
//
//    }
}
