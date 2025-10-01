package mvc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@ToString
@Table(name = "card")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Card {


    @Id
    //No hace falta en relación OneToOne ya que el id se obtiene del id del otro extremo (Person)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_card")
    private Long idCard;



    @OneToOne
    //name es el nombre de la columna que tendrá Card en la BD
    //referencedColumnName es la columna de la que hace referencia en Person
    @JsonIgnore
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person person;



    private String number;
}
