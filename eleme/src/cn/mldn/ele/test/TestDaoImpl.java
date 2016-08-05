package cn.mldn.ele.test;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import cn.mldn.ele.beans.CommentsBean;
import cn.mldn.ele.beans.CustomersBean;
import cn.mldn.ele.beans.DetailsBean;
import cn.mldn.ele.beans.OrdersBean;
import cn.mldn.ele.daoImpl.CommentsDaoImpl;
import cn.mldn.ele.daoImpl.CustomersDaoImpl;
import cn.mldn.ele.daoImpl.DetailsDaoImpl;
import cn.mldn.ele.daoImpl.OrdersDaoImpl;
import cn.mldn.ele.util.DateTime;
public class TestDaoImpl {
	//成功
	@Test
	public void testInsert(){
		DetailsBean detailsBean = new DetailsBean();
		detailsBean.setOid(1);
		detailsBean.setGid(1);
		detailsBean.setTitle("一张订单详情");
		new DetailsDaoImpl().insert(detailsBean);
	}//成功
	@Test
	public void testDelete(){
		CommentsBean commentsBean = new CommentsBean();
		commentsBean.setCid(null);
		commentsBean.setGid(1);
		commentsBean.setName("张三");
		commentsBean.setComment("一个测试");
		new CommentsDaoImpl().delete(commentsBean);
	}
	//成功
	@Test
	public void testUpdate(){
		CommentsBean commentsBean = new CommentsBean();
		commentsBean.setCid(1);
		commentsBean.setGid(1);
		commentsBean.setName("张三");
		commentsBean.setComment("测试更新");
		new CommentsDaoImpl().update(commentsBean);
	}//成功
	@Test
	public void testSelect(){
		CommentsBean commentsBean = new CommentsBean();
		commentsBean.setCid(1);
		commentsBean.setGid(1);
		commentsBean.setName("张三");
		commentsBean.setComment("一个测试");
		String comments = new CommentsDaoImpl().select(commentsBean).getComment();
		System.out.println(comments);;
	}
	@Test
	public void testSelectAll(){
		CommentsBean commentsBean = new CommentsBean();
		commentsBean.setCid(1);
		commentsBean.setGid(1);
		commentsBean.setName("张三");
		commentsBean.setComment("测试更新");
		List<CommentsBean> comments = new CommentsDaoImpl().selectAll(commentsBean);
		for(CommentsBean commentsBean2:comments){
			System.out.println(commentsBean2.getComment());			
		}
	}
}
