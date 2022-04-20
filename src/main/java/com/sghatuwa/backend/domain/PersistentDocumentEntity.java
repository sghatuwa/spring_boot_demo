package com.sghatuwa.backend.domain;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PersistentDocumentEntity {

    @Id
    private String id;

    @Column(nullable = false, name = "first_name")
    private String first_name;

    @Column(nullable = true, name = "middle_name")
    private String middle_name;

    @Column(nullable = true, name = "last_name")
    private String last_name;

    @Column(nullable = true, name = "address")
    private String address;

    @Column(nullable = true, name = "contact")
    private String contact;

    @Column(nullable = false, name = "country")
    private String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersistentDocumentEntity that = (PersistentDocumentEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
