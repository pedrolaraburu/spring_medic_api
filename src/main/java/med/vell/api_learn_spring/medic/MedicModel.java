package med.vell.api_learn_spring.medic;

import med.vell.api_learn_spring.address.DataAddress;

public record MedicModel(String name, String email, String crm, Especialidade especialidade, DataAddress address) {

}
