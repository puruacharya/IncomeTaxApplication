/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SSI STUDENT
 */
public class TaxCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        double tax, rebate = 0.0,net=0.0;
        String income = req.getParameter("t1");
        String age = req.getParameter("t2");
        int in = Integer.parseInt(income);
        int ag = Integer.parseInt(age);
        if (in >= 1000000) {
            tax = in * 0.2;

        } else {
            tax = in * 0.10;
        }
        if (ag >= 60) {
            rebate = tax* 0.1;
        }
        net = tax-rebate;
    PrintWriter out = resp.getWriter();
    out.print("Your tax is : "+ tax);
    out.print("Your rebate is : "+ rebate);
    out.print("Your net payable tax is : "+ net);

}
    
}
