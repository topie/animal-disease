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
	height: 22.5pt;
}

.r5 {
	height: 18.0pt;
}

.r6 {
	height: 76.5pt;
}

.r7 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
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
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="75">
			<col width="72">
			<col width="67">
			<col width="71">
			<col width="71">
			<col width="72">
			<col width="77">
			<col width="76">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="72">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="72">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="18">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="17">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="17"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="17">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="17">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c2" colspan="18">口蹄疫疫苗</td>
			</tr>
			<tr class="r5">
				<td class="c2" colspan="6">使用数量</td>
				<td class="c2" colspan="6">目前库存数量</td>
				<td class="c2" colspan="6">全年使用数量</td>
			</tr>
			<tr class="r6">
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
				
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）)</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
				
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
			</tr>
			<tr class="r7">
				<td role="data" n="fvOinactivatedusecount"   class="c2"><#if item.fvOinactivatedusecount??>${item.fvOinactivatedusecount}</#if></td>
				<td role="data" n="fvSyntheticusecount"   class="c2"><#if item.fvSyntheticusecount??>${item.fvSyntheticusecount}</#if></td>
				<td role="data" n="fvO2inactivatedusecount"   class="c2"><#if item.fvO2inactivatedusecount??>${item.fvO2inactivatedusecount}</#if></td>
				<td role="data" n="fvOainactivatedusecount"   class="c2"><#if item.fvOainactivatedusecount??>${item.fvOainactivatedusecount}</#if></td>
				<td role="data" n="fvO3inactivatedusecount"   class="c2"><#if item.fvO3inactivatedusecount??>${item.fvO3inactivatedusecount}</#if></td>
				<td role="data" n="fvAinactivatedusecount"   class="c2"><#if item.fvAinactivatedusecount??>${item.fvAinactivatedusecount}</#if></td>
				
				<td role="data" n="fvOinactivatedstorecount"   class="c2"><#if item.fvOinactivatedstorecount??>${item.fvOinactivatedstorecount}</#if></td>
				<td role="data" n="fvSyntheticstorecount"   class="c2"><#if item.fvSyntheticstorecount??>${item.fvSyntheticstorecount}</#if></td>
				<td role="data" n="fvO2inactivatedstorecount"   class="c2"><#if item.fvO2inactivatedstorecount??>${item.fvO2inactivatedstorecount}</#if></td>
				<td role="data" n="fvOainactivatedstorecount"   class="c2"><#if item.fvOainactivatedstorecount??>${item.fvOainactivatedstorecount}</#if></td>
				<td role="data" n="fvO3inactivatedstorecount"   class="c2"><#if item.fvO3inactivatedstorecount??>${item.fvO3inactivatedstorecount}</#if></td>
				<td role="data" n="fvAinactivatedstorecount"   class="c2"><#if item.fvAinactivatedstorecount??>${item.fvAinactivatedstorecount}</#if></td>
				
				<td role="data" n="fvOinactivatedyearcount"   class="c2"><#if item.fvOinactivatedyearcount??>${item.fvOinactivatedyearcount}</#if></td>
				<td role="data" n="fvSyntheticyearcount"   class="c2"><#if item.fvSyntheticyearcount??>${item.fvSyntheticyearcount}</#if></td>
				<td role="data" n="fvO2inactivatedsyearcount"   class="c2"><#if item.fvO2inactivatedsyearcount??>${item.fvO2inactivatedsyearcount}</#if></td>
				<td role="data" n="fvOainactivatedyearcount"   class="c2"><#if item.fvOainactivatedyearcount??>${item.fvOainactivatedyearcount}</#if></td>
				<td role="data" n="fvO3inactivatedsyearcount"   class="c2"><#if item.fvO3inactivatedsyearcount??>${item.fvO3inactivatedsyearcount}</#if></td>
				<td role="data" n="fvAinactivatedsyearcount"   class="c2"><#if item.fvAinactivatedsyearcount??>${item.fvAinactivatedsyearcount}</#if></td>
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

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
