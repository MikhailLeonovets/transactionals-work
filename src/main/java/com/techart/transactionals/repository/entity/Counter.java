package com.techart.transactionals.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "count")
    private Integer count;

    public Counter() {

    }

    public Counter(final String name, final Integer count) {
        this.name = name;
        this.count = count;
    }

    public Counter(final Long id, final String name, final Integer count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        final Counter counter = (Counter) o;
        return id != null && Objects.equals(id, counter.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
