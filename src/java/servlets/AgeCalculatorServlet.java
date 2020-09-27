package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos Hildisheim 820203
 */
public class AgeCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String userAge = request.getParameter("age");
        
        request.setAttribute("age", userAge);
        
        if(userAge== null || userAge.equals(""))
        {
            request.setAttribute("message", "Invalid entry. Please enter a valid age. ");
        }
        else
        {
            try
            {
                int newAge = Integer.parseInt(userAge) + 1;
                request.setAttribute("message", "You will be: " + newAge + " on your next birthday!");
            }
            catch (NumberFormatException e)
            {
                request.setAttribute("message", "Please enter a number.");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
            .forward(request, response);
    }
}
