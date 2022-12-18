<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java"
	import="java.util.*" pageEncoding="utf-8"%>

<html>
<head>
</head>

<body bgcolor="#D9DFBB">
	<table width="600" border=1>

		<tr>
			<th>酒店编号</th>
			<th>酒店类型</th>
			<th>酒店名称</th>
			<th>酒店地址</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
		</tr>
		<s:iterator value="allhtJsp_hts" id="ht">
			<tr>
				<td><s:property value="#ht.hotelId"/></td>
				<td><s:property value="#ht.hotelClassJyc.hotelClassName"/></td>
				<td><s:property value="#ht.hotelName"/></td>
				<td><s:property value="#ht.hotelAddress"/></td>
				<td><a  
					href="updateHtbyidUI.action?updateHtbyid.hotelId=<s:property value='#ht.hotelId'/>"
					onclick="if(confirm('您确定修改该酒店信息吗？')) return true;else return false;">修改</a>
				</td>
				<td><a
					href="deletHtbyid.action?deletHtbyid.hotelId=<s:property value='#ht.hotelId'/>"
					onclick="if(confirm('您确定删除该酒店信息吗？')) return true;else return false;">删除</a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
