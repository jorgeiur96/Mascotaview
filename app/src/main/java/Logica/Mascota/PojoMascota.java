package Logica.Mascota;

/**
 * Created by Jorge Urueta on 28/11/2017.
 */

public class PojoMascota {
    int Imagen;
    String nombreMascota ;
    int Cantidad;

    public PojoMascota() {


    }

    public PojoMascota(int imagen, String nombreMascota, int cantidad) {
        Imagen = imagen;
        this.nombreMascota = nombreMascota;
        Cantidad = cantidad;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
