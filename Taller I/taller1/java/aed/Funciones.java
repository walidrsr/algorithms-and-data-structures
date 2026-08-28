package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        int res;
        res = x*x;
        return res ;
    }

    double distancia(double x, double y) {
        double res;

        res = Math.sqrt(x*x + y*y);

        return res;
    }

    boolean esPar(int n) {
        boolean res = true;
        if (n % 2 == 0) {
            return res;
        }
        else res = false;
        return res;
    }

    boolean esBisiesto(int n) {   
        return (n%4 == 0 && n%100 != 0 ) || (n%400 == 0);
    }

    int factorialIterativo(int n) {
        int res=1;
         if (n == 0){
                return 1;
            }
        for (int i = 1; i < n; i++){
         res = res*(i+1);
        }

        return res;
    }

    int factorialRecursivo(int n) {
        int res;
        if (n == 0){
            res = 1;
        } else if (n == 1){
            res = 1;
        } else {
        res = factorialRecursivo(n-1) * n;}
        return res;
    }

    boolean esPrimo(int n) {
        boolean res = true;
        if (n == 1 || n == 0) {
            res = false;
        }


        for (int i = 2; i<n; i++ ){
            if (n % i != 0) {
                res = true;
            }
            else {
                return res = false;
            }
        }

        return res;
    }

    int sumatoria(int[] numeros) {
        int res=0;
        for( int i = 0; i < numeros.length; i++){
            res = numeros[i] + res;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int res=0;
        for (int i =0; i <numeros.length; i++){
            if (numeros [i] == buscado){
                res = i;
            }
        }
        return res;
    }

    boolean tienePrimo(int[] numeros) {
        boolean res=true;

        for (int i = 0; i<numeros.length ; i++){
            if (esPrimo(numeros[i])) {
                return res=true;
            }
            else {
                res =false;}
            }
        
        return res;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;

        for (int i=0; i<numeros.length; i++){
            if (esPar(numeros[i])){
                res = true;
            }
            else {
                return res = false;
            }
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        if (s1.length() > s2.length()){
            return res = false;
        } else {

         for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)==s2.charAt(i)){
                res = true;
            }
            else {
                res = false;
            }
        }
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        boolean res = true;
        if (s2.length() < s1.length()){
            return res = false;
        } else 
        
        {
        
        int j = s2.length() -1;
        for (int i = s1.length()-1; i >= 0 ; i--){
           
            if(s1.charAt(i)==s2.charAt(j)){
                res = true;
            }
            else {
                res = false;
            }

            j = j -1;
        }
        }
        
        return res;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;
        if (xs.length != ys.length){
            return res = false;
        }
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length-1; i++) {
            if (xs[i] > xs [i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0];
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) res = xs[i];
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true;
        for (int x : xs) {
            if(x == 0){
                res = true;
            }
            if (x > 0) {
                res = true;
            } else {
                return res = false;
            }
        }
        return res;
    }

}
