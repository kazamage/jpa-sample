package jp.pgw.develop.swallow.sample.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "children")
public class Child<T extends Parent> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_children")
    @SequenceGenerator(name = "seq_children", sequenceName = "seq_children")
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 127)
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Parent.class)
    private T parent;

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

    public T getParent() {
        return parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }

}
