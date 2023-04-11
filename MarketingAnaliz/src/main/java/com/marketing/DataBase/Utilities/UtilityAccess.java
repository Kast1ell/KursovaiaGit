package com.marketing.DataBase.Utilities;

import com.marketing.DataBase.pojoes.Access;
import com.marketing.DataBase.DAOs.AccessDAO;

import java.util.List;

public class UtilityAccess {
    private AccessDAO accessDAO = new AccessDAO();

    public UtilityAccess() {
    }

    public Access findUser(int id) {
        return accessDAO.findById(id);
    }

    public void saveUser(Access user) {
        accessDAO.save(user);
    }

    public void deleteUser(Access user) {
        accessDAO.delete(user);
    }

    public void updateUser(Access user) {
        accessDAO.update(user);
    }

    public List<Access> findAllUsers() {
        return accessDAO.findAll();

    }

}
