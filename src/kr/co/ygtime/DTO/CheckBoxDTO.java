/* 
    파일명: CheckBoxDTO.java
    설명: 프로젝트 내용 추가 Service부
    작성일: 2018. 4. 9.
    작성자: 최 재 욱 
*/

package kr.co.ygtime.DTO;

public class CheckBoxDTO {
	private int cardNum;
	private int checkNum;
	private int checked;
	private String checkBoxContents;
	
	public CheckBoxDTO() {}
	
	public CheckBoxDTO(int cardNum, int checked, int checkNum, String checkBoxContents) {
		this.checkNum = checkNum;
		this.cardNum = cardNum;
		this.checked = checked;
		this.checkBoxContents = checkBoxContents;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	public int getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public String getCheckBoxContents() {
		return checkBoxContents;
	}
	public void setCheckBoxContents(String checkBoxContents) {
		this.checkBoxContents = checkBoxContents;
	}
	
	
}
