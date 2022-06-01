package psn.nkcat.mapotofu.model;

import java.io.Serializable;

public class BaseUser implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BaseUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseUser(String name) {
        this.name = name;
    }
}