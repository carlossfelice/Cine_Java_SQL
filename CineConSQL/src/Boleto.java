public class Boleto {
    int idBoleto, idUsuario, idPelicula, asiento, sala;
    String fechaCompra;
    double precio;

    public Boleto(
            int idBoleto, int idUsuario,
            int idPelicula, int asiento, int sala,
            String fechaCompra, double precio) {
        this.idBoleto = idBoleto;
        this.idUsuario = idUsuario;
        this.idPelicula = idPelicula;
        this.asiento = asiento;
        this.sala = sala;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(int idBoleto) {
        this.idBoleto = idBoleto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
