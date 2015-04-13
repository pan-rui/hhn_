<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2014/12/17
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>用户提现申请</title>
  <link rel=stylesheet type=text/css href="<c:url value="/css/css.css"/>"/>
  <link rel=stylesheet type=text/css href="<c:url value="/css/jPages.css"/>"/>
  <script type=text/javascript src="<c:url value="/js/jquery-1.9.1.min.js"/>"></script>
  <script type=text/javascript src="<c:url value="/js/My97DatePicker/WdatePicker.js"/>"></script>
  <script type="text/javascript" src="<c:url value="/js/jPages.js"/>"></script>
  <script type="text/javascript">
    $(document).ready(function(){
      $("#bt_search").click(function(){
        $("#form").submit();
      });

      //全选
      $("#chkAll").click(function(){
        if($(this).prop("checked")){
          $(":input[name='trade_ids']").each(function(){
            $(this).prop("checked",true);
          });
        }else{
          $(":input[name='trade_ids']").each(function(){
            $(this).prop("checked",false);
          });
        }
      });

      $("div.holder").jPages({
        containerID: "tbody", //显示数据所在的块的ID
        first: '首页',
        last: '尾页',
        previous: '上页',
        next: '下页',
        perPage: 10,   //每页显示数据为多少行
        startPage: 1, //起始页
        startRange: 2, //开始页码为2个
        midRange: 3, //最多显示几个页码页码,其余用..代替
        endRange: 2, //结束页码为2个
        keyBrowse: true
      });
    });
  </script>
</head>
<body>
<div id=right>
  <div style="padding-bottom: 0px; padding-left: 10px; padding-right: 10px; padding-top: 15px">
    <div>
      <table border=0 cellspacing=0 cellpadding=0 width="100%">
        <tbody>
        <tr>
          <td class=main_alll_h2 height=28 width=120><a href="#">用户提现列表列表</a></td>
          <td width=2>&nbsp; </td>
          <td>&nbsp; </td>
        </tr>
        </tbody>
      </table>
      <div style="padding-bottom: 10px; background-color: #fff; padding-left: 10px; width: 1120px; padding-right: 10px; padding-top: 10px">
        <form id="form" name="form" action="<c:url value="/repalyList.do"/>" method="post">
          <table style="margin-bottom: 8px" border=0 cellspacing=0 cellpadding=0 width="100%">
            <tbody>
            <tr>
              <td class=f66 height=36 width="50%" align=left>用户名称：<input id="user_name" name="user_name" value="<c:out value="${user_name}" />" />
                &nbsp;&nbsp;购买期限：<select name="period" id="period">
                  <option value="">--请选择--</option>
                  <option value="3" <c:if test="${period==3}">selected</c:if>>3个月</option>
                  <option value="6" <c:if test="${period==6}">selected</c:if>>6个月</option>
                  <option value="12" <c:if test="${period==12}">selected</c:if>>12个月</option>
                </select>
                &nbsp;&nbsp;起止时间： <input name="beginDate" id="beginDate" value="<c:out value="${beginDate}"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" type="text"/> -- <input
                        id="endDate" name="endDate" value="<c:out value="${endDate}"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" type="text" />&nbsp;<input id="bt_search" value="搜索" type="button" />
              </td>
            </tr>
            </tbody>
          </table>
        </form>
        <div>
          <table id="listTable" style="width: 100%; color: #333333;border-collapse: collapse;" bgColor="#dee7ef" border="0" cellSpacing="1" cellPadding="1">
            <thread>
              <tr class="gvHeader">
                <th width="10%" class="thalign"><input name="chkAll" id="chkAll" type="checkbox" class="iptalign" />全选</th>
                <th width="10%">用户名称</th>
                <th width="20%">购买期限</th>
                <th width="20%">购买金额</th>
                <th width="20%">利率</th>
                <th width="20%">购买时间</th>
              </tr>
            </thread>
            <tbody id="tbody">
            <c:if test="${empty fundTradeList}">
              <tr class=gvItem>
                <td align="center" colspan="6">查询数据为空！</td>
              </tr>
            </c:if>
            <c:if test="${not empty fundTradeList }">
              <c:forEach items="${fundTradeList}" var="list">
                <tr class=gvItem>
                  <td align="center"><input class="downloadid" value='<c:out value="${list.trade_id}"/>' type="checkbox" name="trade_ids" /></td>
                  <td align="center"><c:out value="${list.user_name}"/></td>
                  <td align="center"><c:out value="${list.period}"/>月</td>
                  <td align="center"><c:out value="${list.trade_amount}"/></td>
                  <td align="center"><c:out value="${list.money_scope}"/></td>
                  <td align="center"><f:formatDate value="${list.trade_time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                </tr>
              </c:forEach>
            </c:if>
            </tbody>
          </table>
          <div id="page" class="holder" align="center"></div>
        </div></div></div>
  </div></div>
</body>
</html>