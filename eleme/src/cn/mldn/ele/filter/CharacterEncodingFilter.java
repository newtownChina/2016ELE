package cn.mldn.ele.filter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CharacterEncodingFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest)req;
		HttpServletResponse httpServletResponse = (HttpServletResponse)resp;
		String method = httpServletRequest.getMethod();
		if(method.equalsIgnoreCase("GET")){
			httpServletResponse.setContentType("text/html;charset=utf-8");
		}else{
			httpServletRequest.setCharacterEncoding("utf-8");
			httpServletResponse.setContentType("text/html;charset=utf-8");
		}
		chain.doFilter(httpServletRequest, httpServletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
