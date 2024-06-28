package com.generation.mapaendemico.service;

import com.generation.mapaendemico.dto.FaunaDTO;
import com.generation.mapaendemico.models.Fauna;
import com.generation.mapaendemico.repository.FaunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class FaunaService {
    @Autowired
    private FaunaRepository faunaRepository;

    public Fauna findById(int id) {
        return faunaRepository.findById(id).orElse(null);
    }

    public List<Fauna> getAllFauna() {
        return faunaRepository.findAll();
    }

    public Fauna findByNombreCientifico(String nombreCientifico) {
        return faunaRepository.findbyNombreCientifico(nombreCientifico).orElse(null);
    }

    public Fauna findByNombreComun(String nombreComun) {
        return faunaRepository.findByNombreComun(nombreComun).orElse(null);
    }

    public Fauna findByClase(String clase) {
        return faunaRepository.findByClase(clase).orElse(null);
    }

    public Fauna findByOrden(String orden) {
        return faunaRepository.findByOrden(orden).orElse(null);
    }

    public Fauna findByFamilia(String familia) {
        return faunaRepository.findByFamilia(familia).orElse(null);
    }

    public Fauna findByRegiones(String regiones) {
        return faunaRepository.findByRegiones(regiones).orElse(null);
    }

    public Fauna findByAmenaza(String amenaza) {
        return faunaRepository.findByAmenaza(amenaza).orElse(null);
    }

    public Fauna findByVertebradoInvertebrado(String vertebradoInvertebrado) {
        return faunaRepository.findByVertebradoInvertebrado(vertebradoInvertebrado).orElse(null);
    }

    public Fauna findByDescripcion(String descripcion) {
        return faunaRepository.findByDescripcion(descripcion).orElse(null);
    }

    public Fauna findByPeso(Integer peso) {
        return faunaRepository.findByPeso(peso).orElse(null);
    }

    public Fauna findByAltura(Integer altura) {
        return faunaRepository.findByAltura(altura).orElse(null);
    }

    public Fauna findByParquesId(int parquesId) {
        return faunaRepository.findByParquesId(parquesId).orElse(null);
    }

    @Transactional
    public Fauna saveFauna(Fauna fauna) {
        return faunaRepository.save(fauna);
    }

    @Transactional
    public void deleteFauna(int id) {
        faunaRepository.deleteById(id);
    }
    
    @Transactional
    public Fauna updateFaunaByNombreCientifico(String nombreCientifico, FaunaDTO faunaActualizada) {
        Fauna faunaActualizar = faunaRepository.findbyNombreCientifico(nombreCientifico);
        if (faunaActualizar != null) {
            faunaActualizar.setNombreCientifico(faunaActualizada.getNombreCientifico());
            faunaActualizar.setNombreComun(faunaActualizada.getNombreComun());
            faunaActualizar.setClase(faunaActualizada.getClase());
            faunaActualizar.setOrden(faunaActualizada.getOrden());
            faunaActualizar.setFamilia(faunaActualizada.getFamilia());
            faunaActualizar.setRegiones(faunaActualizada.getRegiones());
            faunaActualizar.setAmenaza(faunaActualizada.getAmenaza());
            faunaActualizar.setVertebradoInvertebrado(faunaActualizada.getVertebradoInvertebrado());
            faunaActualizar.setDescripcion(faunaActualizada.getDescripcion());
            faunaActualizar.setPeso(faunaActualizada.getPeso());
            faunaActualizar.setAltura(faunaActualizada.getAltura());
            return faunaRepository.save(faunaActualizar);
        }
        return null;
    }
}