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
	height: 21.0pt;
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
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: left;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
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
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c7 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 10pt;
}

.c8 {
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

.c9 {
	white-space: pre-wrap;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c11 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c12 {
	white-space: pre-wrap;
	text-align: right;
	color: black;
	font-size: 10pt;
}

.c13 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c14 {
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
			<col width="85">
			<col width="86">
			<col width="80">
			<col width="82">
			<col width="78">
			<col width="64">
			<col width="151">
			<col width="122">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">单 位:</td>
				<td class="c4" colspan="6">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c5">填表日期:</td>
				<td class="c6" colspan="6"><#if item.wpdrDate??>${item.wpdrDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c5">填 表 人:</td>
				<td class="c6" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c5">主管领导：</td>
				<td class="c6" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c5" rowspan="1">疫苗种类</td>
				<td class="c5" rowspan="1">本周疫苗使用数量(万头份)</td>
				<td class="c7" rowspan="1">累计疫苗使用数量(万头份)</td>
				<td class="c5" rowspan="1">本周免疫数量（万只）</td>
				<td class="c5" rowspan="1">累计免疫数量(万只)</td>
				<td class="c5" rowspan="1">应免数量(万只)</td>
				<td class="c5" rowspan="1">免疫进展(%)</td>
			</tr>
			<tr class="r3">
				<td class="c10">小反刍兽疫活疫苗</td>
				<td role="data" n="wpdrVaccine"  class="c10"><#if item.wpdrVaccine??>${item.wpdrVaccine}</#if></td>
				<td role="lj_wpdrVaccine" class="c11"><#if itemSum.wpdrVaccine??>${itemSum.wpdrVaccine}</#if></td>
				<td role="data" n="wpdrImmuneamount"  class="c10"><#if item.wpdrImmuneamount??>${item.wpdrImmuneamount}</#if></td>
				<td role="lj_wpdrImmuneamount" class="c11"><#if itemSum.wpdrImmuneamount??>${itemSum.wpdrImmuneamount}</#if></td>
				<td n="pestedespetitsruminants" class="c11"><#if wlivestockinout.pestedespetitsruminants??>${wlivestockinout.pestedespetitsruminants}</#if></td>
				<td n="jz_sum" class="c11"></td>
			</tr>
            <input id="wpdrVaccine" type="hidden" value="${itemSum.wpdrVaccine?default(0)-item.wpdrVaccine?default(0)}"/>
            <input id="wpdrImmuneamount" type="hidden" value="${itemSum.wpdrImmuneamount?default(0)-item.wpdrImmuneamount?default(0)}"/>
			<tr class="r3">
				<td class="c13" rowspan="3">填报说明：</td>
				<td class="c14" colspan="6">1.本周免疫数量是指填报本周的免疫数量；</td>
			</tr>
			<tr class="r3">
				<td class="c6" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r6">
				<td class="c4" colspan="6">3.未开展小反刍兽疫免疫的省份请填"0"。</td>
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
            var wpdrVaccine = $.trim($('td[n="wpdrVaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="wpdrVaccine"]').text()));
            var wpdrImmuneamount = $.trim($('td[n="wpdrImmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="wpdrImmuneamount"]').text()));
            var lj_wpdrVaccine=document.getElementById('wpdrVaccine').value;
            var lj_wpdrImmuneamount=document.getElementById('wpdrImmuneamount').value;
            var sum_wpdrVaccine=(parseFloat(lj_wpdrVaccine)+parseFloat(wpdrVaccine)).toFixed(2);
            var sum_wpdrImmuneamount=(parseFloat(lj_wpdrImmuneamount)+parseFloat(wpdrImmuneamount)).toFixed(2);
            $("td[role=lj_wpdrVaccine]").text(sum_wpdrVaccine);
            $("td[role=lj_wpdrImmuneamount]").text(sum_wpdrImmuneamount);
            var lj_sum=parseFloat(sum_wpdrImmuneamount).toFixed(2);
            var pestedespetitsruminants = $.trim($('td[n="pestedespetitsruminants"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="pestedespetitsruminants"]').text()));
            var jz_sum=parseFloat(pestedespetitsruminants)==parseFloat(0)?0:(parseFloat(lj_sum*100)/parseFloat(pestedespetitsruminants)).toFixed(2);
            $('td[n="jz_sum"]').text(jz_sum+"%");
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
