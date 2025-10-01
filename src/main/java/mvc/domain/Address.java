package mvc.domain;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// AL SER EMBEDDABLE NO TENDRÁ ENTITY, NI ID, NI TENDRA REPOSITORY
//@Entity
@Embeddable
public class Address {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id_address;

    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String houseNumber;
    @Column
    private String postCode;

/* ESTO LO SUPRIMIMOS POR SER AHORA EMBEDDABLE EN VEZ DE ENTITY
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_person")
    @ToString.Exclude
    private Person person;
    */

}
