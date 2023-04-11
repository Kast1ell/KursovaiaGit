package com.marketing.DataBase.pojoes;

import javax.persistence.*;

@Entity
@Table(name = "Report")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReportID")
    private int id;
    @Column(name = "UserLogin")
    private String login;
    //можно не указывать Column name, если оно совпадает с названием столбца в таблице
    @Column(name = "ProfileID")
    private int profile;
    @Column(name = "CalculationID")
    private int calculation;

    public Reports() {
    }

    public Reports(String login, int profile, int calculation) {
        this.login = login;
        this.profile = profile;
        this.calculation = calculation;
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

    public int getProfileID() {
        return profile;
    }

    public void setProfileID(int profileID) {
        this.profile = profileID;
    }
    public int getCalculationID() {
        return calculation;
    }

    public void setCalculationID(int calculationID) {
        this.calculation = calculationID;
    }


    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", profile=" + profile +
                ", calculation=" + calculation +
                '}';
    }
}
