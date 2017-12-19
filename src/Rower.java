public class Rower
{
    private int id;
    private int status;
    private String kolor;

    public Rower(int i, int o, String p)//Przeciążenie konstruktora
    {
        this.id=i;
        this.status=o;
        this.kolor=p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
