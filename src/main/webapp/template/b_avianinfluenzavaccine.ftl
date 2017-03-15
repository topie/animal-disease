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
	height: 18.0pt;
}

.r3 {
	height: 16.5pt;
}

.r4 {
	height: 22.5pt;
}

.r5 {
	height: 88.5pt;
}

.r6 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
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
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
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
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c11 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="78">
			<col width="72">
			<col width="67">
			<col width="67">
			<col width="66">
			<col width="67">
			<col width="77">
			<col width="76">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="78">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="65">
			<col width="61">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="18">${templateName}-统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="17">${item.livRegionname}</td>
			</tr>
			<tr class="r3">
				<td class="c4">填表日期:</td>
				<td class="c3" colspan="17"><#if
					item.csfdate??>${item.csfdate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="17">${user.realName}</td>
			</tr>
			<tr class="r3">
				<td class="c5">主管领导：</td>
				<td class="c3" colspan="17">${user.leaderName}</td>
			</tr>
			<tr class="r4">
				<td class="c6" colspan="18">禽流感疫苗</td>
			</tr>
			<tr class="r2">
				<td class="c7" colspan="6">使用数量</td>
				<td class="c8" colspan="6">目前库存数量</td>
				<td class="c8" colspan="6">全年使用数量</td>
			</tr>
			<tr class="r5">
				<td class="c9">重组禽流感病毒H5亚型二价灭活疫苗（Re-6株+Re-7株）(万毫升）</td>
				<td class="c9">禽流感-新城疫重组二联活疫苗（rLH5-6株）（万羽份）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-7株）（万毫升）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-6株）（万毫升）</td>
				<td class="c4">禽流感二价灭活疫苗（H5N1 Re-6株+H9N2 Re-2株）（万毫升）</td>
				<td class="c10">禽流感灭活疫苗（H5N2亚型，D7株）</td>
				
				<td class="c11">重组禽流感病毒H5亚型二价灭活疫苗（Re-6株+Re-7株）(万毫升）</td>
				<td class="c9">禽流感-新城疫重组二联活疫苗（rLH5-6株）（万羽份）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-7株）（万毫升）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-6株）（万毫升）</td>
				<td class="c4">禽流感二价灭活疫苗（H5N1 Re-6株+H9N2 Re-2株）（万毫升）</td>
				<td class="c10">禽流感灭活疫苗（H5N2亚型，D7株）</td>
				
				<td class="c11">重组禽流感病毒H5亚型二价灭活疫苗（Re-6株+Re-7株）(万毫升）</td>
				<td class="c9">禽流感-新城疫重组二联活疫苗（rLH5-6株）（万羽份）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-7株）（万毫升）</td>
				<td class="c9">重组禽流感病毒灭活疫苗（H5N1亚型，Re-6株）（万毫升）</td>
				<td class="c4">禽流感二价灭活疫苗（H5N1 Re-6株+H9N2 Re-2株）（万毫升）</td>
				<td class="c10">禽流感灭活疫苗（H5N2亚型，D7株）</td>
			</tr>
			<tr class="r6">
				<td role="data" n="avRe6re7usecount"   class="c7"><#if item.avRe6re7usecount??>${item.avRe6re7usecount?c}</#if></td>
				<td role="data" n="avRhrh5usecount"   class="c7"><#if item.avRhrh5usecount??>${item.avRhrh5usecount?c}</#if></td>
				<td role="data" n="avH5n1re7usecount"   class="c7"><#if item.avH5n1re7usecount??>${item.avH5n1re7usecount?c}</#if></td>
				<td role="data" n="avH5n1re6usecount"   class="c7"><#if item.avH5n1re6usecount??>${item.avH5n1re6usecount?c}</#if></td>
				<td role="data" n=""   class="c2"></td>
				<td role="data" n="avH5n2d7usecount"   class="c7"><#if item.avH5n2d7usecount??>${item.avH5n2d7usecount?c}</#if></td>
			
				<td role="data" n="avRe6re7storecount"   class="c8"><#if item.avRe6re7storecount??>${item.avRe6re7storecount?c}</#if></td>
				<td role="data" n="avRhrh5storecount"   class="c7"><#if item.avRhrh5storecount??>${item.avRhrh5storecount?c}</#if></td>
				<td role="data" n="avH5n1re7storecount"   class="c7"><#if item.avH5n1re7storecount??>${item.avH5n1re7storecount?c}</#if></td>
				<td role="data" n="avH5n1re6storecount"   class="c7"><#if item.avH5n1re6storecount??>${item.avH5n1re6storecount?c}</#if></td>
				<td role="data" n=""   class="c2"></td>
				<td role="data" n="avH5n2d7storecount"   class="c7"><#if item.avH5n2d7storecount??>${item.avH5n2d7storecount?c}</#if></td>
				
				<td role="data" n="avRe6re7yearcount"   class="c8"><#if item.avRe6re7yearcount??>${item.avRe6re7yearcount?c}</#if></td>
				<td role="data" n="avRhrh5yearcount"   class="c7"><#if item.avRhrh5yearcount??>${item.avRhrh5yearcount?c}</#if></td>
				<td role="data" n="avH5n1re7yearcount"   class="c7"><#if item.avH5n1re7yearcount??>${item.avH5n1re7yearcount?c}</#if></td>
				<td role="data" n="avH5n1re6yearcount"   class="c7"><#if item.avH5n1re6yearcount??>${item.avH5n1re6yearcount?c}</#if></td>
				<td role="data" n=""   class="c2"></td>
				<td role="data" n="avH5n2d7yearcount"   class="c7"><#if item.avH5n2d7yearcount??>${item.avH5n2d7yearcount?c}</#if></td>
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
