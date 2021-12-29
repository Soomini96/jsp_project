package controller;

import controller.action.Action;
import controller.action.CheckIdAction;
import controller.action.JoinAction;
import controller.action.JoinFormAction;
import controller.action.LoginAction;
import controller.action.LoginFormAction;
import controller.action.LogoutAction;

// Factory Method 라는 거임 (생성 디자인 패턴) (마치 싱글톤처럼!)
public class ActionFactory {
	
	// 싱글톤으로 처리하자!
	private ActionFactory() {}
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	// command 패턴 -> 생성은 아니고, 행위 디자인임
	// 이런걸로 인해서 점점 코드가 클린해지는 거임
	public Action getAction(String command) {
		Action action = null;
		
		// 받아온 커맨드의 식별하는 곳~
		if(command.equals("login")) action = new LoginAction();
		if(command.equals("loginForm")) action = new LoginFormAction();
		else if(command.equals("joinForm")) action = new JoinFormAction();
		else if(command.equals("join")) action = new JoinAction();
		else if(command.equals("checkID")) action = new CheckIdAction();
		else if(command.equals("logout")) action = new LogoutAction();
		// ...
		
		return action;
	}
}
