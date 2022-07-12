package io.xstefank.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Test extends PanacheEntity {
    public String property;
}
