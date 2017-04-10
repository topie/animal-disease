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
	height: 16.5pt;
}

.r3 {
	height: 15.0pt;
}

.r4 {
	height: 32.25pt;
}

.r5 {
	height: 21.0pt;
}

.r6 {
	height: 24.0pt;
}

.r7 {
	height: 22.0pt;
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
	text-align: left;
	color: black;
	font-size: 10pt;
}

.c5 {
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
			<col width="69">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="48">
			<col width="58">
			<col width="66">
			<col width="65">
			<col width="64">
			<col width="64">
			<col width="62">
			<col width="66">
			<col width="70">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="19">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="18">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="18"><#if item.kfDate??>${item.kfDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="18">${user.realName}</td>
			</tr>
			<tr class="r3">
				<td class="c4">主管领导：</td>
				<td class="c3" colspan="18">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c2" colspan="11">全省上半年落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">全省春秋防落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">省本级春秋防落实动物疫病防控经费（万元）</td>
			</tr>
			<tr class="r5">
				<td class="c2" colspan="6">疫苗配套经费</td>
				<td class="c2" rowspan="2">扑杀补助</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">基层动物防疫经费</td>
				<td class="c2" rowspan="2">其它</td>
				<td class="c2" rowspan="2">疫苗经费</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">其它</td>
				<td class="c2" rowspan="2">疫苗经费</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">其它</td>
			</tr>
			<tr class="r6">
				<td class="c2">口蹄疫</td>
				<td class="c2">禽流感</td>
				<td class="c2">小反刍兽疫</td>
				<td class="c2">布鲁氏菌病</td>
                <td class="c2">包虫病</td>
				<td class="c2">其 它</td>
			</tr>
			<tr class="r7">
				<td role="data" n="kfFmkingfisher"   class="c2"><#if item.kfFmkingfisher??>${item.kfFmkingfisher}</#if></td>
				<td role="data" n="kfAikingfisher"   class="c2"><#if item.kfAikingfisher??>${item.kfAikingfisher}</#if></td>
				<td role="data" n="kfPprKingfisher"   class="c2"><#if item.kfPprKingfisher??>${item.kfPprKingfisher}</#if></td>
				<td role="data" n="kfBurKingfisher"   class="c2"><#if item.kfBurKingfisher??>${item.kfBurKingfisher}</#if></td>
				<td role="data" n="kfEchKingfisher"   class="c2"><#if item.kfEchKingfisher??>${item.kfEchKingfisher}</#if></td>
				<td role="data" n="kfOtherkingfisher"   class="c2"><#if item.kfOtherkingfisher??>${item.kfOtherkingfisher}</#if></td>
				<td role="data" n="kfCulling"   class="c2"><#if item.kfCulling??>${item.kfCulling}</#if></td>
				<td role="data" n="kfYearmonitoring"   class="c2"><#if item.kfYearmonitoring??>${item.kfYearmonitoring}</#if></td>
				<td role="data" n="kfYearmaterials"   class="c5"><#if item.kfYearmaterials??>${item.kfYearmaterials}</#if></td>
				<td role="data" n="kfYearquarantine"   class="c2"><#if item.kfYearquarantine??>${item.kfYearquarantine}</#if></td>
				<td role="data" n="kfYearother"   class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
				<td role="data" n="kfProvincevaccine"   class="c2"><#if item.kfProvincevaccine??>${item.kfProvincevaccine}</#if></td>
				<td role="data" n="kfProvincemonitoring"   class="c2"><#if item.kfProvincemonitoring??>${item.kfProvincemonitoring}</#if></td>
				<td role="data" n="kfProvincelquarantine"   class="c2"><#if item.kfProvincelquarantine??>${item.kfProvincelquarantine}</#if></td>
				<td role="data" n="kfProvinceother"   class="c2"><#if item.kfProvinceother??>${item.kfProvinceother}</#if></td>
				<td role="data" n="kfLevelvaccine"   class="c2"><#if item.kfLevelvaccine??>${item.kfLevelvaccine}</#if></td>
				<td role="data" n="kfLevelmonitoring"   class="c2"><#if item.kfLevelmonitoring??>${item.kfLevelmonitoring}</#if></td>
				<td role="data" n="kfLevelquarantine"   class="c2"><#if item.kfLevelquarantine??>${item.kfLevelquarantine}</#if></td>
				<td role="data" n="kfLevelother"   class="c2"><#if item.kfLevelother??>${item.kfLevelother}</#if></td>
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
