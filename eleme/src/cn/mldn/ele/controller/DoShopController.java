package cn.mldn.ele.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.mldn.ele.beans.GoodsBean;
import cn.mldn.ele.beans.ShopsBean;
import cn.mldn.ele.serviceImpl.GoodsServiceImpl;
import cn.mldn.ele.serviceImpl.ShopsServiceImpl;

/**处理店铺页
 * @author NXY
 * @version 1.0
 */
public class DoShopController extends HttpServlet {
	private static final long serialVersionUID = 5L;
	private ShopsServiceImpl shopsServiceImpl = new ShopsServiceImpl();
	private GoodsServiceImpl goodsServiceImpl = new GoodsServiceImpl();
	private ShopsBean shopsBean = new ShopsBean();
	private GoodsBean goodsBean = new GoodsBean();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String sid = req.getParameter("sid");
		shopsBean.setSid(Integer.valueOf(sid));
		shopsBean = shopsServiceImpl.queryOne(shopsBean);
		req.setAttribute("shop", shopsBean);
		/*处理所有食物*/
		goodsBean.setSid(Integer.valueOf(sid));
		List<GoodsBean> list = goodsServiceImpl.queryAll(goodsBean);
		StringBuilder builder = new StringBuilder();
		for(GoodsBean g:list){
			builder.append("<li>");
			builder.append("	<div class='img'><img src='"+g.getPicture()+"' width='100' height='100' alt='食物样图'></div>");
			builder.append("	<div class='describe'>");
			builder.append("		<h5>"+g.getName()+"</h5>");
			builder.append("		<span>星级:"+g.getRank()+"</span>");
			builder.append("		<span>"+g.getPrice()+"元</span>");
			builder.append("		<a href='javascript:void(0)' data-gid="+g.getGid()+" data-name="+g.getName()+" data-price="+g.getPrice()+">加入购物车</a>");
			builder.append("	</div>");
			builder.append("</li>");
		}
		req.setAttribute("goodsHtml", builder.toString());
		req.getRequestDispatcher("shop.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init() throws ServletException {
	}

}
