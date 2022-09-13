package br.unesp.rc.springtutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "PessoaJuridica")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @Column(name = "cnpj", unique = true)
    private String cnpj;

    public Juridica() {
    }
}
