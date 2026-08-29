package aed;
public class Horario {
    private int hora;
    private int minutos;


    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        
        return hora+":"+minutos;
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

        Horario otroHorario = (Horario) otro;


        return hora == otroHorario.hora && minutos == otroHorario.minutos ;
    }

}
