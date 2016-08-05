package cn.mldn.ele.dao;
import java.util.List;
import cn.mldn.ele.beans.CommentsBean;
public interface CommentsDao {
	int insert(CommentsBean commentsBean); 
	int delete(CommentsBean commentsBean);
	int update(CommentsBean commentsBean);
	CommentsBean select(CommentsBean commentsBean);
	List<CommentsBean> selectAll(CommentsBean commentsBean);
}
