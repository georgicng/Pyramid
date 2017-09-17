<%-- 
    Document   : new_user.jsp
    Created on : Sep 4, 2017, 1:49:36 AM
    Author     : gaiproject
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/app/header.jsp"/>
<jsp:include page="/app/sidebar.jsp"/>
<jsp:include page="/app/topbar.jsp"/>
<div class="right_col" role="main" style="min-height: 949px;">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>Roles</h3>
            </div>

            <div class="title_right">
                <div class="col-md-4 col-sm-4 col-xs-12 pull-right">
                    <div class="">
                        <a href="app/role/list.jsp" class="btn btn-primary btn-block">All Roles</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>
        <c:if test="${saved == true}">
            <div class="alert alert-success alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
                </button>
                <strong>Permissions saved!</strong> You can make further changes to the permissions below.
            </div>
        </c:if>
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>${role.name} Permissions</h2>
                        <ul class="nav navbar-right panel_toolbox">
                            <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Settings 1</a>
                                    </li>
                                    <li><a href="#">Settings 2</a>
                                    </li>
                                </ul>
                            </li>
                            <li><a class="close-link"><i class="fa fa-close"></i></a>
                            </li>
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <form action="app/role/permissions.jsp?roleId=${role.id}" method="POST" id="permissions">
                               <table id="permissiontable-responsive" class="display" cellspacing="0" width="100%">
                                <thead>
                                    <tr>
                                        <th>Resource</th>
                                        <th>Module</th>
                                        <th>Action</th>
                                        <th>Permission</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${resources}" var="item">
                                        <tr>
                                            <td>${item.name} <input type="hidden" name="perm_resource" value="${item.id}"></td>
                                            <td>${modules[item.modulename]} <input type="hidden" name="perm_id" value="${permissions[item.id][0]}"></td>
                                            <td>${item.action} <input type="hidden" name="action" value="${item.action}"></td>
                                            <td>
                                                <select name="type" required="required" class="form-control  col-md-7 col-xs-12">
                                                    <option value="Deny" <c:if test="${permissions[item.id][1] == item.name}"> selected </c:if> >Deny</option>
                                                    <option value="Allow" <c:if test="${permissions[item.id][1] == item.name}"> selected </c:if> >Allow</option>                                                    
                                                </select>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                            <button type="submit" id="submit">Save Permissions</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/app/footer_tables.jsp"/>
