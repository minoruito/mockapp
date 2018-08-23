<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix = "mytags" uri = "/WEB-INF/tlds/mytaglib.tld" %>

<%@ page session="false"%>

<html>
<head>
<title>簡易工事出来高報告書</title>

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
	<h1>簡易工事出来高報告書</h1>
	<f:form modelAttribute="form" action="#" method="post">

	<div class="formContent">
		<ul>
			<li class="grid-2 right">オーダー番号</li>
			<li class="grid-2"><input type="text" size="10" /><input type="button" value="検索" /></li>
			<li class="grid-1 right">行政区</li>
			<li class="grid-3"><mytags:inputAjax path="gyoseiku" size="2"/></li>
		</ul>
		<ul>
			<li class="grid-2 right">物件名</li>
			<li class="grid-1"><f:input path="bukkenmei" size="20" /></li>
			<li class="grid-2 right">町名</li>
			<li class="grid-2"><mytags:inputAjax path="choumei" size="2"/></li>
		</ul>
		<ul>
			<li class="grid-2 right">工事種別</li>
			<li class="grid-3">
				<f:input path="koujiShubetu" size="2" />
				<select class="pairText">
					<option value=""></option>
					<option value="01">工事種別名1</option>
					<option value="02">工事種別名2</option>
					<option value="03">工事種別名3</option>
					<option value="04">工事種別名4</option>
				</select>
			</li>
		</ul>
		<ul>
			<li class="grid-6">
				簡易なガス栓増設工事<f:checkbox path="koujiChecks1" />
				灯内軽工事<f:checkbox path="koujiChecks2" />
				増位・位置替工事<f:checkbox path="koujiChecks3" />
				撤去工事<f:checkbox path="koujiChecks3" />
			</li>
		</ul>
		<ul>
			<li class="grid-2 right">単価区分</li>
			<li class="grid-2"><f:input path="koujiShubetu" size="2" /><select><option>単価区分名</option></select></li>
			<li class="grid-2">旧単価区分表示<input type="checkbox" /></li>
		</ul>
		<hr />
		<ul>
			<li class="grid-2"><input type="checkbox" />M容量変更</li>
			<li class="grid-4">メーターオーダー番号<input type="text" size="10" /></li>
		</ul>
	</div>
	<div class="formContent">
		<p>詳細情報</p>
		<ul>
			<li class="grid-2 right">フレキ区分</li>
			<li class="grid-2"><input type="text" size="2" /><select><option>フレキ区分</option></select></li>
			<li class="grid-2 right">フレキライン数<input type="text" size="2" /></li>
			<li class="grid-2"><input type="button" value="設計詳細登録" /></li>
		</ul>
		<table>
			<tr>
				<th rowspan="3"></th>
				<th rowspan="3">CH</th>
				<th rowspan="3">GHP</th>
				<th rowspan="3">吸収式</th>
				<th colspan="2" rowspan="2">B</th>
				<th colspan="3" rowspan="2">W</th>
				<th rowspan="2">D</th>
				<th colspan="3">S</th>
				<th rowspan="2">AR</th>
				<th colspan="2" rowspan="2">その他</th>
			</tr>
			<tr>
				<th colspan="2">居室用</th>
				<th></th>
			</tr>
			<tr>
				<th>給湯付</th>
				<th>一般</th>
				<th>元止</th>
				<th>先止<br />11以下</th>
				<th>先止<br />22以上</th>
				<th>乾燥機</th>
				<th>ストーブ<br />/FH</th>
				<th>FF温風<br />FF冷風</th>
				<th>冷媒<br />/温水式</th>
				<th>家庭用<br />暖房</th>
				<th>26Kw<br />未満</th>
				<th>26Kw<br />以上</th>
			</tr>
			<tr>
				<th>取<br />付</th>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
			</tr>
			<tr>
				<th>撤<br />去</th>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
				<td><input type="text" size="2" class="spinner" /></td>
			</tr>
		</table>
		<ul>
			<li class="grid-8 right">未割振り孔口数<input type="text" size="2" />個</li>
		</ul>
		
		<ul>
			<li class="grid-1">摘要</li>
			<li class="grid-10"><textarea></textarea></li>
		</ul>
		<ul>
			<li class="grid-1"></li>
			<li class="grid-2">内管配管長<input type="text" size="2" />m</li>
			<li class="grid-2">内管撤去延長<input type="text" size="2" />m</li>
			<li class="grid-2">ガス栓数<input type="text" size="2" />個</li>
		</ul>
	</div>
	<div class="formContent">
		<p>見積情報</p>
		<ul>
			<li class="grid-2 right">見積休日割増指定</li>
			<li class="grid-2"><input type="checkbox" /></li>
			<li class="grid-2 right">配管代Ⅰ</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">見積小運搬割増指定</li>
			<li class="grid-2"><input type="checkbox" /></li>
			<li class="grid-2 right">ガス栓代</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">見積夜間割増指定</li>
			<li class="grid-2"><input type="checkbox" /></li>
			<li class="grid-2 right">付帯工事代</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">課税区分</li>
			<li class="grid-2"><select><option>課税区分名</option></select></li>
			<li class="grid-2 right">特別工事代A</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">端数処理区分</li>
			<li class="grid-2"><select><option>端数処理区分名</option></select></li>
			<li class="grid-2 right">特別工事代B</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">端数処理形態</li>
			<li class="grid-2"><select><option>端数処理形態名</option></select></li>
			<li class="grid-2 right">臨</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right"></li>
			<li class="grid-2"></li>
			<li class="grid-2 right">計</li>
			<li class="grid-2"><input type="type" size="10" />円</li>
		</ul>
	</div>
	<div class="formContent">
		<p>契約情報</p>
		<ul>
			<li class="grid-2 right">請求先</li>
			<li class="grid-4"><input type="text" size="4"/><input type="text" size="2"/><input type="button" value="建設設備会社" /></li>
		</ul>
		<ul>
			<li class="grid-2 right"></li>
			<li class="grid-4"><input type="text" size="40" /></li>
		</ul>
		<ul>
			<li class="grid-2 right">入金期限日</li>
			<li class="grid-4"><input type="text" size="8" />(現場施工完了日登録時に自動登録)</li>
		</ul>
		<ul>
			<li class="grid-2"><input type="button" value="設計見積情報印刷" /></li>
			<li class="grid-2">発行確定日<input type="text" size="8" /></li>
			<li class="grid-2"><input type="button" value="設計見積情報変更" /></li>
			<li class="grid-2"><input type="button" value="設計見積情報確定" /></li>
		</ul>
	</div>
	
	</f:form>
</body>
</html>
