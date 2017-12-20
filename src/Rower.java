public class Rower
{
    private int id_r;
    private int status;
    private String kolor;

    public Rower(int id_r, int stat, String kol)//Przeciążenie konstruktora
    {
        this.id_r=id_r;
        this.status=stat;
        this.kolor=kol;
    }

    public int getId() {
        return id_r;
    }

    public void setId(int id) {
        this.id_r = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
