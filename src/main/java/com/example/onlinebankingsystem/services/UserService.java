package com.example.onlinebankingsystem.services;

import com.example.onlinebankingsystem.models.User;
import com.example.onlinebankingsystem.models.security.Role;
import com.example.onlinebankingsystem.models.security.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save (User user);

    User createUser(User user, Set<UserRole> userRoles);

    User saveUser (User user);

    List<User> findUserList();

    Role addRole(Long id, String name);
}