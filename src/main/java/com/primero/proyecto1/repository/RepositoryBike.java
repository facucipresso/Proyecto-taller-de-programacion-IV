package com.primero.proyecto1.repository;

import org.springframework.stereotype.Repository;
import com.primero.proyecto1.entity.Bicileta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//extiendo metodos de la interface jpa repository que es de spring data, me provee metodos ya estableceidos
@Repository
public interface RepositoryBike extends JpaRepository<Bicileta, Long>{
    public Bicileta findByTipoAndMarca(String tipo, String marca);

    @Query(nativeQuery = true, value = "SELECT * FROM BICICLETAS")
    public List<Bicileta> mostrarTodas();
}
