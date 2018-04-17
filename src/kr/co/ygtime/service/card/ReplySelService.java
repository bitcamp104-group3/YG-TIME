/* 
    파일명: ReplySelService.java
    설명: 
    작성일: 2018. 4. 17.
    작성자: 김 진 원
*/

package kr.co.ygtime.service.card;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ygtime.Action.Action;
import kr.co.ygtime.Action.ActionForward;
import kr.co.ygtime.DAO.CardDAO;
import kr.co.ygtime.DTO.ReplyDTO;
import net.sf.json.JSONObject;

public class ReplySelService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		int CardNum = Integer.parseInt(request.getParameter("CardNum"));
		int ReplyNum = Integer.parseInt(request.getParameter("ReplyNum"));
		CardDAO dao = null;
		try {
			dao = new CardDAO();
			ReplyDTO replydto = dao.upLoadInsert(ReplyNum, CardNum);
			
			JSONObject json = JSONObject.fromObject(replydto);
			request.setAttribute("json", json);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		ActionForward forward = new ActionForward();
		forward.setPath("/ajaxpath/jsonObject.jsp");
		
		return forward;
	}
	
}