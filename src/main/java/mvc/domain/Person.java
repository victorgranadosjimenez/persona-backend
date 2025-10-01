package mvc.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@EqualsAndHashCode(of = "id_person")

@ToString
@Entity
@Table(name="person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @Column(name="id_person")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;

    @Column
    private String name;



    @OneToOne(mappedBy = "person")
    private Card card;



    /*
    ELEMENT COLLECTION (en vez de usar @OneToMany(mappedBy = "person"))
    Si no queremos que sea una colección de entidades, sino de tipos simples (Strings, BigDecimal, etc.)
    y se trata de un elemento que pertenece completamente a una entidad padre:
     solo se modifican cuando se modifica la entidad
     */
    @ElementCollection
    @CollectionTable(name = "person_phone_number", joinColumns = @JoinColumn(name="id_person"))
    @Column(name = "phone_number")
    private Set<String> phoneNumbers;




    @ElementCollection
    @CollectionTable(name = "person_addresses", joinColumns = @JoinColumn(name="id_person"))
    @AttributeOverrides({
            @AttributeOverride(name = "houseNumber", column = @Column(name="house_number")),
            @AttributeOverride(name = "city", column = @Column(name="city")),
            @AttributeOverride(name = "postCode", column = @Column(name="post_code")),
            @AttributeOverride(name = "street", column = @Column(name="street"))
    })
    private Set<Address> addresses = new HashSet<>();




    @Embedded   //para incrustar los valores de Address en la entidad Person
    private Address addressEmbedded;







    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Address getAddressEmbedded() {
        return addressEmbedded;
    }

    public void setAddressEmbedded(Address addressEmbedded) {
        this.addressEmbedded = addressEmbedded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getIdPerson(), person.getIdPerson()) && Objects.equals(getName(), person.getName()) && Objects.equals(getCard(), person.getCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPerson(), getName(), getCard());
    }
}
