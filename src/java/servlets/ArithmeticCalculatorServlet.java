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
public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        request.setAttribute("message", "-----");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
        .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String valueOne = request.getParameter("firstValue");
        String valueTwo = request.getParameter("secondValue");
        String selection = request.getParameter("calculation");
        
        if(valueOne == null || valueOne.equals("") || valueTwo == null || valueTwo.equals(""))
        {
            request.setAttribute("message", "Sorry, this is invalid...");
        }
        else
        {
            try
            {
                int firstVal = Integer.parseInt(valueOne);
                int secondVal = Integer.parseInt(valueTwo);
                
                switch(selection)
                {
                    case "+":
                        request.setAttribute("message", String.valueOf(firstVal + secondVal));
                        break;
                    case "-":
                        request.setAttribute("message", String.valueOf(firstVal - secondVal));
                        break; 
                    case "*":
                        request.setAttribute("message", String.valueOf(firstVal * secondVal));
                        break; 
                    case "%":
                        request.setAttribute("message", String.valueOf(firstVal % secondVal));
                        break;    
                }
            }
            catch(NumberFormatException e)
            {
                request.setAttribute("message", "Sorry, this is invalid...");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
            .forward(request, response);
    }
}
