<%--
  User: CTKJ-0106
  Date: 2017/11/24
  Time: 16:33
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table id="dg"></table>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fffcf9;">
        <label>部门名称：</label>
        <input class="easyui-textbox" type="text" id="deptname">
        <label>部门编码：</label>
        <input class="easyui-textbox" type="text" id="deptcode">
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<script>
    function searchForm(){
        $('#dg').datagrid('load',{
            deptname:$('#deptname').val(),
            deptcode:$('#deptcode').val(),
        });
    }
    function  add() {
        ttshop.addTabs('新增部门信息','dept-add');
    }
    function  edit() {
        ttshop.addTabs('编辑部门信息','dept-edit');
        //获取选中的行
        var selectRows = $('#dg').datagrid('getSelections');
        //没有选中任何行
        if(selectRows.length == 0){
            $.messager.alert('提示','未选中记录','warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','确认编辑内容吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].id);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'user/edit',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#dg').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }
    function  remove() {
        //获取选中的行
        var selectRows = $('#dg').datagrid('getSelections');
        //没有选中任何行
        if(selectRows.length == 0){
            $.messager.alert('提示','未选中记录','warning');
            return;
        }
        //选中至少一行记录
        $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
            if (r){
                //点击了消息窗口上的确认按钮
                //将选中记录的编号写进一个数组中
                var ids = [];
                for(var i=0;i<selectRows.length;i++){
                    ids.push(selectRows[i].id);
                }
                //ajax提交数组给后台
                $.post(
                    //url:提交给后台的哪个动作去处理，只有第一个参数是必选的，其余的都是可选项
                    'depts/batch',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#dg').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }
    /*初始化数据表格*/
    $('#dg').datagrid({
        pageSize:10,
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        url:'rpDept',
        columns:[[
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:200},
            {field:'deptname',title:'部门名称',width:200},
            {field:'deptcode',title:'部门编码',width:200},
            {field:'ordernum',title:'排序号',width:200},
            {field:'deptremark',title:'备注',width:200},
        ]]
    });

</script>
