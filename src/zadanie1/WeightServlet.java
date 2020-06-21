package zadanie1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/weightServlet")
public class WeightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputkg = request.getParameter("inputkg");
        String inputg = request.getParameter("inputg");
        String inputmg = request.getParameter("inputmg");

        List<String> weightData = new ArrayList<>();
        weightData.add(inputkg);
        weightData.add(inputg);
        weightData.add(inputmg);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (DataCheck.checkIfDataIsCorrect(weightData)) {
            if (!inputkg.isEmpty()) {
                writer.println(WeightCalculation.calculateForKiloGrams(inputkg));
            } else if (!inputg.isEmpty()) {
                writer.println(WeightCalculation.calculateForGrams(inputg));
            } else {
                writer.println(WeightCalculation.calculateForMiliGrms(inputmg));
            }
        } else {
            writer.println("Niepoprawne dane, trzeba podac tylko jedna miare");
        }

    }
}
