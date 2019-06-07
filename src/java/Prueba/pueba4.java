
package Prueba;

import Dao.MascotaDao;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;


public class pueba4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ArrayList<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();

         Session sesions =HibernateUtil.geSessionFactory().openSession();

        lista = mascotadao.listarRaza(sesions);
        //System.out.println("ID\t"+"NOMBRE MASCOTA\t"+"NOMBRE CLIENTE\t"+"RAZA");
        for (Mascota mascota : lista) {
            
             JOptionPane.showMessageDialog(null,"ID :"+mascota.getIdMascota()+" \nNOMBRE MASCOTA: "+ mascota.getNombreMascota()+"\nNOMBRE CLIENTE: "+mascota.getNombreCliente()+"\nRAZA: "+mascota.getRaza());
        }
    }

}