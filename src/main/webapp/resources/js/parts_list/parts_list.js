$(function() {
	// 行削除処理
	$(document).on("click", "tr.data a.remove-button", function() {
		if ($(this).closest('table').find('tr.data').length == 1) {
			$(this).closest('.listContent').find('.no_data_message').css('display', '');
			$(this).closest('table').css('display', 'none');
		}
		$(this).closest('tr').remove();
		return false;
	});
	
	//詳細設計登録ボタンクリック時処理
	$("#save_button").on("click", function() {
		$("#form").prop("action", "/mockapp/parts_list/save");
		$("#form").submit();		
	});
});

Mockapp.renumberingSeisanCodeAddTable = function() {
	$("#seisan_code_add_table").find("tr.data input.himokuCode").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.himokuCode');
		$(this).prop('name', 'addedPartList[' + idx + '].himokuCode');
	});
	$("#seisan_code_add_table").find("tr.data input.himokuCodeName1").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.himokuCodeName1');
		$(this).prop('name', 'addedPartList[' + idx + '].himokuCodeName1');
	});
	$("#seisan_code_add_table").find("tr.data input.himokuCodeName2").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.himokuCodeName2');
		$(this).prop('name', 'addedPartList[' + idx + '].himokuCodeName2');
	});
	$("#seisan_code_add_table").find("tr.data input.himokuCodeName3").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.himokuCodeName3');
		$(this).prop('name', 'addedPartList[' + idx + '].himokuCodeName3');
	});
	$("#seisan_code_add_table").find("tr.data input.himokuName").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.himokuName');
		$(this).prop('name', 'addedPartList[' + idx + '].himokuName');
	});
	$("#seisan_code_add_table").find("tr.data input.num").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.num');
		$(this).prop('name', 'addedPartList[' + idx + '].num');
	});
	$("#seisan_code_add_table").find("tr.data input.tani").each(function(idx, elm) {
		$(this).prop('id', 'addedPartList' + idx + '.tani');
		$(this).prop('name', 'addedPartList[' + idx + '].tani');
	});	
}