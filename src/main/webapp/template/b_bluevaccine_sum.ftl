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
	height: 40.5pt;
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
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="66">
			<col width="107">
			<col width="104">
			<col width="104">
			<col width="106">
			<col width="106">
			<col width="104">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">2016年春防高致病性猪蓝耳病疫苗使用统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="7">高致病性猪蓝耳病疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="2">春防累计使用数量</td>
				<td class="c2" colspan="2">目前库存数量</td>
				<td class="c2" colspan="2">全年使用数量</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td class="c3">上半年使用数量</td>
			</tr>
			<tr class="r4">
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
			</tr>
			<#list items as item>
			<tr class="r5">
				<td n="bvRegionname" class="c2"><#if item.bvRegionname??>${item.bvRegionname?c}</#if></td>
				<td n="bvInactivatedusecount"  class="c2"><#if item.bvInactivatedusecount??>${item.bvInactivatedusecount?c}</#if></td>
				<td n="bvLivingusecount"  class="c2"><#if item.bvLivingusecount??>${item.bvLivingusecount?c}</#if></td>
				<td n="bvInactivatedstorecount"  class="c2"><#if item.bvInactivatedstorecount??>${item.bvInactivatedstorecount?c}</#if></td>
				<td n="bvLivingstorecount"  class="c2"><#if item.bvLivingstorecount??>${item.bvLivingstorecount?c}</#if></td>
				<td n="bvInactivatedyearcount"  class="c2"><#if item.bvInactivatedyearcount??>${item.bvInactivatedyearcount?c}</#if></td>
				<td n="bvLivingyearcount"  class="c2"><#if item.bvLivingyearcount??>${item.bvLivingyearcount?c}</#if></td>
			</tr>
 </#list>
		</tbody>
	</table>
</body>
</html>
