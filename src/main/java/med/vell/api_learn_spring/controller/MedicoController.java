package med.vell.api_learn_spring.controller;

import jakarta.transaction.Transactional;
import med.vell.api_learn_spring.medic.Medic;
import med.vell.api_learn_spring.medic.MedicModel;
import med.vell.api_learn_spring.medic.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicRepository repository;
    @PostMapping
    @Transactional
    public void registerMedic(@RequestBody MedicModel data){
        repository.save(new Medic(data));
    }
}
