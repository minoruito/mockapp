<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="row" items="${searchForm1.bunruiList}" varStatus="status">
	<input type="hidden" id="bunruiList_${status.index}" class="bunruiList" value="${row.value}" />
</c:forEach>

