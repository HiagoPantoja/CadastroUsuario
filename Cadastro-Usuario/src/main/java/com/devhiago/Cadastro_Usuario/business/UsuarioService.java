package com.devhiago.Cadastro_Usuario.business;


import com.devhiago.Cadastro_Usuario.infraestucture.entities.Usuario;
import com.devhiago.Cadastro_Usuario.infraestucture.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final UserRepository repository;

    public UsuarioService(UserRepository repository) {
        this.repository = repository;
    }
    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }
    public Usuario buscarUsuarioPorEmail(String email){
        return  repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")

        );
    }
    public  void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }

    public  void  atualizarUsuarioPorEmail(String email, Usuario usuario) {
        Usuario usuarioEntity = buscarUsuarioPorEmail(email);
    }
    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() :
                        usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() :
                        usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        repository.saveAndFlush(usuarioAtualizado);
    }
}
