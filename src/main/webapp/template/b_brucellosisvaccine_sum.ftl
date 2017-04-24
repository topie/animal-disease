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
				<td class="c1" colspan="10">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="10">布鲁氏菌病疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="3">累计使用数量</td>
				<td class="c2" colspan="3">目前库存数量</td>
				<td class="c2" colspan="3">全年使用数量</td>

			</tr>
			<tr class="r4">
                <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
                <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
			</tr>
			<#assign bruS2usecountSum=0>
			<#assign bruA19usecountSum=0>
			<#assign bruM5usecountSum=0>
			<#assign bruS2storecountSum=0>
			<#assign bruA19storecountSum=0>
			<#assign bruM5storecountSum=0>
			<#assign bruS2yearcountSum=0>
			<#assign bruA19yearcountSum=0>
			<#assign bruM5yearcountSum=0>
			<#list items as item>
				<#assign bruS2usecountSum=bruS2usecountSum?default(0) +item.bruS2usecount?default(0)>
				<#assign bruA19usecountSum=bruA19usecountSum?default(0) +item.bruA19usecount?default(0)>
				<#assign bruM5usecountSum=bruM5usecountSum?default(0) +item.bruM5usecount?default(0)>
				<#assign bruS2storecountSum=bruS2storecountSum?default(0) +item.bruS2storecount?default(0)>
				<#assign bruA19storecountSum=bruA19storecountSum?default(0) +item.bruA19storecount?default(0)>
				<#assign bruM5storecountSum=bruM5storecountSum?default(0) +item.bruM5storecount?default(0)>
				<#assign bruS2yearcountSum=bruS2yearcountSum?default(0) +item.bruS2yearcount?default(0)>
				<#assign bruA19yearcountSum=bruA19yearcountSum?default(0) +item.bruA19yearcount?default(0)>
				<#assign bruM5yearcountSum=bruM5yearcountSum?default(0) +item.bruM5yearcount?default(0)>
			<tr class="r5">
				<td n="bruRegionname" class="c2"><#if item.bruRegionname??>${item.bruRegionname}</#if></td>
				<td n="bruS2usecount"  class="c2"><#if item.bruS2usecount??>${item.bruS2usecount}</#if></td>
				<td n="bruA19usecount"  class="c2"><#if item.bruA19usecount??>${item.bruA19usecount}</#if></td>
				<td n="bruM5usecount"  class="c2"><#if item.bruM5usecount??>${item.bruM5usecount}</#if></td>
				<td n="bruS2storecount"  class="c2"><#if item.bruS2storecount??>${item.bruS2storecount}</#if></td>
				<td n="bruA19storecount"  class="c2"><#if item.bruA19storecount??>${item.bruA19storecount}</#if></td>
				<td n="bruM5storecount"  class="c2"><#if item.bruM5storecount??>${item.bruM5storecount}</#if></td>
                <td n="bruS2yearcount"  class="c2"><#if item.bruS2yearcount??>${item.bruS2yearcount}</#if></td>
                <td n="bruA19yearcount"  class="c2"><#if item.bruA19yearcount??>${item.bruA19yearcount}</#if></td>
                <td n="bruM5yearcount"  class="c2"><#if item.bruM5yearcount??>${item.bruM5yearcount}</#if></td>
			</tr>
 </#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="bruS2usecountSum" class="c2"><#if bruS2usecountSum??>${bruS2usecountSum}</#if></td>
               <td n="bruA19usecountSum" class="c2"><#if bruA19usecountSum??>${bruA19usecountSum}</#if></td>
               <td n="bruM5usecountSum" class="c2"><#if bruM5usecountSum??>${bruM5usecountSum}</#if></td>
               <td n="bruS2storecountSum" class="c2"><#if bruS2storecountSum??>${bruS2storecountSum}</#if></td>
               <td n="bruA19storecountSum" class="c2"><#if bruA19storecountSum??>${bruA19storecountSum}</#if></td>
               <td n="bruM5storecountSum" class="c2"><#if bruM5storecountSum??>${bruM5storecountSum}</#if></td>
                <td n="bruS2yearcountSum" class="c2"><#if bruS2yearcountSum??>${bruS2yearcountSum}</#if></td>
                <td n="bruA19yearcountSum" class="c2"><#if bruA19yearcountSum??>${bruA19yearcountSum}</#if></td>
                <td n="bruM5yearcountSum" class="c2"><#if bruM5yearcountSum??>${bruM5yearcountSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
