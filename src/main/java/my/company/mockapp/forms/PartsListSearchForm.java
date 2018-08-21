package my.company.mockapp.forms;

import java.util.List;

import my.company.mockapp.dto.MasterDataDto;

public class PartsListSearchForm {
	
	private String bunrui;
	private String koukei;
	private String tani;
	
	private List<MasterDataDto> bunruiList;
	private List<MasterDataDto> koukeiList;
	private List<MasterDataDto> taniList;
	
	public String getBunrui() {
		return bunrui;
	}
	public void setBunrui(String bunrui) {
		this.bunrui = bunrui;
	}
	public String getKoukei() {
		return koukei;
	}
	public void setKoukei(String koukei) {
		this.koukei = koukei;
	}
	public String getTani() {
		return tani;
	}
	public void setTani(String tani) {
		this.tani = tani;
	}
	public List<MasterDataDto> getBunruiList() {
		return bunruiList;
	}
	public void setBunruiList(List<MasterDataDto> bunruiList) {
		this.bunruiList = bunruiList;
	}
	public List<MasterDataDto> getKoukeiList() {
		return koukeiList;
	}
	public void setKoukeiList(List<MasterDataDto> koukeiList) {
		this.koukeiList = koukeiList;
	}
	public List<MasterDataDto> getTaniList() {
		return taniList;
	}
	public void setTaniList(List<MasterDataDto> taniList) {
		this.taniList = taniList;
	}
	
	
	

}
