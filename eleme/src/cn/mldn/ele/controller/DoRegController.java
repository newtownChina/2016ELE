package cn.mldn.ele.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.serviceImpl.CustomersServiceImpl;

/**处理用户注册
 * @author NXY
 * @version 1.0
 */
public class DoRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomersServiceImpl customersServiceImpl = new CustomersServiceImpl();
	private CustomersBean customersBean = new CustomersBean();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String phoneNumber = req.getParameter("phoneNumber");
		String password = req.getParameter("password");
		String veriCode = req.getParameter("veriCode");/*验证码逻辑待补充*/
		customersBean.setPhone(phoneNumber);
		customersBean.setPassword(password);
		int num = customersServiceImpl.add(customersBean);
		if(num==1){
			resp.sendRedirect("login.jsp");
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
	}
}
