package my.company.mockapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import my.company.mockapp.dto.AddedPartDto;
import my.company.mockapp.dto.BasicPartDto;

@Service
public class PartsListService {

	private final BasicPartDto[] basicPartData = {
	                                           new BasicPartDto("M222", "基本工事費（灯内軽時）",1.0, "式"),
	                                           new BasicPartDto("C282", "Fネジガス栓 UI 20x20,25,20",2.0, "個"),
	                                           new BasicPartDto("J227", "ネジガス栓付属品 20A",1.0, "式"),
	                                           new BasicPartDto("P100", "新設戸建フレキ施行長",0.5, "m"),
	                                           new BasicPartDto("P338", "軽工事配管費 フレキ管 20A",0.5, "m"),
	};

	
	private final AddedPartDto[] addedPartData = {
            new AddedPartDto("M225", "基本工事", "贈位ネジ、増設・入替フレキ", "ガス栓２栓目以降", "2栓以降基本工事費（灯内軽工事）", 1.0, "式"),
            new AddedPartDto("S111", "内管", "撤去", "3/4(20\')", "軽工事配管費 白SS管15A", 1.0, "m"),
            new AddedPartDto("S112", "内管", "撤去", "3/4(20\')", "軽工事配管費 白SS管20A", 1.0, "m"),
            new AddedPartDto("T115", "内管", "撤去", "3/4(20\')", "撤去配管費 15A", 1.0, "m"),
            new AddedPartDto("T120", "内管", "撤去", "3/4(20\')", "撤去配管費 20A", 1.0, "m"),
            new AddedPartDto("T600", "内管", "撤去", "3/4(20\')", "フレキ管撤去工事費 32A以下", 1.0, "m"),
            new AddedPartDto("A111", "内管", "撤去", "3/4(20\')", "切断工事費 32A以下", 1.0, "m"),
            new AddedPartDto("A130", "内管", "設置", "3/4(20\')", "大型湯沸機取付費 BF型意外の機器", 1.0, "m"),
            new AddedPartDto("F210", "内管", "設置", "3/4(20\')", "VC絶縁継手(ソケット・エルボ型)(内管)15A", 1.0, "m"),
            new AddedPartDto("F211", "内管", "設置", "3/4(20\')", "VC絶縁継手(ソケット・エルボ型)(内管)20A", 1.0, "m"),
            new AddedPartDto("C165", "内管", "設置", "3/4(20\')", "Fガスコンセント(S露出) 9.5A", 1.0, "m"),
            new AddedPartDto("C292", "内管", "設置", "3/4(20\')", "Fネジガス栓UL  (予備栓付) 15x15", 1.0, "m"),
            new AddedPartDto("C164", "内管", "設置", "3/4(20\')", "ガスコンセント(S露出) 9.5A", 1.0, "m"),
            new AddedPartDto("C159", "内管", "設置", "3/4(20\')", "可とう管ガス栓(I,L) 15A", 1.0, "m"),
            new AddedPartDto("J222", "内管", "設置", "3/4(20\')", "ケースガス栓付属品(屋内用) 10A,15A", 1.0, "m"),
	};
	
	private final AddedPartDto[] searchAddedPartData = {
            new AddedPartDto("M201", "基本工事", "木、フレキ", "1栓", "増設・入替フレキ基本工事費 25A以下", 1.0, "式"),
            new AddedPartDto("M202", "基本工事", "木、フレキ", "2栓以上", "2栓目以降増設入替フレキ基本工事費 25A以下", 1.0, "式"),
            new AddedPartDto("M132", "基本工事", "木質ネジ", "贈位", "増設・入替フレキ基本工事費 32A以下", 1.0, "式"),
            new AddedPartDto("M432", "基本工事", "木質ネジ", "撤去", "撤去ネジ基本工事費 32A以下", 1.0, "式"),
            new AddedPartDto("S115", "内管", "新パイプ", "白SS管1/2(15)", "亜鉛メッキ鋼管(白SS管)15A", 1.0, "m"),
            new AddedPartDto("S120", "内管", "新パイプ", "白SS管3/4(20)", "亜鉛メッキ鋼管(白SS管)20A", 1.0, "m"),
            new AddedPartDto("S125", "内管", "新パイプ", "白SS管1(25)", "亜鉛メッキ鋼管(白SS管)25A", 1.0, "m"),
            new AddedPartDto("S132", "内管", "新パイプ", "白SS管1 1/4(32)", "亜鉛メッキ鋼管(白SS管)32A", 1.0, "m"),
            new AddedPartDto("K115", "内管", "新パイプ", "VL管1/2(15)", "塩化ビニール被覆鋼管(VL管)15A", 1.0, "m"),
            new AddedPartDto("K120", "内管", "新パイプ", "VL管3/4(20)", "塩化ビニール被覆鋼管(VL管)15A", 1.0, "m"),
            new AddedPartDto("K125", "内管", "新パイプ", "VL管1(25)", "塩化ビニール被覆鋼管(VL管)15A", 1.0, "m"),
            new AddedPartDto("K132", "内管", "新パイプ", "VL管1 1/4(32)", "塩化ビニール被覆鋼管(VL管)15A", 1.0, "m"),
	};	

	public List<BasicPartDto> getBasicParts(){
		List<BasicPartDto> list = new ArrayList<BasicPartDto>();
		
		for (BasicPartDto m : basicPartData) {
			list.add(m);
		}
		return list;
		
	}

	public List<AddedPartDto> getAddedParts(){
		List<AddedPartDto> list = new ArrayList<AddedPartDto>();
		
		for (AddedPartDto m : addedPartData) {
			list.add(m);
		}
		return list;
		
	}
	
	public AddedPartDto getAddedPart(String code) {
		AddedPartDto result = null;
		for(AddedPartDto dto : addedPartData) {
			if (dto.getHimokuCode().equals(code)) {
				result = dto;
			}
		}
		return result;
	}
	
	public List<AddedPartDto> searchAddedParts(String bunrui, String koukei, String tani){
		List<AddedPartDto> list = new ArrayList<AddedPartDto>();
		
		for (AddedPartDto m : searchAddedPartData) {
			boolean bunruiFlag = false;
			boolean koukeiFlag = false;
			boolean taniFlag = false;
			if (m.getHimokuCodeName1().indexOf(bunrui) >= 0) {
				bunruiFlag = true;
			}
			if (m.getHimokuCodeName2().indexOf(koukei) >= 0) {
				koukeiFlag = true;
			}
			if (m.getHimokuCodeName3().indexOf(tani) >= 0) {
				taniFlag = true;
			}
			
			if (bunrui.isEmpty() && koukei.isEmpty() && tani.isEmpty()) {
				list.add(m);
			} else {
				if (bunruiFlag || koukeiFlag || taniFlag) {
					list.add(m);
				}
			}
		}
		return list;
		
	}
	
	public List<AddedPartDto> getAddedPartList(String[] himokus){
		List<AddedPartDto> list = new ArrayList<AddedPartDto>();
		
		for (AddedPartDto m : searchAddedPartData) {
			if (Arrays.asList(himokus).contains(m.getHimokuCode())) {
				list.add(m);
			}
		}
		return list;
	}

}
