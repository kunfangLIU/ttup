<%--
  User: CTKJ-0106
  Date: 2017/11/27
  Time: 12:48
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="角色详情" data-options="fit:true">
    <form class="roleForm" id="roleAddForm" name="roleAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">角色名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="rolename" name="rolename"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">角色状态：</td>
                <td>
                    <select id="rolestatus" class="easyui-combobox" name="rolestatus"  data-options="required:true" style="width:200px;">
                        <option value = " ">全部</option>
                        <option value = "1">启用</option>
                        <option value = "0">禁用</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="label">备注：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="roleremark" name="roleremark"
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
            <tr>
                <td colspan="2">
                    <button onclick="submitForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-ok'">保存
                    </button>
                    <button onclick="clearForm()" class="easyui-linkbutton" type="button"
                            data-options="iconCls:'icon-undo'">重置
                    </button>
                </td>
            </tr>
        </table>
        <input name="paramData" id="paramData" style="display:none;">
    </form>
</div>

<script>

    //用来提交表单的操作
    function submitForm() {
        $('#roleAddForm').form('submit', {
            //提交给后台处理的URL地址
            url: 'rpRoles',
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
