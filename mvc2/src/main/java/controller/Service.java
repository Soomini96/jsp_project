package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.action.Action;
import controller.action.LoginAction;

/**
 * Servlet implementation class Service
 */
@WebServlet("/service") // 소문자 service로 바꿈
// 대표 서블릿만 맵핑해주면 된다는 장점이 있음!
public class Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Service() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("[ServiceServlet]Served at:" + request.getContextPath());
		
//		Action action = new LoginAction();
//		action.execute(request, response);
		
		// request parameter "command" 안에 있는 명령을 확인한 후 -> 명령에 맞는 Action instance 가져오기
		String command = request.getParameter("command");
		
		ActionFactory af = ActionFactory.getInstance();
		Action action = af.getAction(command);
		
		if(action != null) { // 인스턴스 성공적으로 생성이 된 경우
			action.execute(request, response); // 이렇게 해도 되는 이유는..? -> 이 안에 가는 path가 있기 떄문
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
