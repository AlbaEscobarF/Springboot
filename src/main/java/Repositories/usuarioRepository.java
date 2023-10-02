package Repositories;

import Models.Comentario;
import Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class usuarioRepository {


    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


        Usuario findByNombre(String nombre);

        List<Usuario> findByNombreContaining(String nombre);

        List<Usuario> findByComentarios(Comentario comentario);

    }


}
