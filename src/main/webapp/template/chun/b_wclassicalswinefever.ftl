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
				<td class="c2" colspan="6"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c3">填 表 人:</td>
				<td class="c2" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c3">主管领导：</td>
				<td class="c2" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c3" >疫苗种类</td>
				<td class="c3" >本周疫苗使用数量(万头份)</td>
				<td class="c4" >累计疫苗使用数量(万头份)</td>
				<td class="c3" >本周免疫数量（万头）</td>
				<td class="c3" >累计免疫数量(万头)</td>
				<td class="c3" >应免数量(万头)</td>
				<td class="c3" >免疫进展(%)</td>
			</tr>
			<tr class="r3">
				<td class="c7">猪瘟活疫苗</td>
				<td role="data" n="csfVaccine"  class="c7"><#if item.csfVaccine??>${item.csfVaccine}</#if></td>
				<td role="lj_csfVaccine" class="c8"><#if itemSum.csfVaccine??>${itemSum.csfVaccine} </#if></td>
				<td role="data" n="csfImmuneamount"  class="c7"><#if item.csfImmuneamount??>${item.csfImmuneamount}</#if></td>
				<td role="lj_csfImmuneamount" class="c8"><#if itemSum.csfImmuneamount??>${itemSum.csfImmuneamount} </#if></td>
				<td n="immuneswine" class="c8"><#if wlivestockinout.immuneswine??>${wlivestockinout.immuneswine}</#if></td>
				<td n="jz_sum" class="c8"><#if (wlivestockinout.immuneswine??&&wlivestockinout.immuneswine>0)>${itemSum.csfImmuneamount?default(0)*100/wlivestockinout.immuneswine}%</#if></td>
			</tr>
            <input id="csfVaccine" type="hidden" value="${itemSum.csfVaccine?default(0)-item.csfVaccine?default(0)}"/>
            <input id="csfImmuneamount" type="hidden" value="${itemSum.csfImmuneamount?default(0)-item.csfImmuneamount?default(0)}"/>
			<tr class="r3">
				<td class="c10" rowspan="2">填报说明：</td>
				<td class="c11" colspan="6">1.本周免疫数量是指填报本周的免疫数量；</td>
			</tr>
			<tr class="r6">
				<td class="c2" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应。</td>
			</tr>
		</tbody>
	</table>
    <input type="hidden" id="valid"/>
    <input type="hidden" id="valid-msg"/>
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
                var input = $('<input style="height: 100%;width:100%;min-width:100px;" type="text" name="' + n + '" value="' + oldText + '">')
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
            var csfVaccine = $.trim($('td[n="csfVaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="csfVaccine"]').text()));
            var csfImmuneamount = $.trim($('td[n="csfImmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="csfImmuneamount"]').text()));
            var lj_csfVaccine=document.getElementById('csfVaccine').value;
            var lj_csfImmuneamount=document.getElementById('csfImmuneamount').value;
            var sum_csfVaccine=(parseFloat(lj_csfVaccine)+parseFloat(csfVaccine)).toFixed(2);
            var sum_csfImmuneamount=(parseFloat(lj_csfImmuneamount)+parseFloat(csfImmuneamount)).toFixed(2);
            $("td[role=lj_csfVaccine]").text(sum_csfVaccine);
            $("td[role=lj_csfImmuneamount]").text(sum_csfImmuneamount);
            var lj_sum=parseFloat(sum_csfImmuneamount).toFixed(2);
            var immuneswine = $.trim($('td[n="immuneswine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immuneswine"]').text()));
            var jz_sum=parseFloat(immuneswine)==parseFloat(0)?0:(parseFloat(lj_sum*100)/parseFloat(immuneswine)).toFixed(2);
            $('td[n="jz_sum"]').text(jz_sum+"%");
            var flag="true";
            var msg="";
            if(immuneswine<lj_sum){
                flag="false";
                msg="累计免疫数量大于应免数量，请确认！";
            }
            $("#valid").val(flag);
            $("#valid-msg").val(msg);
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
