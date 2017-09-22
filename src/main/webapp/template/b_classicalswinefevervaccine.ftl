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
	height: 15.0pt;
}

.r3 {
	height: 16.5pt;
}

.r4 {
	height: 22.5pt;
}

.r5 {
	height: 18.0pt;
}

.r6 {
	height: 36.75pt;
}

.r7 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
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
	border-bottom: thin solid black;
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
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="93">
			<col width="97">
			<col width="92">
			<col width="93">
			<col width="86">
			<col width="94">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="6">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="5">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="5"><#if item.cvDate??>${item.cvDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="5">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="5">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c2" colspan="6">猪瘟疫苗</td>
			</tr>
			<tr class="r5">
				<td class="c2" colspan="2">使用数量</td>
				<td class="c2" colspan="2">目前库存数量</td>
				<td class="c2" colspan="2">全年使用数量</td>
			</tr>
			<tr class="r6">
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
			</tr>
			<tr class="r7">
				<td role="data" n="cvLivingusecount"  class="c2"><#if item.cvLivingusecount??>${item.cvLivingusecount}</#if></td>
				<td role="data" n="cvCellusercount"  class="c2"><#if item.cvCellusercount??>${item.cvCellusercount}</#if></td>
				<td role="data" n="cvLivingstorecount"  class="c2"><#if item.cvLivingstorecount??>${item.cvLivingstorecount}</#if></td>
				<td role="data" n="cvCellstorecount"  class="c2"><#if item.cvCellstorecount??>${item.cvCellstorecount}</#if></td>
				<td role="data" n="cvLivingyearcount"  class="c2"><#if item.cvLivingyearcount??>${item.cvLivingyearcount}</#if></td>
				<td role="data" n="cvCellyearcount"  class="c2"><#if item.cvCellyearcount??>${item.cvCellyearcount}</#if></td>
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
                var input = $('<input style="height: 100%;width:100%;min-width:100px;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus();input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
