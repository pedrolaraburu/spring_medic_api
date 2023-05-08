package med.vell.api_learn_spring.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Address(DataAddress address) {
        this.logradouro = address.logradouro();
        this.bairro = address.bairro();
        this.cep = address.cep();
        this.numero = address.numero();
        this.complemento = address.complemento();
        this.cidade = address.complemento();
        this.uf = address.uf();
    }
}
