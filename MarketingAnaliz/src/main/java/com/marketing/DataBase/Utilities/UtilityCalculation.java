package com.marketing.DataBase.Utilities;

import com.marketing.DataBase.DAOs.CalculationDAO;
import com.marketing.DataBase.pojoes.Calculating;

import java.util.List;

public class UtilityCalculation {
    private CalculationDAO calculationDAO = new CalculationDAO();

    public UtilityCalculation() {
    }

    public Calculating findUser(int id) {
        return calculationDAO.findById(id);
    }

    public void saveUser(Calculating user) {
        calculationDAO.save(user);
    }

    public void deleteUser(Calculating user) {
        calculationDAO.delete(user);
    }

    public void updateUser(Calculating user) {
        calculationDAO.update(user);
    }

    public List<Calculating> findAllUsers() {
        return calculationDAO.findAll();

    }

}
