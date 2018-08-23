<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page session="false"%>

<html>
<head>
<title>数量選択</title>

<spring:url value="/resources/js/jquery-3.3.1.js" var="jqueryJs" />
<script src="${jqueryJs}"></script>
<spring:url value="/resources/js/jquery-ui.js" var="jqueryUIJs" />
<script src="${jqueryUIJs}"></script>
<spring:url value="/resources/js/jquery.validate.js"
	var="jqueryValidationJs" />
<script src="${jqueryValidationJs}"></script>

<spring:url value="/resources/css/jquery-ui.css" var="jqueryUICss" />
<link href="${jqueryUICss}" rel="stylesheet" />
<spring:url value="/resources/css/jquery-ui.theme.css"
	var="jqueryUIThemeCss" />
<link href="${jqueryUIThemeCss}" rel="stylesheet" />

<spring:url value="/resources/js/mockapp_common.js"
	var="mockappCommonJs" />
<script src="${mockappCommonJs}"></script>
<spring:url value="/resources/js/parts_list/parts_list.js" var="partsListJs" />
<script src="${partsListJs}"></script>

<spring:url value="/resources/css/mockapp.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
	<h1>数量選択</h1>
	<div class="listContent">
		<p>基本登録 項目一覧</p>
		<div class="right">
			<a id="seisan_code_select" href="#">精算コードを選択</a>
		</div>

		<c:if test="${!empty form.basicPartList}" var="flg" />
		<c:if test="${!flg}">
			<div id="no_selected_data_message" class="no_data_message">精算費目は選択されていません</div>
			<table id="seisan_code_select_table" style="display: none;">
				<tr class="header">
					<th>費目コード</th>
					<th>費目名</th>
					<th>数量</th>
					<th>単位</th>
					<th></th>
				</tr>
			</table>
		</c:if>
		<c:if test="${flg}">
			<table id="seisan_code_select_table">
				<tr class="header">
					<th>費目コード</th>
					<th>費目名</th>
					<th>数量</th>
					<th>単位</th>
					<th></th>
				</tr>
				<c:forEach var="row" items="${form.basicPartList}"
					varStatus="status">
					<tr class="data">
						<td><c:out value="${row.himokuCode}" /></td>
						<td><c:out value="${row.himokuName}" /></td>
						<td><c:out value="${row.num}" /></td>
						<td><c:out value="${row.tani}" /></td>
						<td><a>削除</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
	<div class="listContent">
		<p>追加 精算項目一覧</p>
		<c:if test="${!empty form.basicPartList}" var="flg" />
		<c:if test="${!flg}">
			<div id="no_added_data_message" class="no_data_message">精算費目は選択されていません</div>
			<table id="seisan_code_add_table" style="display: none;">
				<tr class="header">
					<th>費目コード</th>
					<th colspan="3">費目</th>
					<th>費目名</th>
					<th>数量</th>
					<th>単位</th>
					<th></th>
				</tr>
			</table>
		</c:if>
		<c:if test="${!empty form.addedPartList}">
			<table id="seisan_code_add_table">
				<tr class="header">
					<th>費目コード</th>
					<th colspan="3">費目</th>
					<th>費目名</th>
					<th>数量</th>
					<th>単位</th>
					<th></th>
				</tr>
				<c:forEach var="row" items="${form.addedPartList}"
					varStatus="status">
					<tr class="">
						<td><c:out value="${row.himokuCode}" /></td>
						<td><c:out value="${row.himokuCodeName1}" /></td>
						<td><c:out value="${row.himokuCodeName2}" /></td>
						<td><c:out value="${row.himokuCodeName3}" /></td>
						<td><c:out value="${row.himokuName}" /></td>
						<td><input type="text" value='<c:out value="${row.num}"/>' size="2" /></td>
						<td><c:out value="${row.tani}" /></td>
						<td><a class="remove-button">削除</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<div class="left">
			<a id="seisan_code_add" href="#">精算コードを選択</a>
		</div>
	</div>
	<hr />
	<div class="buttonArea">
		<a href="mockapp" class="button">戻る</a> <a href="mockapp"
			class="button">設計詳細登録</a>
	</div>

	<!-- 精算コード選択ポップアップ  -->
	<jsp:include page="seisan_code_select_popup.jsp" flush="false" />

	<!-- 精算コード追加ポップアップ  -->
	<jsp:include page="seisan_code_add_popup.jsp" flush="false" />

	<!-- 精算費目検索ポップアップ -->
	<jsp:include page="seisan_code_search_popup.jsp" flush="false" />

</body>
</html>
