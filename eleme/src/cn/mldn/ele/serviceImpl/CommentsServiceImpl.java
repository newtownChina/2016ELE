package cn.mldn.ele.serviceImpl;
import java.util.List;
import cn.mldn.ele.beans.CommentsBean;
import cn.mldn.ele.dao.CommentsDao;
import cn.mldn.ele.daoImpl.CommentsDaoImpl;
import cn.mldn.ele.service.CommentsService;
public class CommentsServiceImpl implements CommentsService{
	private CommentsDao commentsDao = new CommentsDaoImpl(); 
	@Override
	public int add(CommentsBean commentsBean) {
		return commentsDao.insert(commentsBean);
	}

	@Override
	public int remove(CommentsBean commentsBean) {
		return commentsDao.delete(commentsBean);
	}

	@Override
	public int modify(CommentsBean commentsBean) {
		return commentsDao.update(commentsBean);
	}

	@Override
	public CommentsBean queryOne(CommentsBean commentsBean) {
		return commentsDao.select(commentsBean);
	}

	@Override
	public List<CommentsBean> queryAll(CommentsBean commentsBean) {
		return commentsDao.selectAll(commentsBean);
	}
	
}
