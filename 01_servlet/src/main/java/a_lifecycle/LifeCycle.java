package a_lifecycle;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// http://localhost:8888/servlet/life URL 요청시 해당 Servlet 실행
@WebServlet("/life")
/*
 * * URL Mapping 등록방법
 *   1. Servlet 클래스 상단에 @WebServlet Annotation 활용
 *      @WebServlet("URLMapping")
 *      
 *   2. WEB-INF/web.xml 파일에 Servlet 클래스 등록시 매핑
 *      <servlet>
 *      	<servlet-name>LifeCycle</servlet-name>
 *      	<servlet-class>a_lifecycle.LifeCycle</servlet-class>
 *      </servlet>
 *      <servlet-mapping>
 *      	<servlet-name>LifeCycle</servlet-name>
 *      	<url-pattern>/life</url-pattern>
 *      </servlet-mapping>
 */


public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
