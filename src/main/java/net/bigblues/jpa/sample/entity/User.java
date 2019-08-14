package net.bigblues.jpa.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sec_user")
public class User extends AbstractBaseEntity<Long> {
}
