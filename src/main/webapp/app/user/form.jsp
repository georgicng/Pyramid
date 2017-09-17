<%-- 
    Document   : user_form
    Created on : Sep 14, 2017, 1:57:26 AM
    Author     : gaiproject
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form method="post" data-parsley-validate="" class="form-horizontal form-label-left" novalidate="">
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Name <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" class="form-control" id="name" name="name" placeholder="Surname" required="required" value="${user.name}" data-parsley-mincheck="3">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="othernames">Other Names <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" class="form-control" id="last-name" name="othernames" placeholder="Other Names" required="required" value="${user.othernames}" data-parsley-mincheck="3">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="email" class="form-control" id="email" name="email" placeholder="Email" required="required" value="${user.email}">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="phone">Phone <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" class="form-control" id="phone" name="phone" placeholder="GSM No" required="required" value="${user.phoneno}" data-parsley-mincheck="11">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="username">Username <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="username" name="username" required="required" class="form-control col-md-7 col-xs-12" value="${user.username}" data-parsley-mincheck="3">
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="role">Role <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <c:if test="${not empty roles}">
                <select name="role" required="required" class="form-control  col-md-7 col-xs-12">
                    <option>Choose option</option>
                    <c:forEach items="${roles}" var="item">
                        <option value="<c:out value = "${item.name}"/>" <c:if test="${user.rolename == item.name}"> selected </c:if> ><c:out value = "${item.name}"/></option>
                    </c:forEach>                                        
                </select>
            </c:if>
            <c:if test="${empty roles}">
                <input type="text" id="role" name="role" required="required" placeholder="Enter role" class="form-control col-md-7 col-xs-12" value="${user.rolename}" data-parsley-mincheck="3">
                <input type="hidden" id="role" name="create_role" value="1">								
            </c:if>
        </div>
    </div>
    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12">Status</label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <div id="gender" class="btn-group" data-toggle="buttons">
                <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                    <input type="radio" name="status" value="A" data-parsley-multiple="status" <c:if test="${user.status == 'A'}"> checked </c:if>> &nbsp; Active &nbsp;
                </label>
                <label class="btn btn-primary" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                    <input type="radio" name="status" value="I" data-parsley-multiple="status" <c:if test="${user.status == 'I'}"> checked </c:if>> Inactive
                </label>
            </div>
        </div>
    </div>
    <div class="ln_solid"></div>
    <div class="form-group">
        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
            <button class="btn btn-primary" type="button">Cancel</button>
            <button class="btn btn-primary" type="reset">Reset</button>
            <button type="submit" class="btn btn-success">Submit</button>
        </div>
    </div>

</form>
