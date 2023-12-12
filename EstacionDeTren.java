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
    
    public void imprimirDetalles(){
        String castellano = "";
        if(estacionAbierta == true){
            castellano = "Si.";
        }
        else if (estacionAbierta == false){
            castellano = "No.";
        }
        System.out.println("Nombre estacion: " + estacionDeTren + "|" + " Numero trenes pasan: " + ntrenesQueParan + "|" + " Estacion abierta? " + castellano);
    }
    
    public String getDetalles(){
        String castellano = "";
        String detalles = "";
        if(estacionAbierta == true){
            castellano = "Si.";
        }
        else if (estacionAbierta == false){
            castellano = "No.";
        }
        detalles = "Nombre estacion: " + estacionDeTren + "|" + " Numero trenes pasan: " + ntrenesQueParan + "|" +" Estacion abierta? " + castellano;
        return detalles;
    }
}