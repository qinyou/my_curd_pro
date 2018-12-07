/*treegrid curd 通用*/

/**
 * 打开新增弹窗
 * @param tgId
 * @param url
 * @param width
 * @param height
 */
function newModel(tgid,url,width,height) {
    var node = $("#"+tgid).treegrid("getSelected");
    if(node != null){
        url += '?pid='+node.ID;
    }
    popup.openIframe('新建', url,width,height);
}

/**
 * 打开编辑弹窗
 * @param tgId treegrid id
 * @param url
 * @param width
 * @param height
 */
function editModel(tgId,url,width,height){
    var node = $("#"+tgId).treegrid("getSelected");
    if (node != null) {
        popup.openIframe('编辑', url+'?id=' + node.ID, width, height);
    } else {
        popup.msg('请选择一行数据进行编辑');
    }
}



/**
 * datagird 过滤
 * @param tgId datagrid id
 * @param inputsSpanId 查询条件父容器id
 */
function queryModel(tgId,inputsSpanId){
    var queryParams = {};
    var inputDomAry = $("#"+inputsSpanId+" input[name*=search_]");
    console.log(inputDomAry.length);
    var val;
    for(var i = 0,len = inputDomAry.length; i < len; i++){
        val = $(inputDomAry[i]).val();
        if($.trim(val)=='' || val==undefined || val==null){
            continue;
        }
        queryParams[$(inputDomAry[i]).attr("name")]=val;
    }
    $('#'+tgId).treegrid('load', queryParams);
}


// datagrid 筛选框 enter 监听
$(".searchInputArea,.searchInputAreaDiv").on("keydown", function (e) {
    var that = this;
    if (e.keyCode == 13) {
        $(".searchBtn",that).first().trigger('click');
    }
});

