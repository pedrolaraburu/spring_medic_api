package med.vell.api_learn_spring.medic;

import med.vell.api_learn_spring.address.DataAddress;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public record MedicModel(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        Especialidade especialidade,
        @NotNull
        @Valid
        DataAddress address) {

}
