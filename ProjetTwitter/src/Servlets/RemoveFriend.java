package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class RemoveFriend extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String key = req.getParameter("key");
		String friend_id = req.getParameter("friend_id");
		resp.setContentType( " text / plain " );
		PrintWriter out = resp.getWriter ();
		JSONObject resul = Services.ServiceFriend.removeFriend(key,Integer.parseInt(friend_id));
		out.print(resul.toString());
	}

}
