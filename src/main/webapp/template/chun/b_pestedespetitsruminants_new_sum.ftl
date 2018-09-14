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
	height: 34.5pt;
}

.r3 {
	height: 43.5pt;
}

.r4 {
	height: 39.0pt;
}

.r5 {
	height: 31.5pt;
}

.r6 {
	height: 18.75pt;
}

.r7 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
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
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
	white-space: pre-wrap;
	text-align: center;
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
			<col width="79">
			<col width="161">
			<col width="167">
			<col width="86">
			<col width="114">

		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="5">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="4">小反刍兽疫活疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" >本月疫苗使用数量（万头份）</td>
				<td class="c3" >累计疫苗使用数量（万头份）</td>
				<td class="c2" >本月免疫数量（万只）</td>
				<td class="c2" >累计免疫数量（万只）</td>
			</tr>

			<#assign pdprLivevaccineSum=0>
			<#assign pdprLivevaccine_ljSum=0>
			
			<#assign pdprLiveSum=0>
			<#assign pdprLive_ljSum=0>
			
			<#list items as item>
				<#assign pdprLivevaccineSum=pdprLivevaccineSum?default(0) +item.pdprLivevaccine?default(0)>
				<#assign pdprLivevaccine_ljSum=pdprLivevaccine_ljSum?default(0) +cumulatives[item_index].pdprLivevaccine?default(0)>
				<#assign pdprLiveSum=pdprLiveSum?default(0) +item.pdprLive?default(0)>
				<#assign pdprLive_ljSum=pdprLive_ljSum?default(0) +cumulatives[item_index].pdprLive?default(0)>
			<tr class="r6">
				<td n="pdprRegionname"  class="c2"><#if item.pdprRegionname??>${item.pdprRegionname}</#if></td>
				
				<td n="pdprLivevaccine"  class="c2"><#if item.pdprLivevaccine??>${item.pdprLivevaccine}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].pdprLivevaccine??>${cumulatives[item_index].pdprLivevaccine}</#if></td>
			    <td n="pdprLive"  class="c6"><#if item.pdprLive??>${item.pdprLive}</#if></td>
				<td n=""  class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].pdprLive??>${cumulatives[item_index].pdprLive}</#if></td>
			</tr>
			</#list>
            <tr class="r6">
                <td  class="c2">合计</td>
                <td n="pdprLivevaccineSum" class="c2"><#if pdprLivevaccineSum??>${pdprLivevaccineSum}</#if></td>
                <td n="pdprLivevaccine_ljSum" class="c2"><#if pdprLivevaccine_ljSum??>${pdprLivevaccine_ljSum}</#if></td>
                <td n="pdprLiveSum" class="c2"><#if pdprLiveSum??>${pdprLiveSum}</#if></td>
                <td n="pdprLive_ljSum" class="c2"><#if pdprLive_ljSum??>${pdprLive_ljSum}</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
