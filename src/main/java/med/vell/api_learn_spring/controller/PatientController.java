package med.vell.api_learn_spring.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.vell.api_learn_spring.patient.Patient;
import med.vell.api_learn_spring.patient.PatientModel;
import med.vell.api_learn_spring.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void registerPatient(@RequestBody @Valid PatientModel data){
        repository.save(new Patient(data));
    }
}
