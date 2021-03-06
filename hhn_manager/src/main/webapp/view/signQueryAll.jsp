<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2014/12/15
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>标的查询</title>
    <link rel=stylesheet type=text/css href="<c:url value="/css/css.css"/>"/>
    <link rel=stylesheet type=text/css href="<c:url value="/css/jPages.css"/>"/>
    <script type=text/javascript src="<c:url value="/js/jquery-1.9.1.min.js"/>"></script>
    <script type=text/javascript src="<c:url value="/js/My97DatePicker/WdatePicker.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/js/jPages.js"/>"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#bt_search").click(function () {
                $("#form1").submit();
            });

            //全选
            $("#chkAll").click(function(){
                if($(this).prop("checked")){
                    $(":input[name='sign_ids']").each(function(){
                        $(this).prop("checked",true);
                    });
                }else{
                    $(":input[name='sign_ids']").each(function(){
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
                    <td class=main_alll_h2 height=28 width=120><a href="#">标的查询</a></td>
                    <td width=2>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                </tbody>
            </table>
            <div style="padding-bottom: 10px; background-color: #fff; padding-left: 10px; width: 1120px; padding-right: 10px; padding-top: 10px">
                <form id="form1" name="form1" action="<c:url value="/signQueryAll.do"/>" method="post">
                    <table style="margin-bottom: 8px" border=0 cellspacing=0 cellpadding=0 width="100%">
                        <tbody>
                        <tr>
                            <td class=f66 height=36 width="50%" align=left>标的名称： <input type="text" id="product_name" name="product_name" value='<c:out value="${product_name}" />'/>
                                &nbsp;&nbsp;状态： <select name="product_status" id="product_status">
                                <option value="1" <c:if test="${product_status==1}">selected</c:if>>待发布</option>
                                    <option value="2" <c:if test="${product_status==2}">selected</c:if>>筹标中</option>
                                    <option value="3" <c:if test="${product_status==3}">selected</c:if>>已满标</option>
                                    <option value="4" <c:if test="${product_status==4}">selected</c:if>>已流标</option>
                                    <option value="5" <c:if test="${product_status==5}">selected</c:if>>回款中</option>
                                    <option value="6" <c:if test="${product_status==6}">selected</c:if>>已还款</option>
                                    <option value="7" <c:if test="${product_status==7}">selected</c:if>>冻结</option>
                                    <option value="8" <c:if test="${product_status==8}">selected</c:if>>废弃</option>
                                </select>
                                &nbsp;&nbsp;起止时间： <input name="beginDate" id="beginDate" value="<c:out value="${beginDate}"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" type="text"/> -- <input
                                        id="endDate" name="endDate" value="<c:out value="${endDate}"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" type="text" />&nbsp;<input id="bt_search" value="搜索" type="button" />
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </form>
                <div>
                    <table id="listTable" style="width: 100%; color: #333333;border-collapse: collapse;"
                           bgColor="#dee7ef" border="0" cellSpacing="1" cellPadding="1">
                        <thead>
                        <tr class="gvHeader">
                            <th width="5%" class="thalign2"><input name="chkAll" id="chkAll" type="checkbox" class="iptalign2" />全选</th>
                            <th width="4%">标的ID</th>
                            <th width="8%">借款人</th>
                            <th width="8%">标的类型</th>
                            <th width="12%">借款标题</th>
                            <th width="8%">借款金额</th>
                            <th width="7%">借款利率</th>
                            <th width="6%">借款期限</th>
                            <th width="8%">筹标期限</th>
                            <th width="10%">还款方式</th>
                            <th width="10%">状态</th>
                            <th width="7%">借款时间</th>
                        </tr>
                        </thead>
                        <tbody id="tbody">
                        <c:if test="${empty productList}">
                            <tr class=gvItem>
                                <td colspan="13" align="center">查询数据为空！</td>
                            </tr>
                        </c:if>
                        <c:if test="${not empty productList}">
                            <c:forEach items="${productList}" var="list">
                                <tr class=gvItem>
                                    <td align="center"><input class="downloadid"
                                                              value='<c:out value="${list.product_id}"/>'
                                                              type="checkbox" name="sign_ids" /></td>
                                    <td align="center"><c:out value="${list.product_id}"/></td>
                                    <td align="center"><c:out value="${list.realName}"/></td>
                                    <td align="center">&nbsp;
                                    <td align="center"><c:out value="${list.product_name}"/></td>
                                    <td align="center"><c:out value="${list.invest_amount}"/></td>
                                    <td align="center"><c:out value="${list.annual_rate}"/></td>
                                    <td align="center"><c:out value="${list.loan_period}"/>月</td>
                                    <td align="center"><c:out value="${list.tender_day}"/>天</td>
                                    <td align="center">
                                        <c:choose>
                                            <c:when test="${list.repay_type==0}">
                                                按月还款
                                            </c:when>
                                            <c:otherwise>
                                                其它还款
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
                                    <td align="center">
                                        <c:if test="${product_status==1}">待发布</c:if>
                                        <c:if test="${product_status==2}">筹标中</c:if>
                                        <c:if test="${product_status==3}">已满标</c:if>
                                        <c:if test="${product_status==4}">已流标</c:if>
                                        <c:if test="${product_status==5}">回款中</c:if>
                                        <c:if test="${product_status==6}">已还款</c:if>
                                        <c:if test="${product_status==7}">冻结</c:if>
                                        <c:if test="${product_status==8}">废弃</c:if>
                                    </td>
                                    <td align="center"><f:formatDate value="${list.create_time}"
                                                                     pattern="yyyy-MM-dd"/></td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        </tbody>
                    </table>
                    <div id="page" class="holder" align="center"></div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>