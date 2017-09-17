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
                        <a href="app/role/new.jsp" class="btn btn-primary btn-block">New Role</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>All Roles</h2>
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
                            <table id="roletable-responsive" class="display" cellspacing="0" width="100%">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Description</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/app/footer_tables.jsp"/>
