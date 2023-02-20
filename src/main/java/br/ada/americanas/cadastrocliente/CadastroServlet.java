package br.ada.americanas.cadastrocliente;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroServlet", value = "/cadastro")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = String.valueOf(request.getParameter("name"));
        String cpf = String.valueOf(request.getParameter("cpf"));

        PrintWriter writer = response.getWriter();
        writer.println("<html><body> <h2>Confirmacao de Cadastro</h2> <br>");
        writer.println("<h3>Nome: "+ name + "<br>CPF: " + cpf + "<br>Cadastro realizado com sucesso. </h3></body></html>");

    }
}
