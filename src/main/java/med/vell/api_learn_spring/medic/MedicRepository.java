package med.vell.api_learn_spring.medic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicRepository extends JpaRepository<Medic, Long> { // Generics with type of the object and type of the primary key

}
