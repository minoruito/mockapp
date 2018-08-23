<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<spring:url value="/resources/js/parts_list/seisan_code_search_popup.js" var="partsListJs" />
<script src="${partsListJs}"></script>

<!-- 精算費目検索ポップアップ -->
<div id="seisan_code_search_popup" title="精算費目検索">
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
				<f:form modelAttribute="searchForm1" action="#" method="post"
					id="searchForm1">
					<li>分類： <input type="text" autocomplete="on"
						list="searchForm1_bunrui" value="${searchForm1.bunrui}" /> <datalist
							id="searchForm1_bunrui">
							<c:forEach var="row" items="${searchForm1.bunruiList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<li>口径： <input type="text" autocomplete="on"
						list="searchForm1_koukei" value="${searchForm1.koukei}" /> <datalist
							id="searchForm1_koukei">
							<c:forEach var="row" items="${searchForm1.koukeiList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<li>単位： <input type="text" autocomplete="on"
						list="searchForm1_tani" value="${searchForm1.tani}" /> <datalist
							id="searchForm1_tani">
							<c:forEach var="row" items="${searchForm1.taniList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<input type="submit" value="検索" />
				</f:form>
				<table id="seisan_code_search_popup_tabs-1_table"
					style="display: none;">
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
			<p>フィルタ条件</p>
			<ul>
				<f:form modelAttribute="searchForm2" action="#" method="post"
					id="searchForm2">
					<li>分類： <input type="text" autocomplete="on"
						list="searchForm2_bunrui" value="${searchForm1.bunrui}" /> <datalist
							id="searchForm2_bunrui">
							<c:forEach var="row" items="${searchForm1.bunruiList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<li>口径： <input type="text" autocomplete="on"
						list="searchForm2_koukei" value="${searchForm2.koukei}" /> <datalist
							id="searchForm2_koukei">
							<c:forEach var="row" items="${searchForm2.koukeiList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<li>単位： <input type="text" autocomplete="on"
						list="searchForm2_tani" value="${searchForm2.tani}" /> <datalist
							id="searchForm2_tani">
							<c:forEach var="row" items="${searchForm1.taniList}"
								varStatus="status">
								<option value="${row.value}" />
							</c:forEach>
						</datalist>
					</li>
					<input type="submit" value="検索" />
				</f:form>
				<table id="seisan_code_search_popup_tabs-2_table"
					style="display: none;">
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
		<div id="seisan_code_search_popup_tabs-3">
			<p>灯内軽工事(配管延長1.4mまで)</p>
		</div>
		<div id="seisan_code_search_popup_tabs-4">
			<p>簡易なガス栓増設工事</p>
		</div>
	</div>
</div>