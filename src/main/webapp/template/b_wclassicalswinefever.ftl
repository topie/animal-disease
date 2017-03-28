<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {
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
	height: 31.5pt;
}

.r5 {
	height: 21.0pt;
}

.r6 {
	height: 21.95pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: center;
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

.c5 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #99cc00;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
	white-space: pre-wrap;
	font-size: 10pt;
}

.c7 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: right;
	color: black;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c11 {
	white-space: pre-wrap;
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="149">
			<col width="76">
			<col width="66">
			<col width="72">
			<col width="66">
			<col width="78">
			<col width="64">
			<col width="204">
			<col width="160">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">单 位:</td>
				<td class="c2" colspan="6">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">填表日期:</td>
				<td class="c2" colspan="6"><#if item.csfdate??>${item.csfdate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c3">填 表 人:</td>
				<td class="c2" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c4">主管领导：</td>
				<td class="c2" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c3" >疫苗种类</td>
				<td class="c3" >本周疫苗使用数量(万头份)</td>
				<td class="c4" >秋防累计疫苗使用数量(万头份)</td>
				<td class="c3" >本周免疫数量（万头）</td>
				<td class="c3" >秋防累计免疫数量(万头)</td>
				<td class="c5" >秋防应免数量(万头)</td>
				<td class="c3" >免疫进展(%)</td>
			</tr>
			<tr class="r3">
				<td class="c7">猪瘟活疫苗</td>
				<td role="data" n="csfVaccine"  class="c7"><#if item.csfVaccine??>${item.csfVaccine}</#if></td>
				<td role="data" n=""  class="c8"></td>
				<td role="data" n="csfImmuneamount"  class="c7"><#if item.csfImmuneamount??>${item.csfImmuneamount}</#if></td>
				<td role="data" n=""  class="c8"></td>
				<td role="data" n=""  class="c8"></td>
				<td role="data" n=""  class="c8"></td>
			</tr>
			<tr class="r3">
				<td class="c10" rowspan="2">填报说明：</td>
				<td class="c11" colspan="6">1.本周免疫数量是指填报本周的免疫数量；</td>
			</tr>
			<tr class="r6">
				<td class="c2" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应。</td>
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
