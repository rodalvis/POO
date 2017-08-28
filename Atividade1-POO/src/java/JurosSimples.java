/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 */
@WebServlet(urlPatterns = {"/js"})
public class JurosSimples extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Juros Simples</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"rgb(7,8,9)\"><center>");
             out.println("<hr align='center' width='50%' size='80' color=blue>");
            out.println("<br>");
            out.println("<div><form> <h1>calculo de Juros Simples</h1> <br>");
            out.println("-valor inicial: <input type='text' name='v_i'> <br>");
            out.println("-meses: <input type='text' name='meses'> <br>");
            out.println("-percentual:<input type='text' name='i'> <br>");
            out.println("<input type='submit' name='Calcular'> <br>");
            out.print("</form></div>");
            //int altura= request.getParameter("altura"); Declaraçao para entrada de dados
            String v_i = request.getParameter("v_i");
            String i = request.getParameter("i") ;
            String mes = request.getParameter("meses") ;
            double js =0;
            double ms=(Double.parseDouble(mes));
            //double d = Double.parseDouble((String)
            //M = P . ( 1 + ( i . n ) )  calculo do montante simples
            double I = (Double.parseDouble(i)/100);
            //calculo de juros simples J = P . i . n
            double vi= Double.parseDouble(v_i);
            js =(vi* I * ms);
            double mont= (vi + js);
            out.println("O montante é de: "+mont+" e valorjuros:"+js+"<br>");
            
            out.println("</center></body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
