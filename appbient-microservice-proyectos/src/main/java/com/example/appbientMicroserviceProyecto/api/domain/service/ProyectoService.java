package com.example.appbientMicroserviceProyecto.api.domain.service;

import com.example.appbientMicroserviceProyecto.api.domain.model.entity.Proyecto;
import com.example.appbientMicroserviceProyecto.api.resource.proyectos.CreateProyectosResource;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProyectoService {
    List<Proyecto> getAll();
    Proyecto getById(Long id);
    String create(CreateProyectosResource request);
    Proyecto update(Long id ,Proyecto Proyecto);
    ResponseEntity<?> delete(Long ProyectoId);
}
