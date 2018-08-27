$(function() {
	// ////////////////////////////////////
	// 清算コード追加ポップアップ
	// ////////////////////////////////////

	// 清算コード追加ポップアップ表示
	$("#seisan_code_add").on("click", function() {
		$("#seisan_code_add_popup").dialog('open');
	});
	$("#seisan_code_add_popup").dialog({
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
	$(".seisan_code_add_popup_button").on("click", function() {
		$("#seisan_code_add_popup").dialog("close");
		var code = $(this).data("himokucode");
		$.getJSON(	"get_add_part", {"code" : code}, function(data) {
			// メッセージを消す
			$("#no_added_data_message").css('display', 'none');
			//取得した結果を表示する
			$("#seisan_code_add_table").css("display", "");
			$("#seisan_code_add_table").append(
				'<tr class="data">' +
					'<td>' + data["himokuCode"] + '<input class="himokuCode" id="addedPartList0.himokuCode" name="addedPartList[0].himokuCode" type="hidden" value="' + data["himokuCode"] + '" /></td>' +
					'<td>' + data["himokuCodeName1"] + '<input class="himokuCodeName1" id="addedPartList0.himokuCode" name="addedPartList[0].himokuCodeName1" type="hidden" value="' + data["himokuCodeName1"] + '" /></td>' +
					'<td>' + data["himokuCodeName2"] + '<input class="himokuCodeName2" id="addedPartList0.himokuCode" name="addedPartList[0].himokuCodeName2" type="hidden" value="' + data["himokuCodeName2"] + '" /></td>' +
					'<td>' + data["himokuCodeName3"] + '<input class="himokuCodeName3" id="addedPartList0.himokuCode" name="addedPartList[0].himokuCodeName3" type="hidden" value="' + data["himokuCodeName3"] + '" /></td>' +
					'<td>' + data["himokuName"] + '<input class="himokuName" id="addedPartList.himokuCode" name="addedPartList[0].himokuName" type="hidden" value="' + data["himokuName"] + '" /></td>' +
					'<td><input class="num" id="addedPartList0.num" name="addedPartList[0].num" type="text" value="' + data["num"].toFixed(1) + '" size="3" /></td>' +
					'<td>' + data["tani"] + '<input class="tani" id="addedPartList0.himokuCode" name="addedPartList[0].tani" type="hidden" value="' + data["tani"] + '" /></td>' +
					'<td><a class="remove-button" href="#">削除</a></td>' +
				'</tr>');
					
			//IDを振り直す
			Mockapp.renumberingSeisanCodeAddTable();
		});
	});
});
