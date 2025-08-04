package Gerenciamento.Usuarios.Gerenciamento_de_usuario.service;

import Gerenciamento.Usuarios.Gerenciamento_de_usuario.model.UsModel;
import Gerenciamento.Usuarios.Gerenciamento_de_usuario.repository.UsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsRepository repository;

    public UserService(UsRepository repository) {
        this.repository = repository;
    }

    public List<UsModel> listUser() {
        return repository.findAll();
    }

    public Optional<UsModel> busqUser(Long id) {
        return repository.findById(id);
    }

    public UsModel save(UsModel user) {
        return repository.save(user);
    }

    public UsModel atualizar (Long id, UsModel newUser) {
        UsModel user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        user.setTelefone(newUser.getTelefone());
        return repository.save(user);
    }

    public void Delety(Long id) {
        repository.deleteById(id);
    }
}
