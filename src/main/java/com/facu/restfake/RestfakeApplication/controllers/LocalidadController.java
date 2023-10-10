package com.facu.restfake.RestfakeApplication.controllers;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import com.facu.restfake.RestfakeApplication.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {

}
