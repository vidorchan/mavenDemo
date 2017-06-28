<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login In</title>
    <link rel="stylesheet" type="text/css" href="../css/lib/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/easyui/icon.css">
    <link rel="stylesheet" type="text/css" href="../css/loginIn.css">
    <script type="text/javascript" src="../js/lib/jquery.min.js"></script>
    <script type="text/javascript" src="../js/lib/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/loginIn.js"></script>
</head>
<body>
<div class="loginArea">
    <h2>Login in</h2>
    <div class="easyui-panel loginPanel">
        <div class="loginItem">
            <input ID="username" class="easyui-textbox" data-options="prompt:'Type username',iconCls:'icon-man',validType:['specialCharacter','checkLength[10]']" style="width:100%;height:34px;padding:10px;" label="User Name:">
        </div>
        <div class="loginItem">
            <input id="pass" class="easyui-passwordbox" data-options="prompt:'Type password'" style="width:100%;height:34px;padding:10px" label="Password:">
        </div>
    </div>
    <div id="viewer"></div>
</div>
</body>
</html>