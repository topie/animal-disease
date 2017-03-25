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
	height: 25.5pt;
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
	text-align: left;
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
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
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

.c7 {
	white-space: pre-wrap;
	text-align: right;
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
			<col width="81">
			<col width="88">
			<col width="78">
			<col width="92">
			<col width="78">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="5">${templateName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">单 位:</td>
				<td class="c4" colspan="4">${org.orgName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">填表日期:</td>
				<td class="c4" colspan="4"><#if item.ncdate??>${item.ncdate?string("yyyy-MM-dd")}</#if></td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">填 表 人:</td>
				<td class="c4" colspan="4">${user.realName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c5">主管领导：</td>
				<td class="c4" colspan="4">${user.leaderName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r4">
				<td class="c3" rowspan="2">疫苗种类</td>
				<td class="c5" rowspan="2">本月使用数量（万羽份）</td>
				<td class="c4" rowspan="2">累计使用数量（万羽份）</td>
				<td class="c3" rowspan="2">本月免疫数量（万羽）</td>
				<td class="c3" rowspan="2">累计免疫数量(万羽)</td>
				<td class="c4" rowspan="2">累计使用数量（万羽份）</td>
				<td class="c3" rowspan="2">累计免疫数量(万羽)</td>
			</tr>
			<tr class="r5"></tr>
			<tr class="r2">
				<td class="c3">新城疫灭活疫苗</td>
				<td role="data"  n="ncInactivatedvaccine" class="c3"><#if item.ncInactivatedvaccine??>${item.ncInactivatedvaccine}</#if></td>
				<td role="data"  n="" class="c6"></td>
				<td  role="data"  n="ncInactivatedimmuneamount" class="c3"><#if item.ncInactivatedimmuneamount??>${item.ncInactivatedimmuneamount}</#if></td>
				<td  role="data"  n="" class="c6"></td>
				<td  role="data"  n="" class="c7"></td>
				<td  role="data"  n="" class="c7"></td>
			</tr>
			<tr class="r2">
				<td class="c3">新城疫弱毒疫苗</td>
				<td role="data"  n="ncJointvaccine"  class="c3"><#if item.ncJointvaccine??>${item.ncJointvaccine}</#if></td>
				<td role="data"  n=""   class="c6"></td>
				<td role="data"  n="ncJointimmuneamount"   class="c3"><#if item.ncJointimmuneamount??>${item.ncJointimmuneamount}</#if></td>
				<td role="data"  n=""   class="c6"></td>
				<td role="data"  n=""   class="c7"></td>
				<td role="data"  n=""   class="c7"></td>
			</tr>
			<tr class="r2">
				<td class="c3" rowspan="3">填报说明：</td>
				<td class="c4" colspan="4">1、本月免疫数量是指填报本月的免疫数量；</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c4" colspan="4">2、使用的疫苗种类与其使用数量、免疫动物数量相对应。</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r6">
				<td class="c4" colspan="4">3、&ldquo;新城疫灭活疫苗&rdquo;和&ldquo;新城疫弱毒疫苗&rdquo;使用数量统一按羽份统计；</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
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
