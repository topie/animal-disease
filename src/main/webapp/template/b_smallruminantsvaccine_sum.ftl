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
	height: 22.5pt;
}

.r3 {
	height: 18.0pt;
}

.r4 {
	height: 42.0pt;
}

.r5 {
	height: 19.5pt;
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
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: center;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
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
	text-align: center;
	border-top: thin solid black;
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
			<col width="100">
			<col width="144">
			<col width="154">
			<col width="144">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="4">2016年春防小反刍兽疫疫苗使用统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="4">禽流感疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c3" rowspan="2">省份</td>
				<td class="c2">春/秋防使用数量</td>
				<td class="c4">目前库存数量</td>
				<td class="c4">全年使用数量</td>
			</tr>
			<tr class="r4">
				<td class="c2">小反刍兽疫疫苗(万头份)</td>
				<td class="c4">小反刍兽疫疫苗(万头份)</td>
				<td class="c4">小反刍兽疫疫苗(万头份)</td>
			</tr>
	 <#list items as item>
			<tr class="r5">
				<td  n="srvRegionname" class="c5"><#if item.srvRegionname??>${item.srvRegionname}</#if></td>
				<td  n="srvH5n2d7usecount"  class="c5"><#if item.srvH5n2d7usecount??>${item.srvH5n2d7usecount?c}</#if></td>
				<td  n="srvH5n2d7storecount"  class="c6"><#if item.srvH5n2d7storecount??>${item.srvH5n2d7storecount?c}</#if></td>
				<td  n="srvH5n2d7yearcount"  class="c6"><#if item.srvH5n2d7yearcount??>${item.srvH5n2d7yearcount?c}</#if></td>
			</tr>
   </#list>
		</tbody>
	</table>
</body>
</html>