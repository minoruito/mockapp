$(function() {
	// 行削除処理
	$(document).on("click", "tr.data a.-button", function() {
		if ($(this).closest('table').find('tr.data').length == 1) {
			$(this).closest('.listContent').find('.no_data_message').css('display', '');
			$(this).closest('table').css('display', 'none');
		}
		$(this).closest('tr').remove();
		return false;
	});

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
					'<tr class="data"><td>' + val["himokuCode"] + '</td><td>' + val["himokuName"] + '</td><td>' + val["num"].toFixed(1) + '</td><td>' + val["tani"] + '</td><td><a class="-button" href="#">削除</a></td></tr>');
			});
		});
});

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
				'<tr class="data"><td>' + data["himokuCode"] + '</td><td>' + data["himokuCodeName1"] + '</td><td>' + data["himokuCodeName2"] + '</td><td>' + data["himokuCodeName3"] + '</td><td>' + data["himokuName"] + '</td><td>' + data["num"].toFixed(1) + '</td><td>' + data["tani"] + '</td><td><a class="-button" href="#">削除</a></td></tr>');
		});
	});

	// ////////////////////////////////////
	// 清算コード検索ポップアップ
	// ////////////////////////////////////

	// タブ形状設定
	$("#seisan_code_search_popup_tabs").tabs();

	// 清算コード検索ポップアップ表示
	$("#seisan_code_search").on("click", function() {
		$("#seisan_code_search_popup").dialog('open');
	});
	$("#seisan_code_search_popup").dialog({
		autoOpen : false,
		modal : true,
		resizable : false,
		width : 'auto',
		height : 'auto',
		buttons : [ {
			text : "閉じる",
			click : function() {
				$("#seisan_code_search_popup_tabs-1_table").css("display", "none");
				$(this).dialog('close');
			}
		},
		 {
			text : "精算費目コード追加",
			click : function() {
				$("#seisan_code_search_popup_tabs-1_table").css("display", "none");
				var params = [];
				$(".checkbox:checked").each(function(i, elm) {
					params.push($(elm).val());
				});
				if (params.length > 0) {
					$.ajax({
						url:'get_added_part_list',
						type:'GET',
						data:{
							'himokus': params
						}
					})
					.done( (data) => {
						//取得した結果を表示する
						for(var i in data){
							// メッセージを消す
							$("#no_added_data_message").remove();

							$("#seisan_code_add_table").css("display", "");
							$("#seisan_code_add_table").append(
									'<tr class="data"><td>' + data[i].himokuCode + '</td><td>' + data[i].himokuCodeName1 + '</td><td>' + data[i].himokuCodeName2 + '</td><td>' + data[i].himokuCodeName3 + '</td><td>' + data[i].himokuName + '</td><td>' + data[i].num.toFixed(1) + '</td><td>' + data[i].tani + '</td><td><a class="remove-button" href="#">削除</a></td></tr>');
						}
					})
				}
				$(this).dialog('close');
				$("#seisan_code_add_popup").dialog("close");
			}
		}
		]
	});
	
	//増設・位置替え・撤去工事タブ
	$("#searchForm1").on("submit", function() {
		var bunrui = $("#searchForm1_bunrui").val();
		var koukei = $("#searchForm1_koukei").val();
		var tani = $("#searchForm1_tani").val();
		$.getJSON("search_add_parts", {"bunrui" : bunrui, "koukei" : koukei, "tani" : tani}, function(data) {
			// 行を消す
			$("#seisan_code_search_popup_tabs-1_table").find("tr.data").each(function(i, elm) {
				$(this).remove();
			});

			//取得した結果を表示する
			$("#seisan_code_search_popup_tabs-1_table").css("display", "");
			for(var i in data){
				$("#seisan_code_search_popup_tabs-1_table").append(
						'<tr class="data"><td><input type="checkbox" class="searchForm1 checkbox" value="'+  data[i].himokuCode + '" /></td><td>' + data[i].himokuCode + '</td><td>' + data[i].himokuCodeName1 + '</td><td>' + data[i].himokuCodeName2 + '</td><td>' + data[i].himokuCodeName3 + '</td><td>' + data[i].himokuName + '</td><td>' + data[i].tani + '</td></tr>');
			}
			
		});
		return false;
	});

	//共通(ガス栓・付帯工事)タブ
	$("#searchForm2").on("submit", function() {
		var bunrui = $("#searchForm2_bunrui").val();
		var koukei = $("#searchForm2_koukei").val();
		var tani = $("#searchForm2_tani").val();
		$.getJSON("search_add_parts", {"bunrui" : bunrui, "koukei" : koukei, "tani" : tani}, function(data) {
			// 行を消す
			$("#seisan_code_search_popup_tabs-2_table").find("tr.data").each(function(i, elm) {
				$(this).remove();
			});

			//取得した結果を表示する
			$("#seisan_code_search_popup_tabs-2_table").css("display", "");
			for(var i in data){
				$("#seisan_code_search_popup_tabs-2_table").append(
						'<tr class="data"><td><input type="checkbox" class="searchForm1 checkbox" value="'+  data[i].himokuCode + '" /></td><td>' + data[i].himokuCode + '</td><td>' + data[i].himokuCodeName1 + '</td><td>' + data[i].himokuCodeName2 + '</td><td>' + data[i].himokuCodeName3 + '</td><td>' + data[i].himokuName + '</td><td>' + data[i].tani + '</td></tr>');
			}
			
		});
		return false;
	});
});