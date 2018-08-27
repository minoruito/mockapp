$(function() {
// ////////////////////////////////////
	// 清算コード選択ポップアップ
	// ////////////////////////////////////

	// タブ形状設定
	$("#seisan_code_select_popup_tabs").tabs();

	// 清算コード選択ポップアップ表示
	$("#seisan_code_select").on("click", function() {
		$("#seisan_code_select_popup").dialog('open');
	});
	$("#seisan_code_select_popup").dialog({
		autoOpen : false,
		modal : true,
		resizable : false,
		width : 'auto',
		height : 'auto',
		buttons : [ {
			text : "閉じる",
			click : function() {
				$(this).dialog('close');
			}
		} ]
	});

	// 選択ボタンクリック時処理
	$(".seisan_code_select_popup_tabs-1-button").on("click", function() {
		$("#seisan_code_select_popup").dialog("close");
		$.getJSON("get_basic_parts", {}, function(data) {
			// 行を消す
			$("#no_selected_data_message").css('display', 'none');
			$("#seisan_code_select_table").find("tr.data").each(function(i, elm) {
				$(this).remove();
			});
			
			// 取得した結果を表示する
			$("#seisan_code_select_table").css("display", "");
			$.each(data, function(row, val) {
				$("#seisan_code_select_table").append(
					'<tr class="data">' +
					  '<td>' + val["himokuCode"] + '<input id="basicPartList' + row + '.num" name="basicPartList[' + row + '].himokuCode" type="hidden" value="' + val["himokuCode"] + '"/></td>' +
					  '<td>' + val["himokuName"] + '<input id="basicPartList' + row + '.num" name="basicPartList[' + row + '].himokuName" type="hidden" value="' + val["himokuName"] + '"/></td>' +
					  '<td><input id="basicPartList' + row + '.num" name="basicPartList[' + row + '].num" type="text" value="' + val["num"].toFixed(1) + '" size="3"/></td>' +
					  '<td>' + val["tani"] + '<input id="basicPartList' + row + '.num" name="basicPartList[' + row + '].tani" type="hidden" value="' + val["tani"] + '"/></td>' +
					  '<td><a class="remove-button" href="#">削除</a></td>'+
					'</tr>');
			});
			Mockapp.addValidate();
		});
	});
});