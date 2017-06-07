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
			<col width="97">
			<col width="93">
			<col width="82">
			<col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
            <col width="89">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="19">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="6">布鲁氏菌活疫苗(S2株)</td>
				<td class="c2" colspan="6">布鲁氏菌活疫苗(M5株)</td>
                <td class="c2" colspan="6">布鲁氏菌活疫苗(A19株)</td>
			</tr>
			<tr class="r3">
				<td class="c2">本月疫苗使用数量（万毫升）</td>
				<td class="c2">累计疫苗使用数量（万毫升）</td>
				<td class="c2">牛本月免疫数量（万头）</td>
				<td class="c2">牛累计疫苗数量（万头）</td>
                <td class="c2">羊本月免疫数量（万头）</td>
                <td class="c2">羊累计疫苗数量（万头）</td>
                <td class="c2">本月疫苗使用数量（万毫升）</td>
                <td class="c2">累计疫苗使用数量（万毫升）</td>
                <td class="c2">牛本月免疫数量（万头）</td>
                <td class="c2">牛累计疫苗数量（万头）</td>
                <td class="c2">羊本月免疫数量（万头）</td>
                <td class="c2">羊累计疫苗数量（万头）</td>
                <td class="c2">本月疫苗使用数量（万毫升）</td>
                <td class="c2">累计疫苗使用数量（万毫升）</td>
                <td class="c2">牛本月免疫数量（万头）</td>
                <td class="c2">牛累计疫苗数量（万头）</td>
                <td class="c2">羊本月免疫数量（万头）</td>
                <td class="c2">羊累计疫苗数量（万头）</td>
			</tr>
			<#assign brus2VaccineSum=0>
			<#assign brus2Vaccine_ljSum=0>
			<#assign brus2NiuimmuneamountSum=0>
			<#assign brus2Niuimmuneamount_ljSum=0>
			<#assign brus2SheepimmuneamountSum=0>
			<#assign brus2Sheepimmuneamount_ljSum=0>
			<#assign brum5VaccineSum=0>
			<#assign brum5Vaccine_ljSum=0>

			<#assign brum5NiuimmuneamountSum=0>
			<#assign brum5Niuimmuneamount_ljSum=0>
			<#assign brum5SheepimmuneamountSum=0>
			<#assign brum5Sheepimmuneamount_ljSum=0>
			<#assign brua19VaccineSum=0>
			<#assign brua19Vaccine_ljSum=0>
			<#assign brua19NiuimmuneamountSum=0>
			<#assign brua19Niuimmuneamount_ljSum=0>

			<#assign brua19SheepimmuneamountSum=0>
			<#assign brua19Sheepimmuneamount_ljSum=0>
			<#list items as item>
				<#assign brus2VaccineSum=brus2VaccineSum?default(0) +item.brus2Vaccine?default(0)>
				<#assign brus2Vaccine_ljSum=brus2Vaccine_ljSum?default(0) +cumulatives[item_index].brus2Vaccine?default(0)>
				<#assign brus2NiuimmuneamountSum=brus2NiuimmuneamountSum?default(0) +item.brus2Niuimmuneamount?default(0)>
				<#assign brus2Niuimmuneamount_ljSum=brus2Niuimmuneamount_ljSum?default(0) +cumulatives[item_index].brus2Niuimmuneamount?default(0)>
				<#assign brus2SheepimmuneamountSum=brus2SheepimmuneamountSum?default(0) +item.brus2Sheepimmuneamount?default(0)>
				<#assign brus2Sheepimmuneamount_ljSum=brus2Sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].brus2Sheepimmuneamount?default(0)>
				<#assign brum5VaccineSum=brum5VaccineSum?default(0) +item.brum5Vaccine?default(0)>
				<#assign brum5Vaccine_ljSum=brum5Vaccine_ljSum?default(0) +cumulatives[item_index].brum5Vaccine?default(0)>

				<#assign brum5NiuimmuneamountSum=brum5NiuimmuneamountSum?default(0) +item.brum5Niuimmuneamount?default(0)>
				<#assign brum5Niuimmuneamount_ljSum=brum5Niuimmuneamount_ljSum?default(0) +cumulatives[item_index].brum5Niuimmuneamount?default(0)>
				<#assign brum5SheepimmuneamountSum=brum5SheepimmuneamountSum?default(0) +item.brum5Sheepimmuneamount?default(0)>
				<#assign brum5Sheepimmuneamount_ljSum=brum5Sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].brum5Sheepimmuneamount?default(0)>
				<#assign brua19VaccineSum=brua19VaccineSum?default(0) +item.brua19Vaccine?default(0)>
				<#assign brua19Vaccine_ljSum=brua19Vaccine_ljSum?default(0) +cumulatives[item_index].brua19Vaccine?default(0)>
				<#assign brua19NiuimmuneamountSum=brua19NiuimmuneamountSum?default(0) +item.brua19Niuimmuneamount?default(0)>
				<#assign brua19Niuimmuneamount_ljSum=brua19Niuimmuneamount_ljSum?default(0) +cumulatives[item_index].brua19Niuimmuneamount?default(0)>

				<#assign brua19SheepimmuneamountSum=brua19SheepimmuneamountSum?default(0) +item.brua19Sheepimmuneamount?default(0)>
				<#assign brua19Sheepimmuneamount_ljSum=brua19Sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].brua19Sheepimmuneamount?default(0)>
            <tr class="r4">
				<td n="" class="c2"><#if item.bruRegionname??>${item.bruRegionname}</#if></td>
				
				<td  n="brus2Vaccine" class="c2"><#if item.brus2Vaccine??>${item.brus2Vaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brus2Vaccine??>${cumulatives[item_index].brus2Vaccine}</#if></td>
				<td n="brus2Niuimmuneamount"  class="c2"><#if item.brus2Niuimmuneamount??>${item.brus2Niuimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brus2Niuimmuneamount??>${cumulatives[item_index].brus2Niuimmuneamount}</#if></td>
				
				<td n="brus2Sheepimmuneamount"  class="c2"><#if item.brus2Sheepimmuneamount??>${item.brus2Sheepimmuneamount}</#if></td>
				<td  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brus2Sheepimmuneamount??>${cumulatives[item_index].brus2Sheepimmuneamount}</#if></td>
				<td n="brum5Vaccine"  class="c2"><#if item.brum5Vaccine??>${item.brum5Vaccine}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brum5Vaccine??>${cumulatives[item_index].brum5Vaccine}</#if></td>

                <td  n="brum5Niuimmuneamount" class="c2"><#if item.brum5Niuimmuneamount??>${item.brum5Niuimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brum5Niuimmuneamount??>${cumulatives[item_index].brum5Niuimmuneamount}</#if></td>
                <td n="brum5Sheepimmuneamount"  class="c2"><#if item.brum5Sheepimmuneamount??>${item.brum5Sheepimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brum5Sheepimmuneamount??>${cumulatives[item_index].brum5Sheepimmuneamount}</#if></td>

                <td n="brua19Vaccine"  class="c2"><#if item.brua19Vaccine??>${item.brua19Vaccine}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brua19Vaccine??>${cumulatives[item_index].brua19Vaccine}</#if></td>
                <td n="brua19Niuimmuneamount"  class="c2"><#if item.brua19Niuimmuneamount??>${item.brua19Niuimmuneamount}</#if></td>
                <td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brua19Niuimmuneamount??>${cumulatives[item_index].brua19Niuimmuneamount}</#if></td>

                <td  n="brua19Sheepimmuneamount" class="c2"><#if item.brua19Sheepimmuneamount??>${item.brua19Sheepimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].brua19Sheepimmuneamount??>${cumulatives[item_index].brua19Sheepimmuneamount}</#if></td>
			</tr>
			</#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="brus2VaccineSum" class="c2"><#if brus2VaccineSum??>${brus2VaccineSum}</#if></td>
                <td n="brus2Vaccine_ljSum" class="c2"><#if brus2Vaccine_ljSum??>${brus2Vaccine_ljSum}</#if></td>
                <td n="brus2NiuimmuneamountSum" class="c2"><#if brus2NiuimmuneamountSum??>${brus2NiuimmuneamountSum}</#if></td>
                <td n="brus2Niuimmuneamount_ljSum" class="c2"><#if brus2Niuimmuneamount_ljSum??>${brus2Niuimmuneamount_ljSum}</#if></td>
                <td n="brus2SheepimmuneamountSum" class="c2"><#if brus2SheepimmuneamountSum??>${brus2SheepimmuneamountSum}</#if></td>
                <td n="brus2Sheepimmuneamount_ljSum" class="c2"><#if brus2Sheepimmuneamount_ljSum??>${brus2Sheepimmuneamount_ljSum}</#if></td>
                <td n="brum5VaccineSum" class="c2"><#if brum5VaccineSum??>${brum5VaccineSum}</#if></td>
                <td n="brum5Vaccine_ljSum" class="c2"><#if brum5Vaccine_ljSum??>${brum5Vaccine_ljSum}</#if></td>

                <td n="brum5NiuimmuneamountSum" class="c2"><#if brum5NiuimmuneamountSum??>${brum5NiuimmuneamountSum}</#if></td>
                <td n="brum5Niuimmuneamount_ljSum" class="c2"><#if brum5Niuimmuneamount_ljSum??>${brum5Niuimmuneamount_ljSum}</#if></td>
                <td n="brum5SheepimmuneamountSum" class="c2"><#if brum5SheepimmuneamountSum??>${brum5SheepimmuneamountSum}</#if></td>
                <td n="brum5Sheepimmuneamount_ljSum" class="c2"><#if brum5Sheepimmuneamount_ljSum??>${brum5Sheepimmuneamount_ljSum}</#if></td>
                <td n="brua19VaccineSum" class="c2"><#if brua19VaccineSum??>${brua19VaccineSum}</#if></td>
                <td n="brua19Vaccine_ljSum" class="c2"><#if brua19Vaccine_ljSum??>${brua19Vaccine_ljSum}</#if></td>
                <td n="brua19NiuimmuneamountSum" class="c2"><#if brua19NiuimmuneamountSum??>${brua19NiuimmuneamountSum}</#if></td>
                <td n="brua19Niuimmuneamount_ljSum" class="c2"><#if brua19Niuimmuneamount_ljSum??>${brua19Niuimmuneamount_ljSum}</#if></td>

                <td n="brua19SheepimmuneamountSum" class="c2"><#if brua19SheepimmuneamountSum??>${brua19SheepimmuneamountSum}</#if></td>
                <td n="brua19Sheepimmuneamount_ljSum" class="c2"><#if brua19Sheepimmuneamount_ljSum??>${brua19Sheepimmuneamount_ljSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
