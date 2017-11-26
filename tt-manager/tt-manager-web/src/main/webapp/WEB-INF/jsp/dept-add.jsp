<%--
  User: CTKJ-0106
  Date: 2017/11/26
  Time: 14:52
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="easyui-panel" title="部门详情" data-options="fit:true">
    <form class="deptForm" id="deptAddForm" name="deptAddForm" method="post">
        <table style="width:100%;">
            <tr>
                <td class="label">部门名称：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="deptname" name="deptname"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">部门编码：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="deptcode" name="deptcode"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">排序号：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="ordernum" name="ordernum"
                           data-options="required:true" style="width:200px">
                </td>
            </tr>
            <tr>
                <td class="label">机构层级：</td>
                <td>
                    <select id="deptlevel" class="easyui-combobox" name="deptlevel"  data-options="required:true" style="width:200px;">
                        <option value = " ">全部</option>
                        <option value = "1">一级</option>
                        <option value = "0">0级</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td class="label">备注：</td>
                <td>
                    <input class="easyui-textbox" type="text" id="deptremark" name="deptremark"
                           data-options="validType:'length[0,150]',multiline:true" style="width:200px;">
                </td>
            </tr>
            <tr>
                <%-- <td class="label" >是否删除：</td>--%>
                <td>

                <td>
                    <input class="easyui-numberbox" type="hidden" id="priceView" name="priceView">
                    <input type="hidden" id="deleted" name="deleted" >
                </td>
            </tr>
            <tr>
                <%-- <td class="label" >自身id：</td>--%>
                <td>

                <td>
                    <input class="easyui-numberbox" type="hidden" id="parentView" name="parentView">
                    <input type="hidden" id="parentid" name="parentid" >
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
        $('#deptAddForm').form('submit', {
            //提交给后台处理的URL地址
            url: 'dept',
            //提交前的动作，如果返回false阻止提交
            onSubmit: function () {
                //给商品价格隐藏域设值
                $('#deleted').val($('#priceView').val()*100);
                //this:DOM对象
                //$(this)：jquery对象
                return $(this).form('validate');
            },
            onSubmit: function () {
                //给商品价格隐藏域设值
                $('#parentid').val($('#parentView').val()*100);
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
