package com.can.me.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

/*
*     @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
       private List<Information> inforInformation;

* */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
