package controllers;
import models.Persona;


public class PersonaController {

    //Metodo De orientamiento seleccion descendente
    public void sotByDireccionCodigo(Persona[] personas){
        for(int i = 0 ; i < personas.length ; i++){
            int indexMayor = i;
            
            for (int j = i+1; j < personas.length; j++ ){
                //if (personas[j].getCodigoDireccion() > personas[indexMayor].getCodigoDireccion()){
                if (personas[j]. compareCodigoDireccion(personas[i])){
                    indexMayor = j;
                }
                
            }
            if (i != indexMayor){
                Persona aux = personas[indexMayor];
                personas[indexMayor] = personas[i];
                personas[i] = aux;
            }
        }

    }

    public Persona findPersonByCodigoDireccion(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length -1;

        while(bajo <= alto ){
            int center = (bajo + alto)/2;
            if (personas[center].equalsByCodigoDireccion(codigo)){
                return personas[center];
            }
            if (personas[center].compareCodigoDireccion(codigo)){
                bajo = center + 1;
            }else{
                alto = center -1;
            }
        }           
            return null;
    }
    
}
