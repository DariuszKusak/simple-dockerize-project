package com.kusak.dariusz.simpledockerizeproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "phone")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "producer_id", referencedColumnName = "id")
    private Producer producer;

    @Column(name = "model")
    private String model;
}
