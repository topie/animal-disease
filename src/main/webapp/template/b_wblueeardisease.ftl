<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {width:100%;
	border-collapse: collapse;
	border-spacing: 0;
}

.r1 {
	height: 40.5pt;
}

.r2 {
	height: 16.5pt;
}

.r3 {
	height: 18.75pt;
}

.r4 {
	height: 15.0pt;
}

.r5 {
	height: 24.0pt;
}

.r6 {
	height: 28.5pt;
}

.r7 {
	height: 31.5pt;
}

.r8 {
	height: 20.25pt;
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
			<col width="128">
			<col width="96">
			<col width="80">
			<col width="72">
			<col width="66">
			<col width="76">
			<col width="87">
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
			<tr class="r3">
				<td class="c3">填表日期:</td>
				<td class="c4" colspan="6"><#if item.bedDate??>${item.bedDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c3">填 表 人:</td>
				<td class="c4" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r4">
				<td class="c3">主管领导：</td>
				<td class="c4" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r5">
				<td class="c3" >疫苗种类</td>
				<td class="c3" >本周疫苗使用数量(万毫升/万头份)</td>
				<td class="c5" >累计疫苗使用数量(万毫升/万头份)</td>
				<td class="c3" >本周免疫数量（万头）</td>
				<td class="c3" >累计免疫数量(万头)</td>
				<td class="c3" >应免数量(万头)</td>
				<td class="c3" >免疫进展(%)</td>
			</tr>
			<tr class="r7">
				<td class="c3">高致病性猪蓝耳病灭活疫苗</td>
				<td role="data" n="bedInactivatedvaccine"  class="c3"><#if item.bedInactivatedvaccine??>${item.bedInactivatedvaccine}</#if></td>
				<td role="lj_bedInactivatedvaccine" class="c6"><#if itemSum.bedInactivatedvaccine??>${itemSum.bedInactivatedvaccine} </#if></td>
				<td role="data" n="bedInactivatedimmuneamount"  class="c3"><#if item.bedInactivatedimmuneamount??>${item.bedInactivatedimmuneamount}</#if></td>
				<td role="lj_bedInactivatedimmuneamount" class="c6"><#if itemSum.bedInactivatedimmuneamount??>${itemSum.bedInactivatedimmuneamount} </#if></td>
				<td n="immuneblueear" class="c6" rowspan="2"><#if wlivestockinout.immuneblueear??>${wlivestockinout.immuneblueear}</#if></td>
				<td n="jz_sum" class="c6" rowspan="2"><#if (wlivestockinout.immuneblueear??&&wlivestockinout.immuneblueear>0)>${(itemSum.bedInactivatedimmuneamount?default(0)+itemSum.bedWeakimmuneamount?default(0))*100/wlivestockinout.immuneblueear}%</#if></td>
			</tr>
            <input id="bedInactivatedvaccine" type="hidden" value="${itemSum.bedInactivatedvaccine?default(0)-item.bedInactivatedvaccine?default(0)}"/>
            <input id="bedInactivatedimmuneamount" type="hidden" value="${itemSum.bedInactivatedimmuneamount?default(0)-item.bedInactivatedimmuneamount?default(0)}"/>
            <input id="bedWeakvaccine" type="hidden" value="${itemSum.bedWeakvaccine?default(0)-item.bedWeakvaccine?default(0)}"/>
            <input id="bedWeakimmuneamount" type="hidden" value="${itemSum.bedWeakimmuneamount?default(0)-item.bedWeakimmuneamount?default(0)}"/>
			<tr class="r6">
				<td class="c3">高致病性猪蓝耳病活疫苗</td>
				<td role="data" n="bedWeakvaccine" class="c3"><#if item.bedWeakvaccine??>${item.bedWeakvaccine}</#if></td>
				<td role="lj_bedWeakvaccine" class="c6"><#if itemSum.bedWeakvaccine??>${itemSum.bedWeakvaccine}</#if> </td>
				<td role="data" n="bedWeakimmuneamount"  class="c3"><#if item.bedWeakimmuneamount??>${item.bedWeakimmuneamount}</#if></td>
				<td role="lj_bedWeakimmuneamount" class="c6"><#if itemSum.bedWeakimmuneamount??>${itemSum.bedWeakimmuneamount} </#if></td>
			</tr>
			<tr class="r8">
				<td class="c3" rowspan="3">填报说明：</td>
				<td class="c4" colspan="6">1.本周免疫数量是指填报本周的免疫数量；</td>
			</tr>
			<tr class="r2">
				<td class="c4" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r9">
				<td class="c4" colspan="6">3.&ldquo;高致病性猪蓝耳病灭活疫苗&rdquo;使用数量按毫升统计，&ldquo;高致病性猪蓝耳病活疫苗&rdquo;使用数量按头份统计。</td>
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
                input.focus();input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {
            var bedInactivatedvaccine = $.trim($('td[n="bedInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedInactivatedvaccine"]').text()));
            var bedInactivatedimmuneamount = $.trim($('td[n="bedInactivatedimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedInactivatedimmuneamount"]').text()));
            var bedWeakvaccine = $.trim($('td[n="bedWeakvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedWeakvaccine"]').text()));
            var bedWeakimmuneamount = $.trim($('td[n="bedWeakimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedWeakimmuneamount"]').text()));
            var lj_bedInactivatedvaccine=document.getElementById('bedInactivatedvaccine').value;
            var lj_bedInactivatedimmuneamount=document.getElementById('bedInactivatedimmuneamount').value;
            var lj_bedWeakvaccine=document.getElementById('bedWeakvaccine').value;
            var lj_bedWeakimmuneamount=document.getElementById('bedWeakimmuneamount').value;

            var sum_bedInactivatedvaccine=(parseFloat(lj_bedInactivatedvaccine)+parseFloat(bedInactivatedvaccine)).toFixed(2);
            var sum_bedWeakvaccine=(parseFloat(lj_bedWeakvaccine)+parseFloat(bedWeakvaccine)).toFixed(2);
            var sum_bedInactivatedimmuneamount=(parseFloat(lj_bedInactivatedimmuneamount)+parseFloat(bedInactivatedimmuneamount)).toFixed(2);
            var sum_bedWeakimmuneamount=(parseFloat(lj_bedWeakimmuneamount)+parseFloat(bedWeakimmuneamount)).toFixed(2);
            $("td[role=lj_bedInactivatedvaccine]").text(sum_bedInactivatedvaccine);
            $("td[role=lj_bedWeakvaccine]").text(sum_bedWeakvaccine);
            $("td[role=lj_bedInactivatedimmuneamount]").text(sum_bedInactivatedimmuneamount);
            $("td[role=lj_bedWeakimmuneamount]").text(sum_bedWeakimmuneamount);
            var lj_sum=(parseFloat(sum_bedInactivatedimmuneamount)+parseFloat(sum_bedWeakimmuneamount)).toFixed(2);
            var immuneblueear = $.trim($('td[n="immuneblueear"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneblueear"]').text()));
            var jz_sum=parseFloat(immuneblueear)==parseFloat(0)?0:(parseFloat(lj_sum*100)/parseFloat(immuneblueear)).toFixed(2);
            $('td[n="jz_sum"]').text(jz_sum+"%");

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
