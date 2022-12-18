<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head></head>
  <body bgcolor="#D9DFBB">
    <s:form action="updateHt.action" method="post" theme="simple">
	<table border=1>
    	<tr>
    		<td>酒店类型</td>
    		<td><s:select name="updateHt.hotelclass" list="updatHt_hc" listKey="hotelClassId" listValue="hotelClassName" >	
    		</s:select>
				</td>
    	</tr>
    	<tr>
    		<td>酒店名称</td>
    		<td><input type="text" name="updateHt.hotelName" ></td>
    	</tr>
    	<tr>
    		<td>酒店地址</td>
			<td><input type="text" name="updateHt.hotelAddress"></td>
		</tr>
		<tr>
			<td><input type="submit" value="增加"/></td>
			<td><input type="reset" value="重置"/></td>
		</tr>
    </table>
    
   </s:form>
  </body>
</html>
