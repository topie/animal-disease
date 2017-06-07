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
	height: 22.5pt;
}

.r2 {
	height: 15.0pt;
}

.r3 {
	height: 16.5pt;
}

.r4 {
	height: 33.75pt;
}

.r5 {
	height: 26.25pt;
}

.r6 {
	height: 31.5pt;
}

.r7 {
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
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c7 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
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

.c12 {
	white-space: pre-wrap;
	font-size: 10pt;
}

.c13 {
	white-space: pre-wrap;
	text-align: center;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c14 {
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

.c15 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c16 {
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
			<col width="118">
			<col width="86">
			<col width="84">
			<col width="79">
			<col width="78">
			<col width="80">
			<col width="75">
			<col width="75">
			<col width="58">
			<col width="165">
			<col width="137">
			<col width="137">
			<col width="137">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="9">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位</td>
				<td class="c3" colspan="8">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期</td>
				<td class="c3" colspan="8"><#if item.pdprDate??>${item.pdprDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人</td>
				<td class="c3" colspan="8">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导</td>
				<td class="c3" colspan="8">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="3">疫苗种类</td>
				<td class="c2" rowspan="3">本月使用数量（万头份）</td>
				<td class="c5" rowspan="3">累计使用数量（万头份）</td>
				<td class="c6" colspan="3">本月免疫数量（万只）</td>
				<td class="c6" colspan="3">累计免疫数量(万只)</td>
			</tr>
			<tr class="r4">
				<td class="c7" rowspan="2">种羊</td>
				<td class="c8" colspan="2">商品羊</td>
				<td class="c2" rowspan="2">种羊</td>
				<td class="c9" colspan="2">商品羊</td>
			</tr>
			<tr class="r5">
				<td class="c7">山羊</td>
				<td class="c7">绵羊</td>
				<td class="c10">山羊</td>
				<td class="c11">绵羊</td>
			</tr>
			<tr class="r6">
				<td class="c2">小反刍兽疫活疫苗</td>
				<td role="data"  n="pdprLivevaccine"    class="c2"><#if item.pdprLivevaccine??>${item.pdprLivevaccine}</#if></td>
				<td role="lj_pdprLivevaccine" class="c14"><#if itemSum.pdprLivevaccine??>${itemSum.pdprLivevaccine}</#if></td>
				<td role="data"  n="pdprLivebreedingsheep"    class="c11"><#if item.pdprLivebreedingsheep??>${item.pdprLivebreedingsheep}</#if></td>
				<td role="data"  n="pdprLivegoat"    class="c11"><#if item.pdprLivegoat??>${item.pdprLivegoat}</#if></td>
				<td role="data"  n="pdprLivesheep"    class="c11"><#if item.pdprLivesheep??>${item.pdprLivesheep}</#if></td>
				<td role="lj_pdprLivebreedingsheep" class="c15"><#if itemSum.pdprLivebreedingsheep??>${itemSum.pdprLivebreedingsheep}</#if></td>
				<td role="lj_pdprLivegoat" class="c15"><#if itemSum.pdprLivegoat??>${itemSum.pdprLivegoat}</#if></td>
				<td role="lj_pdprLivesheep" class="c15"><#if itemSum.pdprLivesheep??>${itemSum.pdprLivesheep}</#if></td>
                <input id="pdprLivevaccine" type="hidden" value="${itemSum.pdprLivevaccine?default(0)-item.pdprLivevaccine?default(0)}"/>
                <input id="pdprLivebreedingsheep" type="hidden" value="${itemSum.pdprLivebreedingsheep?default(0)-item.pdprLivebreedingsheep?default(0)}"/>
                <input id="pdprLivegoat" type="hidden" value="${itemSum.pdprLivegoat?default(0)-item.pdprLivegoat?default(0)}"/>
                <input id="pdprLivesheep" type="hidden" value="${itemSum.pdprLivesheep?default(0)-item.pdprLivesheep?default(0)}"/>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="4">填表说明：</td>
				<td class="c3" colspan="8">1、本月免疫数量是指填报本月的免疫数量；</td>
			</tr>
			<tr class="r2">
				<td class="c3" colspan="8">2、使用疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r2">
				<td class="c3" colspan="8">3、没有数字填报，请填&ldquo;0&rdquo;；</td>
			</tr>
			<tr class="r7">
				<td class="c3" colspan="8">4、填报数字请保留至小数点后2位；</td>
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
            var pdprLivevaccine = $.trim($('td[n="pdprLivevaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="pdprLivevaccine"]').text()));
            var pdprLivebreedingsheep = $.trim($('td[n="pdprLivebreedingsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="pdprLivebreedingsheep"]').text()));
            var pdprLivegoat = $.trim($('td[n="pdprLivegoat"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="pdprLivegoat"]').text()));
            var pdprLivesheep = $.trim($('td[n="pdprLivesheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="pdprLivesheep"]').text()));
            var lj_pdprLivevaccine=document.getElementById('pdprLivevaccine').value;
            var lj_pdprLivebreedingsheep=document.getElementById('pdprLivebreedingsheep').value;
            var lj_pdprLivegoat=document.getElementById('pdprLivegoat').value;
            var lj_pdprLivesheep=document.getElementById('pdprLivesheep').value;
            $("td[role=lj_pdprLivevaccine]").text((parseFloat(lj_pdprLivevaccine)+parseFloat(pdprLivevaccine)).toFixed(2));
            $("td[role=lj_pdprLivebreedingsheep]").text((parseFloat(lj_pdprLivebreedingsheep)+parseFloat(pdprLivebreedingsheep)).toFixed(2));
            $("td[role=lj_pdprLivegoat]").text((parseFloat(lj_pdprLivegoat)+parseFloat(pdprLivegoat)).toFixed(2));
            $("td[role=lj_pdprLivesheep]").text((parseFloat(lj_pdprLivesheep)+parseFloat(pdprLivesheep)).toFixed(2));
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
