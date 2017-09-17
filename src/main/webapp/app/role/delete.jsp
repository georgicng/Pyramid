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
                <h3>Delete User</h3>
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
        <c:if test="${deleted == true}">
            <div class="alert alert-success alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
                </button>
                <strong>Role record removed successfully!</strong>.
            </div>
        </c:if>
        <c:if test="${not empty errMsg}">
            <div class="alert alert-success alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
                </button>
                <strong>${errMsg}</strong>
            </div>
        </c:if>
    </div>
</div>
<jsp:include page="/app/footer.jsp"/>
