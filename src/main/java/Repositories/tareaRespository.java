package Repositories;

import Models.Tarea;
import Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class tareaRespository {

    public interface TareaRepository extends JpaRepository<Tarea, Long> {

        // Métodos personalizados

        Tarea findByTítulo(String título);

        List<Tarea> findByTítuloContaining(String título);

        List<Tarea> findByUsuario(Usuario usuario);

    }


}
