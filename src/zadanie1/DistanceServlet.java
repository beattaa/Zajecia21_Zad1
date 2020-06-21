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

@WebServlet("/distanceServlet")
public class DistanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputm = request.getParameter("inputm");
        String inputcm = request.getParameter("inputcm");
        String inputmm = request.getParameter("inputmm");

        List<String> distanceData = new ArrayList<>();
        distanceData.add(inputm);
        distanceData.add(inputmm);
        distanceData.add(inputcm);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (DataCheck.checkIfDataIsCorrect(distanceData)) {
            if (!inputm.isEmpty()) {
                writer.println(DistanceCalculation.calculateForMeters(inputm));
            } else if (!inputcm.isEmpty()) {
                writer.println(DistanceCalculation.calculateForCentyMeters(inputcm));
            } else {
                writer.println(DistanceCalculation.calculateForMiliMeters(inputmm));
            }
        } else {
            writer.println("Niepoprawne dane, trzeba podac tylko jedna miare");
        }

    }
}
