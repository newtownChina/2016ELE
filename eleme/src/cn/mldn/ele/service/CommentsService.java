package cn.mldn.ele.service;
import java.util.List;
import cn.mldn.ele.beans.CommentsBean;
public interface CommentsService {
	int  add(CommentsBean commentsBean);
	int  remove(CommentsBean commentsBean);
	int modify(CommentsBean commentsBean);
	CommentsBean queryOne(CommentsBean commentsBean);
	List<CommentsBean> queryAll(CommentsBean commentsBean);
}
