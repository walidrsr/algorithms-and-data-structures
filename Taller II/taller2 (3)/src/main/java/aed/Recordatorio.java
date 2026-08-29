
package aed;
public class Recordatorio {
    private String mensaje;
    private Fecha fecha;
    private Horario horario;



    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha (fecha);
        this.horario = horario;
    }

    public Horario horario() {

        return horario;
    }

    public Fecha fecha() {
        return new Fecha (fecha);
    }

    public String mensaje() {
        // Implementar
        return mensaje;
    }

    @Override
    public String toString() {
        return mensaje + " @ " + fecha+" "+ horario;
    }

    @Override
    public boolean equals(Object otro) {
        boolean otronull = (otro == null);
        if(otronull){
            return false;
        }
        boolean classdistint= otro.getClass() != this.getClass();

        if (classdistint){
            return false;
        }

        Recordatorio otroRecordatorio = (Recordatorio) otro;


        return otroRecordatorio.mensaje == this.mensaje &&  this.horario.equals(otroRecordatorio.horario) && this.fecha.equals( otroRecordatorio.fecha);
    }

}
