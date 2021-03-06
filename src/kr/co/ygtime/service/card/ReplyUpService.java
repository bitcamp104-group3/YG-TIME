/* 
    파일명: ReplyUpService.java
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

public class ReplyUpService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		try {
			String replyContents= request.getParameter("replyContents");
			int cardNum = Integer.parseInt(request.getParameter("cardNum"));
			int replyNum = Integer.parseInt(request.getParameter("replyNum"));
			
			CardDAO dao = new CardDAO();
			ReplyDTO replydto = new ReplyDTO();
			
			replydto.setReplyContents(replyContents);
			replydto.setCardNum(cardNum);
			replydto.setReplyNum(replyNum);
			
			int resultrow = dao.replyUpdate(replydto);
			
			forward = new ActionForward();
			request.setAttribute("resultrow", resultrow);
			forward.setPath("/ajaxpath/result_row.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return forward;
	}
	
}
