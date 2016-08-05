package cn.mldn.ele.controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.mldn.ele.beans.ShopsBean;
import cn.mldn.ele.serviceImpl.ShopsServiceImpl;

/**处理店铺陈列页
 * @author NXY
 * @version 1.0
 */
public class DoPlaceController extends HttpServlet {
	private static final long serialVersionUID = 3L;
	private ShopsServiceImpl shopsServiceImpl = new ShopsServiceImpl();
	private ShopsBean shopsBean = new ShopsBean();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cityCode = req.getParameter("cityCode");
		shopsBean.setCitycode(cityCode);
		List<ShopsBean> list = shopsServiceImpl.queryAll(shopsBean);
		StringBuilder builder = new StringBuilder();
		for(ShopsBean s:list){
			builder.append("<li><a href='doShop?sid="+s.getSid()+"'>");
			builder.append("	<div class='a_s_l'>");
			builder.append("		<div class='up_half'><img width='70' height='70' alt='店铺logo' src='https://fuss10.elemecdn.com/e/fa/f254bef6894407107457e7fe8535djpeg.jpeg'></div>");
			builder.append("		<div class='down_half'>"+s.getAvgtime()+"分钟</div>");
			builder.append("	</div>");
			builder.append("	<div class='a_s_r'>");
			builder.append("		<div class='row_1'>"+s.getName()+"</div>");
			builder.append("		<div class='row_2'>月售"+s.getSales()+"单</div>");
			builder.append("		<div class='row_3'>"+s.getLowest()+"元起送/配送费"+s.getTranscost()+"元</div>");
			builder.append("		<div class='row_4'>"+s.getReserve()+s.getFirstcut()+s.getFullcut()+s.getCutspecial()+s.getPayonline()+"</div>");
			builder.append("	</div>");
			builder.append("	<div class='details'></div>");
			builder.append("</a></li>");
		}
		req.setAttribute("shopsHtml", builder.toString());
		req.getRequestDispatcher("place.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init() throws ServletException {
	}
}
