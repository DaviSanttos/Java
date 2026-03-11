package model.entities;

import java.util.Date;

public class Produto {
    String name;
    int id;
    Date data;
    Double valorTotal;

    public Integer getId() { return id; }
    public String getName() {
        return name;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setId(int id) {
        this.id = id;
    }
}
