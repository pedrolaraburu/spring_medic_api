package med.vell.api_learn_spring.medic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.vell.api_learn_spring.address.Address;

@Table(name = "medics")
@Entity(name = "Medic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medic {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    @Embedded
    private Address address;

    public Medic(MedicModel data) {
        this.name = data.name();
        this.email = data.email();
        this.crm = data.crm();
        this.telephone = data.telephone();
        this.especialidade = data.especialidade();
        this.address = new Address(data.address());
    }
}
