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
	height: 26.25pt;
}

.r2 {
	height: 34.5pt;
}

.r3 {
	height: 43.5pt;
}

.r4 {
	height: 39.0pt;
}

.r5 {
	height: 31.5pt;
}

.r6 {
	height: 18.75pt;
}

.r7 {
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
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
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
			<col width="79">
			<col width="161">
			<col width="167">
			<col width="86">
			<col width="114">
			<col width="104">
			<col width="85">
			<col width="100">
			<col width="103">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="9">小反刍兽疫免疫情况月报表</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="4">省份</td>
				<td class="c2" colspan="8">小反刍兽疫活疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="3">本月疫苗使用数量（万头份）</td>
				<td class="c3" rowspan="3">累计疫苗使用数量（万头份）</td>
				<td class="c4" colspan="3">本月免疫数量（万只）</td>
				<td class="c4" colspan="3">累计免疫数量（万只）</td>
			</tr>
			<tr class="r4">
				<td class="c3" rowspan="2">种羊</td>
				<td class="c5" colspan="2">商品羊</td>
				<td class="c3" rowspan="2">种羊</td>
				<td class="c2" colspan="2">商品羊</td>
			</tr>
			<tr class="r5">
				<td class="c3">山羊</td>
				<td class="c3">绵羊</td>
				<td class="c2">牛</td>
				<td class="c2">羊</td>
			</tr>
			<#list items as item>
			<tr class="r6">
				<td n="pdprRegionname"  class="c2"><#if item.pdprRegionname??>${item.pdprRegionname}</#if></td>
				
				<td n="pdprLivevaccine"  class="c2"><#if item.pdprLivevaccine??>${item.pdprLivevaccine?c}</#if></td>
				<td n=""  class="c2"></td>
				<td n="pdprLivebreedingsheep"  class="c6"><#if item.pdprLivebreedingsheep??>${item.pdprLivebreedingsheep?c}</#if></td>
				<td n="pdpr_LiveGoat"  class="c6"><#if item.pdpr_LiveGoat??>${item.pdpr_LiveGoat?c}</#if></td>
				<td n="pdpr_LiveSheep"  class="c6"><#if item.pdpr_LiveSheep??>${item.pdpr_LiveSheep?c}</#if></td>
				<td n=""  class="c6"></td>
				<td n=""  class="c2"></td>
				<td n=""  class="c2"></td>
			</tr>
			</#list>
		</tbody>
	</table>
</body>
</html>
