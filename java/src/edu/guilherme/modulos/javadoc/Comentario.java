package edu.guilherme.modulos.javadoc;

public class Comentario{
/**
 *  Exemplo de um metodo que mal estruturado 
 *  é que não obedece as boas praticas da linguagem
 */
    public int somaMultiplica(int n, int x, String m){
        int r = 0;
        
        if (m == "M") {
            r = n * x;
        }
        else{
            r = n + x;
        }

        return r;
    }
}
