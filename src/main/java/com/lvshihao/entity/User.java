package com.lvshihao.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private int id;
    private String name;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                tercharId == user.tercharId &&
                Objects.equals(name, user.name) &&
                Objects.equals(describe, user.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, describe, tercharId);
    }

    private String describe;
    private int tercharId;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", tercharId=" + tercharId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getTercharId() {
        return tercharId;
    }

    public void setTercharId(int tercharId) {
        this.tercharId = tercharId;
    }
}
