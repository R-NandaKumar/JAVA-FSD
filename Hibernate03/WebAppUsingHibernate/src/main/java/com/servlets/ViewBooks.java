package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Books;
import com.operations.BookOperations;

/**
 * Servlet implementation class ViewBooks
 */
@WebServlet("/ViewBooks")
public class ViewBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		BookOperations  bop = new BookOperations();
		List<Books>  bookall = bop.ViewAll();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<table width='100%' border='1'>");
		out.print("<tr><th>Book Number</th><th>Book Name</th><th>Author</th></tr>");
		for(Books b : bookall)
		{
			out.print("<tr>");
			out.print("<td>" + b.getBookno() + "</td>");
			out.print("<td>" + b.getBookname() + "</td>");
			out.print("<td>" + b.getAuthor() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}
}
