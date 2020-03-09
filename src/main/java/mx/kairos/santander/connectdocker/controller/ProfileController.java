package mx.kairos.santander.connectdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.kairos.santander.connectdocker.model.Profile;
import mx.kairos.santander.connectdocker.repository.ProfileRepository;

@RestController
public class ProfileController {

    @Autowired
    private ProfileRepository repository;

    @RequestMapping("/status")
    public String getStatus() {
        return "Hola Mundo";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Profile> getAll() {
        return repository.findAll();
    }
}