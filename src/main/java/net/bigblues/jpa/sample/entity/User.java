package net.bigblues.jpa.sample.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sec_user")
public class User extends AbstractBaseEntity<Long> {

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 4, max = 12)
    private String password;

    @Min(0)
    private int age;

    @ManyToOne(optional = false)
    private Organization orga;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
