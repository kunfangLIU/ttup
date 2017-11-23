<%--
  User: CTKJ-0106
  Date: 2017/11/23
  Time: 10:27
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<table id="rg"></table>
<div id="toolbar">
    <div style="padding: 5px; background-color: #fffcf9;">
        <label>用户名：</label>
        <input class="easyui-textbox" type="text" id="username">
        <label>状态：</label>
        <select id="status" class="easyui-combobox">
            <option value="">全部</option>
            <option value="0">禁用</option>
            <option value="1">启用</option>
        </select>
        <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
        <!--注意：要加上type="button",默认行为是submit-->
        <button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>
    </div>
    <div>
        <button onclick="add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button onclick="edit()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button onclick="remove()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
       <%-- <button onclick="down()" class="easyui-linkbutton" data-options="iconCls:'icon-down',plain:true">下架</button>
        <button onclick="up()" class="easyui-linkbutton" data-options="iconCls:'icon-up',plain:true">上架</button>--%>
    </div>
</div>

<table id="rg"></table>

<script>
    function searchForm(){
        $('#rg').datagrid('load',{
            username:$('#username').val(),
            status:$('#status').combobox('getValue')
        });
    }
    function  add() {
        ttshop.addTabs('新增商品','item-add');
    }
    function  edit() {
        console.log('edit');
    }
   /* function  down() {
        console.log('down');
    }
    function  up() {
        console.log('up');
    }*/
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
                    'items/batch',
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
    $('#rg').datagrid({
        pageSize:10,
        toolbar:'#toolbar',
        fit:true,
        pagination:true,
        url:'rpUsers',
        columns:[[
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:100},
            {field:'useraccount',title:'帐户',width:100},
            {field:'username',title:'用户名',width:100},
            {field:'sex',title:'性别',width:100},
            {field:'mobile',title:'电话',width:100},
            {field:'email',title:'邮箱',width:100},
            {field:'userremark',title:'备注',width:100},
            {field:'userstatus',title:'用户状态',formatter:function(value,row,index){
                switch (value){
                    case "0":
                        return '禁用';
                        break;
                    case '1':
                        return '启用';
                        break;
                    default:
                        return '未知';
                        break;
                }
            }},
        ]]
    });

</script>

