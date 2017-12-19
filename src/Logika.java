import java.util.ArrayList;

public class Logika
{
    private ArrayList<Rower> rowery = new ArrayList<Rower>();
    private ArrayList<Klient> klienci = new ArrayList<Klient>();
    private ArrayList<Wypozyczone> wypozyczenia= new ArrayList<Wypozyczone>();

    public void dodaj_rower(int a, int b, String c)
    {
        Rower rower = new Rower(a,b,c);
        rowery.add(rower);
    }

    public void dodaj_klienta(int a, String b, String c)
    {
        Klient klient = new Klient(a,b,c);
        klienci.add(klient);
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
