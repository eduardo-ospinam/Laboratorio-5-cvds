import java.io.IOException;
import java.io.Writer;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
	    urlPatterns = "/pruebaOspinaMedina"
	)

public class herederaServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Writer responseWriter = resp.getWriter();
	    Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
		String parametroId = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
		       
		 }
}