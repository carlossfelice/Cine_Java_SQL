public class Pelicula {
    int idPelicula;
    String titulo, AnoLanzamiento, genero,
            duracion, sinopsis, calificacion;

    public Pelicula(
            int idPelicula, String titulo, String anoLanzamiento,
            String genero, String duracion,
            String sinopsis, String calificacion) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        AnoLanzamiento = anoLanzamiento;
        this.genero = genero;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.calificacion = calificacion;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoLanzamiento() {
        return AnoLanzamiento;
    }

    public void setAnoLanzamiento(String anoLanzamiento) {
        AnoLanzamiento = anoLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }


}
