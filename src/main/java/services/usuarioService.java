package services;

import Models.Usuario;
import Repositories.usuarioRepository;

import java.util.List;

    public class UsuarioService {

        private Repositories.usuarioRepository.UsuarioRepository usuarioRepository;

        public UsuarioService(Repositories.usuarioRepository.UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        public Usuario obtenerUsuario(Long id) {
            return usuarioRepository.findById(id).orElse(null);
        }

        public List<Usuario> obtenerTodosLosUsuarios() {
            return usuarioRepository.findAll();
        }

        public Usuario crearUsuario(Usuario usuario) {
            return usuarioRepository.save(usuario);
        }

        public Usuario actualizarUsuario(Long id, Usuario usuario) {
            Usuario usuarioActual = usuarioRepository.findById(id).orElse(null);

            if (usuarioActual != null) {
                usuarioActual.setNombre(usuario.getNombre());
                usuarioActual.setCorreoElectronico(usuario.getCorreoElectronico());

                return usuarioRepository.save(usuarioActual);
            } else {
                return null;
            }
        }

        public void eliminarUsuario(Long id) {
            usuarioRepository.deleteById(id);
        }
    }


