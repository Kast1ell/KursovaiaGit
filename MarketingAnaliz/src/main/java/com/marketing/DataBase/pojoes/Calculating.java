package com.marketing.DataBase.pojoes;

import javax.persistence.*;

@Entity
@Table(name = "Calculations")
public class Calculating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CalculationID")
    private int id;
    @Column(name = "UserLogin")
    private String login;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    @Column(name = "TableData")
    private String TableData;
    @Column(name = "GraphicData")
    private String GraphicData;
    @Column(name = "EnterData")
    private String EnterData;
    @Column(name = "Effective")
    private String effective;

    public Calculating() {
    }

    public Calculating(String login, String TableData, String GraphicData, String enterData, String effective) {
        this.login = login;
        this.TableData = TableData;
        this.GraphicData = GraphicData;
        this.EnterData = enterData;
        this.effective = effective;
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getTableData() {
        return TableData;
    }
    public void setTableData(String TableData) {
        this.TableData = TableData;
    }
    public String getGraphicData() {
        return GraphicData;
    }
    public void setGraphicData(String GraphicData) {
        this.GraphicData = GraphicData;
    }
    public String getEnterData() {
        return EnterData;
    }
    public void setEnterData(String EnterData) {
        this.EnterData = EnterData;
    }
    public String getEffective() {
        return effective;
    }
    public void setEffective(String effective) {
        this.effective = effective;
    }


    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", TableData=" + TableData +
                ", GraphicData=" + GraphicData +
                ", EnterData=" + EnterData +
                ", effective=" + effective +
                '}';
    }
}
