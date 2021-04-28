
package br.com.mca.controller;

import br.com.mca.dao.LoginDao;
import br.com.mca.model.Login;
import java.sql.SQLException;
import java.util.ArrayList;


public class LoginController {
    
    public ArrayList<Login> buscarLoginSenha() throws SQLException, ClassNotFoundException{
        return LoginDao.buscarLogin();
    }

}
