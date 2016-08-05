package cn.mldn.ele.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**处理提交的订单
 * @author NXY
 * @version 1.0
 */
public class DoCheckoutController extends HttpServlet {
	private static final long serialVersionUID = 6L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String gid = req.getParameter("gid");
		req.getRequestDispatcher("checkout.jsp").forward(req, resp);
	}
	@Override
	public void destroy() {
	}

	@Override
	public void init() throws ServletException {
	}
}
