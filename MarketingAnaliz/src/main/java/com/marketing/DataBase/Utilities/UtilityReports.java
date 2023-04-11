package com.marketing.DataBase.Utilities;

import com.marketing.DataBase.DAOs.ReportsDAO;
import com.marketing.DataBase.pojoes.Reports;

import java.util.List;

public class UtilityReports {
    private ReportsDAO reportsDAO = new ReportsDAO();

    public UtilityReports() {
    }

    public Reports findUser(int id) {
        return reportsDAO.findById(id);
    }

    public void saveUser(Reports user) {
        reportsDAO.save(user);
    }

    public void deleteUser(Reports user) {
        reportsDAO.delete(user);
    }

    public void updateUser(Reports user) {
        reportsDAO.update(user);
    }

    public List<Reports> findAllUsers() {
        return reportsDAO.findAll();

    }

}
