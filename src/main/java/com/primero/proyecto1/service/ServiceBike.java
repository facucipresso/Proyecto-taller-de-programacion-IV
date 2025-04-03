package com.primero.proyecto1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.primero.proyecto1.entity.Bicileta;
import com.primero.proyecto1.repository.RepositoryBike;

public interface ServiceBike {

    List<Bicileta> findAllBikes();
    Bicileta saveBike(Bicileta bici);
    Bicileta updateBike(Bicileta bici);
    void deleteBike(Long id);
    Bicileta findByTipoAndMarca(String tipo, String marca);
    List<Bicileta> mostrarTodas();

}
