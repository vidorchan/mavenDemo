<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/loginIn.css" />
    <link rel="stylesheet" type="text/css" href="../css/lib/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/easyui/icon.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/easyui/color.css">
    <script type="text/javascript" src="../js/test.js"></script>
    <script type="text/javascript" src="../js/lib/jquery.min.js"></script>
    <script type="text/javascript" src="../js/lib/easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h1>Hello Feign</h1>
<h2>Welcome ${user.login}</h2>
<table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:250px"
       url="get_users.php"
       toolbar="#toolbar" pagination="true"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th field="firstname" width="50">First Name</th>
        <th field="lastname" width="50">Last Name</th>
        <th field="phone" width="50">Phone</th>
        <th field="email" width="50">Email</th>
    </tr>
    </thead>
</table>
<div id="toolbar">
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
</div>

<div id="dlg" class="easyui-dialog" style="width:400px"
     closed="true" buttons="#dlg-buttons">
    <form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
        <div style="margin-bottom:20px;font-size:14px;border-bottom:1px solid #ccc">User Information</div>
        <div style="margin-bottom:10px">
            <input name="firstname" class="easyui-textbox" required="true" label="First Name:" style="width:100%">
        </div>
        <div style="margin-bottom:10px">
            <input name="lastname" class="easyui-textbox" required="true" label="Last Name:" style="width:100%">
        </div>
        <div style="margin-bottom:10px">
            <input name="phone" class="easyui-textbox" required="true" label="Phone:" style="width:100%">
        </div>
        <div style="margin-bottom:10px">
            <input name="email" class="easyui-textbox" required="true" validType="email" label="Email:" style="width:100%">
        </div>
    </form>
</div>
<div id="dlg-buttons">
    <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">Save</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
</div>
</body>
</html>