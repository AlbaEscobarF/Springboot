package Controller;

import Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UsuarioServiceImpl;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UsuarioController {
    @RestController
    public class UsuarioRestController {

        @Autowired
        private UsuarioServiceImpl usuarioService;

        @GetMapping("/")
        public List<Usuario> listarUsuarios() {
            return usuarioService.listarTodos();
        }

        @PostMapping("/usuarios")
        public Usuario crearUsuario(@RequestBody Usuario usuario) {
            return usuarioService.crear(usuario);
        }

        @GetMapping("/usuarios/{id}")
        public Usuario obtenerUsuario(@PathVariable Long id) {
            return usuarioService.obtener(id);
        }

        @PutMapping("/usuarios/{id}")
        public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
            return usuarioService.actualizar(id, usuario);
        }

        @DeleteMapping("/usuarios/{id}")
        public void eliminarUsuario(@PathVariable Long id) {
            usuarioService.eliminar(id);
        }

    }

    }




