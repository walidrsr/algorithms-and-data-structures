package aed;
public class Agenda {
    Fecha fecha;
    ArregloRedimensionableDeRecordatorios recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fecha = fechaActual;
        this.recordatorios = new ArregloRedimensionableDeRecordatorios();

    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
       this.recordatorios.agregarAtras(recordatorio);
    }

    @Override
    public String toString() {
        String recordatoriosFechaActual = fecha.toString() + "\n=====\n";
        for (int indice=0; indice < recordatorios.longitud();indice ++){
            if (recordatorios.obtener(indice).fecha().toString().equals(this.fecha.toString())){
                recordatoriosFechaActual= recordatoriosFechaActual + recordatorios.obtener(indice).toString() + "\n";
            }
        }
        return  recordatoriosFechaActual;
    }

    public void incrementarDia() {
        fecha.incrementarDia();
    }

    public Fecha fechaActual() {
        // Implementar
        return this.fecha;
    }

}
