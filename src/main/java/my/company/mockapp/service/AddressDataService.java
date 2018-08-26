package my.company.mockapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import my.company.mockapp.dto.ChoumeiDataDto;
import my.company.mockapp.dto.GyouseikuDataDto;
import my.company.mockapp.dto.MasterDataDto;

@Service
public class AddressDataService {

	private final GyouseikuDataDto[] gyouseikuData = { 
			new GyouseikuDataDto("01", "千種区"), 
			new GyouseikuDataDto("02", "東区"), 
			new GyouseikuDataDto("03", "北区"), 
			new GyouseikuDataDto("04", "西区"), 
			new GyouseikuDataDto("05", "中村区"), 
			new GyouseikuDataDto("06", "中区"), 
			new GyouseikuDataDto("07", "昭和区"), 
			new GyouseikuDataDto("08", "瑞穂区"), 
			new GyouseikuDataDto("09", "熱田区"), 
			new GyouseikuDataDto("10", "中川区"), 
			new GyouseikuDataDto("11", "港区"), 
			new GyouseikuDataDto("12", "南区"), 
			new GyouseikuDataDto("13", "守山区"), 
			new GyouseikuDataDto("14", "緑区"), 
			new GyouseikuDataDto("15", "名東区"), 
			new GyouseikuDataDto("16", "天白区"), 
	};
			
			private final ChoumeiDataDto[] choumeiData = { 
			new ChoumeiDataDto("01", "千種区", "01", "青柳町"), 
			new ChoumeiDataDto("01", "千種区", "02", "赤坂町"), 
			new ChoumeiDataDto("01", "千種区", "03", "揚羽町"), 
			new ChoumeiDataDto("02", "東区", "01", "主税町"), 
			new ChoumeiDataDto("02", "東区", "02", "筒井町"), 
			new ChoumeiDataDto("02", "東区", "03", "徳川町"), 
			new ChoumeiDataDto("03", "北区", "01", "楠町"), 
			new ChoumeiDataDto("03", "北区", "02", "黒川本通"), 
			new ChoumeiDataDto("03", "北区", "03", "玄馬町"), 
			new ChoumeiDataDto("04", "西区", "01", "砂原町"), 
			new ChoumeiDataDto("04", "西区", "02", "中小田井１丁目"), 
			new ChoumeiDataDto("04", "西区", "03", "則武町"), 
			new ChoumeiDataDto("05", "中村区", "01", "笹島町"), 
			new ChoumeiDataDto("05", "中村区", "02", "太閤通１丁目"), 
			new ChoumeiDataDto("05", "中村区", "03", "太閤通２丁目"), 
			new ChoumeiDataDto("06", "中区", "01", "金山１丁目"), 
			new ChoumeiDataDto("06", "中区", "02", "金山２丁目"), 
			new ChoumeiDataDto("06", "中区", "03", "金山３丁目"), 
			new ChoumeiDataDto("07", "昭和区", "01", "鶴舞町"), 
			new ChoumeiDataDto("07", "昭和区", "02", "滝川町"), 
			new ChoumeiDataDto("07", "昭和区", "03", "吹上１丁目"), 
			new ChoumeiDataDto("08", "瑞穂区", "01", "川澄町"), 
			new ChoumeiDataDto("08", "瑞穂区", "02", "高辻町"), 
			new ChoumeiDataDto("08", "瑞穂区", "03", "佃町"), 
			new ChoumeiDataDto("09", "熱田区", "01", "金山町"), 
			new ChoumeiDataDto("09", "熱田区", "02", "古新町"), 
			new ChoumeiDataDto("09", "熱田区", "03", "５番町"), 
			new ChoumeiDataDto("10", "中川区", "01", "荒子１丁目"), 
			new ChoumeiDataDto("10", "中川区", "02", "荒子２丁目"), 
			new ChoumeiDataDto("10", "中川区", "03", "荒子３丁目"), 
			new ChoumeiDataDto("11", "港区", "01", "入場町"), 
			new ChoumeiDataDto("11", "港区", "02", "大江町"), 
			new ChoumeiDataDto("11", "港区", "03", "大手町"), 
			new ChoumeiDataDto("12", "南区", "01", "霞町"), 
			new ChoumeiDataDto("12", "南区", "02", "五条町"), 
			new ChoumeiDataDto("12", "南区", "03", "要町"), 
			new ChoumeiDataDto("13", "守山区", "01", "小幡１丁目"), 
			new ChoumeiDataDto("13", "守山区", "02", "小幡２丁目"), 
			new ChoumeiDataDto("13", "守山区", "03", "小幡３丁目"), 
			new ChoumeiDataDto("14", "緑区", "01", "有松町"), 
			new ChoumeiDataDto("14", "緑区", "02", "梅里１丁目"), 
			new ChoumeiDataDto("14", "緑区", "03", "梅里２丁目"), 
			new ChoumeiDataDto("15", "名東区", "01", "藤が丘"), 
			new ChoumeiDataDto("15", "名東区", "02", "引山１丁目"), 
			new ChoumeiDataDto("15", "名東区", "03", "引山２丁目"), 
			new ChoumeiDataDto("16", "天白区", "01", "植田１丁目"), 
			new ChoumeiDataDto("16", "天白区", "02", "植田２丁目"), 
			new ChoumeiDataDto("16", "天白区", "03", "植田３丁目"), 
	};

	public List<ChoumeiDataDto> findAddressData(String gyouseikuCd, String choumeiCd) {
		List<ChoumeiDataDto> list = new ArrayList<ChoumeiDataDto>();

		for (ChoumeiDataDto dto : choumeiData) {
			if (dto.getGyouseikuCd().equals(gyouseikuCd) && dto.getChoumeiCd().equals(choumeiCd)) {
				list.add(dto);
			}
		}
		return list;
	}

	public GyouseikuDataDto findGyoseikuData(String gyouseikuCd) {
		GyouseikuDataDto result = new GyouseikuDataDto("", "");
		for (GyouseikuDataDto dto : gyouseikuData) {
			if (dto.getGyouseikuCd().equals(gyouseikuCd)) {
				result = dto;
				break;
			}
		}
		
		return result;
	}

	public ChoumeiDataDto findChoumeiData(String gyouseikuCd, String choumeiCd) {
		ChoumeiDataDto result = new ChoumeiDataDto("", "", "", "");
		for (ChoumeiDataDto dto : choumeiData) {
			if (dto.getGyouseikuCd().equals(gyouseikuCd) && dto.getChoumeiCd().equals(choumeiCd)) {
				result = dto;
				break;
			}
		}
		return result;
	}
}
