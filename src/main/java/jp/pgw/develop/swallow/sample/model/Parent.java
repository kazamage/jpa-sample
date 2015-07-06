package jp.pgw.develop.swallow.sample.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parents")
public class Parent<T extends Child> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_parents")
    @SequenceGenerator(name = "seq_parents", sequenceName = "seq_parents")
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 127)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Child.class, mappedBy = "parent")
    private List<T> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }

}
