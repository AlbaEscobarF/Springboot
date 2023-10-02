package Controller;

import Models.Comentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.ComentarioService;

import java.util.List;

@RestController
    @RequestMapping("/comentarios")
    public class ComentarioController {

        @Autowired
        private ComentarioService comentarioServiceImpl;

        @GetMapping
        public List<Comentario> getAllComentarios() {
            return comentarioServiceImpl.getAllComentarios();
        }

        @GetMapping("/{id}")
        public Comentario getComentarioById(@PathVariable Long id) {
            ComentarioController comentarioService = null;
            return comentarioService.getComentarioById(id);
        }

        @PostMapping
        public Comentario createComentario(@RequestBody Comentario comentario) {
            return comentarioServiceImpl.createComentario(comentario);
        }

        @PutMapping("/{id}")
        public Comentario updateComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
            return comentarioServiceImpl.updateComentario(id, comentario);
        }

        @DeleteMapping("/{id}")
        public void deleteComentario(@PathVariable Long id) {
            comentarioServiceImpl.deleteComentario(id);
        }
    }

