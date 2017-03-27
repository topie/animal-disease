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
	height: 22.5pt;
}

.r2 {
	height: 15.0pt;
}

.r3 {
	height: 16.5pt;
}

.r4 {
	height: 26.25pt;
}

.r5 {
	height: 31.5pt;
}

.r6 {
	height: 28.5pt;
}

.r7 {
	height: 30.0pt;
}

.r8 {
	height: 27.0pt;
}

.r9 {
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
	text-align: left;
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
	background-color: #ff8080;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: right;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
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
			<col width="128">
			<col width="86">
			<col width="84">
			<col width="57">
			<col width="53">
			<col width="57">
			<col width="62">
			<col width="52">
			<col width="51">
			<col width="52">
			<col width="64">
			<col width="92">
			<col width="136">
			<col width="136">
			<col width="136">
			<col width="151">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="11">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位</td>
				<td class="c3" colspan="10">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期</td>
				<td class="c3" colspan="10"><#if item.fmdDate??>${item.fmdDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人</td>
				<td class="c3" colspan="10">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c4">主管领导</td>
				<td class="c3" colspan="10">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">疫苗种类</td>
				<td class="c2" rowspan="2">本月使用数量（万毫升）</td>
				<td class="c5" rowspan="2">累计使用数量（万毫升）</td>
				<td class="c2" colspan="4">本月免疫数量（万头/只）</td>
				<td class="c2" colspan="4">累计免疫数量(万头/只)</td>
			</tr>
			<tr class="r4">
				<td class="c2">猪</td>
				<td class="c2">牛</td>
				<td class="c2">羊</td>
				<td class="c2">其它动物</td>
				<td class="c2">猪</td>
				<td class="c2">牛</td>
				<td class="c2">羊</td>
				<td class="c2">其它动物</td>
			</tr>
			<tr class="r5">
				<td class="c2">口蹄疫o型灭活类疫苗</td>
				<td role="data" n="fmdInactivatedvaccine"  class="c2"><#if item.fmdInactivatedvaccine??>${item.fmdInactivatedvaccine?c}</#if></td>
				<td class="c7"><#if itemSum.fmdInactivatedvaccine??>${itemSum.fmdInactivatedvaccine?string("0.##")}<#else>0.00</#if></td>
				<td role="data"  n="fmdInactivatedimmuneamountpig"  class="c2"><#if item.fmdInactivatedimmuneamountpig??>${item.fmdInactivatedimmuneamountpig?c}</#if></td>
				<td role="data" n="fmdInactivatedimmuneamountniu"   class="c2"><#if item.fmdInactivatedimmuneamountniu??>${item.fmdInactivatedimmuneamountniu?c}</#if></td>
				<td role="data" n="fmdInactivatedimmuneamountsheep"   class="c2"><#if item.fmdInactivatedimmuneamountsheep??>${item.fmdInactivatedimmuneamountsheep?c}</#if></td>
				<td role="data"  n="fmdInactivatedimmuneamountother"  class="c2"><#if item.fmdInactivatedimmuneamountother??>${item.fmdInactivatedimmuneamountother?c}</#if></td>
				<td class="c7"><#if itemSum.fmdInactivatedimmuneamountpig??>${itemSum.fmdInactivatedimmuneamountpig?string("0.##")}<#else>0.00</#if></td>
				<td class="c7"><#if itemSum.fmdInactivatedimmuneamountsheep??>${itemSum.fmdInactivatedimmuneamountsheep?string("0.##")}<#else>0.00</#if></td>
				<td  class="c7"><#if itemSum.fmdInactivatedimmuneamountother??>${itemSum.fmdInactivatedimmuneamountother?string("0.##")}<#else>0.00</#if></td>
			</tr>
			<tr class="r6">
				<td class="c2">口蹄疫o型-亚洲i型二价灭活疫苗</td>
				<td role="data"  n="fmdO2vaccine"  class="c9"><#if item.fmdO2vaccine??>${item.fmdO2vaccine?c}</#if></td>
				<td class="c7"><#if itemSum.fmdO2vaccine??>${itemSum.fmdO2vaccine?string("0.##")}<#else>0.00</#if></td>
				<td role="data"  n="fmdO2immuneamountpig"  class="c9"><#if item.fmdO2immuneamountpig??>${item.fmdO2immuneamountpig?c}</#if></td>
				<td role="data"  n="fmdO2immuneamountniu"  class="c2"><#if item.fmdO2immuneamountniu??>${item.fmdO2immuneamountniu?c}</#if></td>
				<td role="data"  n="fmdO2immuneamountsheep"  class="c9"><#if item.fmdO2immuneamountsheep??>${item.fmdO2immuneamountsheep?c}</#if></td>
				<td role="data"  n="fmdO2immuneamountother"  class="c9"><#if item.fmdO2immuneamountother??>${item.fmdO2immuneamountother?c}</#if></td>
				<td class="c7"><#if itemSum.fmdO2immuneamountpig??>${itemSum.fmdO2immuneamountpig?string("0.##")}<#else>0.00</#if></td>
				<td class="c7"><#if itemSum.fmdO2immuneamountniu??>${itemSum.fmdO2immuneamountniu?string("0.##")}<#else>0.00</#if></td>
				<td  class="c7"><#if itemSum.fmdO2immuneamountsheep??>${itemSum.fmdO2immuneamountsheep?string("0.##")}<#else>0.00</#if></td>
				<td  class="c7"><#if itemSum.fmdO2immuneamountother??>${itemSum.fmdO2immuneamountother?string("0.##")}<#else>0.00</#if></td>
			</tr>
			<tr class="r7">
				<td class="c4">口蹄疫o型-a型-亚洲i型三价灭活疫苗</td>
				<td role="data"  n="fmdO3vaccine"  class="c2"><#if item.fmdO3vaccine??>${item.fmdO3vaccine?c}</#if></td>
				<td  class="c7"><#if itemSum.fmdO3vaccine??>${itemSum.fmdO3vaccine?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="fmdO3immuneamountpig"   class="c2"><#if item.fmdO3immuneamountpig??>${item.fmdO3immuneamountpig?c}</#if></td>
				<td role="data" n="fmdO3immuneamountniu" class="c4"><#if item.fmdO3immuneamountniu??>${item.fmdO3immuneamountniu?c}</#if></td>
				<td role="data"  n="fmdO3immuneamountsheep"  class="c10"><#if item.fmdO3immuneamountsheep??>${item.fmdO3immuneamountsheep?c}</#if></td>
				<td role="data"  n="fmdO3immuneamountother"  class="c10"><#if item.fmdO3immuneamountother??>${item.fmdO3immuneamountother?c}</#if></td>
				<td class="c10"></td>
				<td  class="c7"><#if itemSum.fmdO3immuneamountniu??>${itemSum.fmdO3immuneamountniu?string("0.##")}<#else>0.00</#if></td>
				<td class="c7"><#if itemSum.fmdO3immuneamountsheep??>${itemSum.fmdO3immuneamountsheep?string("0.##")}<#else>0.00</#if></td>
                <td class="c10"></td>
			</tr>
			<tr class="r8">
				<td class="c2">口蹄疫a型灭活疫苗</td>
				<td role="data" n="fmdAvaccine" class="c11"><#if item.fmdAvaccine??>${item.fmdAvaccine?c}</#if></td>
				<td  class="c7"><#if itemSum.fmdAvaccine??>${itemSum.fmdAvaccine?string("0.##")}<#else>0.00</#if></td>
				<td role="data"  n="" class="c11"></td>
				<td role="data" n="fmdAimmuneamountniu"  class="c2"><#if item.fmdAimmuneamountniu??>${item.fmdAimmuneamountniu?c}</#if></td>
				<td role="data" n="fmdAimmuneamountsheep"  class="c11"><#if item.fmdAimmuneamountsheep??>${item.fmdAimmuneamountsheep?c}</#if></td>
                <td  class="c11"></td>
				<td   class="c11"></td>
				<td class="c7"><#if itemSum.fmdAimmuneamountniu??>${itemSum.fmdAimmuneamountniu?string("0.##")}<#else>0.00</#if></td>
				<td  class="c7"><#if itemSum.fmdAimmuneamountsheep??>${itemSum.fmdAimmuneamountsheep?string("0.##")}<#else>0.00</#if></td>
                <td   class="c11"></td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="4">填表说明：</td>
				<td class="c3" colspan="10">1、本月免疫数量是指填报本月的免疫数量；</td>
			</tr>
			<tr class="r2">
				<td class="c3" colspan="10">2、使用疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r2">
				<td class="c3" colspan="10">3、没有数字填报，请填&ldquo;0&rdquo;；</td>
			</tr>
			<tr class="r9">
				<td class="c3" colspan="10">4、填报数字请保留至小数点后2位；</td>
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
