public class Wypozyczone
{
    private int id_row;
    private int id_kli;
    private double data_wyp;
    private double data_odd;

    public Wypozyczone(int id_row, int id_kli, double data_wyp)
    {
        this.id_row = id_row;
        this.id_kli = id_kli;
        this.data_wyp = data_wyp;
        this.data_odd = 0;
    }

    public int getId_row() {
        return id_row;
    }

    public void setId_row(int id_row) {
        this.id_row = id_row;
    }

    public int getId_kli() {
        return id_kli;
    }

    public void setId_kli(int id_kli) {
        this.id_kli = id_kli;
    }

    public double getData_wyp() {
        return data_wyp;
    }

    public void setData_wyp(double data_wyp) {
        this.data_wyp = data_wyp;
    }

    public double getData_odd() {
        return data_odd;
    }

    public void setData_odd(double data_odd) {
        this.data_odd = data_odd;
    }
}
