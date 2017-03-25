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
	height: 36.75pt;
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
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="66">
			<col width="93">
			<col width="97">
			<col width="92">
			<col width="93">
			<col width="86">
			<col width="94">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">2016年春防猪瘟疫苗使用统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="7">猪瘟疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="2">春/秋防使用数量</td>
				<td class="c2" colspan="2">目前库存数量</td>
				<td class="c2" colspan="2">全年使用数量</td>
			</tr>
			<tr class="r4">
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td class="c2">传代细胞源猪瘟活疫苗(万头份)</td>
			</tr>
			<#list items as item>
			<tr class="r5">
				<td n="cvregionname" class="c2"><#if item.cvregionname??>${item.cvregionname}</#if></td>
				<td n="cvLivingusecount"  class="c2"><#if item.cvLivingusecount??>${item.cvLivingusecount}</#if></td>
				<td n="cvCellusercount"  class="c2"><#if item.cvCellusercount??>${item.cvCellusercount}</#if></td>
				<td n="cvLivingstorecount"  class="c2"><#if item.cvLivingstorecount??>${item.cvLivingstorecount}</#if></td>
				<td n="cvCellstorecount"  class="c2"><#if item.cvCellstorecount??>${item.cvCellstorecount}</#if></td>
				<td n="cvLivingyearcount"  class="c2"><#if item.cvLivingyearcount??>${item.cvLivingyearcount}</#if></td>
				<td n="cvCellyearcount"  class="c2"><#if item.cvCellyearcount??>${item.cvCellyearcount}</#if></td>
			</tr>
<#list items as item>
		</tbody>
	</table>
</body>
</html>
