package instituto;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Adrian
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//       Scanner ent = new Scanner(System.in);
//     
//        String Nombre;
//        double edad;
//       boolean res=true;
//       
//      System.out.println("Ingrese los elementos del arreglo:");
//      int valor = ent.nextInt();
//      
// 
//       Personas[] lista = new Personas[valor];
//       Personas p =new Personas();
//       
//     while(res){
//         
//         
//         for (int i=0 ; i < valor ; i++){
//       
//        System.out.println("Ingrese el nombre");
//        Nombre=ent.next();
//        System.out.println("Ingrese la edad");
//        edad = ent.nextDouble();
//        
//        p.setNombre(Nombre);
//        p.setEdad(edad);
//        
//        lista[i]=p;
//         
//       
//        
//        } 
//          
//      
//      ListasPersonas lp = new ListasPersonas();
//      
//         System.out.println("*******************************");
//         System.out.println("La edad maxima es: "+lp.edadMax(lista));
//      
//         System.out.println("*******************************");
//         double resultado=lp.sumaEdad(lista);
//         System.out.println("El Promedio es: "+resultado);
//         
//         System.out.println("/////////////////////////////////");
//         System.out.println("Desea realizar una nueva accion");
//         System.out.println("1 = si ; 0 = no");
//         int val=ent.nextInt();
//         if (val==0){
//            res=false;
//      
//         }
//     }

        Personas p1 = new Personas();
        p1.setNombre("Luis");
        p1.setEdad(20);
        
        Personas p2 = new Personas();
        p2.setNombre("Jose");
        p2.setEdad(21);
        
        
        ArrayList <Personas> nombres = new ArrayList<Personas>();
        
        nombres.add(p1);
        nombres.add(p2);
        
        ListasPersonas Lista = new ListasPersonas();
        
        double maxP =Lista.edadMax(nombres);
        
        System.out.println("El de menor edad"+Lista.edadMinPersona(nombres));
        System.out.println("El de mayor edad"+Lista.edadMaxPersona(nombres));
                
                
   }
          
}
