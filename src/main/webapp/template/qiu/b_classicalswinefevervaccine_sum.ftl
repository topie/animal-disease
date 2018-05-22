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
				<td class="c1" colspan="7">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="7">猪瘟疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="2">使用数量</td>
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
			<#assign cvLivingusecountSum=0>
			<#assign cvCellusercountSum=0>
			<#assign cvLivingstorecountSum=0>
			<#assign cvCellstorecountSum=0>
			<#assign cvLivingyearcountSum=0>
			<#assign cvCellyearcountSum=0>
			<#list items as item>
				<#assign cvLivingusecountSum=cvLivingusecountSum?default(0) +item.cvLivingusecount?default(0)>
				<#assign cvCellusercountSum=cvCellusercountSum?default(0) +item.cvCellusercount?default(0)>
				<#assign cvLivingstorecountSum=cvLivingstorecountSum?default(0) +item.cvLivingstorecount?default(0)>
				<#assign cvCellstorecountSum=cvCellstorecountSum?default(0) +item.cvCellstorecount?default(0)>
				<#assign cvLivingyearcountSum=cvLivingyearcountSum?default(0) +item.cvLivingyearcount?default(0)>
				<#assign cvCellyearcountSum=cvCellyearcountSum?default(0) +item.cvCellyearcount?default(0)>
			<tr class="r5">
				<td n="cvRegionname" class="c2"><#if item.cvRegionname??>${item.cvRegionname}</#if></td>
				<td n="cvLivingusecount"  class="c2"><#if item.cvLivingusecount??>${item.cvLivingusecount}</#if></td>
				<td n="cvCellusercount"  class="c2"><#if item.cvCellusercount??>${item.cvCellusercount}</#if></td>
				<td n="cvLivingstorecount"  class="c2"><#if item.cvLivingstorecount??>${item.cvLivingstorecount}</#if></td>
				<td n="cvCellstorecount"  class="c2"><#if item.cvCellstorecount??>${item.cvCellstorecount}</#if></td>
				<td n="cvLivingyearcount"  class="c2"><#if item.cvLivingyearcount??>${item.cvLivingyearcount}</#if></td>
				<td n="cvCellyearcount"  class="c2"><#if item.cvCellyearcount??>${item.cvCellyearcount}</#if></td>
			</tr>
			</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="cvLivingusecountSum" class="c2"><#if cvLivingusecountSum??>${cvLivingusecountSum}</#if></td>
                <td n="cvCellusercountSum" class="c2"><#if cvCellusercountSum??>${cvCellusercountSum}</#if></td>
                <td n="cvLivingstorecountSum" class="c2"><#if cvLivingstorecountSum??>${cvLivingstorecountSum}</#if></td>
                <td n="cvCellstorecountSum" class="c2"><#if cvCellstorecountSum??>${cvCellstorecountSum}</#if></td>
                <td n="cvLivingyearcountSum" class="c2"><#if cvLivingyearcountSum??>${cvLivingyearcountSum}</#if></td>
                <td n="cvCellyearcountSum" class="c2"><#if cvCellyearcountSum??>${cvCellyearcountSum}</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
