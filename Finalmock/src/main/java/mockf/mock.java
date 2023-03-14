package mockf;

public class mock extends ht{

	
	int num3=Integer.parseInt(req.getParameter("frist"));
	res.getWriter().print(num3);

	req.setAttribute("number", num3);
	req.getRequestDispatcher("task1.jsp").forward(req, res);;
	
	
	
}
