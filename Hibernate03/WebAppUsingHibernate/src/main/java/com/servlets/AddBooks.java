package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Books;
import com.operations.BookOperations;

/**
 * Servlet implementation class AddBooks
 */
@WebServlet("/AddBooks")
public class AddBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String bname = request.getParameter("txtBname");
		String author = request.getParameter("txtAuthor");
		
		Books book = new Books();
		book.setBookname(bname);
		book.setAuthor(author);
		
		BookOperations bop = new BookOperations();
		bop.AddBooks(book);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>Book Added....</h2>");
		request.getRequestDispatcher("NewBooks.html").include(request, response);
	}
}
