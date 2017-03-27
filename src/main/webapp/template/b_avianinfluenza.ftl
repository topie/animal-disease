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
	border-left: thin solid black;
	color: black;
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
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="170">
			<col width="107">
			<col width="84">
			<col width="50">
			<col width="44">
			<col width="47">
			<col width="46">
			<col width="54">
			<col width="45">
			<col width="42">
			<col width="46">
			<col width="92">
			<col width="123">
			<col width="123">
			<col width="123">
			<col width="145">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="11">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">单 位:</td>
				<td class="c4" colspan="10">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">填表日期:</td>
				<td class="c4" colspan="10"><#if item.aiDate??>${item.aiDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c3">填 表 人:</td>
				<td class="c4" colspan="10">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c5">主管领导：</td>
				<td class="c4" colspan="10">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c3" rowspan="2">疫苗种类</td>
				<td class="c3" rowspan="2">本月使用数量（万毫升/万羽份）</td>
				<td class="c5" rowspan="2">累计使用数量（万毫升/万羽份）</td>
				<td class="c3" colspan="4">本月免疫数量(万羽)</td>
				<td class="c3" colspan="4">累计免疫数量(万羽)</td>
			</tr>
			<tr class="r4">
				<td class="c3">鸡</td>
				<td class="c3">鸭</td>
				<td class="c3">鹅</td>
				<td class="c3">其它禽</td>
				<td class="c3">鸡</td>
				<td class="c3">鸭</td>
				<td class="c3">鹅</td>
				<td class="c3">其它禽</td>


			</tr>
			<tr class="r2">
				<td role="data" class="c3">高致病性禽流感灭活疫苗</td>
				<td role="data" n="aiInactivatedvaccine" class="c3"><#if item.aiInactivatedvaccine??>${item.aiInactivatedvaccine?string("0.##")}<#else>0.00</#if></td>

				<td role="data"    class="c7"><#if itemSum.aiInactivatedvaccine??>${itemSum.aiInactivatedvaccine?string("0.##")}<#else>0.00</#if></td>

				<td role="data" n="aiInactivatedimmuneamountchicken"   class="c3"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="aiInactivatedimmuneamountduck"   class="c3"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="aiInactivatedimmuneamountgoose"   class="c3"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose?string("0.##")}<#else>0.00</#if></td>
				<td  role="data" n="aiInactivatedimmuneamountother"  class="c3"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother?string("0.##")}<#else>0.00</#if></td>
                <td class="c3"><#if itemSum.aiInactivatedimmuneamountchicken??>${itemSum.aiInactivatedimmuneamountchicken?string("0.##")}<#else>0.00</#if></td>
                <td class="c3"><#if itemSum.aiInactivatedimmuneamountduck??>${itemSum.aiInactivatedimmuneamountduck?string("0.##")}<#else>0.00</#if></td>
                <td class="c3"><#if itemSum.aiInactivatedimmuneamountgoose??>${itemSum.aiInactivatedimmuneamountgoose?string("0.##")}<#else>0.00</#if></td>
                <td class="c3"><#if itemSum.aiInactivatedimmuneamountother??>${itemSum.aiInactivatedimmuneamountother?string("0.##")}<#else>0.00</#if></td>
			</tr>
			<tr class="r2">
				<td role="data"  class="c4">禽流感-新城疫重组二联活疫苗</td>
				<td role="data" n="aiJointvaccine"   class="c3"><#if item.aiJointvaccine??>${item.aiJointvaccine?string("0.##")}<#else>0.00</#if></td>

				<td role="data"   class="c7"><#if itemSum.aiJointvaccine??>${itemSum.aiJointvaccine?string("0.##")}<#else>0.00</#if></td>

				<td role="data" n="aiJointimmuneamountchicken"   class="c3"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="aiJointimmuneamountduck"   class="c3"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="aiJointimmuneamountgoose"   class="c3"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="aiJointimmuneamountother"   class="c3"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother?string("0.##")}<#else>0.00</#if></td>
				 <td class="c3"><#if itemSum.aiJointimmuneamountchicken??>${itemSum.aiJointimmuneamountchicken?string("0.##")}<#else>0.00</#if></td>
				<td class="c3"><#if itemSum.aiJointimmuneamountduck??>${itemSum.aiJointimmuneamountduck?string("0.##")}<#else>0.00</#if></td>
				<td class="c3"><#if itemSum.aiJointimmuneamountgoose??>${itemSum.aiJointimmuneamountgoose?string("0.##")}<#else>0.00</#if></td>
				<td class="c3"><#if itemSum.aiJointimmuneamountother??>${itemSum.aiJointimmuneamountother?string("0.##")}<#else>0.00</#if></td>
			</tr>
			<tr class="r2">
				<td class="c3" rowspan="3">填报说明：</td>
				<td class="c4" colspan="10">1、本月免疫数量是指填报本月的免疫数量；</td>
			</tr>
			<tr class="r2">
				<td class="c4" colspan="10">2、使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r5">
				<td class="c4" colspan="10">3、&ldquo;高致病性禽流感灭活疫苗&rdquo;使用数量按毫升统计，&ldquo;禽流感-新城疫重组二联活疫苗&rdquo;使用数量按羽份统计。</td>
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