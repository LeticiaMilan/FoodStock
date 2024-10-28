package controller;

import dao.LoginDao;

public class LoginController {
    LoginDao loginDao = new LoginDao();
    
    public void fazerLogin(String email, String senha) {
        loginDao.fazerLogin(email, senha);
    }
}
