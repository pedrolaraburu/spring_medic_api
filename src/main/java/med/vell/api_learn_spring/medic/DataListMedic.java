package med.vell.api_learn_spring.medic;

public record DataListMedic(String name, String email, String crm, Especialidade especialidade) {
    public DataListMedic(Medic medic){
        this(medic.getName(), medic.getEmail(), medic.getCrm(), medic.getEspecialidade());
    }
}
