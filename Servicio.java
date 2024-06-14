import java.util.Objects;
public class Servicio extends NormalyVip {
    String recargoextra;
    double costoextra;

    public Servicio(String fecha, String ruta, String normal, String VIP, double costo, String recargoextra, double costoextra) {
        super(fecha, ruta, normal, VIP, costo);
        this.recargoextra = recargoextra;
        this.costoextra = costoextra;
    }

    public String getRecargoextra() {
        return recargoextra;
    }

    public void setRecargoextra(String recargoextra) {
        this.recargoextra = recargoextra;
    }

    public double getCostoextra() {
        return costoextra;
    }

    public void setCostoextra(double costoextra) {
        this.costoextra = costoextra;
    }

    @Override
    public double Costo_Total(double costo) {
        return super.Costo_Total(costo+costoextra);
    }
}
