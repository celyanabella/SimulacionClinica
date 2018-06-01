/******************************************************************
 * cola.java: estructura de datos que se utiliza para laÂatencion *
 * de clientes.                                                   *
 ******************************************************************/

package SimulacionClinica;


public class cola
{
    private nodo primero, ultimo;
    private int trance,cliente=0,te=0,ti,tf;


        public cola()
	{
		primero=null;
		ultimo=null;

	}
        
	public void insertar(int d,boolean cli)
	{

            nodo nuevo=new nodo(d);
            
            if((int)(1+Math.random()*10)<=7)
               trance=1;
            else
                trance=2;

            if(cli==true)
            {
              cliente++;
              System.out.println("La cola contiene "+cliente+" elementos");
            }
		if(primero==null)
		{
			primero=nuevo;
			ultimo=nuevo;
		}
		else
		{
			ultimo.siguiente=nuevo;
			ultimo=nuevo;
		}
	}
        
	public int sacar(boolean cli)
	{
		int x;
                if(cli==true)
                     cliente--;
		x=primero.dato;
	    primero=primero.siguiente;
	    return x;
	}
        public int primerDato()
        {
           return primero.dato;
        }
        public int ultimoDato()
        {
            return ultimo.dato;
        }
        
        public cola clienteimpaciente(int d,boolean cli)
       {
             cola caux=new cola();
             nodo aux=primero;
             int encontrado=0;
             while(aux!=null&&encontrado!=d)
             {
                 encontrado=aux.dato;
                 if(encontrado!=d)
                 {
                     caux.insertar(encontrado, true);
                     aux=aux.siguiente;
                 }
                 else
                 {
                     if(cli==true)
                         cliente--;
                     aux=aux.siguiente;
                     while(aux!=null)
                     {
                         caux.insertar(aux.dato, true);
                         aux=aux.siguiente;
                     }
                 }
             }
             return caux;
       }
	public boolean vacia()
	{
		if(primero==null)
			return true;
		else
			return false;
	}



	public String print()
	{
		nodo n=primero;
                String x="";
                Object o;
		while(n!=null)
		{
                        o=n.dato;
                        x=o.toString();
			System.out.print(n.dato);
			if (n.siguiente!=null)
			{
				System.out.print("<<<");
                                x="<<<";
			}
		  n=n.siguiente;

		}
		System.out.print("\n");
                x="\n";
                return x;
	}
        public int getCliente() {
                return cliente;
         }
        public int getTrance() {
             return trance;
       }
}
