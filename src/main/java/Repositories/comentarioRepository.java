package Repositories;

import Models.Comentario;
import Models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class comentarioRepository {
    public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

        // Métodos personalizados

        List<Comentario> findByTarea(Tarea tarea);

    }


}
