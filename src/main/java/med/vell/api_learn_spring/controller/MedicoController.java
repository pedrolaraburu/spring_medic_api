package med.vell.api_learn_spring.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.vell.api_learn_spring.medic.DataListMedic;
import med.vell.api_learn_spring.medic.Medic;
import med.vell.api_learn_spring.medic.MedicModel;
import med.vell.api_learn_spring.medic.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicRepository repository;
    @PostMapping
    @Transactional
    public void registerMedic(@RequestBody @Valid MedicModel data){
        repository.save(new Medic(data));
    }

    @GetMapping
    public Page<DataListMedic> listMedics(Pageable page){
        return repository.findAll(page).map(DataListMedic::new);
    }
}
