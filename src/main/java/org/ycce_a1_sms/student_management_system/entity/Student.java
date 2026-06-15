package org.ycce_a1_sms.student_management_system.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

// @Entity is used to mark a java class as a database entity
//it tells hibernate/JPA , "this class should be mapped to a database table"
// now students becomes a database entity
@Entity
@Table(name = "students")
// @Table is used to specify the database table name, without hibernate uses the class name as table name
// this maps the class to table.
// common types
//INDENTITY = AUTO INCRAMENT
//AUTO = HIBERNATE CHOOSE Strategy
//SEQUENCE = USES DATABASE SEQ
//TABLE = USES SEPARATE TABLE FOR ID
public class Student
{
    @Id
    // is used to define primary key of the table
    @GeneratedValue(strategy = GenerationType.AUTO)
    // it is udsed to generate primary keys values automatically
    private  int id ;
    @Column(name = "first_name")
    //USED TO CUSTOMIZE TABLE COLS , WE CAN DEFINE ITS NAME , LENGTH , UNIQNESS , NULLABILITY.
    private  String firstName;
    @Column(name = "last_name")
    private  String lastName;
    private  String email;

    public Student(){
        super();
    }

    public Student(String email, String firstName, int id, String lastName) {
        super();
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
