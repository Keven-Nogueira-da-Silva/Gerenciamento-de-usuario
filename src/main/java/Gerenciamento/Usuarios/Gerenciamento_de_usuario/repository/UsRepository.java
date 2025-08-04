package Gerenciamento.Usuarios.Gerenciamento_de_usuario.repository;

import Gerenciamento.Usuarios.Gerenciamento_de_usuario.model.UsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsRepository extends JpaRepository<UsModel, Long> {

}
