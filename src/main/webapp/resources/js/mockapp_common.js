var Mockapp = {};
//行毎のバリデーション追加関数
Mockapp.addValidate = function() {
	$("input[type='text'].required").each(function() {
		$(this).rules('add', {
			required : true,
			messages : {
				required: function () {
					$.toast({
						heading: '入力エラー',
						text:'必須項目です。値を入力して下さい。',
						position : 'top-right',
						bgColor : '#FF4444', 
						loader : false,
						allowToastClose : true,
						stack : 1
				   });
				}
			}
		});
	});
	$("input[type='checkbox'].required").each(function() {
		$(this).rules('add', {
			required : function(elm) {
				var flg = false;
				$(elm).parent("li").find("input[type='checkbox']").each(function() {
					flg = flg || ($(this).prop('checked') == true);
				});
				if (flg) {
					$(elm).parent("li").find("input[type='checkbox']").each(function() {
						$(this).removeClass("error");
					});
				}
				return !flg;
			},
			messages : {
				required: function () {
					$.toast({
						heading: '入力エラー',
						text:'工事区分は、必須項目です。いずれかにチェックを入力して下さい。',
						position : 'top-right',
						bgColor : '#FF4444', 
						loader : false,
						allowToastClose : true,
						stack : 1
					});
				}
			}
		});
	});
}

$(function(){
	//日付ピッカーの日本語設定
	$.datepicker.regional['ja'] = {
		closeText: '閉じる',
		prevText: '<前',
		nextText: '次>',
		currentText: '今日',
		monthNames: ['1月','2月','3月','4月','5月','6月',
		'7月','8月','9月','10月','11月','12月'],
		monthNamesShort: ['1月','2月','3月','4月','5月','6月',
		'7月','8月','9月','10月','11月','12月'],
		dayNames: ['日曜日','月曜日','火曜日','水曜日','木曜日','金曜日','土曜日'],
		dayNamesShort: ['日','月','火','水','木','金','土'],
		dayNamesMin: ['日','月','火','水','木','金','土'],
		weekHeader: '週',
		dateFormat: 'yy/mm/dd',
		firstDay: 0,
		isRTL: false,
		showMonthAfterYear: true,
		yearSuffix: '年'};
	$.datepicker.setDefaults($.datepicker.regional['ja']);

	//マスタ取得（AJAX)
   $("input[type=text].ajax").on("blur", function() {
	   	var masterDiv = $(this).data("master");
		var target = $(this).prop("id");
		var val = $(this).val();
		if (val != "") {
			$.getJSON("/mockapp/common/getMasterValue", {masterDiv: masterDiv, code: val}, function(data) {
				$("#"+target +"_value").val(data.value);
				});
		} else {
			$("#"+target +"_value").val("");
		}
	});
   
   //行政区マスタ取得（AJAX)
   $("input[type=text].gyouseikuAjax").on("blur", function() {
		var target = $(this).prop("id");
		var val = $(this).val();
		if (val != "") {
			$.getJSON("/mockapp/common/getGyouseikuValue", {gyouseikuCd: val}, function(data) {
				$("#"+target +"_value").val(data.gyouseiku);
				});
		} else {
			$("#"+target +"_value").val("");
		}
	});
   
   //町丁名マスタ取得（AJAX)
   $("input[type=text].choumeiAjax").on("blur", function() {
	   	var gyouseikuElm = $(this).data("gyouseiku");
	   	var gyouseiku = $("#"+gyouseikuElm).val();
		var target = $(this).prop("id");
		var val = $(this).val();
		if (val != "" && gyouseiku != "") {
			$.getJSON("/mockapp/common/getChoumeiValue", {gyouseikuCd: gyouseiku, choumeiCd: val}, function(data) {
				$("#"+target +"_value").val(data.choumei);
				});
		} else {
			$("#"+target +"_value").val("");
		}
	});
   
   //スピナー
   $('.spinner').spinner({
		max: 99,
		min: 0
	  });
   
   //カレンダー
   $(".calender").datepicker({
	   beforeShow: function(input, inst) {
		   var offset = $(this).offset();
		   var window_height = $(window).height();
		   if (offset.top > window_height /2) {
			   var calendar = inst.dpDiv;
			   setTimeout(function() {
				   calendar.position({
					   my: 'left bottom',
					   at: 'left top',
					   of: input
				   });
			   }, 1);
		   }
	   }
   });

   //区分ープルダウン
   $('.parttext').on('change', function() {
	   var val = $(this).val();
	   var targetText = $(this).closest("li").find("input[type='text']");
	   $(targetText).val(val);
   });
   
	//バリデーション
	$('form').validate({
		error: function(label) {
			$(this).addClass("error");
		},
	});
	Mockapp.addValidate();
	
   
});