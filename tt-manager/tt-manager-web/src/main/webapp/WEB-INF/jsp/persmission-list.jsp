<%--
  User: CTKJ-0106
  Date: 2017/11/26
  Time: 16:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table id="sg"></table>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fffcf9;">
        <label>权限名称：</label>
        <input class="easyui-textbox" type="text" id="permissionname">
        <label>权限级别：</label>
        <select id="permissionlevel" class="easyui-combobox">
            <option value="">全部</option>
            <option value=1>一级</option>
            <option value=1>二级</option>
            <option value=3>三级</option>
            <option value=4>四级</option>
        </select>
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
        $('#sg').datagrid('load',{
            permissionname:$('#permissionname').val(),
            permissionlevel:$('#permissionlevel').combobox('getValue')
        });
    }
    function  add() {
        ttshop.addTabs('新增权限信息','permission-add');
    }
    function  edit() {
        ttshop.addTabs('编辑权限信息','dept-edit');
        //获取选中的行
        var selectRows = $('#sg').datagrid('getSelections');
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
        var selectRows = $('#sg').datagrid('getSelections');
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
                    'permissions/batch',
                    //data:提交哪些数据给后台进行处理
                    {'ids[]':ids},
                    //function:处理后成功回调的函数
                    function(data){
                        $('#sg').datagrid('reload');
                    },
                    //datatype:返回的数据类型
                    'json'
                );

            }
        });
    }
    /*初始化数据表格*/
    $('#sg').datagrid({
        pageSize:10,
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        url:'rpPermission',
        columns:[[
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:200},
            {field:'permissionname',title:'权限名称',width:200},
            {field:'type',title:'权限类型',width:200},
            {field:'ordernum',title:'序列号',width:200},
            {field:'permissionremark',title:'备注',width:200},
            {field:'permissionlevel',title:'权限级别',formatter:function(value,row,index){
                switch (value){
                    case 1:
                        return '一级';
                        break;
                    case 2:
                        return '二级';
                        break;
                    case 3:
                        return '三级';
                        break;
                    case 4:
                        return '四级';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }},
        ]]
    });

</script>
