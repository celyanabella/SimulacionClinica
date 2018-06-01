/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionClinica;

/**
 *
 * @author HP USER
 */
public class Enfermera {
    private int tiemposervicio,numservicio,aleatory,tipo,tinicial,tfinal,cliente,ttotal,numcliente;
    
    public Enfermera(int numserv,int tipo) {
        this.numservicio = numservicio;
        this.tipo=tipo;
        tiemposervicio=0;
        tfinal=0;ttotal=0;numcliente=0;
    }
    public void tiempo(int tiempoi,int tiemposervi,int cliente)
    {
        tinicial=tiempoi;
        tfinal=tinicial+tiemposervi;
        ttotal=ttotal+tiemposervi;
        cliente=cliente;
        numcliente++;
    }
    public boolean ocupado(int tiempo)
    {
        if(tfinal!=0&&tiempo<=tfinal)
                 return true;
            else
               return false;
      }
     public int getTipo() {
        return tipo;
    }
      public int getNumcli() {
        return numcliente;
    }
      public int getTt() {
        return ttotal;
    }
   
}
