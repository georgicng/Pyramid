<%-- 
    Document   : user_form
    Created on : Sep 14, 2017, 1:57:26 AM
    Author     : gaiproject
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form id="role-form" method="post" data-parsley-validate="" class="form-horizontal form-label-left" novalidate="">

    <div class="form-group">
        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Role Name <span class="required">*</span>
        </label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <input type="text" id="name" name="name" required="required" class="form-control col-md-7 col-xs-12" value="${role.name}" data-parsley-mincheck="3">
        </div>
    </div>
    <div class="form-group">
        <label for="description" class="control-label col-md-3 col-sm-3 col-xs-12">Description</label>
        <div class="col-md-6 col-sm-6 col-xs-12">
            <textarea name="description" class="form-control col-md-7 col-xs-12" rows="3">${role.description}</textarea>
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
                    <input type="radio" name="status" value="I" data-parsley-multiple="status" <c:if test="${role.status == 'I'}"> checked </c:if>> Inactive
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
