<#--数据字典 datagrid  -->
<#include "../common/common.ftl"/>
<@layout>
<#include "../common/popup.ftl"/>
<div class="easyui-layout" fit="true" border="false">
    <div data-options="region:'west',split:true" style="width:40%;" collapsible="false">
        <table id="dg" class="easyui-datagrid"
               url="${ctx!}/sysRole/query"
               toolbar="#tb" rownumbers="true" border="false"
               data-options="onSelect:groupSelect"
               fitColumns="true"
               fit="true" pagination="true"
               ctrlSelect="true"
               striped="true"
               pageSize="40" pageList="[20,40]">
            <thead>
            <tr>
                <th data-options="field:'ID',checkbox:true"></th>
                <th field="NAME" width="100">名称</th>
                <th field="CODE" width="100">编码</th>
                <th field="DESCRIPTION" width="200">说明</th>
                <th field="SORT" width="50">排序号</th>
            </tr>
            </thead>
        </table>
        <div id="tb">
            <a onclick="newModel('${ctx!}/sysRole/newModel', '500px', '400px')" href="#" class="easyui-linkbutton"
               iconCls="iconfont icon-add" plain="true">新增</a>
            <a onclick="editModel('dg','${ctx!}/sysRole/newModel', '500px', '400px')" href="#"
               class="easyui-linkbutton" iconCls="iconfont icon-edit" plain="true">编辑</a>
            <a onclick="deleteModel('dg','${ctx!}/sysRole/deleteAction')" href="#" class="easyui-linkbutton  "
               iconCls="iconfont icon-delete" plain="true">删除</a>
            <span id="searchSpan" class="searchInputArea">
                    <input name="search_LIKE_NAME" prompt="名称" class="easyui-textbox" style="width:120px; ">
                    <input name="search_LIKE_CODE" prompt="编码" class="easyui-textbox" style="width:120px; ">
                    <a href="#" class="easyui-linkbutton searchBtn" data-options="iconCls:'iconfont icon-search',plain:true"
                       onclick="queryModel('dg','searchSpan')">搜索</a>
            </span>
        </div>
    </div>

    <div data-options="region:'center'">
        <table id="dg2" class="easyui-datagrid"
               url="${ctx!}/sysDict/queryDict?search_EQS_del_flag=0"
               toolbar="#tb2" rownumbers="true" border="false"
               fit="true" pagination="true"
               fitColumns="true"
               ctrlSelect="true"
               striped="true"
               pageSize="40" pageList="[20,40]">
            <thead>
            <tr>
                <th data-options="field:'ID',checkbox:true"></th>
                <th field="DICT_LABEL" width="150">名称</th>
                <th field="DICT_VALUE" width="200">编码</th>
                <th field="DICT_SORT" width="100">排序号</th>
                <th field="CREATE_TIME" width="200">创建时间</th>
            </tr>
            </thead>
        </table>
        <div id="tb2">
            <div id="searchSpan2" class="searchInputAreaDiv"   >
                    <input name="search_LIKE_dict_label" prompt="名称" class="easyui-textbox" style="width:120px; ">
                    <input name="search_LIKE_dict_value" prompt="编码" class="easyui-textbox" style="width:120px; ">
                    <a href="#" class="easyui-linkbutton searchBtn" data-options="iconCls:'iconfont icon-search',plain:true"
                       onclick="queryModel('dg2','searchSpan2')">搜索</a>
            </div>
        </div>
    </div>
</div>
<script src="${ctx!}/static/js/dg-curd.js"></script>
<script>
    /*左侧分组选中*/
    function groupSelect(index,row){
        var queryParams = {};
        queryParams.search_EQS_group_code = row.GROUP_CODE;
        $('#dg2').datagrid('load', queryParams);
    };
</script>
</@layout>