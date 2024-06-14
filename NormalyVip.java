import java.util.Objects;

public class NormalyVip extends Ticket{
    String Ruta;
    String Normal;
    String VIP;
    double costo;

    public NormalyVip(String fecha, String ruta, String normal, String VIP, double costo) {
        super(fecha);
        Ruta = ruta;
        Normal = normal;
        this.VIP = VIP;
        this.costo = costo;
    }

    public String getNormal() {
        return Normal;
    }

    public void setNormal(String normal) {
        Normal = normal;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String ruta) {
        Ruta = ruta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public void Rutas(){
        if(Objects.equals(getNormal(), "si")){
            switch (getRuta()){
                case "Guayaquil":
                    setCosto(getCosto());
                    break;
                case "Tulcan":
                    setCosto(getCosto());
                    break;
                case "Puyo":
                    setCosto(getCosto());
                    break;
                case "Riobamba":
                    setCosto(getCosto());
                    break;
            }
        }
        if(Objects.equals(getVIP(), "si")){
            switch (getRuta()){
                case "Guayaquil":
                    setCosto(getCosto()*1.3);
                    break;
                case "Tulcan":
                    setCosto(getCosto()*1.3);
                    break;
                case "Puyo":
                    setCosto(getCosto()*1.3);
                    break;
                case "Riobamba":
                    setCosto(getCosto()*1.3);
                    break;
            }
        }
    }

    @Override
    public double Costo_Total(double costo) {
        return Costo_Total(getCosto());
    }
}
