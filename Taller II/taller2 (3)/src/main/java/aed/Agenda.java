package aed;

public class Agenda {
    Fecha fecha;
    Recordatorio[] recordatorios;

    public Agenda(Fecha fechaActual) {
        this.fecha = fechaActual;
        
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
       // this.recordatorios = recordatorio;
    }

    @Override
    public String toString() {

        return this.fecha + " ==== " + this.recordatorios;
    }

    public void incrementarDia() {
        // Implementar
    }

    public Fecha fechaActual() {
        // Implementar
        return this.fecha;
    }

}
