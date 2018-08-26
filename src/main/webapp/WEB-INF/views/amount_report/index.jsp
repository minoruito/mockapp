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
<link href="${jqueryUIThemeCss}" rel="stylesheet" />
<spring:url value="/resources/js/jquery.toast.js"
    var="jqueryToastJs" />
<script src="${jqueryToastJs}"></script>

<spring:url value="/resources/css/jquery-ui.css" var="jqueryUICss" />
<link href="${jqueryUICss}" rel="stylesheet" />
<spring:url value="/resources/css/jquery-ui.theme.css"
	var="jqueryUIThemeCss" />
<link href="${jqueryUIThemeCss}" rel="stylesheet" />
<spring:url value="/resources/css/jquery.toast.css"
    var="jqueryToastCss" />
<link href="${jqueryToastCss}" rel="stylesheet" />
    
<spring:url value="/resources/js/mockapp_common.js"
	var="mockappCommonJs" />
<script src="${mockappCommonJs}"></script>
<spring:url value="/resources/js/amount_report.js" var="amountReportJs" />
<script src="${amountReportJs}"></script>

<spring:url value="/resources/css/mockapp.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
	<h1>簡易工事出来高報告書</h1>
	<f:form modelAttribute="form" action="#" method="post">

	<div class="formContent">
		<ul>
			<li class="grid-2 right">オーダー番号<span class="required">*</span></li>
			<li class="grid-2"><f:input path="orderNo" size="12" class="required"/><a href="#mockapp" id="seachOrderNo" class="button">検索</a></li>
			<li class="grid-1 right">行政区</li>
			<li class="grid-3"><mytags:inputGyouseikuAjax path="gyoseiku" size="2" /></li>
		</ul>
		<ul>
			<li class="grid-2 right">物件名</li>
			<li class="grid-1"><f:input path="bukkenmei" size="20" /></li>
			<li class="grid-2 right">町名</li>
			<li class="grid-2"><mytags:inputChoumeiAjax path="choumei" size="2" data-gyouseiku="gyoseiku"/></li>
		</ul>
		<ul>
			<li class="grid-2 right">工事種別</li>
			<li class="grid-3">
				<f:input path="koujiShubetu" size="2" readonly="true"/>
				<select class="parttext">
					<option value=""></option>
					<option value="01">工事種別名1</option>
					<option value="02">工事種別名2</option>
					<option value="03">工事種別名3</option>
					<option value="04">工事種別名4</option>
				</select>
			</li>
		</ul>
		<ul>
			<li class="grid-7">
				簡易なガス栓増設工事<span class="required">*</span><f:checkbox path="koujiChecks1" class="required"/>
				灯内軽工事<span class="required">*</span><f:checkbox path="koujiChecks2" class="required"/>
				増位・位置替工事<span class="required">*</span><f:checkbox path="koujiChecks3" class="required"/>
				撤去工事<span class="required">*</span><f:checkbox path="koujiChecks4" class="required"/>
			</li>
		</ul>
		<ul>
			<li class="grid-2 right">単価区分<span class="required">*</span></li>
			<li class="grid-2">
				<f:input path="tankaKubun" size="2" readonly="true" class="required"/>
				<select class="parttext">
					<option value=""></option>
					<option value="01">単価区分1</option>
					<option value="02">単価区分2</option>
					<option value="03">単価区分3</option>
					<option value="04">単価区分4</option>
				</select>
			</li>
			<li class="grid-2">旧単価区分表示<f:checkbox path="kyuuTankaKubunHyouji" /></li>
		</ul>
		<hr />
		<ul>
			<li class="grid-2"><f:checkbox path="mYoryo" />M容量変更</li>
			<li class="grid-4">メーターオーダー番号<f:input path="materOrderNo" size="10" /></li>
		</ul>
	</div>
	<div class="formContent">
		<p>詳細情報</p>
		<ul>
			<li class="grid-2 right">フレキ区分</li>
			<li class="grid-2">
				<f:input path="flexDiv" size="2" readonly="true"/>
				<select class="parttext">
					<option value=""></option>
					<option value="01">フレキ区分1</option>
					<option value="02">フレキ区分2</option>
					<option value="03">フレキ区分3</option>
					<option value="04">フレキ区分4</option>
				</select>
			</li>
			<li class="grid-2 right">フレキライン数<f:input path="flexLineNum" size="2" /></li>
			<li class="grid-2">
				<a href="#mockapp" class="button" id="parts_list_button">設計詳細登録</a>
			</li>
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
                <c:forEach var="toritsuke" items="${form.toritsukeList}" varStatus="status">
					<td><f:input path="toritsukeList[${status.index}].num" size="2" class="spinner" /></td>
				</c:forEach>
			</tr>
			<tr>
				<th>撤<br />去</th>
                <c:forEach var="tekko" items="${form.tekkoList}" varStatus="status">
					<td><f:input path="tekkoList[${status.index}].num" size="2" class="spinner" /></td>
				</c:forEach>
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
			<li class="grid-2">内管配管長<f:input path="naikanHaikanEnchoM" size="2" />m</li>
			<li class="grid-2">内管撤去延長<f:input path="naikanTekkyoEnchoM" size="2" />m</li>
			<li class="grid-2">ガス栓数<f:input path="gasSenNum" size="2" />個</li>
		</ul>
	</div>
	<div class="formContent">
		<p>見積情報</p>
		<ul>
			<li class="grid-2 right">見積休日割増指定</li>
			<li class="grid-2"><f:checkbox path="mitsumoriKyuujituSitei" /></li>
			<li class="grid-2 right">配管代Ⅰ</li>
			<li class="grid-2"><f:input path="haikanDai1" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">見積小運搬割増指定</li>
			<li class="grid-2"><f:checkbox path="mitumoriShouUnpanSitei" /></li>
			<li class="grid-2 right">ガス栓代</li>
			<li class="grid-2"><f:input path="gasSenDai" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">見積夜間割増指定</li>
			<li class="grid-2"><f:checkbox path="mitsumoriYakanSitei" /></li>
			<li class="grid-2 right">付帯工事代</li>
			<li class="grid-2"><f:input path="futaiKoujiDai" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">課税区分</li>
			<li class="grid-2">
				<f:select path="kazeiKubun">
					<f:option value=""></f:option>
					<f:options items="${kazeiKubunList}" itemLabel="value" itemValue="code" />
				</f:select>
			</li>
			<li class="grid-2 right">特別工事代A</li>
			<li class="grid-2"><f:input path="tokubetsuKoujiA" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">端数処理区分</li>
			<li class="grid-2">
				<f:select path="hasuushoriKubun">
					<f:option value=""></f:option>
					<f:options items="${hasuushoriKubunList}" itemLabel="value" itemValue="code" />
				</f:select>
			</li>
			<li class="grid-2 right">特別工事代B</li>
			<li class="grid-2"><f:input path="tokubetsuKoujiB" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right">端数処理形態</li>
			<li class="grid-2">
				<f:select path="hasuushoriKeitai">
					<f:option value=""></f:option>
					<f:options items="${hasuushoriKeitaiList}" itemLabel="value" itemValue="code" />
				</f:select>
			</li>
			<li class="grid-2 right">臨</li>
			<li class="grid-2"><f:input path="rin" size="10" />円</li>
		</ul>
		<ul>
			<li class="grid-2 right"></li>
			<li class="grid-2"></li>
			<li class="grid-2 right">計</li>
			<li class="grid-2"><f:input path="kei" size="10" />円</li>
		</ul>
	</div>
	<div class="formContent">
		<p>契約情報</p>
		<ul>
			<li class="grid-2 right">請求先</li>
			<li class="grid-4">
				<f:input path="seikyuusaki1" size="10" />
				<f:input path="seikyuusaki2" size="2" />
				<a href="#mockapp" class="button">建設設備会社</a>
			</li>
		</ul>
		<ul>
			<li class="grid-2 right"></li>
			<li class="grid-4"><f:input path="seikyuusakiMei" size="40" /></li>
		</ul>
		<ul>
			<li class="grid-2 right">入金期限日</li>
			<li class="grid-4">
				<f:input path="nyuukinKigenbi" size="10" class="calender"/>(現場施工完了日登録時に自動登録)
			</li>
		</ul>
		<ul>
			<li class="grid-1"></li>
			<li class="grid-2">
				<a href="#mockapp" class="button">設計見積情報印刷</a>
			</li>
			<li class="grid-2">発行確定日<f:input path="hakkouKakuteibi" size="10" class="calender"/></li>
			<li class="grid-2"><a href="#mockapp" class="button" id="save_button">設計見積情報変更</a></li>
			<li class="grid-2"><a href="#mockapp" class="button">設計見積情報確定</a></li>
		</ul>
	</div>
	</f:form>
</body>
</html>
