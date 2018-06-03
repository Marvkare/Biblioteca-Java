/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author Marvkare
 */
public class añadir {
    
    public String libros[][] = new String [10][5];
    
    
    public  void añadir(String caja1, String caja2, String caja3, String caja4, String caja5){
        funLibros();
        
        for(int i=0; i<libros.length; i++){
           
            System.out.println(libros[i][0]);
            if(libros[i][0]=="")
            {
                System.out.println("Esta vacio");
                libros[i][0] = "Libro añadido";
                System.out.println(libros[i][0]);
                for(int j = 0; j<libros.length; j++){
                 
                   switch (j){
                       case 0:
                           libros[i][j] = caja1;
                           break;
                       case 1:
                           libros[i][j] = caja2;
                           break;
                       case 2:
                           libros[i][j] = caja3;
                           break;
                       case 3:
                           libros[i][j] = caja4;
                           break;
                       case 4:
                           libros[i][j] = caja5;
                           break;    
                   }
                }
                
            }else{
                System.out.println("no esta vacio");
            }
        }
    
}
    
   
        
        
    public  String[][] funLibros(){
        
        libros[0][0] = "Libro 1"; libros[0][1] = "2"; libros[0][2] = "3"; libros[0][3] = "4"; libros[0][4] = "5";
        libros[1][0] = ""; libros[1][1] = ""; libros[1][2] = ""; libros[1][3] = ""; libros[1][4] = "";
        libros[2][0] = "Libro 3"; libros[2][1] = ""; libros[2][2] = ""; libros[2][3] = ""; libros[2][4] = "";
        libros[3][0] = "Libro 4"; libros[3][1] = ""; libros[3][2] = ""; libros[3][3] = ""; libros[3][4] = "";
        libros[4][0] = "Libro 5";
        libros[5][0] = "Libro 6";
        libros[6][0] = "Libro 7";
        libros[7][0] = "Libro 8";
        libros[8][0] = "Libro 9";
        libros[9][0] = "Libro 10";
        String[][] libros1 = this.libros;
        return libros;        
    }
    
    public String respuestas(){
        funLibros();
        String hola = "hola";
        System.out.println(libros[1][0]);
        return hola;
    }
}

