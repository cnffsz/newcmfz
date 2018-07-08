<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<script type="text/javascript">

$(function() {

    $('#masterSummary').textbox({
        multiline:true,
		height:50
	});



});

</script>

<div style="margin-top: 35px;margin-left: 75px">
	<form id="ffMaster"     method="post" enctype="multipart/form-data">
		<p>上师姓名：<input id="masterName" class="easyui-textbox" name="masterName"></p>
		<p>上师简介：<input id="masterSummary" class="easyui-textbox"  name="masterSummary"></p>
		<p>上师图像：<input id="masterPic" name="masterFile1" class="easyui-filebox" ></p>
	</form>
</div>


