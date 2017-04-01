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
				<td class="c3">高致病性禽流感灭活疫苗</td>
				<td role="data" n="aiInactivatedvaccine" class="c3"><#if item.aiInactivatedvaccine??>${item.aiInactivatedvaccine}</#if></td>

				<td role="lj_aiInactivatedvaccine" class="c7" ><#if itemSum.aiInactivatedvaccine??>${itemSum.aiInactivatedvaccine}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountchicken"   class="c3"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountduck"   class="c3"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountgoose"   class="c3"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountother"  class="c3"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother}</#if></td>
                <td role="lj_aiInactivatedimmuneamountchicken" class="c3"><#if itemSum.aiInactivatedimmuneamountchicken??>${itemSum.aiInactivatedimmuneamountchicken}</#if></td>
                <td role="lj_aiInactivatedimmuneamountduck" class="c3"><#if itemSum.aiInactivatedimmuneamountduck??>${itemSum.aiInactivatedimmuneamountduck}</#if></td>
                <td role="lj_aiInactivatedimmuneamountgoose" class="c3"><#if itemSum.aiInactivatedimmuneamountgoose??>${itemSum.aiInactivatedimmuneamountgoose}</#if></td>
                <td role="lj_aiInactivatedimmuneamountother" class="c3"><#if itemSum.aiInactivatedimmuneamountother??>${itemSum.aiInactivatedimmuneamountother}</#if></td>

                <input id="aiInactivatedvaccine" type="hidden" value="${itemSum.aiInactivatedvaccine?default(0)-item.aiInactivatedvaccine?default(0)}"/>
                <input id="aiInactivatedimmuneamountchicken" type="hidden" value="${itemSum.aiInactivatedimmuneamountchicken?default(0)-item.aiInactivatedimmuneamountchicken?default(0)}"/>
                <input id="aiInactivatedimmuneamountduck" type="hidden" value="${itemSum.aiInactivatedimmuneamountduck?default(0)-item.aiInactivatedimmuneamountduck?default(0)}"/>
                <input id="aiInactivatedimmuneamountgoose" type="hidden" value="${itemSum.aiInactivatedimmuneamountgoose?default(0)-item.aiInactivatedimmuneamountgoose?default(0)}"/>
                <input id="aiInactivatedimmuneamountother" type="hidden" value="${itemSum.aiInactivatedimmuneamountother?default(0)-item.aiInactivatedimmuneamountother?default(0)}"/>
			</tr>
			<tr class="r2">
				<td class="c4">禽流感-新城疫重组二联活疫苗</td>
				<td role="data" n="aiJointvaccine"   class="c3"><#if item.aiJointvaccine??>${item.aiJointvaccine}</#if></td>
				<td role="lj_aiJointvaccine" class="c7"><#if itemSum.aiJointvaccine??>${itemSum.aiJointvaccine}</#if></td>
				<td role="data" n="aiJointimmuneamountchicken"   class="c3"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken}</#if></td>
				<td role="data" n="aiJointimmuneamountduck"   class="c3"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck}</#if></td>
				<td role="data" n="aiJointimmuneamountgoose"   class="c3"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose}</#if></td>
				<td role="data" n="aiJointimmuneamountother"   class="c3"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother}</#if></td>
				<td role="lj_aiJointimmuneamountchicken" class="c3"><#if itemSum.aiJointimmuneamountchicken??>${itemSum.aiJointimmuneamountchicken}</#if></td>
				<td role="lj_aiJointimmuneamountduck" class="c3"><#if itemSum.aiJointimmuneamountduck??>${itemSum.aiJointimmuneamountduck}</#if></td>
				<td role="lj_aiJointimmuneamountgoose" class="c3"><#if itemSum.aiJointimmuneamountgoose??>${itemSum.aiJointimmuneamountgoose}</#if></td>
				<td role="lj_aiJointimmuneamountother" class="c3"><#if itemSum.aiJointimmuneamountother??>${itemSum.aiJointimmuneamountother}</#if></td>

                <input id="aiJointvaccine" type="hidden" value="${itemSum.aiJointvaccine?default(0)-item.aiJointvaccine?default(0)}"/>
                <input id="aiJointimmuneamountchicken" type="hidden" value="${itemSum.aiJointimmuneamountchicken?default(0)-item.aiJointimmuneamountchicken?default(0)}"/>
                <input id="aiJointimmuneamountduck" type="hidden" value="${itemSum.aiJointimmuneamountduck?default(0)-item.aiJointimmuneamountduck?default(0)}"/>
                <input id="aiJointimmuneamountgoose" type="hidden" value="${itemSum.aiJointimmuneamountgoose?default(0)-item.aiJointimmuneamountgoose?default(0)}"/>
                <input id="aiJointimmuneamountother" type="hidden" value="${itemSum.aiJointimmuneamountother?default(0)-item.aiJointimmuneamountother?default(0)}"/>
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
            var aiInactivatedvaccine = $.trim($('td[n="aiInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedvaccine"]').text()));
            var aiInactivatedimmuneamountchicken = $.trim($('td[n="aiInactivatedimmuneamountchicken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountchicken"]').text()));
            var aiInactivatedimmuneamountduck = $.trim($('td[n="aiInactivatedimmuneamountduck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountduck"]').text()));
            var aiInactivatedimmuneamountgoose = $.trim($('td[n="aiInactivatedimmuneamountgoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountgoose"]').text()));
            var aiInactivatedimmuneamountother = $.trim($('td[n="aiInactivatedimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountother"]').text()));
            var aiJointvaccine = $.trim($('td[n="aiJointvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointvaccine"]').text()));
            var aiJointimmuneamountchicken = $.trim($('td[n="aiJointimmuneamountchicken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountchicken"]').text()));
            var aiJointimmuneamountduck = $.trim($('td[n="aiJointimmuneamountduck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountduck"]').text()));
            var aiJointimmuneamountgoose = $.trim($('td[n="aiJointimmuneamountgoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountgoose"]').text()));
            var aiJointimmuneamountother = $.trim($('td[n="aiJointimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountother"]').text()));
			var lj_aiInactivatedvaccine=document.getElementById('aiInactivatedvaccine').value;
            var lj_aiInactivatedimmuneamountchicken=document.getElementById('aiInactivatedimmuneamountchicken').value;
            var lj_aiInactivatedimmuneamountduck=document.getElementById('aiInactivatedimmuneamountduck').value;
            var lj_aiInactivatedimmuneamountgoose=document.getElementById('aiInactivatedimmuneamountgoose').value;
            var lj_aiInactivatedimmuneamountother=document.getElementById('aiInactivatedimmuneamountother').value;
            var lj_aiJointvaccine=document.getElementById('aiJointvaccine').value;
            var lj_aiJointimmuneamountchicken=document.getElementById('aiJointimmuneamountchicken').value;
            var lj_aiJointimmuneamountduck=document.getElementById('aiJointimmuneamountduck').value;
            var lj_aiJointimmuneamountgoose=document.getElementById('aiJointimmuneamountgoose').value;
            var lj_aiJointimmuneamountother=document.getElementById('aiJointimmuneamountother').value;
            $("td[role=lj_aiInactivatedvaccine]").text((parseFloat(lj_aiInactivatedvaccine)+parseFloat(aiInactivatedvaccine)).toFixed(2));
            $("td[role=lj_aiInactivatedimmuneamountchicken]").text((parseFloat(lj_aiInactivatedimmuneamountchicken)+parseFloat(aiInactivatedimmuneamountchicken)).toFixed(2));
            $("td[role=lj_aiInactivatedimmuneamountduck]").text((parseFloat(lj_aiInactivatedimmuneamountduck)+parseFloat(aiInactivatedimmuneamountduck)).toFixed(2));
            $("td[role=lj_aiInactivatedimmuneamountgoose]").text((parseFloat(lj_aiInactivatedimmuneamountgoose)+parseFloat(aiInactivatedimmuneamountgoose)).toFixed(2));
            $("td[role=lj_aiInactivatedimmuneamountother]").text((parseFloat(lj_aiInactivatedimmuneamountother)+parseFloat(aiInactivatedimmuneamountother)).toFixed(2));
            $("td[role=lj_aiJointvaccine]").text((parseFloat(lj_aiJointvaccine)+parseFloat(aiJointvaccine)).toFixed(2));
            $("td[role=lj_aiJointimmuneamountchicken]").text((parseFloat(lj_aiJointimmuneamountchicken)+parseFloat(aiJointimmuneamountchicken)).toFixed(2));
            $("td[role=lj_aiJointimmuneamountduck]").text((parseFloat(lj_aiJointimmuneamountduck)+parseFloat(aiJointimmuneamountduck)).toFixed(2));
            $("td[role=lj_aiJointimmuneamountgoose]").text((parseFloat(lj_aiJointimmuneamountgoose)+parseFloat(aiJointimmuneamountgoose)).toFixed(2));
            $("td[role=lj_aiJointimmuneamountother]").text((parseFloat(lj_aiJointimmuneamountother)+parseFloat(aiJointimmuneamountother)).toFixed(2));
        }
        calculate()
    })(jQuery, window, document)
</script>
</#if>