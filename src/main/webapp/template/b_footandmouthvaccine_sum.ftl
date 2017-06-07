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
	height: 76.5pt;
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
			<col width="75">
			<col width="72">
			<col width="84">
			<col width="61">
			<col width="59">
			<col width="72">
			<col width="77">
			<col width="76">
			<col width="67">
			<col width="66">
			<col width="70">
			<col width="66">
			<col width="72">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="72">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="19">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="19">口蹄疫疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="6">累计使用数量</td>
				<td class="c2" colspan="6">目前库存数量</td>
				<td class="c2" colspan="6">全年使用数量</td>
			</tr>
			<tr class="r4">
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）)</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型灭活类疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td class="c2">口蹄疫A型灭活疫苗（万毫升）</td>
			</tr>
			<#assign fvOinactivatedusecountSum=0>
			<#assign fvSyntheticusecountSum=0>
			<#assign fvO2inactivatedusecountSum=0>
			<#assign fvOainactivatedusecountSum=0>
			<#assign fvO3inactivatedusecountSum=0>
			<#assign fvAinactivatedusecountSum=0>
			<#assign fvOinactivatedstorecountSum=0>
			<#assign fvSyntheticstorecountSum=0>
			<#assign fvO2inactivatedstorecountSum=0>
			<#assign fvOainactivatedstorecountSum=0>
			<#assign fvO3inactivatedstorecountSum=0>
			<#assign fvAinactivatedstorecountSum=0>
			<#assign fvOinactivatedyearcountSum=0>
			<#assign fvSyntheticyearcountSum=0>
			<#assign fvO2inactivatedsyearcountSum=0>
			<#assign fvOainactivatedyearcountSum=0>
			<#assign fvO3inactivatedsyearcountSum=0>
			<#assign fvAinactivatedsyearcountSum=0>
			<#list items as item>
				<#assign fvOinactivatedusecountSum=fvOinactivatedusecountSum?default(0) +item.fvOinactivatedusecount?default(0)>
				<#assign fvSyntheticusecountSum=fvSyntheticusecountSum?default(0) +item.fvSyntheticusecount?default(0)>
				<#assign fvO2inactivatedusecountSum=fvO2inactivatedusecountSum?default(0) +item.fvO2inactivatedusecount?default(0)>
				<#assign fvOainactivatedusecountSum=fvOainactivatedusecountSum?default(0) +item.fvOainactivatedusecount?default(0)>
				<#assign fvO3inactivatedusecountSum=fvO3inactivatedusecountSum?default(0) +item.fvO3inactivatedusecount?default(0)>
				<#assign fvAinactivatedusecountSum=fvAinactivatedusecountSum?default(0) +item.fvAinactivatedusecount?default(0)>
				<#assign fvOinactivatedstorecountSum=fvOinactivatedstorecountSum?default(0) +item.fvOinactivatedstorecount?default(0)>
				<#assign fvSyntheticstorecountSum=fvSyntheticstorecountSum?default(0) +item.fvSyntheticstorecount?default(0)>
				<#assign fvO2inactivatedstorecountSum=fvO2inactivatedstorecountSum?default(0) +item.fvO2inactivatedstorecount?default(0)>
				<#assign fvOainactivatedstorecountSum=fvOainactivatedstorecountSum?default(0) +item.fvOainactivatedstorecount?default(0)>
				<#assign fvO3inactivatedstorecountSum=fvO3inactivatedstorecountSum?default(0) +item.fvO3inactivatedstorecount?default(0)>
				<#assign fvAinactivatedstorecountSum=fvAinactivatedstorecountSum?default(0) +item.fvAinactivatedstorecount?default(0)>

				<#assign fvOinactivatedyearcountSum=fvOinactivatedyearcountSum?default(0) +item.fvOinactivatedyearcount?default(0)>
				<#assign fvSyntheticyearcountSum=fvSyntheticyearcountSum?default(0) +item.fvSyntheticyearcount?default(0)>
				<#assign fvO2inactivatedsyearcountSum=fvO2inactivatedsyearcountSum?default(0) +item.fvO2inactivatedsyearcount?default(0)>
				<#assign fvOainactivatedyearcountSum=fvOainactivatedyearcountSum?default(0) +item.fvOainactivatedyearcount?default(0)>
				<#assign fvO3inactivatedsyearcountSum=fvO3inactivatedsyearcountSum?default(0) +item.fvO3inactivatedsyearcount?default(0)>
				<#assign fvAinactivatedsyearcountSum=fvAinactivatedsyearcountSum?default(0) +item.fvAinactivatedsyearcount?default(0)>
			<tr class="r5">
				<td n="fvRegionname" class="c2"><#if item.fvRegionname??>${item.fvRegionname}</#if></td>
				<td n="fvOinactivatedusecount"  class="c2"><#if item.fvOinactivatedusecount??>${item.fvOinactivatedusecount}</#if></td>
				<td n="fvSyntheticusecount"  class="c2"><#if item.fvSyntheticusecount??>${item.fvSyntheticusecount}</#if></td>
				<td n="fvO2inactivatedusecount"  class="c2"><#if item.fvO2inactivatedusecount??>${item.fvO2inactivatedusecount}</#if></td>
				<td n="fvOainactivatedusecount"  class="c2"><#if item.fvOainactivatedusecount??>${item.fvOainactivatedusecount}</#if></td>
				<td n="fvO3inactivatedusecount"  class="c2"><#if item.fvO3inactivatedusecount??>${item.fvO3inactivatedusecount}</#if></td>
				<td n="fvAinactivatedusecount"  class="c2"><#if item.fvAinactivatedusecount??>${item.fvAinactivatedusecount}</#if></td>
				<td n="fvOinactivatedstorecount"  class="c2"><#if item.fvOinactivatedstorecount??>${item.fvOinactivatedstorecount}</#if></td>
				<td n="fvSyntheticstorecount"  class="c2"><#if item.fvSyntheticstorecount??>${item.fvSyntheticstorecount}</#if></td>
				<td n="fvO2inactivatedstorecount"  class="c2"><#if item.fvO2inactivatedstorecount??>${item.fvO2inactivatedstorecount}</#if></td>
				<td n="fvOainactivatedstorecount"  class="c2"><#if item.fvOainactivatedstorecount??>${item.fvOainactivatedstorecount}</#if></td>
				<td n="fvO3inactivatedstorecount"  class="c2"><#if item.fvO3inactivatedstorecount??>${item.fvO3inactivatedstorecount}</#if></td>
				<td n="fvAinactivatedstorecount"  class="c2"><#if item.fvAinactivatedstorecount??>${item.fvAinactivatedstorecount}</#if></td>
				
				<td n="fvOinactivatedyearcount"  class="c2"><#if item.fvOinactivatedyearcount??>${item.fvOinactivatedyearcount}</#if></td>
				<td n="fvSyntheticyearcount"  class="c2"><#if item.fvSyntheticyearcount??>${item.fvSyntheticyearcount}</#if></td>
				<td n="fvO2inactivatedsyearcount"  class="c2"><#if item.fvO2inactivatedsyearcount??>${item.fvO2inactivatedsyearcount}</#if></td>
				<td n="fvOainactivatedyearcount"  class="c2"><#if item.fvOainactivatedyearcount??>${item.fvOainactivatedyearcount}</#if></td>
				<td n="fvO3inactivatedsyearcount"  class="c2"><#if item.fvO3inactivatedsyearcount??>${item.fvO3inactivatedsyearcount}</#if></td>
				<td n="fvAinactivatedsyearcount"  class="c2"><#if item.fvAinactivatedsyearcount??>${item.fvAinactivatedsyearcount}</#if></td>
			</tr>
