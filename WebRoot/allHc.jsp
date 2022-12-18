<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java"
	import="java.util.*" pageEncoding="utf-8"%>

<html>
<head>
</head>

<body bgcolor="#D9DFBB">
	<table width="500" border=1>

		<tr>
			<th>酒店编号</th>
			<th>酒店类型</th>
		</tr>
		<s:iterator value="allhcJsp_hcs" id="hc">
			<tr>
				<td><s:property value="#hc.hotelClassId"/></td>
				<td><s:property value="#hc.hotelClassName"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
