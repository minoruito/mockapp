package my.company.mockapp.forms;

import java.util.List;

import javax.validation.Valid;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.dto.BasicPartDto;

public class AmountReportForm {

	//ヘッダー
	@Valid
	private String orderNo; //オーダー番号
	
	@Valid
	private String gyoseiku; //行政区

	@Valid
	private String bukkenmei; //物件名

	@Valid
	private String choumei; //町丁名
	@Valid
	private String koujiShubetu; //工事種別
	@Valid
	private Boolean koujiChecks1; //簡易なガス栓増設工事
	@Valid
	private Boolean koujiChecks2; //灯内軽工事
	@Valid
	private Boolean koujiChecks3; //増位・位置替工事
	@Valid
	private Boolean koujiChecks4; //撤去工事
	
	@Valid
	private Boolean mYoryo;
	@Valid
	private String materOrderNo;
	
	//詳細情報
	@Valid
	private String flexDiv;
	@Valid
	private String flexLineNum;
	
	@Valid
	private String miwarifuriKokoNum;

	@Valid
	private String note;
	@Valid
	private String naikanHaikanEnchoM;
	@Valid
	private String naikanTekkyoEnchoM;
	
	@Valid
	private List<AmountReportShosaiForm> toritsukeList;
	@Valid
	private List<AmountReportShosaiForm> TekkoList;
	
	@Valid
	private String gasSenNum;
	
	//見積情報
	@Valid
	private Boolean mitsumoriKyuujituSitei;
	@Valid
	private String haikanDai1;
	@Valid
	private Boolean mitumoriShouUnpanSitei;
	@Valid
	private String gasSenDai;
	@Valid
	private Boolean mitsumoriYakanSitei;
	@Valid
	private String futaiKoujiDai;
	@Valid
	private String kazeiKubun;
	@Valid
	private String tokubetsuKoujiA;
	@Valid
	private String hasuushoriKubun;
	@Valid
	private String tokubetsuKoujiB;
	@Valid
	private String hasuushoriKeitai;
	@Valid
	private String rin;
	@Valid
	private String kei;

	//契約情報
	@Valid
	private String seikyuusaki1;
	@Valid
	private String seikyuusaki2;
	@Valid
	private String seikyuusakiMei;

