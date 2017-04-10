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
	height: 22.5pt;
}

.r2 {
	height: 32.25pt;
}

.r3 {
	height: 21.0pt;
}

.r4 {
	height: 24.0pt;
}

.r5 {
	height: 16.5pt;
}

.r6 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
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
			<col width="69">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="48">
			<col width="58">
			<col width="66">
			<col width="58">
			<col width="67">
			<col width="66">
			<col width="59">
			<col width="66">
			<col width="53">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="19">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
				<td class="c2" colspan="11">全省落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">全省春秋防落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">省本级春秋防落实动物疫病防控经费（万元）</td>
			</tr>
			<tr class="r3">
				<td class="c2" colspan="6">疫苗配套经费</td>
				<td class="c2" rowspan="2">扑杀补助</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">基层动物防疫经费</td>
				<td class="c2" rowspan="2">其它</td>
				<td class="c2" rowspan="2">疫苗经费</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">其它</td>
				<td class="c2" rowspan="2">疫苗经费</td>
				<td class="c2" rowspan="2">监测经费</td>
				<td class="c2" rowspan="2">应急物资储备经费</td>
				<td class="c2" rowspan="2">其它</td>
			</tr>
			<tr class="r4">
				<td class="c2">口蹄疫</td>
				<td class="c2">禽流感</td>
                <td class="c2">小反刍兽疫</td>
                <td class="c2">布鲁氏菌病</td>
                <td class="c2">包虫病</td>
				<td class="c2">其 它</td>
			</tr>
			<#assign kfFmkingfisherSum=0>
			<#assign kfAikingfisherSum=0>
			<#assign kfBkingfisherSum=0>
			<#assign kfCskingfisherSum=0>
			<#assign kfOtherkingfisherSum=0>
			<#assign kfCullingSum=0>
			<#assign kfYearmonitoringSum=0>
			<#assign kfYearmaterialsSum=0>
			<#assign kfYearquarantineSum=0>
			<#assign kfYearotherSum=0>
			<#assign kfProvincevaccineSum=0>
			<#assign kfProvincemonitoringSum=0>
			<#assign kfProvincelquarantineSum=0>
			<#assign kfProvinceotherSum=0>
			<#assign kfLevelvaccineSum=0>
			<#assign kfLevelmonitoringSum=0>
			<#assign kfLevelquarantineSum=0>
			<#assign kfLevelotherSum=0>

			<#assign kfPprKingfisherSum=0>
			<#assign kfBurKingfisherSum=0>
			<#assign kfEchKingfisherSum=0>


			<#list items as item>
				<#assign kfFmkingfisherSum=kfFmkingfisherSum?default(0) +item.kfFmkingfisher?default(0)>
				<#assign kfAikingfisherSum=kfAikingfisherSum?default(0) +item.kfAikingfisher?default(0)>

				<#assign kfPprKingfisherSum=kfPprKingfisherSum?default(0) +item.kfPprKingfisher?default(0)>
				<#assign kfBurKingfisherSum=kfBurKingfisherSum?default(0) +item.kfBurKingfisher?default(0)>
				<#assign kfEchKingfisherSum=kfEchKingfisherSum?default(0) +item.kfEchKingfisher?default(0)>

				<#assign kfBkingfisherSum=kfBkingfisherSum?default(0) +item.kfBkingfisher?default(0)>
				<#assign kfCskingfisherSum=kfCskingfisherSum?default(0) +item.kfCskingfisher?default(0)>
				<#assign kfOtherkingfisherSum=kfOtherkingfisherSum?default(0) +item.kfOtherkingfisher?default(0)>
				<#assign kfCullingSum=kfCullingSum?default(0) +item.kfCulling?default(0)>
				<#assign kfYearmonitoringSum=kfYearmonitoringSum?default(0) +item.kfYearmonitoring?default(0)>
				<#assign kfYearmaterialsSum=kfYearmaterialsSum?default(0) +item.kfYearmaterials?default(0)>
				<#assign kfYearquarantineSum=kfYearquarantineSum?default(0) +item.kfYearquarantine?default(0)>
				<#assign kfYearotherSum=kfYearotherSum?default(0) +item.kfYearother?default(0)>
				<#assign kfProvincevaccineSum=kfProvincevaccineSum?default(0) +item.kfProvincevaccine?default(0)>
				<#assign kfProvincemonitoringSum=kfProvincemonitoringSum?default(0) +item.kfProvincemonitoring?default(0)>

				<#assign kfProvincelquarantineSum=kfProvincelquarantineSum?default(0) +item.kfProvincelquarantine?default(0)>
				<#assign kfProvinceotherSum=kfProvinceotherSum?default(0) +item.kfProvinceother?default(0)>
				<#assign kfLevelvaccineSum=kfLevelvaccineSum?default(0) +item.kfLevelvaccine?default(0)>
				<#assign kfLevelmonitoringSum=kfLevelmonitoringSum?default(0) +item.kfLevelmonitoring?default(0)>
				<#assign kfLevelquarantineSum=kfLevelquarantineSum?default(0) +item.kfLevelquarantine?default(0)>
				<#assign kfLevelotherSum=kfLevelotherSum?default(0) +item.kfLevelother?default(0)>
			
			<tr class="r5">
				<td n="kfRegionname" class="c2"><#if item.kfRegionname??>${item.kfRegionname}</#if></td>
				<td n="kfFmkingfisher"  class="c2"><#if item.kfFmkingfisher??>${item.kfFmkingfisher}</#if></td>
				<td n="kfAikingfisher"  class="c2"><#if item.kfAikingfisher??>${item.kfAikingfisher}</#if></td>

                <td n="kfPprKingfisher"   class="c2"><#if item.kfPprKingfisher??>${item.kfPprKingfisher}</#if></td>
                <td n="kfBurKingfisher"   class="c2"><#if item.kfBurKingfisher??>${item.kfBurKingfisher}</#if></td>
                <td n="kfEchKingfisher"   class="c2"><#if item.kfEchKingfisher??>${item.kfEchKingfisher}</#if></td>
			
				<td n="kfOtherkingfisher"  class="c2"><#if item.kfOtherkingfisher??>${item.kfOtherkingfisher}</#if></td>
				<td n="kfCulling"  class="c2"><#if item.kfCulling??>${item.kfCulling}</#if></td>
				<td n="kfYearmonitoring"  class="c2"><#if item.kfYearmonitoring??>${item.kfYearmonitoring}</#if></td>
				<td n="kfYearmaterials"  class="c2"><#if item.kfYearmaterials??>${item.kfYearmaterials}</#if></td>
				<td n="kfYearquarantine"  class="c2"><#if item.kfYearquarantine??>${item.kfYearquarantine}</#if></td>
				<td n="kfYearother"  class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
				<td n="kfProvincevaccine"  class="c2"><#if item.kfProvincevaccine??>${item.kfProvincevaccine}</#if></td>
				<td n="kfProvincemonitoring"  class="c2"><#if item.kfProvincemonitoring??>${item.kfProvincemonitoring}</#if></td>
				
				<td n="kfProvincelquarantine"  class="c2"><#if item.kfProvincelquarantine??>${item.kfProvincelquarantine}</#if></td>
				<td n="kfProvinceother"  class="c2"><#if item.kfProvinceother??>${item.kfProvinceother}</#if></td>
				<td n="kfLevelvaccine"  class="c2"><#if item.kfLevelvaccine??>${item.kfLevelvaccine}</#if></td>
				<td n="kfLevelmonitoring"  class="c2"><#if item.kfLevelmonitoring??>${item.kfLevelmonitoring}</#if></td>
				<td n="kfLevelquarantine"  class="c2"><#if item.kfLevelquarantine??>${item.kfLevelquarantine}</#if></td>
				<td n="kfLevelother"  class="c2"><#if item.kfLevelother??>${item.kfLevelother}</#if></td>
			</tr>
