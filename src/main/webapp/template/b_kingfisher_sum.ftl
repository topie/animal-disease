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
				<td class="c1" colspan="19">2016年春防经费统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
				<td class="c2" colspan="10">全省上半年落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">全省春防落实动物疫病防控经费（万元）</td>
				<td class="c2" colspan="4">省本级春防落实动物疫病防控经费（万元）</td>
			</tr>
			<tr class="r3">
				<td class="c2" colspan="5">疫苗配套经费</td>
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
				<td class="c2">高致病性猪蓝耳病</td>
				<td class="c2">猪 瘟</td>
				<td class="c2">其 它</td>
			</tr>
			<#list items as item>
			<tr class="r5">
				<td n="kfRegionname" class="c2"><#if item.kfRegionname??>${item.kfRegionname}</#if></td>
				
				<td n="kfFmkingfisher"  class="c2"><#if item.kfFmkingfisher??>${item.kfFmkingfisher}</#if></td>
				<td n="kfAikingfisher"  class="c2"><#if item.kfAikingfisher??>${item.kfAikingfisher}</#if></td>
				<td n="kfBkingfisher"  class="c2"><#if item.kfBkingfisher??>${item.kfBkingfisher}</#if></td>
				<td n="kfCskingfisher"  class="c2"><#if item.kfCskingfisher??>${item.kfCskingfisher}</#if></td>
				<td n="kfOtherkingfisher"  class="c2"><#if item.kfOtherkingfisher??>${item.kfOtherkingfisher}</#if></td>
				
				<td n="kfCulling"  class="c2"><#if item.kfCulling??>${item.kfCulling}</#if></td>
				<td n="kfYearmonitoring"  class="c2"><#if item.kfYearmonitoring??>${item.kfYearmonitoring}</#if></td>
				<td n="kfYearmaterials"  class="c2"><#if item.kfYearmaterials??>${item.kfYearmaterials}</#if></td>
				<td n="kfYearquarantine"  class="c2"><#if item.kfYearquarantine??>${item.kfYearquarantine}</#if></td>
				<td n="kfYearother"  class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
				
				<td n="kfYearother"  class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
				<td n="kfProvincemonitoring"  class="c2"><#if item.kfProvincemonitoring??>${item.kfProvincemonitoring}</#if></td>
				<td n="kfProvincelquarantine"  class="c2"><#if item.kfProvincelquarantine??>${item.kfProvincelquarantine}</#if></td>
				<td n="kfProvinceother"  class="c2"><#if item.kfProvinceother??>${item.kfProvinceother}</#if></td>
				
				<td n="kfLevelvaccine"  class="c2"><#if item.kfLevelvaccine??>${item.kfLevelvaccine}</#if></td>
				<td n="kfLevelmonitoring"  class="c2"><#if item.kfLevelmonitoring??>${item.kfLevelmonitoring}</#if></td>
				<td n="kfLevelquarantine"  class="c2"><#if item.kfLevelquarantine??>${item.kfLevelquarantine}</#if></td>
				<td n="kfLevelother"  class="c2"><#if item.kfLevelother??>${item.kfLevelother}</#if></td>
			</tr>
</#list>
		</tbody>
	</table>
</body>
</html>
