/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webService;


import java.io.Serializable;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author aluno
 */
public class Login implements Serializable {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/login")
    
    public String login (String dados) {
        
        JSONObject obj =  new JSONObject(dados);
        
        String email = obj.getString("email");
        String senha = obj.getString("senha");
        
        System.out.println("Email ->" +email + " e a Senha ->" + senha);
        return null;
    }
    
    public String login () {
        
        return null;
    }
    
}
