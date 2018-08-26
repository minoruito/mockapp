$(function() {
	$("#seachOrderNo").on("click", function() {
		$("form").validate().cancelSubmit = true;
		if ($("#orderNo").val() != "") {
			$("#form").prop("action", "/mockapp/amount_report/search");
			$("#form").submit();
		}
	});
	
	$(".gyouseikuAjax").each(function() {
		if ($(this).val() != "") {
			$(this).trigger("blur");
		}
	});
	$(".choumeiAjax").each(function() {
		if ($(this).val() != "") {
			$(this).trigger("blur");
		}
	});
	
	$(".parttext").each(function() {
		var code = $(this).prev();
		if ($(code).val() != "") {
			$(this).val($(code).val());
		}
	});
	
	//設計詳細登録ボタンクリック時処理
	$("#parts_list_button").on("click", function() {
		$("form").validate().cancelSubmit = true;
		$("#form").prop("action", "/mockapp/amount_report/parts_list");
		$("#form").submit();		
	});
	
	//詳細見積情報変更ボタンクリック時処理
	$("#save_button").on("click", function() {
		$("#form").prop("action", "/mockapp/amount_report/save");
		$("#form").submit();		
	});

});