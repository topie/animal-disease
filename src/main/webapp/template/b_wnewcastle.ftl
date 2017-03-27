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
	height: 28.5pt;
}

.r5 {
	height: 27.75pt;
}

.r6 {
	height: 21.95pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
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
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
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
			<col width="121">
			<col width="90">
			<col width="83">
			<col width="88">
			<col width="71">
			<col width="82">
			<col width="76">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="6">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="6"><#if item.ncdate??>${item.ncdate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c4">主管领导：</td>
				<td class="c3" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c2" rowspan="2">疫苗种类</td>
				<td class="c2" rowspan="2">本周疫苗使用数量(万毫升/万羽份)</td>
				<td class="c4" rowspan="2">秋防累计疫苗使用数量(万毫升/万羽份)</td>
				<td class="c2" rowspan="2">本周免疫数量（万羽）</td>
				<td class="c2" rowspan="2">秋防累计免疫数量(万羽)</td>
				<td class="c5" rowspan="2">秋防应免数量(万羽)</td>
				<td class="c2" rowspan="2">免疫进展(%)</td>
			</tr>
			<tr class="r5"></tr>
			<tr class="r3">
				<td class="c2">新城疫灭活疫苗</td>
				<td role="data" n="ncInactivatedvaccine"  class="c2"><#if item.ncInactivatedvaccine??>${item.ncInactivatedvaccine}</#if></td>
				<td role="data" n=""  class="c6"></td>
				<td role="data" n="ncInactivatedimmuneamount"  class="c2"><#if item.ncInactivatedimmuneamount??>${item.ncInactivatedimmuneamount}</#if></td>
				<td role="data" n=""  class="c6"></td>
				<td role="data" n=""  class="c6" rowspan="2"></td>
				<td role="data" n=""  class="c6" rowspan="2"></td>
			</tr>
			<tr class="r3">
				<td class="c2">新城疫弱毒疫苗</td>
				<td role="data" n="ncJointvaccine"  class="c2"><#if item.ncJointvaccine??>${item.ncJointvaccine}</#if></td>
				<td role="data" n=""  class="c6"></td>
				<td role="data" n="ncJointimmuneamount"  class="c2"><#if item.ncJointimmuneamount??>${item.ncJointimmuneamount}</#if></td>
				<td role="data" n=""  class="c6"></td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="3">填报说明：</td>
				<td class="c3" colspan="6">1.本周免疫数量是指填报本周的免疫数量；</td>
			</tr>
			<tr class="r3">
				<td class="c3" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r6">
				<td class="c3" colspan="6">3.&ldquo;新城疫灭活疫苗&rdquo;和&ldquo;新城疫弱毒疫苗&rdquo;使用数量统一按羽份统计。</td>
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
