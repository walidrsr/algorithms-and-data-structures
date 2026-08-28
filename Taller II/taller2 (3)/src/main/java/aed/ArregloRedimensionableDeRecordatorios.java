package aed;

class ArregloRedimensionableDeRecordatorios {
    private Recordatorio[] recordatorios ;
    
    public ArregloRedimensionableDeRecordatorios() {
       this.recordatorios = new Recordatorio [0];
    }

    public int longitud() {
        return recordatorios.length;
    }

    public void agregarAtras(Recordatorio i) {
        recordatorios[recordatorios.length-1] = i;
    }

    public Recordatorio obtener(int i) {
        Recordatorio elem = recordatorios[i] ;
        return elem ;
    }

    public void quitarAtras() {
        
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        // Implementar
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        // Implementar
        return null;
    }
}
