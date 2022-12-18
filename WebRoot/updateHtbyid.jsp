<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<%@ page language="java"	import="java.util.*" pageEncoding="utf-8"%>
<sx:head parseContent="true"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head></head>
  <body bgcolor="#D9DFBB">
    <s:form action="updateHtbyid.action" method="post" theme="simple">
	<table border=1>
	<tr>
    		<td>酒店编号</td>
    		<td><input type="text" name="updateHtbyid.hotelId" value="<s:property value="updateHtbyid.hotelId"/>"></td>
    	</tr>
    	<tr>
    		<td>酒店类型</td>
    		<td><s:select name="updateHtbyid.hotelclass" list="updatHt_hc" listKey="hotelClassId" listValue="hotelClassName" value="updateHtbyid.hotelclass.hotelClassId">	
    		</s:select></td>
    	</tr>
    	<tr>
    		<td>酒店名称</td>
    		<td><input type="text" name="updateHtbyid.hotelName" value="<s:property value="updateHtbyid.hotelName"/>" readonly>
    		</td>
    	</tr>
    	<tr>
    		<td>酒店地址</td>
			<td><input type="text" name="updateHtbyid.hotelAddress" value="<s:property value="updateHtbyid.hotelAddress"/>"></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"/></td>
			<td><input type="reset" value="重置"/></td>
		</tr>
    </table>
    
   </s:form>
  </body>
</html>
