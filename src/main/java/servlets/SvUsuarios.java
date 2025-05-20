package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Crear una lista de tipo Usuario y la convierte a array list
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        //llamar al metodo getUsuarios de la controladora y guardarlos en la lista creada
        listaUsuarios = control.getUsuarios();
        
        //manejar los datos desde la sesion
        HttpSession misession = request.getSession();
        //se le pone una especie de alias al atributo y se le pasa la lista
        misession.setAttribute("listaUsuarios", listaUsuarios);
        
        System.out.println("Usuarios: "+ listaUsuarios.get(0));
        
        //cargar el jsp
        response.sendRedirect("verUsuarios.jsp");       
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //tomar los datos del fomulario
        String nombreUsuario = request.getParameter("nombreusu");
        String contra = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");

       control.crearUsuario(nombreUsuario,contra,rol);
        response.sendRedirect("index.jsp");
               
       
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
