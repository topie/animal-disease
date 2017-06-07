<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {width:100%;
	border-collapse: collapse;
	border-spacing: 0;
}

.r1 {
	height: 24.75pt;
}

.r2 {
	height: 16.5pt;
}

.r3 {
	height: 28.5pt;
}

.r4 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="152">
			<col width="179">
			<col width="201">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="3">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="2">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="2"><#if item.srvdate??>${item.srvdate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="2">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="2">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c5" colspan="3">小反刍兽疫疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c6">使用数量</td>
				<td class="c4">目前库存数量</td>
				<td class="c6">全年使用数量</td>
			</tr>
			<tr class="r3">
				<td class="c6">小反刍兽疫疫苗(万头份)</td>
				<td class="c5">小反刍兽疫疫苗(万头份)</td>
				<td class="c6">小反刍兽疫疫苗(万头份)</td>
			</tr>
			<tr class="r4">
				<td role="data" n="srvH5n2d7usecount"  class="c5"><#if item.srvH5n2d7usecount??>${item.srvH5n2d7usecount}</#if></td>
				<td role="data" n="srvH5n2d7storecount"  class="c5"><#if item.srvH5n2d7storecount??>${item.srvH5n2d7storecount}</#if></td>
				<td role="data" n="srvH5n2d7yearcount"  class="c5"><#if item.srvH5n2d7yearcount??>${item.srvH5n2d7yearcount}</#if></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
<#if report.status!=1>
<script type="text/javascript">
    (function ($, window, document, undefined) {
        $("td[role=data]").each(function (i, d) {
            var n = $(this).attr("n")
            $(this).off("click")
            $(this).on("click", function (e) {
                $("td[role=data]").each(function (e) {
                    $(this).attr("current", 0)
                })
                $(this).attr("current", 1)
                $("td[current=0]").find("input").each(function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                var oldText = $(this).text()
                $(this).empty()
                var input = $('<input style="height: 100%;width:100%;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus()
                e.stopPropagation()
            })
        })

        var calculate = function () {

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
