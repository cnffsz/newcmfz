<%@page pageEncoding="UTF-8"  isELIgnored="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>持名法州后台管理中心</title>
			
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
	<link rel="icon" href="img/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="css/common.css" type="text/css"></link>
	<link rel="stylesheet" href="css/login.css" type="text/css"></link>
	<script type="text/javascript" src="script/jquery.js"></script>
	<script type="text/javascript" src="script/common.js"></script>
	<script type="text/javascript">

 /*       $(document).ready(function () {
            $("#mgrName").focus();
            //记住用户名和密码
            $('#Remeber').click(function () {
                if ($("#UserAccount").val() == "") {
                    alert("用户名不能为空！");
                }else {
                    if ($('#Remeber').attr("checked")) {
                        setCookie("uname", $("#mgrName").val(), 60);
                    }
                    else {
                        delCookie("uname");
                    }
                }
            });
            if (getCookie("uname") != null)
            {
                $('#Remember').attr("checked", "checked");
                $('#mgrName').val(getCookie("uname"));
            }
        })
        //写cookies
        function setCookie(name, value) {
            var Days = 30;
            var exp = new Date();
            exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
            document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
        }
        //读取cookies
        function getCookie(name) {
            var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
            if (arr = document.cookie.match(reg)) return unescape(arr[2]);
            else return null;
        }
        //删除cookies
        function delCookie(name) {
            var exp = new Date();
            exp.setTime(exp.getTime() - 1);
            var cval = getCookie(name);
            if (cval != null) document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
        }
*/




        $(function(){
			/*//点击更换验证码：
			$("#captchaImage").click(function(){//点击更换验证码
				alert("自己做");
			});*/
			
			/*//  form 表单提交
			$("#loginForm").bind("submit",function(){
				alert("自己做");
				return false;
			});*/

			$("#username").val("${name}");
		});
	</script>
</head>
<body>
	
		<div class="login">
			<form id="loginForm" action="/cmfz/admin/admin/login" method="post" >
				
				<table>
					<tbody>
						<tr>
							<td width="190" rowspan="2" align="center" valign="bottom">
								<img src="img/header_logo.gif" />
							</td>
							<th>
								用户名:
							</th>
							<td>
								<input type="text"  id="username" name="mgrName" class="text"  maxlength="20"/>
							</td>
					  </tr>
					  <tr>
							<th>
								密&nbsp;&nbsp;&nbsp;码:
							</th>
							<td>
								<input type="password" name="mgrPwd" class="text"   maxlength="20" autocomplete="off"/>
							</td>
					  </tr>
					
						<tr>
							<td>&nbsp;</td>
							<th>验证码:</th>
							<td>
								<input type="text" id="enCode" name="Vcode" class="text captcha" maxlength="4" autocomplete="off"/>
								<img id="captchaImage" class="captchaImage" width="75"  height="25"     src="/cmfz/admin/admin/getImage"  title="点击更换验证码" onclick="this.src='/cmfz/admin/admin/getImage?time-'+(new Date()).getTime();"/>

							</td>
						</tr>					
					<tr>
						<td>
							&nbsp;
						</td>
						<th>
							&nbsp;
						</th>
						<td>
							<label>
								<input type="checkbox" id="Remember" value="true" name="remember"/> 记住用户名
							</label>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<th>&nbsp;</th>
						<td>
							<input type="button" class="homeButton" value="" onclick="location.href='/'"><input type="submit" class="loginButton" value="登录">
						</td>
					</tr>
				</tbody></table>
				<div class="powered">COPYRIGHT © 2008-2017.</div>
				<div class="link">
					<a href="http://www.chimingfowang.com/">持名佛网首页</a> |
					<a href="http://www.chimingbbs.com/">交流论坛</a> |
					<a href="">关于我们</a> |
					<a href="">联系我们</a> |
					<a href="">授权查询</a>
				</div>
			</form>
		</div>
</body>
</html>