</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="kfFmkingfisherSum" class="c2"><#if kfFmkingfisherSum??>${kfFmkingfisherSum}</#if></td>
                <td n="kfAikingfisherSum" class="c2"><#if kfAikingfisherSum??>${kfAikingfisherSum}</#if></td>
                <td n="kfPprKingfisherSum"   class="c2"><#if kfPprKingfisherSum??>${kfPprKingfisherSum}</#if></td>
                <td n="kfBurKingfisherSum"   class="c2"><#if kfBurKingfisherSum??>${kfBurKingfisherSum}</#if></td>
                <td n="kfEchKingfisherSum"   class="c2"><#if kfEchKingfisherSum??>${kfEchKingfisherSum}</#if></td>
                <td n="kfOtherkingfisherSum" class="c2"><#if kfOtherkingfisherSum??>${kfOtherkingfisherSum}</#if></td>
                <td n="kfCullingSum" class="c2"><#if kfCullingSum??>${kfCullingSum}</#if></td>
                <td n="kfYearmonitoringSum" class="c2"><#if kfYearmonitoringSum??>${kfYearmonitoringSum}</#if></td>
                <td n="kfYearmaterialsSum" class="c2"><#if kfYearmaterialsSum??>${kfYearmaterialsSum}</#if></td>
                <td n="kfYearquarantineSum" class="c2"><#if kfYearquarantineSum??>${kfYearquarantineSum}</#if></td>
                <td n="kfYearotherSum" class="c2"><#if kfYearotherSum??>${kfYearotherSum}</#if></td>
                <td n="kfProvincevaccineSum" class="c2"><#if kfProvincevaccineSum??>${kfProvincevaccineSum}</#if></td>
                <td n="kfProvincemonitoringSum" class="c2"><#if kfProvincemonitoringSum??>${kfProvincemonitoringSum}</#if></td>
                <td n="kfProvincelquarantineSum" class="c2"><#if kfProvincelquarantineSum??>${kfProvincelquarantineSum}</#if></td>
                <td n="kfProvinceotherSum" class="c2"><#if kfProvinceotherSum??>${kfProvinceotherSum}</#if></td>
                <td n="kfLevelvaccineSum" class="c2"><#if kfLevelvaccineSum??>${kfLevelvaccineSum}</#if></td>
                <td n="kfLevelmonitoringSum" class="c2"><#if kfLevelmonitoringSum??>${kfLevelmonitoringSum}</#if></td>
                <td n="kfLevelquarantineSum" class="c2"><#if kfLevelquarantineSum??>${kfLevelquarantineSum}</#if></td>
                <td n="kfLevelotherSum" class="c2"><#if kfLevelotherSum??>${kfLevelotherSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