</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="fvOinactivatedusecountSum" class="c2"><#if fvOinactivatedusecountSum??>${fvOinactivatedusecountSum}</#if></td>
                <td n="fvSyntheticusecountSum" class="c2"><#if fvSyntheticusecountSum??>${fvSyntheticusecountSum}</#if></td>
                <td n="fvO2inactivatedusecountSum" class="c2"><#if fvO2inactivatedusecountSum??>${fvO2inactivatedusecountSum}</#if></td>
                <td n="fvOainactivatedusecountSum" class="c2"><#if fvOainactivatedusecountSum??>${fvOainactivatedusecountSum}</#if></td>
                <td n="fvO3inactivatedusecountSum" class="c2"><#if fvO3inactivatedusecountSum??>${fvO3inactivatedusecountSum}</#if></td>
                <td n="fvAinactivatedusecountSum" class="c2"><#if fvAinactivatedusecountSum??>${fvAinactivatedusecountSum}</#if></td>
                <td n="fvOinactivatedstorecountSum" class="c2"><#if fvOinactivatedstorecountSum??>${fvOinactivatedstorecountSum}</#if></td>
                <td n="fvSyntheticstorecountSum" class="c2"><#if fvSyntheticstorecountSum??>${fvSyntheticstorecountSum}</#if></td>
                <td n="fvO2inactivatedstorecountSum" class="c2"><#if fvO2inactivatedstorecountSum??>${fvO2inactivatedstorecountSum}</#if></td>
                <td n="fvOainactivatedstorecountSum" class="c2"><#if fvOainactivatedstorecountSum??>${fvOainactivatedstorecountSum}</#if></td>
                <td n="fvO3inactivatedstorecountSum" class="c2"><#if fvO3inactivatedstorecountSum??>${fvO3inactivatedstorecountSum}</#if></td>
                <td n="fvAinactivatedstorecountSum" class="c2"><#if fvAinactivatedstorecountSum??>${fvAinactivatedstorecountSum}</#if></td>
                <td n="fvOinactivatedyearcountSum" class="c2"><#if fvOinactivatedyearcountSum??>${fvOinactivatedyearcountSum}</#if></td>
                <td n="fvSyntheticyearcountSum" class="c2"><#if fvSyntheticyearcountSum??>${fvSyntheticyearcountSum}</#if></td>
                <td n="fvO2inactivatedsyearcountSum" class="c2"><#if fvO2inactivatedsyearcountSum??>${fvO2inactivatedsyearcountSum}</#if></td>
                <td n="fvOainactivatedyearcountSum" class="c2"><#if fvOainactivatedyearcountSum??>${fvOainactivatedyearcountSum}</#if></td>
                <td n="fvO3inactivatedsyearcountSum" class="c2"><#if fvO3inactivatedsyearcountSum??>${fvO3inactivatedsyearcountSum}</#if></td>
                <td n="fvAinactivatedsyearcountSum" class="c2"><#if fvAinactivatedsyearcountSum??>${fvAinactivatedsyearcountSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
