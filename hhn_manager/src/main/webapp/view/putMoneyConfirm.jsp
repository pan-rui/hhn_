<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2014/12/16
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>放款确认</title>
  <link rel=stylesheet type=text/css href="<c:url value="/css/css.css"/>"/>
  <script type=text/javascript src="<c:url value="/js/jquery-1.9.1.min.js"/>"></script>
  <script type=text/javascript src="<c:url value="/js/My97DatePicker/WdatePicker.js"/>"></script>
  <script type="text/javascript">
    function auditSign(id) {
      if (confirm("确认放款吗？")) {
        $.ajax({
          type: "POST",
          url: "<c:url value="/signPutMoney.do"/>",
          data: {productId: id},
          async: true,
          dataType: "json",
          success: function (data) {
            if (data) {
              alert("确认放款成功！");
              self.window.close();
              opener.document.form1.submit();
            }else{
              alert("确认放款失败！");
            }
          }
        });
      }
    }
  </script>
</head>
<body>
<div id=right>
  <div style="padding-bottom: 0px; padding-left: 10px; padding-right: 10px; padding-top: 15px">
    <div></div>
      <table id="detail" cellspacing="0" cellpadding="0" style="border-collapse: collapse;border: 1px solid #DEE7EF;width: 100%">
          <tr>
            <td class="lftd">标的ID：</td><td class="ritd"><c:out value="${productDetail.product_id}" /></td>
          </tr>
        <tr>
          <td class="lftd">标的名称：</td><td class="ritd"><c:out value="${productDetail.product_name}" /></td>
        </tr>
        <tr>
          <td class="lftd">筹款用途：</td><td class="ritd"><c:out value="${productDetail.product_usage}" /></td>
        </tr>
        <tr>
          <td class="lftd">年利率：</td><td class="ritd"><c:out value="${productDetail.annual_rate}" /></td>
        </tr>
        <tr>
          <td class="lftd">筹标期限：</td><td class="ritd"><c:out value="${productDetail.loan_period}" />月</td>
        </tr>
        <tr>
          <td class="lftd">发布时间：</td><td class="ritd"><c:out value="${productDetail.publishTime}" /></td>
        </tr>
        <tr>
          <td class="lftd">满标时间：</td><td class="ritd"><c:out value="${productDetail.fullTime}" /></td>
        </tr>
        <tr>
          <td class="lftd">计划筹款金额：</td><td class="ritd"><c:out value="${productDetail.invest_amount}" /></td>
        </tr>
        <tr>
          <td class="lftd">已筹款金额：</td><td class="ritd"><c:out value="${productDetail.invested_amount}" /></td>
        </tr>
        <tr>
          <td colspan="2">&nbsp;</td>
        </tr>
        <tr>
          <td colspan="2" style="text-align: center;padding-bottom: 5px;"><input type="button" value="确认放款" onclick="auditSign('<c:out value="${productDetail.product_id}"/>')" />
            &nbsp;&nbsp;<input type="button" value="取消" onclick="window.close();" /></td>
        </tr>
        </table>
  </div>
  </div>
</body>
</html>
