package ir.legocode.jpa04.domain;

import com.sun.xml.bind.v2.runtime.unmarshaller.TagName;
import ir.legocode.jpa04.base.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = User.TABLE_NAME)
public class User extends BaseEntity<Long> {
//
    public static final String TABLE_NAME = "user_table";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String AGE = "age";
   //
    @Column(name = User.FIRST_NAME)
    private String firstName;
    @Column(name = User.LAST_NAME)
    private String lastName;
    @Column(name = User.AGE)
    private String age;
//
    public User(String firstName, String lastName, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {
    }
//
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    //

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
