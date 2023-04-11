package com.marketing.DataBase.Utilities;

import com.marketing.DataBase.DAOs.UserProfilesDAO;
import com.marketing.DataBase.pojoes.UserProfiles;

import java.util.List;

public class UtilityProfiles {
    private UserProfilesDAO profilesDAO = new UserProfilesDAO();

    public UtilityProfiles() {
    }

    public UserProfiles findUser(int id) {
        return profilesDAO.findById(id);
    }

    public void saveUser(UserProfiles user) {
        profilesDAO.save(user);
    }

    public void deleteUser(UserProfiles user) {
        profilesDAO.delete(user);
    }

    public void updateUser(UserProfiles user) {
        profilesDAO.update(user);
    }

    public List<UserProfiles> findAllUsers() {
        return profilesDAO.findAll();

    }

}
