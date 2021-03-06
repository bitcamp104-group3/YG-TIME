/* 
    파일명: UpLoadDTO.java
    설명: 프로젝트 내용 추가 Service부
    작성일: 2018. 4. 9.
    작성자: 최 재 욱 
*/

package kr.co.ygtime.DTO;

public class UpLoadDTO {
	private int fileNum;
	private int cardNum;
	private String filePath;
	private String originFileName;
	public UpLoadDTO() {}
	
	public UpLoadDTO(int fileNum, int cardNum, String filePath, String originFileName) {
		this.fileNum = fileNum;
		this.cardNum = cardNum;
		this.filePath = filePath;
		this.originFileName = originFileName;
		
	}
	
	public String getOriginFileName() {
		return originFileName;
	}

	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}

	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}
	public int getCardNum() {
		return cardNum;
	}
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
