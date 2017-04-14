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
	height: 16.5pt;
}

.r3 {
	height: 18.75pt;
}

.r4 {
	height: 15.0pt;
}

.r5 {
	height: 19.5pt;
}

.r6 {
	height: 34.5pt;
}

.r7 {
	height: 31.5pt;
}

.r8 {
	height: 30.0pt;
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
			<col width="114">
			<col width="107">
			<col width="72">
			<col width="78">
			<col width="214">
			<col width="131">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="5">${templateName}</</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="4">${org.orgName}</td>
			</tr>
			<tr class="r3">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="4"><#if item.bedDate??>${item.bedDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="4">${user.realName}</td>
			</tr>
			<tr class="r4">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="4">${user.leaderName}</td>
			</tr>
			<tr class="r5">
				<td class="c2" >疫苗种类</td>
				<td class="c2" >本月使用数量（万毫升/万头份）</td>
				<td class="c4" >累计使用数量（万毫升/万头份）</td>
				<td class="c2" >本月免疫数量（万头）</td>
				<td class="c2" >累计免疫数量(万头)</td>
			</tr>
			<tr class="r7">
				<td class="c2">高致病性猪蓝耳病灭活疫苗</td>
				<td role="data" n="bedInactivatedvaccine"  class="c2"><#if item.bedInactivatedvaccine??>${item.bedInactivatedvaccine}</#if></td>
				<td role="lj_bedInactivatedvaccine" class="c6"><#if itemSum.bedInactivatedvaccine??>${itemSum.bedInactivatedvaccine}</#if></td>
				<td role="data" n="bedInactivatedimmuneamount" class="c2"><#if item.bedInactivatedimmuneamount??>${item.bedInactivatedimmuneamount}</#if></td>
				<td role="lj_bedInactivatedimmuneamount" class="c6"><#if itemSum.bedInactivatedimmuneamount??>${itemSum.bedInactivatedimmuneamount}</#if></td>
			</tr>
			<tr class="r8">
				<td class="c2">高致病性猪蓝耳病活疫苗</td>
				<td role="data" n="bedWeakvaccine" class="c2"><#if item.bedWeakvaccine??>${item.bedWeakvaccine}</#if></td>
				<td role="lj_bedWeakvaccine" class="c6"><#if itemSum.bedWeakvaccine??>${itemSum.bedWeakvaccine}</#if></td>
				<td role="data" n="bedWeakimmuneamount" class="c2"><#if item.bedWeakimmuneamount??>${item.bedWeakimmuneamount}</#if></td>
				<td role="lj_bedWeakimmuneamount" class="c6"><#if itemSum.bedWeakimmuneamount??>${itemSum.bedWeakimmuneamount}</#if></td>
			</tr>
            <input id="bedInactivatedvaccine" type="hidden" value="${itemSum.bedInactivatedvaccine?default(0)-item.bedInactivatedvaccine?default(0)}"/>
            <input id="bedInactivatedimmuneamount" type="hidden" value="${itemSum.bedInactivatedimmuneamount?default(0)-item.bedInactivatedimmuneamount?default(0)}"/>
            <input id="bedWeakvaccine" type="hidden" value="${itemSum.bedWeakvaccine?default(0)-item.bedWeakvaccine?default(0)}"/>
            <input id="bedWeakimmuneamount" type="hidden" value="${itemSum.bedWeakimmuneamount?default(0)-item.bedWeakimmuneamount?default(0)}"/>
			<tr class="r4">
				<td class="c2" rowspan="3">填报说明：</td>
				<td class="c3" colspan="4">1、本月免疫数量是指填报本月的免疫数量；</td>
			</tr>
			<tr class="r4">
				<td class="c3" colspan="4">2、使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r9">
				<td class="c3" colspan="4">3、&ldquo;高致病性猪蓝耳病灭活疫苗&rdquo;使用数量按毫升统计，&ldquo;高致病性猪蓝耳病弱毒疫苗&rdquo;使用数量按头份统计。</td>
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
            var bedInactivatedvaccine = $.trim($('td[n="bedInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedInactivatedvaccine"]').text()));
            var bedInactivatedimmuneamount = $.trim($('td[n="bedInactivatedimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedInactivatedimmuneamount"]').text()));
            var bedWeakvaccine = $.trim($('td[n="bedWeakvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedWeakvaccine"]').text()));
            var bedWeakimmuneamount = $.trim($('td[n="bedWeakimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="bedWeakimmuneamount"]').text()));
            var lj_bedInactivatedvaccine=document.getElementById('bedInactivatedvaccine').value;
            var lj_bedInactivatedimmuneamount=document.getElementById('bedInactivatedimmuneamount').value;
            var lj_bedWeakvaccine=document.getElementById('bedWeakvaccine').value;
            var lj_bedWeakimmuneamount=document.getElementById('bedWeakimmuneamount').value;
            $("td[role=lj_bedInactivatedvaccine]").text((parseFloat(lj_bedInactivatedvaccine)+parseFloat(bedInactivatedvaccine)).toFixed(2));
            $("td[role=lj_bedInactivatedimmuneamount]").text((parseFloat(lj_bedInactivatedimmuneamount)+parseFloat(bedInactivatedimmuneamount)).toFixed(2));
            $("td[role=lj_bedWeakvaccine]").text((parseFloat(lj_bedWeakvaccine)+parseFloat(bedWeakvaccine)).toFixed(2));
            $("td[role=lj_bedWeakimmuneamount]").text((parseFloat(lj_bedWeakimmuneamount)+parseFloat(bedWeakimmuneamount)).toFixed(2));
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>