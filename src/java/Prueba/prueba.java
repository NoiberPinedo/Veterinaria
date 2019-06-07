
package Prueba;

import Dao.MascotaDao;
import entidades.Mascota;


public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MascotaDao mascotadao=new MascotaDao();
        Mascota mimascota=new Mascota(5, "Sandor", "Juan", "pug");
       
        mascotadao.guardarMascota(mimascota);
    }
    
}
