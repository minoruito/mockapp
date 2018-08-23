<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/resources/js/parts_list/seisan_code_add_popup.js" var="partsListJs" />
<script src="${partsListJs}"></script>

<!-- 精算コード追加ポップアップ  -->
<div id="seisan_code_add_popup" title="精算コード追加">
	<p>よく使う精算費目一覧</p>
	<table>
		<tr>
			<th>費目追加</th>
			<th>費目コード</th>
			<th>費目名</th>
		</tr>
		<c:forEach var="row" items="${form.addedPartPopupList}"
			varStatus="status">
			<tr>
				<td><a href="#" class="button seisan_code_add_popup_button"
					data-himokucode="<c:out value="${row.himokuCode}" />">選択</a></td>
				<td><c:out value="${row.himokuCode}" /></td>
				<td><c:out value="${row.himokuName}" /></td>
			</tr>
		</c:forEach>
	</table>
	<p>
		追加項目が上記に無い場合<a id="seisan_code_search" href="#" class="button">精算費目追加</a>
	</p>
</div>