package aed;
class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] recordatorios ;
    
    public ArregloRedimensionableDeRecordatorios() {
     this.recordatorios = new  Recordatorio [0];
    }

    public int longitud() {
        return recordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        Recordatorio[] nuevoRecordatorio=new Recordatorio[recordatorios.length+1];

        for(int j = 0; j < nuevoRecordatorio.length-1 ;j++){
            nuevoRecordatorio[j]=this.recordatorios[j];
        }

        nuevoRecordatorio[nuevoRecordatorio.length-1] = i;
        this.recordatorios = nuevoRecordatorio;
    }

    public Recordatorio obtener(int i) {
        Recordatorio elem = recordatorios[i] ;
        return elem ;
    }

    public void quitarAtras() {
        Recordatorio[] nuevoRecordatorio = new Recordatorio[recordatorios.length-1];

        for(int j = 0; j < nuevoRecordatorio.length ;j++){
            nuevoRecordatorio[j]=this.recordatorios[j];
        }

        this.recordatorios = nuevoRecordatorio;
        
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        Recordatorio[] nuevoRecordatorio = new Recordatorio[recordatorios.length];

        for(int j = 0; j < nuevoRecordatorio.length ;j++){
            if(indice == j){
                nuevoRecordatorio[indice]=valor;
            }
            else {
                nuevoRecordatorio[j]=this.recordatorios[j];
            }
        }
        this.recordatorios=nuevoRecordatorio;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        recordatorios = vector.recordatorios.clone();
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
      ArregloRedimensionableDeRecordatorios nuevoArray = new ArregloRedimensionableDeRecordatorios();
        
        for(int j = 0; j < recordatorios.length ;j++){
            nuevoArray.agregarAtras(obtener(j));
        }

    

        return nuevoArray;
    }
}
