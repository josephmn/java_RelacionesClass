
package relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph Magallanes
 */
public class Relaciones {

    public static void main(String[] args) {
        
        Auto auto = new Auto();
        
        auto.setId(1L);
        auto.setMarca("Renault");
        auto.setModelo("Daunter");
        
        List<Propietario> listaPropietario = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();

        prop1.setId(35L);
        prop1.setNombre("Luisina");
        prop1.setApellido("de Paula");
        
        prop2.setId(36L);
        prop2.setNombre("Pepito");
        prop2.setApellido("De la cruz");
        
        prop3.setId(37L);
        prop3.setNombre("José");
        prop3.setApellido("Hernández");
        
        listaPropietario.add(prop1);
        listaPropietario.add(prop2);
        listaPropietario.add(prop3);

        auto.setListaPropietarios(listaPropietario);
        
        System.out.println("El auto " + auto.getMarca() + " " + auto.getModelo() + 
                " tiene como propietarios a: " + auto.getListaPropietarios().toString());
        
    }

}
