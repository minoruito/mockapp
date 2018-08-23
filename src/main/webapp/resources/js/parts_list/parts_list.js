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
});