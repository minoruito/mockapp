package my.company.mockapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GyouseikuDataDto {

	private String gyouseikuCd;
	private String gyouseiku;
	
	public GyouseikuDataDto(String gyouseikuCd, String gyouseiku) {
		this.gyouseikuCd = gyouseikuCd;
		this.gyouseiku = gyouseiku;
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
}
