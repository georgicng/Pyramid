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
                <h3>Users</h3>
            </div>

            <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for...">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">Go!</button>
                        </span>
                    </div>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>Plus Table Design</h2>
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
                        <p class="text-muted font-13 m-b-30">
                            DataTables has most features enabled by default, so all you need to do to use it with your own tables is to call the construction function: <code>$().DataTable();</code>
                        </p>
                        <div id="datatable-checkbox_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer"><div class="row"><div class="col-sm-6"><div class="dataTables_length" id="datatable-checkbox_length"><label>Show <select name="datatable-checkbox_length" aria-controls="datatable-checkbox" class="form-control input-sm"><option value="10">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select> entries</label></div></div><div class="col-sm-6"><div id="datatable-checkbox_filter" class="dataTables_filter"><label>Search:<input type="search" class="form-control input-sm" placeholder="" aria-controls="datatable-checkbox"></label></div></div></div><div class="row"><div class="col-sm-12"><table id="datatable-checkbox" class="table table-striped table-bordered bulk_action dataTable no-footer" role="grid" aria-describedby="datatable-checkbox_info">
                                        <thead>
                                            <tr role="row"><th class="sorting_disabled" rowspan="1" colspan="1" aria-label="
                                                               " style="width: 6px;">
                                                </th><th class="sorting_asc" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-sort="ascending" aria-label=": activate to sort column descending" style="width: 34px;"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Name: activate to sort column ascending" style="width: 139px;">Name</th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 232px;">Position</th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 102px;">Office</th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 51px;">Age</th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 100px;">Start date</th><th class="sorting" tabindex="0" aria-controls="datatable-checkbox" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 78px;">Salary</th></tr>
                                        </thead>


                                        <tbody>

























































                                            <tr role="row" class="odd">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Tiger Nixon</td>
                                                <td>System Architect</td>
                                                <td>Edinburgh</td>
                                                <td>61</td>
                                                <td>2011/04/25</td>
                                                <td>$320,800</td>
                                            </tr><tr role="row" class="even">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Garrett Winters</td>
                                                <td>Accountant</td>
                                                <td>Tokyo</td>
                                                <td>63</td>
                                                <td>2011/07/25</td>
                                                <td>$170,750</td>
                                            </tr><tr role="row" class="odd">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Ashton Cox</td>
                                                <td>Junior Technical Author</td>
                                                <td>San Francisco</td>
                                                <td>66</td>
                                                <td>2009/01/12</td>
                                                <td>$86,000</td>
                                            </tr><tr role="row" class="even">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Cedric Kelly</td>
                                                <td>Senior Javascript Developer</td>
                                                <td>Edinburgh</td>
                                                <td>22</td>
                                                <td>2012/03/29</td>
                                                <td>$433,060</td>
                                            </tr><tr role="row" class="odd">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Airi Satou</td>
                                                <td>Accountant</td>
                                                <td>Tokyo</td>
                                                <td>33</td>
                                                <td>2008/11/28</td>
                                                <td>$162,700</td>
                                            </tr><tr role="row" class="even">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Brielle Williamson</td>
                                                <td>Integration Specialist</td>
                                                <td>New York</td>
                                                <td>61</td>
                                                <td>2012/12/02</td>
                                                <td>$372,000</td>
                                            </tr><tr role="row" class="odd">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Herrod Chandler</td>
                                                <td>Sales Assistant</td>
                                                <td>San Francisco</td>
                                                <td>59</td>
                                                <td>2012/08/06</td>
                                                <td>$137,500</td>
                                            </tr><tr role="row" class="even">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Rhona Davidson</td>
                                                <td>Integration Specialist</td>
                                                <td>Tokyo</td>
                                                <td>55</td>
                                                <td>2010/10/14</td>
                                                <td>$327,900</td>
                                            </tr><tr role="row" class="odd">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Colleen Hurst</td>
                                                <td>Javascript Developer</td>
                                                <td>San Francisco</td>
                                                <td>39</td>
                                                <td>2009/09/15</td>
                                                <td>$205,500</td>
                                            </tr><tr role="row" class="even">
                                                <td>
                                                </td><th class="sorting_1"><div class="icheckbox_flat-green" style="position: relative;"><input type="checkbox" id="check-all" class="flat" style="position: absolute; opacity: 0;"><ins class="iCheck-helper" style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins></div></th>

                                                <td>Sonya Frost</td>
                                                <td>Software Engineer</td>
                                                <td>Edinburgh</td>
                                                <td>23</td>
                                                <td>2008/12/13</td>
                                                <td>$103,600</td>
                                            </tr></tbody>
                                    </table></div></div><div class="row"><div class="col-sm-5"><div class="dataTables_info" id="datatable-checkbox_info" role="status" aria-live="polite">Showing 1 to 10 of 57 entries</div></div><div class="col-sm-7"><div class="dataTables_paginate paging_simple_numbers" id="datatable-checkbox_paginate"><ul class="pagination"><li class="paginate_button previous disabled" id="datatable-checkbox_previous"><a href="#" aria-controls="datatable-checkbox" data-dt-idx="0" tabindex="0">Previous</a></li><li class="paginate_button active"><a href="#" aria-controls="datatable-checkbox" data-dt-idx="1" tabindex="0">1</a></li><li class="paginate_button "><a href="#" aria-controls="datatable-checkbox" data-dt-idx="2" tabindex="0">2</a></li><li class="paginate_button "><a href="#" aria-controls="datatable-checkbox" data-dt-idx="3" tabindex="0">3</a></li><li class="paginate_button "><a href="#" aria-controls="datatable-checkbox" data-dt-idx="4" tabindex="0">4</a></li><li class="paginate_button "><a href="#" aria-controls="datatable-checkbox" data-dt-idx="5" tabindex="0">5</a></li><li class="paginate_button "><a href="#" aria-controls="datatable-checkbox" data-dt-idx="6" tabindex="0">6</a></li><li class="paginate_button next" id="datatable-checkbox_next"><a href="#" aria-controls="datatable-checkbox" data-dt-idx="7" tabindex="0">Next</a></li></ul></div></div></div></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/app/footer.jsp"/>
