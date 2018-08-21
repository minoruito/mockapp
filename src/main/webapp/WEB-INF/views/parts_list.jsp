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
<spring:url value="/resources/js/parts_list.js" var="partsListJs" />
<script src="${partsListJs}"></script>

<spring:url value="/resources/css/mockapp.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
	<h1>数量選択</h1>
	<div class="listContent">
		<p>基本登録 項目一覧</p>
		<div class="right">
			<a id="seisan_code_select" href="#">清算コードを選択</a>
		</div>

		<c:if test="${!empty form.basicPartList}" var="flg" />
		<c:if test="${!flg}">
			<div id="no_selected_data_message">清算費目は選択されていません</div>
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
		<p>追加 清算項目一覧</p>
		<c:if test="${!empty form.basicPartList}" var="flg" />
		<c:if test="${!flg}">
			<div id="no_added_data_message">清算費目は選択されていません</div>
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
						<td><c:out value="${row.num}" /></td>
						<td><c:out value="${row.tani}" /></td>
						<td><a class="remove-button">削除</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<div class="left">
			<a id="seisan_code_add" href="#">清算コードを選択</a>
		</div>
	</div>
	<hr />
	<div class="buttonArea">
		<a href="mockapp" class="button">戻る</a> <a href="mockapp"
			class="button">設計詳細登録</a>
	</div>

	<!-- 清算コード選択ポップアップ  -->
	<div id="seisan_code_select_popup" title="清算コード選択">
		<p>基本登録 (20A以下のFネジガス栓(UI/UL) 1箇所取付時)</p>
		<div id="seisan_code_select_popup_tabs">
			<ul>
				<li><a href="#seisan_code_select_popup_tabs-1">灯内軽基本</a></li>
				<li><a href="#seisan_code_select_popup_tabs-2">位置替フレキ</a></li>
			</ul>
			<div id="seisan_code_select_popup_tabs-1">
				<table>
					<tr>
						<th colspan="3"></th>
						<th colspan="8">フレキ配管</th>
					</tr>
					<tr>
						<th colspan="3"></th>
						<th colspan="2">10A</th>
						<th colspan="2">15A</th>
						<th colspan="2">20A</th>
						<th colspan="2">25A</th>
					</tr>
					<tr>
						<th colspan="3"></th>
						<th>0.5m</th>
						<th>1.0m</th>
						<th>0.5m</th>
						<th>1.0m</th>
						<th>0.5m</th>
						<th>1.0m</th>
						<th>0.5m</th>
						<th>1.0m</th>
					</tr>
					<tr>
						<th rowspan="4">ガ<br />ス<br />栓<br />・<br />接<br />続<br />具
						</th>
						<th rowspan="2">UI</th>
						<td>15A</td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>15A</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
					</tr>
					<tr>
						<th rowspan="2">UL</th>
						<td>15A</td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>20A</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
						<td><a href="#"
							class="button seisan_code_select_popup_tabs-1-button">選択</a></td>
					</tr>
				</table>
			</div>
			<div id="seisan_code_select_popup_tabs-2">
				<p>位置替フレキ</p>
			</div>
		</div>
	</div>

	<!-- 清算コード追加ポップアップ  -->
	<div id="seisan_code_add_popup" title="清算コード追加">
		<p>よく使う清算費目一覧</p>
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
			追加項目が上記に無い場合<a id="seisan_code_search" href="#" class="button">清算費目追加</a>
		</p>
	</div>

	<!-- 清算費目検索ポップアップ -->
	<div id="seisan_code_search_popup" title="清算費目検索">
		<p>工事種別</p>
		<div id="seisan_code_search_popup_tabs">
			<ul>
				<li><a href="#seisan_code_search_popup_tabs-1">増設・位置替え・撤去工事</a></li>
				<li><a href="#seisan_code_search_popup_tabs-2">共通(ガス栓・付帯工事)</a></li>
				<li><a href="#seisan_code_search_popup_tabs-3">灯内軽工事(配管延長1.4mまで)</a></li>
				<li><a href="#seisan_code_search_popup_tabs-4">簡易なガス栓増設工事</a></li>
			</ul>
			<div id="seisan_code_search_popup_tabs-1">
				<p>フィルタ条件</p>
				<ul>
				   <f:form modelAttribute="searchForm1" action="#" method="post" id="searchForm1">
						<li>分類：
							<input type="text" autocomplete="on" list="searchForm1_bunrui" value="${searchForm1.bunrui}"/>
							<datalist id="searchForm1_bunrui">
								<c:forEach var="row" items="${searchForm1.bunruiList}" varStatus="status">
                   				<option value="${row.value}" />
								</c:forEach>
							</datalist>
						</li>
						<li>口径：
							<input type="text" autocomplete="on" list="searchForm1_koukei" value="${searchForm1.koukei}"/>
							<datalist id="searchForm1_koukei">
								<c:forEach var="row" items="${searchForm1.koukeiList}" varStatus="status">
                   				<option value="${row.value}" />
								</c:forEach>
							</datalist>
						</li>
						<li>単位：
							<input type="text" autocomplete="on" list="searchForm1_tani" value="${searchForm1.tani}"/>
							<datalist id="searchForm1_tani">
								<c:forEach var="row" items="${searchForm1.taniList}" varStatus="status">
                   				<option value="${row.value}" />
								</c:forEach>
							</datalist>
						</li>
						<input type="submit" value="検索"/>
					</f:form>
					<table id="seisan_code_search_popup_tabs-1_table" style="display:none;">
						<tr class="header">
							<th>選択</th>
							<th>費目コード</th>
							<th colspan="3">費目</th>
							<th>費目名</th>
							<th>単位</th>
						</tr>
					</table>
				</ul>
			</div>
			<div id="seisan_code_search_popup_tabs-2">
				<p>共通(ガス栓・付帯工事</p>
			</div>
			<div id="seisan_code_search_popup_tabs-3">
				<p>灯内軽工事(配管延長1.4mまで)</p>
			</div>
			<div id="seisan_code_search_popup_tabs-4">
				<p>簡易なガス栓増設工事</p>
			</div>
		</div>
	</div>
	<c:import url="parameters.jsp" />
</body>
</html>
