package controller;

import dao.LoginDao;

public class LoginController {
    LoginDao loginDao = new LoginDao();
    
    public int fazerLogin(String email, String senha) {
        return loginDao.fazerLogin(email, senha);
    }
}
