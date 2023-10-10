package com.facu.restfake.RestfakeApplication.controllers;

import com.facu.restfake.RestfakeApplication.entities.Persona;
import com.facu.restfake.RestfakeApplication.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
