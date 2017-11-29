<%--
  User: CTKJ-0106
  Date: 2017/11/23
  Time: 13:58
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>


<div class="easyui-panel" title="用户详情" data-options="fit:true"  buttons="#dlg-buttons">
    <form class="userForm" id="userAddForm" name="userAddForm" method="post">



        <table style="width:100%;">
            <tr>
                <td class="label">帐户名：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="useraccount" name="useraccount"
                           data-options="required:true" style="width:200px" /><font color="red">*</font><font color="red" id = "sp1"></font>
                </td>
            </tr>
            <tr>
                <td class="label">用户名：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="username" name="username"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">用户密码：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="password" name="password"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">所属部门：</td>
                <td>
                    <input id="deptid" name="deptid" style="width:200px;">
                </td>
            </tr>

            <tr>
                <td class="label">用户状态：</td>
                <td>
                    <select id="userstatus" class="easyui-combobox" name="userstatus"  data-options="required:true" style="width:200px;">
                        <option value = " ">全部</option>
                        <option value = "1">启用</option>
                        <option value = "0">禁用</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td class="label">手机：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="mobile" name="mobile"
                           data-options="required:false" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">邮箱：</td>
                <td>

                    <input class="easyui-textbox" type="text" id="email" name="email"
                           data-options="required:false" style="width:200px;">
                </td>
            </tr>

            <tr>
                <td class="label">性别：</td>
                <td>
                    <input type="radio" name="sex" value="男" checked = "checked"><span>男</span>
                    <input type="radio" name="sex" value="女"><span>女</span>
                </td>
            </tr>
            <tr>
                <td class="label">备注：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="userremark" name="userremark"
                           data-options="validType:'length[0,150]',multiline:true" style="width:200px;">
                </td>
            </tr>
            <tr>
                <%-- <td class="label" >是否删除：</td>--%>
                <td>
                    <%--<select id="deletedView" class="easyui-combobox"  data-options="required:true" name="deletedView" style="width:200px;">
                        <option value="aa">全部</option>
                        <option>是</option>
                        <option>否</option>
                    </select>--%>
                <td>
                    <input class="easyui-numberbox" type="hidden" id="priceView" name="priceView">
                    <input type="hidden" id="deleted" name="deleted" >
                </td>
            </tr>
           <%-- <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>--%>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>
<div id="dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">保存</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
</div>
<script>
    //初始化树形下拉框
    $('#deptid').combotree({
        url: 'userCats?parentId=0',
        required: true,
        onBeforeExpand:function(node){
            //首先获取combotree组件中的树，再获取到树中选项
            var options = $('#deptid').combotree('tree').tree('options');
            //通过修改url用来点击
            options.url = 'userCats?parentId=' + node.id;
        },
        onBeforeSelect:function(node){
            //如果是最终的类别返回true，否则返回false
            var isLeaf = $('#deptId').tree('isLeaf',node.target);
            if(!isLeaf){
                $.messager.alert('警告','没有选中最终类目','warning');
                return false;
            }

        }
    });
    //用来提交表单的操作
    function submitForm() {
        $('#userAddForm').form('submit', {
            //提交给后台处理的URL地址
            url: 'user',
            //提交前的动作，如果返回false阻止提交
            onSubmit: function () {
                //给商品价格隐藏域设值
                $('#deleted').val($('#priceView').val()*100);
                //this:DOM对象
                //$(this)：jquery对象
                return $(this).form('validate');
            },
            //提交处理成功后的动作
            success: function () {
                console.log('success');
            }
        })
    }

</script>
