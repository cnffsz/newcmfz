<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript" src="../js/datagrid-detailview.js"></script>
<script type="text/javascript">
$(function(){
	
	$('#dg12').datagrid({
        remoteSort:false,
        singleSelect:true,
        nowrap:false,
        fitColumns:true,
	    url:'/cmfz/admin/picture/showPic.do',
	    columns:[[    
	        {field:'pictureId',title:'标识编号',width:80},
	        {field:'picturePath',title:'图片姓名',width:80},
	        {field:'pictureDescription',title:'详情',width:80},
	        {field:'pictureStatus',title:'状态',width:80,
                formatter:function (value) {
                    return value == '展示中' ? '<font style="color:red">展示中</font>' : '未展示'
                }
            },
	        {field:'pictureDate',title:'日期',width:80,
                formatter : function(value){
                    var date = new Date(value);
                    var y = date.getFullYear();
                    var m = date.getMonth() + 1;
                    var d = date.getDate();
                    var h = date.getHours();
                    var m1 =date.getMinutes();
                    var s = date.getSeconds();
                    if (m <10){
                        return y + '-' +"0"+m + '-' + d;
                    }

                    return y + '-' +m + '-' + d
                        ;
                }

            },
	        {field:"operation",title:"操作",width:40,formatter:function(value,row,index){
	        	//$("#del").linkbutton({});
				return "<a class='easyui-linkbutton' data-options=\"height:20,iconCls:'icon-edit'\" onClick='updatebtn()'>修改</a> ";
			}},
	    ]],
        view:detailview,
        detailFormatter: function(rowIndex, rowData) {
            return '<table><tr>' +
                '<td rowspan=2 style="border:0"><img src="/upload/' + rowData.picturePath + '" style="height:50px;"></td>' +
                '<td style="border:0">' +
                '</td>' +
                '</tr></table>';
        },


            onLoadSuccess:function(){
	    	/* console.log(11);
	    	$(".btn").linkbutton({}); */
	    	$.parser.parse(); 
	    },
	    pagination:true,
	    pageList : [ 5, 10, 15, 20, 25 ],
		pageSize : 5,
		toolbar : "#tb",
		fitColumns: true,
		singleSelect:true,
		
	});
	

	
	$("#addUser").linkbutton({
		onClick:function(){
			$("#dialog").dialog({
				width:450,
				height:200,
				title:"新增轮播",
				toolbar:[{
					iconCls:"icon-help",
					text:"help"
				}],
				href:"/cmfz/admin/main/formPic.jsp",
				modal:true,
				buttons:[{
					iconCls:"icon-edit",
					text:"保存",
					handler:function(){
						//提交
						$("#ff").form("submit",{
							url:"/cmfz/admin/picture/addPic.do",
							onSubmit:function(){
								return $("#ff").form("validate");
							},
							success:function(res){
								if(res == "success"){
									$.messager.alert('提示','添加成功！');
									$("#dialog").dialog("close");
									$("#dg12").datagrid({
										url:"/cmfz/admin/picture/showPic.do",
									});
								}
							}
						}); 
					}
				},{
					iconCls:"icon-cancel",
					text:"取消",
					handler:function(){
						$.messager.show({
							title:"我的消息",
							msg:"对话框将要消失了",
							timeout:5000,
							showType:"slider",
						});
						
						$("#dialog").dialog("close");
					}
				}],
			});
			
		}
	});
	
	

	
	


});

function updatebtn(){
        var rowData = $("#dg12").datagrid("getSelected");
            $("#dialog").dialog({
                width:450,
                height:200,
                title:"修改用户",
                toolbar:[{
                    iconCls:"icon-help",
                    text:"help"
                }],
                href:"/cmfz/admin/main/modifyPic.jsp",
                modal:true,
                buttons:[{
                    iconCls:"icon-edit",
                    text:"保存",
                    handler:function(){
                        //提交
                        $("#ff").form("submit",{
                            url:"/cmfz/admin/picture/updatePic.do",
                            onSubmit:function(){
                                return $("#ff").form("validate");
                            },
                            success:function(res){
                                if(res == "success"){
                                    $.messager.alert('提示','修改成功！');
                                    $("#dialog").dialog("close");
                                    $("#dg12").datagrid({
                                        url:"/cmfz/admin/picture/showPic.do",
                                    });
                                }
                            }
                        });


                    }
                },{
                    iconCls:"icon-cancel",
                    text:"取消",
                    handler:function(){
                        $.messager.show({
                            title:"我的消息",
                            msg:"对话框将要消失了",
                            timeout:5000,
                            showType:"slider",
                        });

                        $("#dialog").dialog("close");
                    }
                }],
                onLoad:function(){
                    $("#ff").form("load",rowData); //在加载表单时将行数据加载到表单元素中
                }
            });




}



function qq(value,name){
	if(name=="name"){
		$('#dg12').datagrid({
		    url:'/cmfz/admin/picture/showPic.do?name='+value,
		    
		}); 
	}
	if(name=="id"){
		$('#dg12').datagrid({
		    url:'/cmfz/admin/picture/showPic.do?id='+value,

		});
	}
}

</script>

<table id="dg12"></table>
<div id="tb">
<a id="addUser" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true,text:'新增轮播图'"></a>
<a id="editUser" class="easyui-linkbutton" data-options="iconCls:'icon-help',plain:true,text:'帮助'"></a>

</div>
<div id="dialog"></div>


