package Persistencia;

import Logica.Mascota;
import Persistencia.exceptions.NonexistentEntityException;
import com.sun.istack.internal.logging.Logger;
import java.util.List;
import java.util.logging.Level;


public class ControladoraPersistencia {

    MascotaJpaController masJPA = new MascotaJpaController ();
    
    //metodo para alta
    public void crearMascota (Mascota m){
        try {
            masJPA.create(m);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistencia.class.getClass()).log(Level.SEVERE, null, e);
        }
    }
    //metodo para baja
    public void eliminarMascota (int id){
        try {
            masJPA.destroy(id);
        } catch (NonexistentEntityException e) {
            Logger.getLogger(ControladoraPersistencia.class.getClass()).log(Level.SEVERE, null, e);
        }
    }
    //metodo para lectura
    public List<Mascota> obtenerMascota(){
        return masJPA.findMascotaEntities();
    }
    //metodo para modificar
    public void modificarMascota (Mascota m){
            try {
                masJPA.edit(m);
            } catch (Exception e) {
                Logger.getLogger(ControladoraPersistencia.class.getClass()).log(Level.SEVERE, null, e);
            }
    }
    
}
