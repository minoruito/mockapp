package my.company.mockapp.service;

import java.util.ArrayList;
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

}
