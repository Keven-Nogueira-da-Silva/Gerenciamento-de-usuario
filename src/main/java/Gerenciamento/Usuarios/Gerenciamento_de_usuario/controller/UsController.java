package Gerenciamento.Usuarios.Gerenciamento_de_usuario.controller;

import Gerenciamento.Usuarios.Gerenciamento_de_usuario.model.UsModel;
import Gerenciamento.Usuarios.Gerenciamento_de_usuario.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsController {

    private final UserService service;

    public UsController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UsModel> listUser() {
        return service.listUser();
    }

    @GetMapping("/{id}")
    public Optional<UsModel> busqUser(@PathVariable Long id) {
        return service.busqUser(id);
    }

    @PostMapping
    public UsModel save(@RequestBody UsModel user){
        return service.save(user);
    }

    @PutMapping
    public UsModel atulizar(@PathVariable Long id, @RequestBody UsModel user) {
        return service.atualizar(id, user);
    }


    @DeleteMapping("/{id}")
    public void delety(Long id) {
        service.Delety(id);
    }

}
