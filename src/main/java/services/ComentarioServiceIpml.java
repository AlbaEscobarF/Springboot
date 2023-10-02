package services;

import Models.Comentario;
import Repositories.tareaRespository;

import java.util.List;

public class ComentarioServiceIpml {

        private Repositories.comentarioRepository.ComentarioRepository comentarioRepository;
        private tareaRespository.TareaRepository tareaRepository;

        public ComentarioServiceIpml(Repositories.comentarioRepository.ComentarioRepository comentarioRepository, tareaRespository.TareaRepository tareaRepository) {
            this.comentarioRepository = comentarioRepository;
            this.tareaRepository = tareaRepository;
        }

        public Comentario obtenerComentario(Long id) {
            return comentarioRepository.findById(id).orElse(null);
        }
        public List<Comentario> obtenerComentariosDeTarea(Long idTarea) {
            return comentarioRepository.findByTarea(tareaRepository.findById(idTarea).orElse(null));
        }
        public Comentario crearComentario(Comentario comentario) {
            return comentarioRepository.save(comentario);
        }
        public void eliminarComentario(Long id) {
            comentarioRepository.deleteById(id);
        }
    }

