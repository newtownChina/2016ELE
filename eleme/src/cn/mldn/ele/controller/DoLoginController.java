package cn.mldn.ele.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.serviceImpl.CustomersServiceImpl;

/**处理用户登录
 * @author NXY
 * @version 1.0
 */
public class DoLoginController extends HttpServlet {
	private static final long serialVersionUID = 2L;
	private CustomersServiceImpl customersServiceImpl = new CustomersServiceImpl();
	private CustomersBean customersBean = new CustomersBean();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String phoneNumber = req.getParameter("username");
		String password = req.getParameter("password");
		String veriCode = req.getParameter("veriCode");/*验证码逻辑待补充*/
		if(phoneNumber==""||password==""){
			resp.getWriter().print("<script>alert('用户名或者密码错误')</script>");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			
		}else{
			customersBean.setPhone(phoneNumber);
			customersBean.setPassword(password);
			customersBean = customersServiceImpl.queryOne(customersBean);
			if(customersBean.getCid()!=0 && customersBean.getCid()!=null){
				resp.sendRedirect("index.jsp");
			}else{
				resp.getWriter().print("<script>alert('用户名或者密码错误')</script>");
			}
		}
	}

	@Override
	public void destroy() {
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
	}
}
