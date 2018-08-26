package my.company.mockapp.dto;

public class AmountReportDto {

	private String orderNo; //オーダー番号
	
	private String gyoseiku; //行政区

	private String bukkenmei; //物件名

	private String choumei; //町丁名

	private String koujiShubetu; //工事種別

	public AmountReportDto(String orderNo, String gyoseiku, String bukkenmei, String choumei, String koujiShubetu) {
		this.orderNo = orderNo;
		this.gyoseiku = gyoseiku;
		this.bukkenmei = bukkenmei;
		this.choumei = choumei;
		this.koujiShubetu = koujiShubetu;
	}
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getGyoseiku() {
		return gyoseiku;
	}

	public void setGyoseiku(String gyoseiku) {
		this.gyoseiku = gyoseiku;
	}

	public String getBukkenmei() {
		return bukkenmei;
	}

	public void setBukkenmei(String bukkenmei) {
		this.bukkenmei = bukkenmei;
	}

	public String getChoumei() {
		return choumei;
	}

	public void setChoumei(String choumei) {
		this.choumei = choumei;
	}

	public String getKoujiShubetu() {
		return koujiShubetu;
	}

	public void setKoujiShubetu(String koujiShubetu) {
		this.koujiShubetu = koujiShubetu;
	}
}
