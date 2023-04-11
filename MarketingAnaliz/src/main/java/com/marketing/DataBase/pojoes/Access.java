package com.marketing.DataBase.pojoes;

import javax.persistence.*;

@Entity
@Table (name = "Access")
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccessID")
    private int id;
    @Column(name = "AccessKey")
    private int key;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    @Column(name = "Access")
    private int access;

    public Access() {
    }

    public Access(int key, int access) {
        this.key = key;
        this.access = access;
    }
    public int getId() {
        return id;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public int getAccess() {
        return access;
    }
    public void setAccess(int access) {
        this.access = access;
    }


    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", access=" + access +
                '}';
    }
}
