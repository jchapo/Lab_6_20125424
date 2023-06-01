package Servlets;

import Beans.Cancion;
import Daos.CanBandaDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Canciones por Banda",urlPatterns = {"/listaCanBanda"})
public class CanBandaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CanBandaDao canbandadao = new CanBandaDao();
        ArrayList<Cancion> listaCanBanda = canbandadao.obtenerCanBanda();

        request.setAttribute("listaCanBanda",listaCanBanda);

        RequestDispatcher view =request.getRequestDispatcher("listaCanBanda.jsp");
        view.forward(request,response);
    }
}