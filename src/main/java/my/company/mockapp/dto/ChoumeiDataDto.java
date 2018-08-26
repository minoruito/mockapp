package my.company.mockapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ChoumeiDataDto {

	private String gyouseikuCd;
	private String gyouseiku;
	private String choumeiCd;
	private String choumei;
	
	public ChoumeiDataDto(String gyouseikuCd, String gyouseiku, String choumeiCd, String choumei) {
		this.gyouseikuCd = gyouseikuCd;
		this.gyouseiku = gyouseiku;
		this.choumeiCd = choumeiCd;
		this.choumei = choumei;		
	}
	public String getGyouseikuCd() {
		return gyouseikuCd;
	}
	public void setGyouseikuCd(String gyouseikuCd) {
		this.gyouseikuCd = gyouseikuCd;
	}
	public String getGyouseiku() {
		return gyouseiku;
	}
	public void setGyouseiku(String gyouseiku) {
		this.gyouseiku = gyouseiku;
	}
	public String getChoumeiCd() {
		return choumeiCd;
	}
	public void setChoumeiCd(String choumeiCd) {
		this.choumeiCd = choumeiCd;
	}
	public String getChoumei() {
		return choumei;
	}
	public void setChoumei(String choumei) {
		this.choumei = choumei;
	}
	
	
}
