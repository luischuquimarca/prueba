/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoscon.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class ProductosconArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec=new Scanner(System.in);
        int op;
        int dim;
        String codigo = null,nombre=null,tipo=null, precio=null;
        Producto obj1;
        ArrayList<String>nombre_productos=new ArrayList();
        do{
            
        
        System.out.println("menu");
        System.out.println("1. ingresar");
        System.out.println("2. eliminar");
        System.out.println("3. buscar");
        System.out.println("4. modificar");
        System.out.println("5. salir");
        System.out.println("elija la opcion: ");
        op=tec.nextInt();
        switch (op){
            case 1:
                
            
            System.out.println("ingrese la cantidad para la lista: ");
            dim=tec.nextInt();
            for(int i=0;i<dim;i++){
                System.out.print("ingrese el codigo: ");
                codigo=tec.next();
                System.out.print("ingrese el nombre: ");
                nombre=tec.next();
                System.out.print("ingrese el tipo: ");
                tipo=tec.next();
                System.out.print("ingrese el precio: ");
                precio=tec.next();
                System.out.println("");
                nombre_productos.add(codigo);
                nombre_productos.add(nombre);
                nombre_productos.add(tipo);
                nombre_productos.add(precio);
                obj1=new Producto(codigo,nombre,tipo,precio);
        }break;
            case 2:
                System.out.print("ingrese el elemento que desae eliminar: ");
                codigo=tec.next();
                nombre_productos.remove(codigo);
                System.out.println(nombre_productos);
                break;
            case 3:
                System.out.print("ingrese el elemento que desae eliminar: ");
                codigo=tec.next();
        }
        }while(op!=5);
        
    }
    
}
