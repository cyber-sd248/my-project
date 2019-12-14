package com.sathya.rms.services;

import com.sathya.rms.entities.Users;

public interface UsersService {

    public Iterable<Users> getAllUsers();
    public Users addUser(Users users);
    public Users updateUser(Users users);
    public void deleteUser(Integer id);
}
