/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta1.lab8;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Владимир
 */
@WebServlet(name = "Lab8Servlet", urlPatterns = {"/lab8"})
public class Lab8Servlet extends HttpServlet {

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
            out.println("<title>Servlet Lab8Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab8Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
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
        String x = request.getParameter("x");
        String res = "";
        if (x.equals("")) {
            res = "Please enter array elements ";
        }
        String[] arrString = x.split(" ");
        int arr[] = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

        String sizeString = request.getParameter("size");
        if (sizeString.equals("")) {
            res = "Please enter array length";
        }
        int size = Integer.parseInt(sizeString);

        request.setAttribute("input_error", res);

        if (res.isEmpty()) {

            request.setAttribute("res_1", Solution.toString(Solution.productExceptSelf1(arr, size), size));
            request.setAttribute("res_2", Solution.toString(Solution.productExceptSelf2(arr, size), size));
            request.setAttribute("res_3", Solution.toString(Solution.productExceptSelf3(arr, size), size));
        }

        request.getRequestDispatcher("lab8.jsp").forward(request, response);
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
