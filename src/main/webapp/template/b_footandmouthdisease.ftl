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
				<td role="data" n="fmdInactivatedvaccine"  class="c2"><#if item.fmdInactivatedvaccine??>${item.fmdInactivatedvaccine}</#if></td>
				<td role="lj_fmdInactivatedvaccine" class="c7"><#if itemSum.fmdInactivatedvaccine??>${itemSum.fmdInactivatedvaccine}</#if></td>
				<td role="data"  n="fmdInactivatedimmuneamountpig"  class="c2"><#if item.fmdInactivatedimmuneamountpig??>${item.fmdInactivatedimmuneamountpig}</#if></td>
				<td role="data" n="fmdInactivatedimmuneamountniu"   class="c2"><#if item.fmdInactivatedimmuneamountniu??>${item.fmdInactivatedimmuneamountniu}</#if></td>
				<td role="data" n="fmdInactivatedimmuneamountsheep"   class="c2"><#if item.fmdInactivatedimmuneamountsheep??>${item.fmdInactivatedimmuneamountsheep}</#if></td>
				<td role="data"  n="fmdInactivatedimmuneamountother"  class="c2"><#if item.fmdInactivatedimmuneamountother??>${item.fmdInactivatedimmuneamountother}</#if></td>
				<td role="lj_fmdInactivatedimmuneamountpig" class="c7"><#if itemSum.fmdInactivatedimmuneamountpig??>${itemSum.fmdInactivatedimmuneamountpig}</#if></td>
                <td role="lj_fmdInactivatedimmuneamountniu"  class="c7"><#if itemSum.fmdInactivatedimmuneamountniu??>${itemSum.fmdInactivatedimmuneamountniu}</#if></td>
				<td role="lj_fmdInactivatedimmuneamountsheep" class="c7"><#if itemSum.fmdInactivatedimmuneamountsheep??>${itemSum.fmdInactivatedimmuneamountsheep}</#if></td>
				<td role="lj_fmdInactivatedimmuneamountother" class="c7"><#if itemSum.fmdInactivatedimmuneamountother??>${itemSum.fmdInactivatedimmuneamountother}</#if></td>
                <input id="fmdInactivatedvaccine" type="hidden" value="${itemSum.fmdInactivatedvaccine?default(0)-item.fmdInactivatedvaccine?default(0)}"/>
                <input id="fmdInactivatedimmuneamountpig" type="hidden" value="${itemSum.fmdInactivatedimmuneamountpig?default(0)-item.fmdInactivatedimmuneamountpig?default(0)}"/>
                <input id="fmdInactivatedimmuneamountniu" type="hidden" value="${itemSum.fmdInactivatedimmuneamountniu?default(0)-item.fmdInactivatedimmuneamountniu?default(0)}"/>
                <input id="fmdInactivatedimmuneamountsheep" type="hidden" value="${itemSum.fmdInactivatedimmuneamountsheep?default(0)-item.fmdInactivatedimmuneamountsheep?default(0)}"/>
                <input id="fmdInactivatedimmuneamountother" type="hidden" value="${itemSum.fmdInactivatedimmuneamountother?default(0)-item.fmdInactivatedimmuneamountother?default(0)}"/>
			</tr>
			<tr class="r6">
				<td class="c2">口蹄疫o型-亚洲i型二价灭活疫苗</td>
				<td role="data"  n="fmdO2vaccine"  class="c9"><#if item.fmdO2vaccine??>${item.fmdO2vaccine}</#if></td>
				<td role="lj_fmdO2vaccine" class="c7"><#if itemSum.fmdO2vaccine??>${itemSum.fmdO2vaccine}</#if></td>
				<td role="data"  n="fmdO2immuneamountpig"  class="c9"><#if item.fmdO2immuneamountpig??>${item.fmdO2immuneamountpig}</#if></td>
				<td role="data"  n="fmdO2immuneamountniu"  class="c2"><#if item.fmdO2immuneamountniu??>${item.fmdO2immuneamountniu}</#if></td>
				<td role="data"  n="fmdO2immuneamountsheep"  class="c9"><#if item.fmdO2immuneamountsheep??>${item.fmdO2immuneamountsheep}</#if></td>
				<td role="data"  n="fmdO2immuneamountother"  class="c9"><#if item.fmdO2immuneamountother??>${item.fmdO2immuneamountother}</#if></td>
				<td role="lj_fmdO2immuneamountpig" class="c7"><#if itemSum.fmdO2immuneamountpig??>${itemSum.fmdO2immuneamountpig}</#if></td>
				<td role="lj_fmdO2immuneamountniu" class="c7"><#if itemSum.fmdO2immuneamountniu??>${itemSum.fmdO2immuneamountniu}</#if></td>
				<td role="lj_fmdO2immuneamountsheep" class="c7"><#if itemSum.fmdO2immuneamountsheep??>${itemSum.fmdO2immuneamountsheep}</#if></td>
				<td role="lj_fmdO2immuneamountother" class="c7"><#if itemSum.fmdO2immuneamountother??>${itemSum.fmdO2immuneamountother}</#if></td>
			</tr>
            <input id="fmdO2vaccine" type="hidden" value="${itemSum.fmdO2vaccine?default(0)-item.fmdO2vaccine?default(0)}"/>
            <input id="fmdO2immuneamountpig" type="hidden" value="${itemSum.fmdO2immuneamountpig?default(0)-item.fmdO2immuneamountpig?default(0)}"/>
            <input id="fmdO2immuneamountniu" type="hidden" value="${itemSum.fmdO2immuneamountniu?default(0)-item.fmdO2immuneamountniu?default(0)}"/>
            <input id="fmdO2immuneamountsheep" type="hidden" value="${itemSum.fmdO2immuneamountsheep?default(0)-item.fmdO2immuneamountsheep?default(0)}"/>
            <input id="fmdO2immuneamountother" type="hidden" value="${itemSum.fmdO2immuneamountother?default(0)-item.fmdO2immuneamountother?default(0)}"/>
			<tr class="r7">
				<td class="c2">口蹄疫o型-a型-亚洲i型三价灭活疫苗</td>
				<td role="data"  n="fmdO3vaccine"  class="c2"><#if item.fmdO3vaccine??>${item.fmdO3vaccine}</#if></td>
				<td role="lj_fmdO3vaccine" class="c7"><#if itemSum.fmdO3vaccine??>${itemSum.fmdO3vaccine}</#if></td>
				<td  n="fmdO3immuneamountpig"   class="c2">-</td>
				<td role="data" n="fmdO3immuneamountniu" class="c4"><#if item.fmdO3immuneamountniu??>${item.fmdO3immuneamountniu}</#if></td>
				<td role="data" n="fmdO3immuneamountsheep"  class="c10"><#if item.fmdO3immuneamountsheep??>${item.fmdO3immuneamountsheep}</#if></td>
				<td n="fmdO3immuneamountother"  class="c10">-</td>
				<td class="c10">-</td>
				<td role="lj_fmdO3immuneamountniu" class="c7"><#if itemSum.fmdO3immuneamountniu??>${itemSum.fmdO3immuneamountniu}</#if></td>
				<td role="lj_fmdO3immuneamountsheep" class="c7"><#if itemSum.fmdO3immuneamountsheep??>${itemSum.fmdO3immuneamountsheep}</#if></td>
                <td class="c11">-</td>
                <input id="fmdO3vaccine" type="hidden" value="${itemSum.fmdO3vaccine?default(0)-item.fmdO3vaccine?default(0)}"/>
                <input id="fmdO3immuneamountniu" type="hidden" value="${itemSum.fmdO3immuneamountniu?default(0)-item.fmdO3immuneamountniu?default(0)}"/>
                <input id="fmdO3immuneamountsheep" type="hidden" value="${itemSum.fmdO3immuneamountsheep?default(0)-item.fmdO3immuneamountsheep?default(0)}"/>
			</tr>
			<tr class="r8">
				<td class="c2">口蹄疫a型灭活疫苗</td>
				<td role="data" n="fmdAvaccine" class="c11"><#if item.fmdAvaccine??>${item.fmdAvaccine}</#if></td>
				<td role="lj_fmdAvaccine" class="c7"><#if itemSum.fmdAvaccine??>${itemSum.fmdAvaccine}</#if></td>
				<td   n="" class="c11">-</td>
				<td role="data" n="fmdAimmuneamountniu"  class="c2"><#if item.fmdAimmuneamountniu??>${item.fmdAimmuneamountniu}</#if></td>
				<td role="data" n="fmdAimmuneamountsheep"  class="c11"><#if item.fmdAimmuneamountsheep??>${item.fmdAimmuneamountsheep}</#if></td>
                <td  class="c11">-</td>
				<td   class="c11">-</td>
				<td role="lj_fmdAimmuneamountniu" class="c7"><#if itemSum.fmdAimmuneamountniu??>${itemSum.fmdAimmuneamountniu}</#if></td>
				<td role="lj_fmdAimmuneamountsheep" class="c7"><#if itemSum.fmdAimmuneamountsheep??>${itemSum.fmdAimmuneamountsheep}</#if></td>
                <td   class="c11">-</td>
                <input id="fmdAvaccine" type="hidden" value="${itemSum.fmdAvaccine?default(0)-item.fmdAvaccine?default(0)}"/>
                <input id="fmdAimmuneamountniu" type="hidden" value="${itemSum.fmdAimmuneamountniu?default(0)-item.fmdAimmuneamountniu?default(0)}"/>
                <input id="fmdAimmuneamountsheep" type="hidden" value="${itemSum.fmdAimmuneamountsheep?default(0)-item.fmdAimmuneamountsheep?default(0)}"/>
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
            var fmdInactivatedvaccine = $.trim($('td[n="fmdInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedvaccine"]').text()));
            var fmdInactivatedimmuneamountpig = $.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountpig"]').text()));
            var fmdInactivatedimmuneamountniu = $.trim($('td[n="fmdInactivatedimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountniu"]').text()));
            var fmdInactivatedimmuneamountsheep = $.trim($('td[n="fmdInactivatedimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountsheep"]').text()));
            var fmdInactivatedimmuneamountother = $.trim($('td[n="fmdInactivatedimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdInactivatedimmuneamountother"]').text()));
            var lj_fmdInactivatedvaccine=document.getElementById('fmdInactivatedvaccine').value;
            var lj_fmdInactivatedimmuneamountpig=document.getElementById('fmdInactivatedimmuneamountpig').value;
            var lj_fmdInactivatedimmuneamountniu=document.getElementById('fmdInactivatedimmuneamountniu').value;
            var lj_fmdInactivatedimmuneamountsheep=document.getElementById('fmdInactivatedimmuneamountsheep').value;
            var lj_fmdInactivatedimmuneamountother=document.getElementById('fmdInactivatedimmuneamountother').value;
            $("td[role=lj_fmdInactivatedvaccine]").text((parseFloat(lj_fmdInactivatedvaccine)+parseFloat(fmdInactivatedvaccine)).toFixed(2));
            $("td[role=lj_fmdInactivatedimmuneamountpig]").text((parseFloat(lj_fmdInactivatedimmuneamountpig)+parseFloat(fmdInactivatedimmuneamountpig)).toFixed(2));
            $("td[role=lj_fmdInactivatedimmuneamountniu]").text((parseFloat(lj_fmdInactivatedimmuneamountniu)+parseFloat(fmdInactivatedimmuneamountniu)).toFixed(2));
            $("td[role=lj_fmdInactivatedimmuneamountsheep]").text((parseFloat(lj_fmdInactivatedimmuneamountsheep)+parseFloat(fmdInactivatedimmuneamountsheep)).toFixed(2));
            $("td[role=lj_fmdInactivatedimmuneamountother]").text((parseFloat(lj_fmdInactivatedimmuneamountother)+parseFloat(fmdInactivatedimmuneamountother)).toFixed(2));
            var fmdO2vaccine = $.trim($('td[n="fmdO2vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2vaccine"]').text()));
            var fmdO2immuneamountpig = $.trim($('td[n="fmdO2immuneamountpig"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountpig"]').text()));
            var fmdO2immuneamountniu = $.trim($('td[n="fmdO2immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountniu"]').text()));
            var fmdO2immuneamountsheep = $.trim($('td[n="fmdO2immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountsheep"]').text()));
            var fmdO2immuneamountother = $.trim($('td[n="fmdO2immuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO2immuneamountother"]').text()));
            var lj_fmdO2vaccine=document.getElementById('fmdO2vaccine').value;
            var lj_fmdO2immuneamountpig=document.getElementById('fmdO2immuneamountpig').value;
            var lj_fmdO2immuneamountniu=document.getElementById('fmdO2immuneamountniu').value;
            var lj_fmdO2immuneamountsheep=document.getElementById('fmdO2immuneamountsheep').value;
            var lj_fmdO2immuneamountother=document.getElementById('fmdO2immuneamountother').value;
            $("td[role=lj_fmdO2vaccine]").text((parseFloat(lj_fmdO2vaccine)+parseFloat(fmdO2vaccine)).toFixed(2));
            $("td[role=lj_fmdO2immuneamountpig]").text((parseFloat(lj_fmdO2immuneamountpig)+parseFloat(fmdO2immuneamountpig)).toFixed(2));
            $("td[role=lj_fmdO2immuneamountniu]").text((parseFloat(lj_fmdO2immuneamountniu)+parseFloat(fmdO2immuneamountniu)).toFixed(2));
            $("td[role=lj_fmdO2immuneamountsheep]").text((parseFloat(lj_fmdO2immuneamountsheep)+parseFloat(fmdO2immuneamountsheep)).toFixed(2));
            $("td[role=lj_fmdO2immuneamountother]").text((parseFloat(lj_fmdO2immuneamountother)+parseFloat(fmdO2immuneamountother)).toFixed(2));
            var fmdO3vaccine = $.trim($('td[n="fmdO3vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3vaccine"]').text()));
            var fmdO3immuneamountniu = $.trim($('td[n="fmdO3immuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountniu"]').text()));
            var fmdO3immuneamountsheep = $.trim($('td[n="fmdO3immuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdO3immuneamountsheep"]').text()));
            var lj_fmdO3vaccine=document.getElementById('fmdO3vaccine').value;
            var lj_fmdO3immuneamountniu=document.getElementById('fmdO3immuneamountniu').value;
            var lj_fmdO3immuneamountsheep=document.getElementById('fmdO3immuneamountsheep').value;
            $("td[role=lj_fmdO3vaccine]").text((parseFloat(lj_fmdO3vaccine)+parseFloat(fmdO3vaccine)).toFixed(2));
            $("td[role=lj_fmdO3immuneamountniu]").text((parseFloat(lj_fmdO3immuneamountniu)+parseFloat(fmdO3immuneamountniu)).toFixed(2));
            $("td[role=lj_fmdO3immuneamountsheep]").text((parseFloat(lj_fmdO3immuneamountsheep)+parseFloat(fmdO3immuneamountsheep)).toFixed(2));

            var fmdAvaccine = $.trim($('td[n="fmdAvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAvaccine"]').text()));
            var fmdAimmuneamountniu = $.trim($('td[n="fmdAimmuneamountniu"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountniu"]').text()));
            var fmdAimmuneamountsheep = $.trim($('td[n="fmdAimmuneamountsheep"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="fmdAimmuneamountsheep"]').text()));
            var lj_fmdAvaccine=document.getElementById('fmdAvaccine').value;
            var lj_fmdAimmuneamountniu=document.getElementById('fmdAimmuneamountniu').value;
            var lj_fmdAimmuneamountsheep=document.getElementById('fmdAimmuneamountsheep').value;
            $("td[role=lj_fmdAvaccine]").text((parseFloat(lj_fmdAvaccine)+parseFloat(fmdAvaccine)).toFixed(2));
            $("td[role=lj_fmdAimmuneamountniu]").text((parseFloat(lj_fmdAimmuneamountniu)+parseFloat(fmdAimmuneamountniu)).toFixed(2));
            $("td[role=lj_fmdAimmuneamountsheep]").text((parseFloat(lj_fmdAimmuneamountsheep)+parseFloat(fmdAimmuneamountsheep)).toFixed(2));
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
