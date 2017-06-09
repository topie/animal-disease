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
	height: 28.5pt;
}

.r5 {
	height: 40.5pt;
}

.r6 {
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
	text-align: center;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="87">
			<col width="60">
			<col width="59">
			<col width="58">
			<col width="61">
			<col width="60">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="16">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="15">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="15"><#if item.pddate??>${item.pddate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="15">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="15">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" colspan="5">鸡</td>
				<td class="c2" colspan="3">鸭</td>
				<td class="c2" colspan="3">鹅</td>
				<td class="c2" colspan="5">其它</td>
			</tr>
			<tr class="r4">
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" colspan="2">新城疫</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" colspan="2">新城疫</td>
			</tr>
			<tr class="r5">
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
			</tr>
			<tr class="r6">
				<td role="data" n="pdChickenherdscount"   class="c2"><#if item.pdChickenherdscount??>${item.pdChickenherdscount}</#if></td>
				<td role="data" n="pdChickenashuldcount"   class="c2"><#if item.pdChickenashuldcount??>${item.pdChickenashuldcount}</#if></td>
				<td role="data" n="pdChickenaactualcount"   class="c2"><#if item.pdChickenaactualcount??>${item.pdChickenaactualcount}</#if></td>
				<td role="data" n="pdChickennshuldcount"   class="c2"><#if item.pdChickennshuldcount??>${item.pdChickennshuldcount}</#if></td>
				<td role="data" n="pdChickennactualcount"   class="c2"><#if item.pdChickennactualcount??>${item.pdChickennactualcount}</#if></td>
				
				<td role="data" n="pdDuckherdscount"   class="c2"><#if item.pdDuckherdscount??>${item.pdDuckherdscount}</#if></td>
				<td role="data" n="pdDuckshuldcount"   class="c2"><#if item.pdDuckshuldcount??>${item.pdDuckshuldcount}</#if></td>
				<td role="data" n="pdDuckactualcount"   class="c2"><#if item.pdDuckactualcount??>${item.pdDuckactualcount}</#if></td>
				
				<td role="data" n="pdGooseherdscount"   class="c2"><#if item.pdGooseherdscount??>${item.pdGooseherdscount}</#if></td>
				<td role="data" n="pdGooseshuldcount"   class="c2"><#if item.pdGooseshuldcount??>${item.pdGooseshuldcount}</#if></td>
				<td role="data" n="pdGooseactualcount"   class="c2"><#if item.pdGooseactualcount??>${item.pdGooseactualcount}</#if></td>
				
				<td role="data" n="pdOtherherdscount"   class="c2"><#if item.pdOtherherdscount??>${item.pdOtherherdscount}</#if></td>
				<td role="data" n="pdOtherashuldcount"   class="c2"><#if item.pdOtherashuldcount??>${item.pdOtherashuldcount}</#if></td>
				<td role="data" n="pdOtheraactualcount"   class="c2"><#if item.pdOtheraactualcount??>${item.pdOtheraactualcount}</#if></td>
				<td role="data" n="pdOtherniashuldcount"   class="c2"><#if item.pdOtherniashuldcount??>${item.pdOtherniashuldcount}</#if></td>
				<td role="data" n="pdOtherniactualcount"   class="c2"><#if item.pdOtherniactualcount??>${item.pdOtherniactualcount}</#if></td>
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

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
