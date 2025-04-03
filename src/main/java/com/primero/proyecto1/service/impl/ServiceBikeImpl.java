package com.primero.proyecto1.service.impl;

import com.primero.proyecto1.entity.Bicileta;
import com.primero.proyecto1.repository.RepositoryBike;
import com.primero.proyecto1.service.ServiceBike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
class ServiceBikeImpl implements ServiceBike {

    @Autowired //inyecto repositorio automaticamente
    RepositoryBike repositoryBike;


    @Override
    public List<Bicileta> findAllBikes(){
        return repositoryBike.findAll(); //son metodos que ya tiene la interfaz jpa repository
    }

    @Override
    public Bicileta saveBike(Bicileta bici){
        return  repositoryBike.save(bici);
    }

    @Override
    public Bicileta updateBike(Bicileta bici){


        /* TODO ESTO ES PARA CUANDO TOMA UN ID COMO PARAMETRO Y COMO PATHVARIABLE*/
        /*Bicileta bike = repositoryBike.findById(id).get();

        if(Objects.nonNull(bici.getCodigo()) && !"".equalsIgnoreCase(bici.getCodigo())){
            bike.setCodigo(bici.getCodigo());
        }
        if(Objects.nonNull(bici.getTipo()) && !"".equalsIgnoreCase(bici.getTipo())){
            bike.setTipo(bici.getTipo());
        }
        if(Objects.nonNull(bici.getMarca()) && !"".equalsIgnoreCase(bici.getMarca())){
            bike.setMarca(bici.getMarca());
        }
        if(Objects.nonNull(bici.getModelo()) && !"".equalsIgnoreCase(bici.getModelo())){
            bike.setModelo(bici.getModelo());
        }
        bike.setPrecio(bici.getPrecio());*/

        return repositoryBike.save(bici);
    }

    @Override
    public void deleteBike(Long id){
        repositoryBike.deleteById(id);
    }

    @Override
    public Bicileta findByTipoAndMarca(String tipo, String marca){
        return repositoryBike.findByTipoAndMarca(tipo, marca);
    }

    @Override
    public List<Bicileta> mostrarTodas(){
        return repositoryBike.mostrarTodas();
    }
}
