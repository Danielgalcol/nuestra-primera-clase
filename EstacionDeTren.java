public class EstacionDeTren{
    private String estacionDeTren;
    private int ntrenesQueParan;
    private boolean estacionAbierta;
    
    public EstacionDeTren(String nombreEsta, boolean laEstacionAbierta){
        ntrenesQueParan = 0;
        estacionDeTren = nombreEsta;
        estacionAbierta = laEstacionAbierta;
    }
    
    public String getNombreDeLaEstacion(){
        return estacionDeTren;
    }
    
    public int getNTrenesQueParan(){
        return ntrenesQueParan;
    }
    
    public boolean getEstacionAbierta(){
        return estacionAbierta;
    }
    
    public String setNombreDeLaEstacion(String cambioNombre){
        estacionDeTren = cambioNombre;
        return estacionDeTren;
    }
    
    public int setNTrenesQueParan(int masTrenes){
        ntrenesQueParan = ntrenesQueParan + masTrenes;
        return ntrenesQueParan;
    }
    
    public boolean setEstacionAbierta(){
        if(estacionAbierta == true){
            estacionAbierta = false;
        }
        else if (estacionAbierta == false){
            estacionAbierta = true;
        }
        return estacionAbierta;
    }
}