	@Valid
	private String nyuukinKigenbi;
	@Valid
	private String hakkouKakuteibi;
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
	public Boolean getKoujiChecks1() {
		return koujiChecks1;
	}
	public void setKoujiChecks1(Boolean koujiChecks1) {
		this.koujiChecks1 = koujiChecks1;
	}
	public Boolean getKoujiChecks2() {
		return koujiChecks2;
	}
	public void setKoujiChecks2(Boolean koujiChecks2) {
		this.koujiChecks2 = koujiChecks2;
	}
	public Boolean getKoujiChecks3() {
		return koujiChecks3;
	}
	public void setKoujiChecks3(Boolean koujiChecks3) {
		this.koujiChecks3 = koujiChecks3;
	}
	public Boolean getKoujiChecks4() {
		return koujiChecks4;
	}
	public void setKoujiChecks4(Boolean koujiChecks4) {
		this.koujiChecks4 = koujiChecks4;
	}
	public Boolean getmYoryo() {
		return mYoryo;
	}
	public void setmYoryo(Boolean mYoryo) {
		this.mYoryo = mYoryo;
	}
	public String getMaterOrderNo() {
		return materOrderNo;
	}
	public void setMaterOrderNo(String materOrderNo) {
		this.materOrderNo = materOrderNo;
	}
	public String getFlexDiv() {
		return flexDiv;
	}
	public void setFlexDiv(String flexDiv) {
		this.flexDiv = flexDiv;
	}
	public String getFlexLineNum() {
		return flexLineNum;
	}
	public void setFlexLineNum(String flexLineNum) {
		this.flexLineNum = flexLineNum;
	}
	public String getMiwarifuriKokoNum() {
		return miwarifuriKokoNum;
	}
	public void setMiwarifuriKokoNum(String miwarifuriKokoNum) {
		this.miwarifuriKokoNum = miwarifuriKokoNum;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getNaikanHaikanEnchoM() {
		return naikanHaikanEnchoM;
	}
	public void setNaikanHaikanEnchoM(String naikanHaikanEnchoM) {
		this.naikanHaikanEnchoM = naikanHaikanEnchoM;
	}
	public String getNaikanTekkyoEnchoM() {
		return naikanTekkyoEnchoM;
	}
	public void setNaikanTekkyoEnchoM(String naikanTekkyoEnchoM) {
		this.naikanTekkyoEnchoM = naikanTekkyoEnchoM;
	}
	public List<AmountReportShosaiForm> getToritsukeList() {
		return toritsukeList;
	}
	public void setToritsukeList(List<AmountReportShosaiForm> toritsukeList) {
		this.toritsukeList = toritsukeList;
	}
	public List<AmountReportShosaiForm> getTekkoList() {
		return TekkoList;
	}
	public void setTekkoList(List<AmountReportShosaiForm> tekkoList) {
		TekkoList = tekkoList;
	}
	public String getGasSenNum() {
		return gasSenNum;
	}
	public void setGasSenNum(String gasSenNum) {
		this.gasSenNum = gasSenNum;
	}
	public Boolean getMitsumoriKyuujituSitei() {
		return mitsumoriKyuujituSitei;
	}
	public void setMitsumoriKyuujituSitei(Boolean mitsumoriKyuujituSitei) {
		this.mitsumoriKyuujituSitei = mitsumoriKyuujituSitei;
	}
	public String getHaikanDai1() {
		return haikanDai1;
	}
	public void setHaikanDai1(String haikanDai1) {
		this.haikanDai1 = haikanDai1;
	}
	public Boolean getMitumoriShouUnpanSitei() {
		return mitumoriShouUnpanSitei;
	}
	public void setMitumoriShouUnpanSitei(Boolean mitumoriShouUnpanSitei) {
		this.mitumoriShouUnpanSitei = mitumoriShouUnpanSitei;
	}
	public String getGasSenDai() {
		return gasSenDai;
	}
	public void setGasSenDai(String gasSenDai) {
		this.gasSenDai = gasSenDai;
	}
	public Boolean getMitsumoriYakanSitei() {
		return mitsumoriYakanSitei;
	}
	public void setMitsumoriYakanSitei(Boolean mitsumoriYakanSitei) {
		this.mitsumoriYakanSitei = mitsumoriYakanSitei;
	}
	public String getFutaiKoujiDai() {
		return futaiKoujiDai;
	}
	public void setFutaiKoujiDai(String futaiKoujiDai) {
		this.futaiKoujiDai = futaiKoujiDai;
	}
	public String getKazeiKubun() {
		return kazeiKubun;
	}
	public void setKazeiKubun(String kazeiKubun) {
		this.kazeiKubun = kazeiKubun;
	}
	public String getTokubetsuKoujiA() {
		return tokubetsuKoujiA;
	}
	public void setTokubetsuKoujiA(String tokubetsuKoujiA) {
		this.tokubetsuKoujiA = tokubetsuKoujiA;
	}
	public String getHasuushoriKubun() {
		return hasuushoriKubun;
	}
	public void setHasuushoriKubun(String hasuushoriKubun) {
		this.hasuushoriKubun = hasuushoriKubun;
	}
	public String getTokubetsuKoujiB() {
		return tokubetsuKoujiB;
	}
	public void setTokubetsuKoujiB(String tokubetsuKoujiB) {
		this.tokubetsuKoujiB = tokubetsuKoujiB;
	}
	public String getHasuushoriKeitai() {
		return hasuushoriKeitai;
	}
	public void setHasuushoriKeitai(String hasuushoriKeitai) {
		this.hasuushoriKeitai = hasuushoriKeitai;
	}
	public String getRin() {
		return rin;
	}
	public void setRin(String rin) {
		this.rin = rin;
	}
	public String getKei() {
		return kei;
	}
	public void setKei(String kei) {
		this.kei = kei;
	}
	public String getSeikyuusaki1() {
		return seikyuusaki1;
	}
	public void setSeikyuusaki1(String seikyuusaki1) {
		this.seikyuusaki1 = seikyuusaki1;
	}
	public String getSeikyuusaki2() {
		return seikyuusaki2;
	}
	public void setSeikyuusaki2(String seikyuusaki2) {
		this.seikyuusaki2 = seikyuusaki2;
	}
	public String getSeikyuusakiMei() {
		return seikyuusakiMei;
	}
	public void setSeikyuusakiMei(String seikyuusakiMei) {
		this.seikyuusakiMei = seikyuusakiMei;
	}
	public String getNyuukinKigenbi() {
		return nyuukinKigenbi;
	}
	public void setNyuukinKigenbi(String nyuukinKigenbi) {
		this.nyuukinKigenbi = nyuukinKigenbi;
	}
	public String getHakkouKakuteibi() {
		return hakkouKakuteibi;
	}
	public void setHakkouKakuteibi(String hakkouKakuteibi) {
		this.hakkouKakuteibi = hakkouKakuteibi;
	}
	

    
}
