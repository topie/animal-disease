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
	height: 16.5pt;
}

.r3 {
	height: 47.25pt;
}

.r4 {
	height: 19.5pt;
}

.r5 {
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
			<col width="112">
			<col width="100">
			<col width="93">
			<col width="73">
			<col width="87">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="5">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="4">猪瘟活疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2">本月疫苗使用数量（万头份）</td>
				<td class="c2">累计疫苗使用数量（万头份）</td>
				<td class="c2">本月免疫数量（万头）</td>
				<td class="c2">累计疫苗数量（万头）</td>
			</tr>
			<#assign csfVaccineSum=0>
			<#assign csfVaccine_ljSum=0>
			<#assign csfImmuneamountSum=0>
			<#assign csfImmuneamount_ljSum=0>
			
			<#list items as item>
				<#assign csfVaccineSum=csfVaccineSum?default(0) +item.csfVaccine?default(0)>
				<#assign csfVaccine_ljSum=csfVaccine_ljSum?default(0) +cumulatives[item_index].csfVaccine?default(0)>
				<#assign csfImmuneamountSum=csfImmuneamountSum?default(0) +item.csfImmuneamount?default(0)>
				<#assign csfImmuneamount_ljSum=csfImmuneamount_ljSum?default(0) +cumulatives[item_index].csfImmuneamount?default(0)>
				
			<tr class="r4">
				<td n="csfRegionname" class="c2"><#if item.csfRegionname??>${item.csfRegionname}</#if></td>
				<td n="csfVaccine" class="c2"><#if item.csfVaccine??>${item.csfVaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].csfVaccine??>${cumulatives[item_index].csfVaccine}</#if></td>
				<td n="csfImmuneamount" class="c2"><#if item.csfImmuneamount??>${item.csfImmuneamount}</#if></td>
				<td   class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].csfImmuneamount??>${cumulatives[item_index].csfImmuneamount}</#if></td>
			</tr>
			</#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="csfVaccineSum" class="c2"><#if csfVaccineSum??>${csfVaccineSum}</#if></td>
                <td n="csfVaccine_ljSum" class="c2"><#if csfVaccine_ljSum??>${csfVaccine_ljSum}</#if></td>
                <td n="csfImmuneamountSum" class="c2"><#if csfImmuneamountSum??>${csfImmuneamountSum}</#if></td>
                <td n="csfImmuneamount_ljSum" class="c2"><#if csfImmuneamount_ljSum??>${csfImmuneamount_ljSum}</#if></td>
                

            </tr>
		</tbody>
	</table>
</body>
</html>
