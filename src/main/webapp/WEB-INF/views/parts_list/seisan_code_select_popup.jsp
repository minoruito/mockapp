<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/resources/js/parts_list/seisan_code_select_popup.js" var="partsListJs" />
<script src="${partsListJs}"></script>

<!-- 精算コード選択ポップアップ  -->
<div id="seisan_code_select_popup" title="精算コード選択">
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