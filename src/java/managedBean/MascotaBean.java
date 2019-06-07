/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;

    public MascotaBean() {
        this.mascota = new Mascota();
    }

    public void guardarMascota() {

        try {
            MascotaDao mascotaDao = new MascotaDao();
            mascotaDao.guardarMascota(mascota);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public boolean actualizarMascota(Mascota mascota) {

        boolean respuesta = true;

        try {
            MascotaDao mascotaDao = new MascotaDao();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return respuesta;
    }

    public boolean listarMascotas() {

        ArrayList<Mascota> lista = new ArrayList<>();
        boolean respuesta = true;

        try {
            MascotaDao mascotaDao = new MascotaDao();

        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

}
