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
				<td class="c1" colspan="7">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="7">高致病性猪蓝耳病疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="2">累计使用数量</td>
				<td class="c2" colspan="2">目前库存数量</td>
				<td class="c2" colspan="2">全年使用数量</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr class="r4">
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
			</tr>
			<#assign bvInactivatedusecountSum=0>
			<#assign bvLivingusecountSum=0>
			<#assign bvInactivatedstorecountSum=0>
			<#assign bvLivingstorecountSum=0>
			<#assign bvInactivatedyearcountSum=0>
			<#assign bvLivingyearcountSum=0>
			<#list items as item>
				<#assign bvInactivatedusecountSum=bvInactivatedusecountSum?default(0) +item.bvInactivatedusecount?default(0)>
				<#assign bvLivingusecountSum=bvLivingusecountSum?default(0) +item.bvLivingusecount?default(0)>
				<#assign bvInactivatedstorecountSum=bvInactivatedstorecountSum?default(0) +item.bvInactivatedstorecount?default(0)>
				<#assign bvLivingstorecountSum=bvLivingstorecountSum?default(0) +item.bvLivingstorecount?default(0)>
				<#assign bvInactivatedyearcountSum=bvInactivatedyearcountSum?default(0) +item.bvInactivatedyearcount?default(0)>
				<#assign bvLivingyearcountSum=bvLivingyearcountSum?default(0) +item.bvLivingyearcount?default(0)>
			<tr class="r5">
				<td n="bvRegionname" class="c2"><#if item.bvRegionname??>${item.bvRegionname}</#if></td>
				<td n="bvInactivatedusecount"  class="c2"><#if item.bvInactivatedusecount??>${item.bvInactivatedusecount}</#if></td>
				<td n="bvLivingusecount"  class="c2"><#if item.bvLivingusecount??>${item.bvLivingusecount}</#if></td>
				<td n="bvInactivatedstorecount"  class="c2"><#if item.bvInactivatedstorecount??>${item.bvInactivatedstorecount}</#if></td>
				<td n="bvLivingstorecount"  class="c2"><#if item.bvLivingstorecount??>${item.bvLivingstorecount}</#if></td>
				<td n="bvInactivatedyearcount"  class="c2"><#if item.bvInactivatedyearcount??>${item.bvInactivatedyearcount}</#if></td>
				<td n="bvLivingyearcount"  class="c2"><#if item.bvLivingyearcount??>${item.bvLivingyearcount}</#if></td>
			</tr>
 </#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="bvInactivatedusecountSum" class="c2"><#if bvInactivatedusecountSum??>${bvInactivatedusecountSum}</#if></td>
               <td n="bvLivingusecountSum" class="c2"><#if bvLivingusecountSum??>${bvLivingusecountSum}</#if></td>
               <td n="bvInactivatedstorecountSum" class="c2"><#if bvInactivatedstorecountSum??>${bvInactivatedstorecountSum}</#if></td>
               <td n="bvLivingstorecountSum" class="c2"><#if bvLivingstorecountSum??>${bvLivingstorecountSum}</#if></td>
               <td n="bvInactivatedyearcountSum" class="c2"><#if bvInactivatedyearcountSum??>${bvInactivatedyearcountSum}</#if></td>
               <td n="bvLivingyearcountSum" class="c2"><#if bvLivingyearcountSum??>${bvLivingyearcountSum}</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
