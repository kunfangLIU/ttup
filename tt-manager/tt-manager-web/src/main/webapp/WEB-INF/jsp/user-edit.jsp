<%--
  User: CTKJ-0106
  Date: 2017/11/24
  Time: 15:51
--%>
<script src="http://www.cnblogs.com/Resources/jquery-easyui-1.2.3/jquery-1.4.4.min.js" type="text/javascript"></script>
<script src="http://www.cnblogs.com/Resources/jquery-easyui-1.2.3/jquery.easyui.min.js" type="text/javascript"></script>
<link href="http://www.cnblogs.com/Resources/jquery-easyui-1.2.3/themes/default/easyui.css" rel="stylesheet"
      type="text/css" />
<link href="http://www.cnblogs.com/Resources/jquery-easyui-1.2.3/themes/icon.css" rel="stylesheet"
      type="text/css" />
<script src="http://www.cnblogs.com/Resources/jquery-easyui-1.2.3/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        var datagrid; //定义全局变量datagrid
        var editRow = undefined; //定义全局变量：当前编辑的行
        datagrid = $("#dd").datagrid({
        pagination: true, //显示分页
            pageSize: 15, //页大小
            pageList: [15, 30, 45, 60], //页大小下拉选项此项各value是pageSize的倍数
            fit: true, //datagrid自适应宽度
            fitColumn: false, //列自适应宽度
            striped: true, //行背景交换
            nowap: true, //列内容多时自动折至第二行
            border: false,
        columns: [[//显示的列
            {field:'ck',checkbox:true},
            {field:'id',title:'序号',width:100},
            {field:'useraccount',title:'帐户',width:100},
            {field:'username',title:'用户名',width:100},
            {field:'sex',title:'性别',width:100},
            {field:'mobile',title:'电话',width:100},
            {field:'email',title:'邮箱',width:100},
            {field:'userremark',title:'备注',width:100},
            {field:'userstatus',title:'用户状态',formatter:function(value,row,index) {
                switch (value) {
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
            },
    ]]

        { text: '修改', iconCls: 'icon-edit', handler: function () {
//修改时要获取选择到的行
            var rows = datagrid.datagrid("getSelections");
//如果只选择了一行则可以进行修改，否则不操作
            if (rows.length == 1) {
//修改之前先关闭已经开启的编辑行，当调用endEdit该方法时会触发onAfterEdit事件
                if (editRow != undefined) {
                    datagrid.datagrid("endEdit", editRow);
                }
//当无编辑行时
                if (editRow == undefined) {
//获取到当前选择行的下标
                    var index = datagrid.datagrid("getRowIndex", rows[0]);
//开启编辑
                    datagrid.datagrid("beginEdit", index);
//把当前开启编辑的行赋值给全局变量editRow
                    editRow = index;
//当开启了当前选择行的编辑状态之后，
//应该取消当前列表的所有选择行，要不然双击之后无法再选择其他行进行编辑
                    datagrid.datagrid("unselectAll");
                }
            }
        }
        }, '_',
        { text: '保存', iconCls: 'icon-save', handler: function () {
//保存时结束当前编辑的行，自动触发onAfterEdit事件如果要与后台交互可将数据通过Ajax提交后台
            datagrid.datagrid("endEdit", editRow);
        }
        }, '_',
        { text: '取消编辑', iconCls: 'icon-redo', handler: function () {
//取消当前编辑行把当前编辑行罢undefined回滚改变的数据,取消选择的行
            editRow = undefined;
            datagrid.datagrid("rejectChanges");
            datagrid.datagrid("unselectAll");
        }
        }, '_'
        onAfterEdit: function (rowIndex, rowData, changes) {
//endEdit该方法触发此事件
            console.info(rowData);
            editRow = undefined;
        },
        onDblClickRow: function (rowIndex, rowData) {
//双击开启编辑行
            if (editRow != undefined) {
                datagrid.datagrid("endEdit", editRow);
            }
            if (editRow == undefined) {
                datagrid.datagrid("beginEdit", rowIndex);
                editRow = rowIndex;
            }
        }
    });
    });
</script>