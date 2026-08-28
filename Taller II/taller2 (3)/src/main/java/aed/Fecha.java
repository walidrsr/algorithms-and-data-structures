package aed;

public class Fecha {
    private int dia;
    private int mes;


    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        dia = fecha.dia;
        mes = fecha.mes;
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    public String toString() {
        return dia + "/" + mes;
    }

    @Override
    public boolean equals(Object otra) {
        boolean otranull = (otra == null);
        if(otranull){
            return false;
        }
        boolean classdistint= otra.getClass() != this.getClass();

        if (classdistint){
            return false;
        }

        Fecha otrafecha = (Fecha) otra;


        return dia == otrafecha.dia && mes == otrafecha.mes ;
    }

    public void incrementarDia() {
        if (dia == 31 && mes == 12){
            dia = 1;
            mes = 1;
        }
        else {
            dia = dia +1;
            if (dia > diasEnMes(mes)){
                dia = 1; 
                mes = mes +1 ;
            }
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
