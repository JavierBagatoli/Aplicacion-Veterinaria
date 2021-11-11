package Logica;

import Persistencia.ControladoraPersistencia;
import Persistencia.MascotaJpaController;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void altaMascota(String clienteN, String nombre, String raza, String color,
            String alergico, String atencion, String duenioNom, String duenioCel,
            String obs){
        
        Mascota m = new Mascota();
        m.setClienteN(clienteN);
        m.setNombre(nombre);
        m.setRaza(raza);
        m.setColor(color);
        m.setAlergico(alergico);
        m.setAtencionEspecial(atencion);
        m.setNombreDuenio(duenioNom);
        m.setCelDuenio(duenioCel);
        m.setObservaciones(obs);
        
        
        controlPersis.crearMascota(m);
    }
    
    public void altaMascota(Mascota m){
        controlPersis.crearMascota(m);
    }
    
    public void bajaMascota(int id){
        controlPersis.eliminarMascota(0);
    }

    public List<Mascota> traerMascota() {
        return controlPersis.obtenerMascota();
    }
    
    public void modificarMascota(Mascota m){
        controlPersis.modificarMascota(m);
    }
    
}
