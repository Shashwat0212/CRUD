package net.java.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter//initializer for the getter methods
@Setter//initializer for the setter methods
@NoArgsConstructor//initializer for the no argument constructor
@AllArgsConstructor//initializer for the all argument constructor
@Entity//The @Entity annotation specifies that the class is an entity and is mapped to a database table.
@Table(name = "employees")// The @Table annotation specifies the name of the database table to be used for mapping
public class Employee {
    // specifies the primary key of an entity
    @Id
    //specification of generation strategies for the values of primary keys.
    //identity-Indicates that the persistence provider must assign primary keys for the entity using a database identity column.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;
}
